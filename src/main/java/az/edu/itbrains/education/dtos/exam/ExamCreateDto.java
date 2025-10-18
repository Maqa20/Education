package az.edu.itbrains.education.dtos.exam;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamCreateDto {
    private String name;
    private String description;
    private String image;
    private String link;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime time;
 }
