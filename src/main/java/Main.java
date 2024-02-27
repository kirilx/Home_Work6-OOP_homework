public static void main(String[] args) {

    StudentManagement studentManagement = new StudentManagement();


    studentManagement.addStudent(new Student("Ivan", 25, "computers"));
    studentManagement.addStudent(new Student("Peter", 21, "Math"));
    studentManagement.addStudent(new Student("Maria", 19, "Physics"));

studentManagement.displayAllStudents();

}
