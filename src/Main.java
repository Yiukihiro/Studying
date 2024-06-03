import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        new CreateCharacter(StartTheDialog.startTheDialog()).createCharacter();
        String answer = new Scanner(System.in).nextLine();
        switch (answer) {
            case "Нет": new PhasesList(0).phrases();
            break;
            case "Да": new PhasesList(1).phrases();
            break;
        }

    }
}