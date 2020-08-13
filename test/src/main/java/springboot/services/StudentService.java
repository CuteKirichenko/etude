package springboot.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.entity.Student;
import springboot.repository.StudentRepo;

import javax.transaction.Transactional;

@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class StudentService {

    @Autowired
    private final StudentRepo studentRepo;

    public boolean createUserokOk(String name, int age) {
        try {
            Student student = new Student();
            student.setName("Tatiyana");
            student.setAge(27);
            student.setId(1L);
            studentRepo.saveAndFlush(student);
        } catch (Throwable e) {
            log.error(e.getMessage());
        }
        return true;
    }

}
