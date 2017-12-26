package Task5Main.Task_5_4;

public class CompareObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Ivan");
        Student student2 = new Student();
        student2.setName("Ivan");
        System.out.println(student1.equals(student2));
    }
}
