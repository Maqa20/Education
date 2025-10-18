package az.edu.itbrains.education.repositories;

import az.edu.itbrains.education.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
