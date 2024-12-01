
public class Main {

    public static void main(String[] args) {
        Car audi = new Car("Audi");
        audi.refuel();
        audi.start();
        audi.move();
        audi.stop();

        Airplane boeing = new Airplane("Boeing");
        boeing.refuel();
        boeing.start();
        boeing.move();
        boeing.refuel();

        Bicycle bmx = new Bicycle("BMX");
        bmx.start();
        bmx.move();
        bmx.stop();

    }
}