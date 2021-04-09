import java.util.*;

public class BirdsSanctuary {
    private Set<Birds> birdsList = new HashSet<>();
    static BirdsSanctuary instance;

    static synchronized BirdsSanctuary getInstance()
    {
        if (instance == null)
        {
            instance = new BirdsSanctuary();
        }
        return instance;
    }
    public void add(Birds bird) {
        boolean birdsChecks = birdsList.stream().anyMatch(i -> i.equals(bird));
        if (!birdsChecks) {
            birdsList.add(bird);
            bird.incrementCount();
        }
    }
    public void removebird(Birds bird)
    {
        birdsList.remove(bird);
        bird.decrementCount();
    }
    public void printfyable() {
        for (Birds bird : birdsList) {
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }
    public void prinswimmable() {
        for (Birds bird : birdsList) {
            if (bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
        }
    }

    public void prineatable() {
        for (Birds bird : birdsList) {
            if (bird instanceof Eatable) {
                ((Eatable) bird).eat();

            }
        }
    }
}

