public abstract class Vehicle implements Transport{
    protected String name;

    Vehicle(String name){
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + " " + "has started");
    }
}
