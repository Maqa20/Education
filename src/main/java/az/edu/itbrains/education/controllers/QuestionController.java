package az.edu.itbrains.education.controllers;
import az.edu.itbrains.education.dtos.question.QuestionCreateDto;
import az.edu.itbrains.education.dtos.question.QuestionDto;
import az.edu.itbrains.education.dtos.question.QuestionUpdateDto;
import az.edu.itbrains.education.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/all")
    public ResponseEntity<List<QuestionDto>> getAll(){

        List<QuestionDto> questionDtoList = questionService.getAll();
        return new ResponseEntity<>(questionDtoList, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<QuestionCreateDto> createQuestion(@RequestBody QuestionCreateDto questionCreateDto){

        QuestionCreateDto question =questionService.createQuestion(questionCreateDto);
        return new ResponseEntity<>(question,HttpStatus.CREATED);
    }
    @GetMapping("/update/{id}")
    public ResponseEntity<QuestionUpdateDto> getQuestionById(@PathVariable Long id){

        QuestionUpdateDto update = questionService.getUpdateQuestion(id);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<QuestionUpdateDto> updateQuestion(@PathVariable  Long id ,@RequestBody QuestionUpdateDto questionUpdateDto){

        QuestionUpdateDto question = questionService.updateQuestion(id, questionUpdateDto);
        return new ResponseEntity<>(question,HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<QuestionDto> remove(@PathVariable Long id){
        QuestionDto questionDto = questionService.deleteQuestion(id);
        return new ResponseEntity<>(questionDto,HttpStatus.OK);
    }

}
