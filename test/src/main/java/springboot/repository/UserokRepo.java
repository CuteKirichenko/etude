package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.entity.Userok;

@Repository
public interface UserokRepo extends JpaRepository<Userok, Long> {

    Userok findByName(String name);

    Userok saveAndFlush(Userok userok);
}
