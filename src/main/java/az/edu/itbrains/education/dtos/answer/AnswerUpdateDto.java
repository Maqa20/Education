package az.edu.itbrains.education.dtos.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerUpdateDto {
    private String answer;
    private boolean correct;
    private Long questionId;
}
