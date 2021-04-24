import java.util.*;

public class BirdsSanctuary {
    private Set<Birds> birdsList = new HashSet<>();
    static BirdsSanctuary instance;

    private BirdsSanctuary() {

    }

    static synchronized BirdsSanctuary getInstance() {
        if (instance == null) {
            instance = new BirdsSanctuary();
        }
        return instance;
    }

    public void add(Birds bird) {
        //boolean birdsChecks = birdsList.stream().anyMatch(i -> i.equals(bird));
        try {
            if (bird == null) {
                throw new BirdSanctuaryAddException("Birds not exist");
            }
            if(birdsList.add(bird));
            {
                bird.incrementCount();
            }
        } catch (BirdSanctuaryAddException e) {
            e.printStackTrace();
        }

    }
    public void removebird(Birds bird)
    {
        birdsList.remove(bird);
        bird.decrementCount();
    }
    public void printfyable() {
        /*for (Birds bird : birdsList) {
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }*/
        birdsList.stream().filter(bird->bird instanceof Flyable).forEach(b -> ((Flyable) b).fly());
    }
    public void prinswimmable() {
        /*for (Birds bird : birdsList) {
            if (bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
        }*/
        birdsList.stream().filter(bird->bird instanceof Swimmable).forEach(b -> ((Swimmable) b).swim());
    }

    public void prineatable() {
        /*for (Birds bird : birdsList) {
            if (bird instanceof Eatable) {
                ((Eatable) bird).eat();

            }
        }*/
        birdsList.stream().filter(bird->bird instanceof Eatable).forEach(b -> ((Eatable) b).eat());
    }
}

