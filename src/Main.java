
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {

    //release Threads lessons

    public static void main(String[] args) {
        System.out.println("Введите число элементов до 10");

        //Using Threads for coping site code
        try {
            URL openSite = new URL("https://yummyani.me");
            ReadableByteChannel readSite = Channels.newChannel(openSite.openStream());
            FileOutputStream writeSite = new FileOutputStream("writeSite.txt");
            writeSite.getChannel().transferFrom(readSite, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }

/*
        //release with additional Class
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();
        new ElementsList(new Scanner(System.in).nextInt()).start();*/

        //Thread class release
//        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();
//        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();
//        new Thread(new NewTest(new Scanner(System.in).nextInt())).start();

//        //release with Runnable
//
//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                int i = new Scanner(System.in).nextInt();
//                for (; i <= 10; i++) {
//                    System.out.println("Элемент номер" + " " + i);
//                }
//            }
//        }).start();
    }
}