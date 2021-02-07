package homeworkOOP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student extends Person {
        private String faculty;
        private int facultyNumber;

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", facultyNumber=" + facultyNumber +
                '}';
    }

   /* @Override
    public void hasWork() {
        System.out.println("Test3");
    }*/

    // @Override
    public void printInfo() {
        System.out.println("test1");
    }

    public void printInfo(String info) {
        System.out.println("info");
    }
}
