package Task7.Task_72;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);

        StudentwithBuilder stud = new StudentwithBuilder.Builder()
                .builder();
    }
}
