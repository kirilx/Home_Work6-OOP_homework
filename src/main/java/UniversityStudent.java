public class UniversityStudent extends Student {
    private String major;

    public UniversityStudent(String name, int age, String course, String major) {
        super(name, age, course);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    private void setMajor(String major) {
        if (major.isEmpty()) {
            System.out.println("Major cannot be empty");

        } else {
            this.major = major;
        }
    }
}
