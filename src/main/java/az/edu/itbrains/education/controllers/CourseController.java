package az.edu.itbrains.education.controllers;

import az.edu.itbrains.education.dtos.course.CourseCreateDto;
import az.edu.itbrains.education.dtos.course.CourseDto;
import az.edu.itbrains.education.dtos.course.CourseUpdateDto;
import az.edu.itbrains.education.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/all")
    public ResponseEntity<List<CourseDto>> getAll(){

        List<CourseDto> courseDtoList = courseService.getAll();
        return new ResponseEntity<>(courseDtoList, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<CourseCreateDto> createCourse(@RequestBody CourseCreateDto courseCreateDto){

        CourseCreateDto course =courseService.createCourse(courseCreateDto);
        return new ResponseEntity<>(course,HttpStatus.CREATED);
    }
    @GetMapping("/update/{id}")
    public ResponseEntity<CourseUpdateDto> getCourseById(@PathVariable Long id){

        CourseUpdateDto update = courseService.getUpdateCourse(id);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CourseUpdateDto> updateCourse(@PathVariable  Long id ,@RequestBody CourseUpdateDto courseUpdateDto){

        CourseUpdateDto course = courseService.updateCourse(id, courseUpdateDto);
        return new ResponseEntity<>(course,HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<CourseDto> remove(@PathVariable Long id){
        CourseDto courseDto = courseService.deleteCourse(id);
        return new ResponseEntity<>(courseDto,HttpStatus.OK);
    }

}
