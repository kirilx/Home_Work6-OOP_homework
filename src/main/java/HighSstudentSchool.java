public class HighSstudentSchool extends Student {
    private int className ;
    public HighSstudentSchool(String name, int age, String course) {
        super(name, age, course);
        this.className = 0 ;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }
}
