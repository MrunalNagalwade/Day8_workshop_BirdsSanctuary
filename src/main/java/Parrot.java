public class Parrot extends Birds implements Flyable, Eatable {
    static int count;
    public void fly(){

        System.out.println("parrot IS FLYING");
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    void decrementCount() {
        count--;
    }

    int getCount() {
        return count;
    }

    public void eat()
    {
        System.out.println("parrot IS eating");
    }

}
