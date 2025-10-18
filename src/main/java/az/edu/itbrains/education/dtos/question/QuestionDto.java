package az.edu.itbrains.education.dtos.question;

import az.edu.itbrains.education.dtos.exam.ExamDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    private Long id;
    private String question;
    private ExamDto exam;
}
