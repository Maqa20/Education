package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.dtos.question.QuestionCreateDto;
import az.edu.itbrains.education.dtos.question.QuestionDto;
import az.edu.itbrains.education.dtos.question.QuestionUpdateDto;
import az.edu.itbrains.education.repositories.QuestionRepository;
import az.edu.itbrains.education.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<QuestionDto> getAll() {
        return List.of();
    }

    @Override
    public QuestionCreateDto createQuestion(QuestionCreateDto questionCreateDto) {
        return null;
    }

    @Override
    public QuestionUpdateDto getUpdateQuestion(Long id) {
        return null;
    }

    @Override
    public QuestionUpdateDto updateQuestion(Long id, QuestionUpdateDto questionUpdateDto) {
        return null;
    }

    @Override
    public QuestionDto deleteQuestion(Long id) {
        return null;
    }
}
