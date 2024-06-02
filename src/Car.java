import java.util.Scanner;

public class Car {
    public void moveCar() throws InterruptedException {
        synchronized (this) {
            System.out.println("Car is moving");
            wait();
            System.out.println("Car has stopped");
        }
    }
    public void stopCar() throws InterruptedException {
        System.out.println("Type something to stop the Car");
        new Scanner(System.in).nextLine();
        synchronized (this) {
            notify();
        }
    }
}
