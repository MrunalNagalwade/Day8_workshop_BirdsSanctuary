public class Duck extends Birds implements Flyable, Swimmable,Eatable {
    static int count;
    public void fly(){
        System.out.println("DUCK IS FLYING");
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

    @Override
    public void eat()
    {
        System.out.println("DUCK IS eating");
    }
    @Override
    public void swim()
    {
        System.out.println("DUCK IS swimming");
    }
}
