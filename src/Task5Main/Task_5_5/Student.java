package Task5Main.Task_5_5;

public class Student {

    private String name;

    Student(String nameInput) {
        name = nameInput;
    }

    Student(Student student) {
        name = student.name;
    }

    public String setName(String nameInput) {
        return this.name = nameInput;
    }

    public String getName() {
        return name;
    }
}
