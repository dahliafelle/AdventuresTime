package Task5Main.Task_5_7;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.drinkBeer(9);
        student.playGames(12);

        PhdStudent phdStudent = new PhdStudent();
        phdStudent.getPaid(2);
        phdStudent.work(6);

        MasterStudent masterStudent = new MasterStudent();
        masterStudent.getPaid(3);
        masterStudent.work(12);
    }
}
