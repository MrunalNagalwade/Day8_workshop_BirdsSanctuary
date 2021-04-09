public class Penguine extends Birds implements Swimmable, Eatable {
    static int count;

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    void decrementCount() {
        count--;
    }

    int getCount() {
        return count ;
    }

    @Override
    public void eat()
    {
        System.out.println("penguine IS eating");
    }
    @Override
    public void swim()
    {
        System.out.println("penguine IS swimming");
    }
}
