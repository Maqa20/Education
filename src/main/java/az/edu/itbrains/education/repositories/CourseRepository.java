package az.edu.itbrains.education.repositories;

import az.edu.itbrains.education.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
