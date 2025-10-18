package az.edu.itbrains.education.dtos.lesson;

import az.edu.itbrains.education.dtos.course.CourseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LessonDto {
    private Long id;
    public String name;
    private String description;
    private String video;
    private String image;
    private int index;
    private CourseDto course;
}
