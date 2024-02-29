public static void main(String[] args) {

    StudentManagement system = new StudentManagement();
Student allice = new HighSstudentSchool("alice",20,"Math",5);
   Student john = new UniversityStudent("john",26,"Psychology","Siance");
   system.addStudent(new Student("ivan", 25, "computers"));
  system.addStudent(new UniversityStudent("peter",24,"Gymnastic","Sports"));
  system.addStudent(new Student("maria", 19, "Physics"));

    system.addStudent(allice);
    system.addStudent(john);

//system.displayAllStudents();
system.searchStudentByName("peter");
}
