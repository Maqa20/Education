package az.edu.itbrains.education.controllers;
import az.edu.itbrains.education.dtos.exam.ExamCreateDto;
import az.edu.itbrains.education.dtos.exam.ExamDto;
import az.edu.itbrains.education.dtos.exam.ExamUpdateDto;
import az.edu.itbrains.education.services.ExamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/exams")
@RequiredArgsConstructor
public class ExamController {

    private final ExamService examService;

    @GetMapping("/all")
    public ResponseEntity<List<ExamDto>> getAll(){

        List<ExamDto> examDtoList = examService.getAll();
        return new ResponseEntity<>(examDtoList, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ExamCreateDto> createExam(@RequestBody ExamCreateDto examCreateDto){

        ExamCreateDto exam =examService.createExam(examCreateDto);
        return new ResponseEntity<>(exam,HttpStatus.CREATED);
    }
    @GetMapping("/update/{id}")
    public ResponseEntity<ExamUpdateDto> getExamById(@PathVariable Long id){

        ExamUpdateDto update = examService.getUpdateExam(id);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ExamUpdateDto> updateExam(@PathVariable  Long id ,@RequestBody ExamUpdateDto examUpdateDto){

        ExamUpdateDto exam = examService.updateExam(id, examUpdateDto);
        return new ResponseEntity<>(exam,HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<ExamDto> remove(@PathVariable Long id){
        ExamDto examDto = examService.deleteExam(id);
        return new ResponseEntity<>(examDto,HttpStatus.OK);
    }

}
