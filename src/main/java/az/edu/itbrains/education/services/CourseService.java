package az.edu.itbrains.education.services;

import az.edu.itbrains.education.dtos.course.CourseCreateDto;
import az.edu.itbrains.education.dtos.course.CourseDto;
import az.edu.itbrains.education.dtos.course.CourseUpdateDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> getAll();

    CourseCreateDto createCourse(CourseCreateDto courseCreateDto);

    CourseUpdateDto getUpdateCourse(Long id);

    CourseUpdateDto updateCourse(Long id, CourseUpdateDto courseUpdateDto);

    CourseDto deleteCourse(Long id);
}
