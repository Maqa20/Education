package az.edu.itbrains.education.dtos.course;

import az.edu.itbrains.education.enums.CourseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseUpdateDto {
    private String name;
    private String description;
    private String image;
    private Long categoryId;
    private String duration;
    private Float price;
    private CourseStatus courseStatus;
}
