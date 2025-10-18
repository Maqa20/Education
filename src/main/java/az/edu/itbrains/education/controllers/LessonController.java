package az.edu.itbrains.education.controllers;
import az.edu.itbrains.education.dtos.lesson.LessonCreateDto;
import az.edu.itbrains.education.dtos.lesson.LessonDto;
import az.edu.itbrains.education.dtos.lesson.LessonUpdateDto;
import az.edu.itbrains.education.services.LessonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {

private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<LessonDto>> getAll(){

        List<LessonDto> lessonDtoList = lessonService.getAll();
        return new ResponseEntity<>(lessonDtoList, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<LessonCreateDto> createLesson(@RequestBody LessonCreateDto lessonCreateDto){

        LessonCreateDto lesson =lessonService.createLesson(lessonCreateDto);
        return new ResponseEntity<>(lesson,HttpStatus.CREATED);
    }
    @GetMapping("/update/{id}")
    public ResponseEntity<LessonUpdateDto> getLessonById(@PathVariable Long id){

        LessonUpdateDto update = lessonService.getUpdateLesson(id);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<LessonUpdateDto> updateLesson(@PathVariable  Long id ,@RequestBody LessonUpdateDto lessonUpdateDto){

        LessonUpdateDto lesson = lessonService.updateLesson(id, lessonUpdateDto);
        return new ResponseEntity<>(lesson,HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<LessonDto> remove(@PathVariable Long id){
        LessonDto lessonDto = lessonService.deleteLesson(id);
        return new ResponseEntity<>(lessonDto,HttpStatus.OK);
    }

}
