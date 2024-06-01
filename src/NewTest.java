public class NewTest implements Runnable {
    Integer i;

    NewTest(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (i = i; i <= 10; i++) {
            System.out.println("Элемент номер" + " " + i);
        }
    }
}
