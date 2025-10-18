package az.edu.itbrains.education.services;

import az.edu.itbrains.education.dtos.answer.AnswerCreateDto;
import az.edu.itbrains.education.dtos.answer.AnswerDto;
import az.edu.itbrains.education.dtos.answer.AnswerUpdateDto;

import java.util.List;

public interface AnswerService {
    List<AnswerDto> getAll();

    AnswerCreateDto createAnswer(AnswerCreateDto answerCreateDto);

    AnswerUpdateDto getUpdateAnswer(Long id);

    AnswerUpdateDto updateAnswer(Long id, AnswerUpdateDto answerUpdateDto);

    AnswerDto deleteAnswer(Long id);
}

