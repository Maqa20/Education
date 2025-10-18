package az.edu.itbrains.education.dtos.exam;

import az.edu.itbrains.education.dtos.question.QuestionDto;
import az.edu.itbrains.education.enums.ExamStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamDto {
    private String name;
    private String description;
    private String image;
    private String link;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime time;
    private ExamStatus examStatus;
    private List<QuestionDto> questions;
}
