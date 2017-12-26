package Task5Main.Task_5_3;

public class CopyConstructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Ivan");
        Student student2 = new Student(student1);
        student2.setFirstName("Petro");
        System.out.println(student1.firstName + student2.firstName);
    }
}
