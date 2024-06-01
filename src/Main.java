

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число элементов до 10");
/*      new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();*/

/*      new Thread(new NewTest(new Scanner(System.in).nextInt())).start();
        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();
        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();*/

        new Thread(new Runnable() {

            @Override
            public void run() {
                int i = new Scanner(System.in).nextInt();
                for (i = i; i < 10; i++) {
                    System.out.println("Элемент номер" + " " + i);
                }
            }
        }).start();
    }
}