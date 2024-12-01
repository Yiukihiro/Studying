public class Bicycle extends Vehicle {

    Bicycle(String name){
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

}
