package springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springboot.entity.Userok;
import springboot.repository.UserokRepo;

@SpringBootApplication
@RequiredArgsConstructor
public class AppRun {

    @Autowired
    UserokRepo userokRepo;

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Userok userok = new Userok();
            userok.setName("Tatiyana");
            userok.setAge(27);
            userokRepo.saveAndFlush(userok);
        };
    }
}
