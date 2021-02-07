package homeworkOOP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    private String name;
    private int age;
    private ContactINfo contactInfo;// Has-A aggregation


    public abstract void printInfo();

    public void hasWork(){
        System.out.println("test2");
    }
}
