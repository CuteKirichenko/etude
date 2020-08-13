package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    Student findByName(String name);
}
