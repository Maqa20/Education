package az.edu.itbrains.education.repositories;

import az.edu.itbrains.education.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
