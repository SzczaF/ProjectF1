package pl.coderslab.projectf1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import pl.coderslab.projectf1.converter.ConstructorConverter;
import pl.coderslab.projectf1.converter.RaceConverter;

@SpringBootApplication
public class ProjectF1Application {
    public static void main(String[] args) {
        SpringApplication.run(ProjectF1Application.class, args);
    }

    @Bean
    public ConstructorConverter getConstructorConverter() {
        return new ConstructorConverter();
    }

    @Bean
    public RaceConverter getRaceConverter() {
        return new RaceConverter();
    }

}