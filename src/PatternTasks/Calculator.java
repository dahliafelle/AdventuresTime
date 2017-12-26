package PatternTasks;

public class Calculator {
    public static void main(String[] args) {

        // CalcSingleton calcSingleton = CalcSingleton.getInstance();
        System.out.println(CalcSingleton.add(3, 5));
        System.out.println(CalcSingleton.divide(9, 0));
    }
}
