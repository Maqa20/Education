package az.edu.itbrains.education.services.impls;
import az.edu.itbrains.education.repositories.RoleRepository;
import az.edu.itbrains.education.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;
}
