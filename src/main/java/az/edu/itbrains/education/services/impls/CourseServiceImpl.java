package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.dtos.course.CourseCreateDto;
import az.edu.itbrains.education.dtos.course.CourseDto;
import az.edu.itbrains.education.dtos.course.CourseUpdateDto;
import az.edu.itbrains.education.models.Category;
import az.edu.itbrains.education.models.Course;
import az.edu.itbrains.education.models.User;
import az.edu.itbrains.education.repositories.CourseRepository;
import az.edu.itbrains.education.services.CategoryService;
import az.edu.itbrains.education.services.CourseService;
import az.edu.itbrains.education.services.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;
    private final UserService userService;


    @Override
    public List<CourseDto> getAll() {
        List<CourseDto> courseDtoList = courseRepository.findAll()
                .stream()
                .map(course -> modelMapper.map(course, CourseDto.class))
                .toList();
        return courseDtoList;
    }

    @Override
    public CourseCreateDto createCourse(CourseCreateDto courseCreateDto) {
        Course course = new Course();
        course.setName(courseCreateDto.getName());
        course.setDescription(courseCreateDto.getDescription());
        course.setPrice(courseCreateDto.getPrice());
        course.setDuration(courseCreateDto.getDuration());
        User user = userService.findUSerById();
        course.setUser(user);
        Category category =categoryService.findCategoryById(courseCreateDto.getCategoryId());
        course.setCategory(category);
        courseRepository.save(course);
        return courseCreateDto;

    }

    @Override
    public CourseUpdateDto getUpdateCourse(Long id) {
        Course course = courseRepository.findById(id).orElse(null);
        if (course != null) {
            return modelMapper.map(course, CourseUpdateDto.class);
        }
        return null;
    }

    @Override
    public CourseUpdateDto updateCourse(Long id, CourseUpdateDto courseUpdateDto) {
        Course course = courseRepository.findById(id).orElse(null);
        if (course != null) {
            modelMapper.map(courseUpdateDto, course);
            Category category =categoryService.findCategoryById(courseUpdateDto.getCategoryId());
            course.setCategory(category);
            courseRepository.save(course);
            return modelMapper.map(course, CourseUpdateDto.class);

        }
        return null;
    }

    @Override
    public CourseDto deleteCourse(Long id) {
            Course course = courseRepository.findById(id).orElse(null);
            if (course != null) {
                courseRepository.delete(course);
                return modelMapper.map(course, CourseDto.class);
            }
        return null;
    }
}
