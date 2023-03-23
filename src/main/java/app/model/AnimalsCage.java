package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class AnimalsCage {
    private Animal animal;
    @Autowired
    private AnimalsCage(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    @Autowired
    Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.print("At: ");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
