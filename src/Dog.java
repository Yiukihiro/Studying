public class Dog extends Behavior{
    protected static String noise = "Dog can bark";

    Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(noise);
    }
}
