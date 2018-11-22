package hr.matija.grdjan.motivationjoke.service;


import hr.matija.grdjan.motivationjoke.model.MotivationJokes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final MotivationJokes motivationJokes;//Napraviti svoju klasu sa salama i metodom getRandomQuote

    public JokeServiceImpl(MotivationJokes motivationJokes) {
        this.motivationJokes = motivationJokes;
    }

    @Override
    public String getJoke() {
        return motivationJokes.getRandomQuote();
    }
}
