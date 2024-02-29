public class HighSstudentSchool extends Student {
    private int grade;

    public HighSstudentSchool(String name, int age, String course, Integer grade) {
        super(name, age, course);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    private void setGrade(int className) {
        if (grade > 0) {
            this.grade = className;
        } else {
            System.out.println("Grade must be positive");
        }
    }
}
