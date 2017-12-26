package Task5Main.Task_5_5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pupkin Vasyl");
        Student student2 = new Student(student1);
        PhdStudent phdStudent1 = new PhdStudent(student2);
        System.out.println(phdStudent1.getName());
    }
}
