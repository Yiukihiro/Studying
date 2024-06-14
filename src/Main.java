import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
        Course firstCourse = new Course(1, "First Course");
        firstCourse.display();
        Course secondCourse = new Course(2, "Second Course");
        secondCourse.display();
            System.out.println(firstCourse.equals(secondCourse));

            List<Course> courses = new ArrayList<>();
            courses.add(firstCourse);
            courses.add(secondCourse);
            PrintCourse(courses);
    }
    public static void PrintCourse(List<Course> courses) {
        for (Course course : courses) {
            course.display();
        };
    }
}