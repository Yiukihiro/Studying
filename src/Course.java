public class Course {

    private int id;
    private String simpleName;

    public Course(Integer id, String simpleName) {
        this.id = id;
        this.simpleName = simpleName;
    }

    public void display() {
        System.out.println(simpleName + " " + "object hashcode: " + id);
    }

    public boolean equals(Object object) {
        return id == ((Course) object).id;
    }
}
