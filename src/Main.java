
import java.util.Scanner;

public class Main {

    //release Threads lessons

    public static void main(String[] args) {
        System.out.println("Введите число элементов до 10");
/*
        //release with additional Class
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();*/

        //Thread class release
        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();
        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();
        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();

        //release with Runnable

        new Thread(new Runnable() {

            @Override
            public void run() {
                int i = new Scanner(System.in).nextInt();
                for (; i <= 10; i++) {
                    System.out.println("Элемент номер" + " " + i);
                }
            }
        }).start();
    }
}