package springboot.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "course", schema = "public")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseNAme;

    @Column(name = "teacher")
    private String teacher;
}
