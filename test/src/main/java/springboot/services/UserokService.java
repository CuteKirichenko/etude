package springboot.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springboot.entity.Userok;
import springboot.repository.UserokRepo;

import javax.transaction.Transactional;

@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class UserokService {

    private final UserokRepo userokRepo;

    public boolean createUserokOk(String name, int age) {
        try {
            Userok userok = new Userok();
            userok.setName("Tatiyana");
            userok.setAge(27);
            userok.setId(1L);
            userokRepo.saveAndFlush(userok);
        } catch (Throwable e) {
            log.error(e.getMessage());
        }
        return true;
    }

}
