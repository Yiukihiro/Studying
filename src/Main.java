import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                BigInteger factorial = new BigInteger(String.valueOf(1));
                for (int i = 1; i <= 300000; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                System.out.println(factorial);
            }
        });
        t1.start();
        while (t1.isAlive()) {
            System.out.println("Падажжи");
            Thread.sleep(1000);
        }


        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}