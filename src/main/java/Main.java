import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        BirdsSanctuary birdssanctuary = BirdsSanctuary.getInstance();
        Duck duck = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();
        Duck duck4 = new Duck();
        Parrot parrot = new Parrot();
        Penguine penguine = new Penguine();
        Penguine penguine1 = new Penguine();
        ToyDuck toyDuck = new ToyDuck();
        ToyDuck toyDuck1 = new ToyDuck();


        birdssanctuary.add(parrot);
        birdssanctuary.add(duck);
        birdssanctuary.add(penguine);
        birdssanctuary.add(duck2);
        birdssanctuary.add(duck3);
        birdssanctuary.add(duck4);
        birdssanctuary.add(penguine1);
        birdssanctuary.add(toyDuck);
        birdssanctuary.add(toyDuck1);

        birdssanctuary.removebird(duck2);
        birdssanctuary.removebird(duck3);
        birdssanctuary.removebird(duck4);

        birdssanctuary.printfyable();
        birdssanctuary.prinswimmable();
        birdssanctuary.prineatable();

        System.out.println(duck.getCount());
        System.out.println(penguine.getCount());
        System.out.println(parrot.getCount());
        System.out.println(toyDuck.getCount());
    }

}
