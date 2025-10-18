package az.edu.itbrains.education.repositories;

import az.edu.itbrains.education.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
