public class Car extends Vehicle implements Fuelable{


    Car(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " " + "drive");
    }

    @Override
    public void stop() {
        System.out.println(name + " " + "stopped");
    }

    @Override
    public void refuel() {
        System.out.println(name + " " + "refuel");
    }
}
