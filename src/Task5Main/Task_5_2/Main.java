package Task5Main.Task_5_2;

public class Main {
    public static void main(String[] args) {
        PhdStudent phdStudent = new PhdStudent();
        phdStudent.setFirstName("Kitten");
        phdStudent.setLastName("Invasion");
        phdStudent.enrollCourse();
        phdStudent.startStudy();
        phdStudent.getScore();
        phdStudent.finishStudy();
        phdStudent.defendThesis();
        phdStudent.graduate();


        MasterStudent masterStudent = new MasterStudent();
        masterStudent.setFirstName("Doggy");
        masterStudent.setLastName("Invasion");
        masterStudent.enrollCourse();
        masterStudent.startStudy();
        masterStudent.getScore();
        masterStudent.finishStudy();
        masterStudent.graduate();
    }
}
