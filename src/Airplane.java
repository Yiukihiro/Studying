public class Airplane extends Vehicle implements Fuelable{

    Airplane(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " " + "flying");
    }

    @Override
    public void stop() {
        System.out.println(name + " " + "landing");
    }

    @Override
    public void refuel() {
        System.out.println(name + " " + "refuel");
    }
}
