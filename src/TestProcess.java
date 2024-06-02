import java.awt.print.PrinterException;

public class TestProcess extends Thread {

    private volatile boolean isStarted = true;

    @Override
    public void run() {
        while (isStarted) {
            System.out.println("Hello World");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void quiteProcess() {
        isStarted = false;
    }
}
