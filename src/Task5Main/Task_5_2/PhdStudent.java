package Task5Main.Task_5_2;

public class PhdStudent extends Student {
    protected void defendThesis() {
        System.out.println(" Congratulations! PhdStudent " + firstName + lastName + " defend thesis");
    }

    protected void graduate() {
        System.out.println(" Congratulations! PhdStudent " + firstName + lastName + " is graduated!");
    }
}
