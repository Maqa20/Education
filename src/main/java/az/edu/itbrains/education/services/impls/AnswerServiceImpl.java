package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.dtos.answer.AnswerCreateDto;
import az.edu.itbrains.education.dtos.answer.AnswerDto;
import az.edu.itbrains.education.dtos.answer.AnswerUpdateDto;
import az.edu.itbrains.education.repositories.AnswerRepository;
import az.edu.itbrains.education.services.AnswerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService {
    private final AnswerRepository answerRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<AnswerDto> getAll() {
        return List.of();
    }

    @Override
    public AnswerCreateDto createAnswer(AnswerCreateDto answerCreateDto) {
        return null;
    }

    @Override
    public AnswerUpdateDto getUpdateAnswer(Long id) {
        return null;
    }

    @Override
    public AnswerUpdateDto updateAnswer(Long id, AnswerUpdateDto answerUpdateDto) {
        return null;
    }

    @Override
    public AnswerDto deleteAnswer(Long id) {
        return null;
    }
}
