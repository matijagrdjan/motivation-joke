package hr.matija.grdjan.motivationjoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:joke-config.xml")
public class MotivationJokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotivationJokeApplication.class, args);
    }
}
