package homeworkOOP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Teacher extends Person{
    private String teacherOfClass;
    private int students;

    @Override
    public String toString() {
        return "Teacher{" +
                "The class is " + teacherOfClass +
                " the students in the class are " + students +
                '}';
    }


    @Override
    public void printInfo() {
        System.out.println("The name of the teacher is Marya");
    }
}
