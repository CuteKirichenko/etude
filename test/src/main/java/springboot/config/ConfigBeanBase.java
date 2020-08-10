package springboot.config;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Profile({"default"})
@PropertySource("default/app.properties")
@EntityScan(basePackages = "springboot.entity")
@EnableJpaRepositories(basePackages = "springboot.repository")
public class ConfigBeanBase {

    private static String num;

    public ConfigBeanBase() {
    }

    @Autowired
    public ConfigBeanBase(@Value("${testnum}") String configNum) {
        num = configNum;
    }

    public static String getNum() {
        return num;
    }

    @Bean(name = "config")
    InitializingBean go() {
        return () ->
                LoggerFactory.getLogger(getClass()).info("test num: " + num);
    }


}

