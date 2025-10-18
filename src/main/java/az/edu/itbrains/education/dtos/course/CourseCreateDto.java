package az.edu.itbrains.education.dtos.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseCreateDto {
    private String name;
    private String description;
    private String image;
    private Long categoryId;
    private String duration;
    private Float price;
}
