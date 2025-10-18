package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.models.User;
import az.edu.itbrains.education.repositories.UserRepository;
import az.edu.itbrains.education.services.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public User findUSerById() {
        return userRepository.findById(1L).orElse(null);
    }
}
