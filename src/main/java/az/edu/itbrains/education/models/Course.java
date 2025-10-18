package az.edu.itbrains.education.models;

import az.edu.itbrains.education.enums.CourseStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Course{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 1000)
    private String description;

    private String image;

    @Enumerated(EnumType.STRING)
    private CourseStatus courseStatus;
    
    private Float price;
    private Integer duration;
    private String link;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "course")
    private List<Lesson> lessons;

    public void setDuration(String duration) {
    }
}
