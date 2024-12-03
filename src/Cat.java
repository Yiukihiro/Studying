public class Cat extends Behavior {
    protected static String noise = "Cat can meow";

    Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(noise);
    }
}
