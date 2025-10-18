package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.dtos.exam.ExamCreateDto;
import az.edu.itbrains.education.dtos.exam.ExamDto;
import az.edu.itbrains.education.dtos.exam.ExamUpdateDto;
import az.edu.itbrains.education.repositories.ExamRepository;
import az.edu.itbrains.education.services.ExamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ExamDto> getAll() {
        return List.of();
    }

    @Override
    public ExamCreateDto createExam(ExamCreateDto examCreateDto) {
        return null;
    }

    @Override
    public ExamUpdateDto getUpdateExam(Long id) {
        return null;
    }

    @Override
    public ExamUpdateDto updateExam(Long id, ExamUpdateDto examUpdateDto) {
        return null;
    }

    @Override
    public ExamDto deleteExam(Long id) {
        return null;
    }
}
