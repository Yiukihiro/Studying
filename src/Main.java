import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Behavior> animals = new ArrayList<>();
        animals.add(new Dog("Rex", 3));
        animals.add(new Cat("Barsik", 4));
        animals.add(new Parrot("Kesha", 1));

        for (Animal animal : animals) {
            if (animal instanceof Behavior) {
                ((Behavior) animal).info(); // Вывод информации
            }
            animal.eat();
            animal.sleep();
            animal.makeNoise();
            System.out.println();
        }
    }
}
