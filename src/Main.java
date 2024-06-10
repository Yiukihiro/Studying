import java.util.Objects;

public class Main {

    public static void main(String[] args)  {
        Course firstCourse = new Course(1, "First Course");
        firstCourse.display();
        Course secondCourse = new Course(2, "Second Course");
        secondCourse.display();
            System.out.println(firstCourse.equals(secondCourse));
    }
}