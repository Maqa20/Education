package az.edu.itbrains.education.services;

import az.edu.itbrains.education.dtos.question.QuestionCreateDto;
import az.edu.itbrains.education.dtos.question.QuestionDto;
import az.edu.itbrains.education.dtos.question.QuestionUpdateDto;

import java.util.List;

public interface QuestionService {
    List<QuestionDto> getAll();

    QuestionCreateDto createQuestion(QuestionCreateDto questionCreateDto);

    QuestionUpdateDto getUpdateQuestion(Long id);

    QuestionUpdateDto updateQuestion(Long id, QuestionUpdateDto questionUpdateDto);

    QuestionDto deleteQuestion(Long id);
}
