import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
    }


    public List<Student> getStudents() {
        return students;
    }
    public void displayAllStudents() {
        if(students.isEmpty()){
            System.out.println("List with the students is empty ");
        } else {
            System.out.println("List with the students:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + " Age: " + student.getAge() + " Course "+ student.getCourse());
                if (student instanceof HighSstudentSchool ) {
                    System.out.println(", Classname: " + ((HighSstudentSchool) student).getClassName());
                    

                } else if (student instanceof UniversityStudent) {
                    System.out.println(", Major: " + ((UniversityStudent) student).getMajor());
                    
                }
            }

        }
    }
}
