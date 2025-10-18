package az.edu.itbrains.education.controllers;

import az.edu.itbrains.education.dtos.answer.AnswerCreateDto;
import az.edu.itbrains.education.dtos.answer.AnswerDto;
import az.edu.itbrains.education.dtos.answer.AnswerUpdateDto;
import az.edu.itbrains.education.services.AnswerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

    @GetMapping("/all")
    public ResponseEntity<List<AnswerDto>> getAll(){

        List<AnswerDto> answerDtoList = answerService.getAll();
        return new ResponseEntity<>(answerDtoList, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<AnswerCreateDto> createAnswer(@RequestBody AnswerCreateDto answerCreateDto){

        AnswerCreateDto answer =answerService.createAnswer(answerCreateDto);
        return new ResponseEntity<>(answer,HttpStatus.CREATED);
    }
    @GetMapping("/update/{id}")
    public ResponseEntity<AnswerUpdateDto> getAnswerById(@PathVariable Long id){

        AnswerUpdateDto update = answerService.getUpdateAnswer(id);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<AnswerUpdateDto> updateAnswer(@PathVariable  Long id ,@RequestBody AnswerUpdateDto answerUpdateDto){

        AnswerUpdateDto answer = answerService.updateAnswer(id, answerUpdateDto);
        return new ResponseEntity<>(answer,HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<AnswerDto> remove(@PathVariable Long id){
        AnswerDto answerDto = answerService.deleteAnswer(id);
        return new ResponseEntity<>(answerDto,HttpStatus.OK);
    }

}
