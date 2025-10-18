package az.edu.itbrains.education.repositories;

import az.edu.itbrains.education.models.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,Long> {
}
