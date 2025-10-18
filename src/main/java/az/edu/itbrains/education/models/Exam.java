package az.edu.itbrains.education.models;

import az.edu.itbrains.education.enums.ExamStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String image;
    private String link;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime time;

    @Enumerated(EnumType.STRING)
    private ExamStatus examStatus;

    @OneToMany(mappedBy = "exam")
    private java.util.List<Question> questions;

}
