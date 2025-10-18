package az.edu.itbrains.education.dtos.course;


import az.edu.itbrains.education.dtos.category.CategoryDto;
import az.edu.itbrains.education.enums.CourseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    private Long id;
    private String name;
    private String description;
    private String image;
    private String link;
    private CategoryDto category;
    private String duration;
    private Float price;
    private CourseStatus status;
}
