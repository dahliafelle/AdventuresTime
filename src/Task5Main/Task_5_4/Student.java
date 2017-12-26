package Task5Main.Task_5_4;

public class Student {
    String name;

    Student() {
    }

    Boolean equals(Student student) {
        return this.name.equals(student.name);
    }

    public String getName() {
        return name;
    }

    public String setName(String nameInput) {
        return name = nameInput;
    }
}
