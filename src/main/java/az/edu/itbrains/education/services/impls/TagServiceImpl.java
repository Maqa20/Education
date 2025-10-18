package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.repositories.TagRepository;
import az.edu.itbrains.education.services.TagService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;
    private final ModelMapper modelMapper;
}
