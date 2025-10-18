package az.edu.itbrains.education.services;

import az.edu.itbrains.education.dtos.exam.ExamCreateDto;
import az.edu.itbrains.education.dtos.exam.ExamDto;
import az.edu.itbrains.education.dtos.exam.ExamUpdateDto;

import java.util.List;

public interface ExamService {
    List<ExamDto> getAll();

    ExamCreateDto createExam(ExamCreateDto examCreateDto);

    ExamUpdateDto getUpdateExam(Long id);

    ExamUpdateDto updateExam(Long id, ExamUpdateDto examUpdateDto);

    ExamDto deleteExam(Long id);
}
