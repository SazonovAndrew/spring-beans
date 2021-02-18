package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say: ");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println("It isn't a DI: " + new Timer().getTime());
        System.out.println("It's a DI: " + timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer(){
        return timer;
    }
}
