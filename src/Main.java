import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {

/*        //Starting process
        TestProcess nT = new TestProcess();
        nT.start();

        //Checking typing
        new Scanner(System.in).nextLine();
        nT.quiteProcess();
*/

        final Car bmw = new Car();

        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bmw.moveCar();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
//2nd thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bmw.stopCar();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //Starting

        t1.start();
        t2.start();

        //Synchronizing

        try {
            t1.join();
            t2.join();}
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}