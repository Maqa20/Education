package az.edu.itbrains.education.dtos.answer;

import az.edu.itbrains.education.dtos.question.QuestionDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto {
    private Long id;
    private String answer;
    private boolean correct;
    private QuestionDto question;
}
