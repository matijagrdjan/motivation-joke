package hr.matija.grdjan.motivationjoke.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MotivationJokes {
    private List<String> quotes = new ArrayList<>();

    public MotivationJokes(){
        this.quotes.add("You suck!!!");
        this.quotes.add("You are so dumb. You are really dumb, for real!");
        this.quotes.add("You are an Idiot!!!");
        this.quotes.add("don't be afraid to look like an idiot, because you are");
    }
    public String getRandomQuote() {
        return (String)this.quotes.get(ThreadLocalRandom.current().nextInt(1, this.quotes.size()));
    }
}
