package homeworkOOP;

public class Main {
    public static void main(String[] args) {
       /* Student student = new Student();
        student.setFaculty("CST");
        student.setFacultyNumber(123456);
        student.printInfo();
        student.printInfo("Test2");

        System.out.println(student.toString());
        student.hasWork();*/ //lecture 7

        //Home work
        Teacher teacher = new Teacher();
        teacher.printInfo();
        teacher.setTeacherOfClass("12 A");
        teacher.setStudents(26);
        System.out.println(teacher.toString());

    }
}
