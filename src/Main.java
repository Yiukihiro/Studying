import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Starting process
        TestProcess nT = new TestProcess();
        nT.start();

        //Checking typing
        new Scanner(System.in).nextLine();
        nT.quiteProcess();

    }
}