package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.dtos.lesson.LessonCreateDto;
import az.edu.itbrains.education.dtos.lesson.LessonDto;
import az.edu.itbrains.education.dtos.lesson.LessonUpdateDto;
import az.edu.itbrains.education.repositories.LessonRepository;
import az.edu.itbrains.education.services.LessonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LessonServiceImpl implements LessonService {
    private final LessonRepository lessonRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<LessonDto> getAll() {
        return List.of();
    }

    @Override
    public LessonCreateDto createLesson(LessonCreateDto lessonCreateDto) {
        return null;
    }

    @Override
    public LessonUpdateDto getUpdateLesson(Long id) {
        return null;
    }

    @Override
    public LessonUpdateDto updateLesson(Long id, LessonUpdateDto lessonUpdateDto) {
        return null;
    }

    @Override
    public LessonDto deleteLesson(Long id) {
        return null;
    }
}
