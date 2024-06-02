public class App {

    private int count = 0;
//Synchronizer
    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args) {
        App app = new App();
        app.doSomething();
    }

    public void doSomething(){
//1st thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
//2nd thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
//starter
        t1.start();
        t2.start();

//synchronized t1,t2 with main thread
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}
