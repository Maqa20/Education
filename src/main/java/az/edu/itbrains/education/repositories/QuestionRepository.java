package az.edu.itbrains.education.repositories;

import az.edu.itbrains.education.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
