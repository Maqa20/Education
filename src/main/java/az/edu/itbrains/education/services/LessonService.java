package az.edu.itbrains.education.services;

import az.edu.itbrains.education.dtos.lesson.LessonCreateDto;
import az.edu.itbrains.education.dtos.lesson.LessonDto;
import az.edu.itbrains.education.dtos.lesson.LessonUpdateDto;

import java.util.List;

public interface LessonService {
    List<LessonDto> getAll();

    LessonCreateDto createLesson(LessonCreateDto lessonCreateDto);

    LessonUpdateDto getUpdateLesson(Long id);

    LessonUpdateDto updateLesson(Long id, LessonUpdateDto lessonUpdateDto);

    LessonDto deleteLesson(Long id);
}
