package springboot.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "userki", schema = "public")
public class Userok {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;


}
