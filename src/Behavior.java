public abstract class Behavior implements Animal {
    String name;
    int age;

    public Behavior(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void info() {
        System.out.println(name + " " + "is a" + " " + age + " " + "years old" + " " + this.getClass().getSimpleName() );
    }

    @Override
    public void eat() {
        System.out.println(name + " " + "can eating");
    }

    @Override
    public void sleep() {
        System.out.println(name + " " + "can sleeping");
    }


}
