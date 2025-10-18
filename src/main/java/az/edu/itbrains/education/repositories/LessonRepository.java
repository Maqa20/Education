package az.edu.itbrains.education.repositories;

import az.edu.itbrains.education.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson,Long> {
}
