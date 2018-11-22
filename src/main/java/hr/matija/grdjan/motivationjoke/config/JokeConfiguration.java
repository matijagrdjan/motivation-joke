package hr.matija.grdjan.motivationjoke.config;

import hr.matija.grdjan.motivationjoke.model.MotivationJokes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokeConfiguration {

    @Bean
    public MotivationJokes motivationJokes(){
        return new MotivationJokes();
    }
}
