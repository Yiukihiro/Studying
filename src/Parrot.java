public class Parrot extends Behavior{
    protected static String noise = "Parrot can repeat words";

    Parrot(String name, int age){
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(noise);
    }
}
