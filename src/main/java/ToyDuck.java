public  class ToyDuck extends Birds implements Flyable, Swimmable{
    static int count;
    public void fly()
    {
        System.out.println("toyduck IS FLYING");
    }

    @Override
    public void incrementCount() {
        count++;
    }
    @Override
    public void decrementCount()
    {
        count--;
    }
    int getCount() {
        return count;
    }
    @Override
    public void swim()
    {
        System.out.println("toyduck IS swimming");
    }

}
