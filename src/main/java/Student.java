
public class Student {

    private String name ;
    private  int age ;
    private  String course ;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    private void setCourse(String course) {
        this.course = course;
    }
}
