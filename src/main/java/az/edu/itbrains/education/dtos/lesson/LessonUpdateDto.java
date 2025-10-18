package az.edu.itbrains.education.dtos.lesson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LessonUpdateDto {
    public String name;
    private String description;
    private String video;
    private String image;
    private int index;
    private Long courseId;

}
