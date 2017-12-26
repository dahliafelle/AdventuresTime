package PatternTasks;

public class CalcSingleton {
    private static CalcSingleton instance = null;

    protected CalcSingleton() {
    }

    protected static CalcSingleton getInstance() {
        if (instance == null) {
            instance = new CalcSingleton();
        }
        return instance;
    }

    protected static double add(double a, double b) {
        return a + b;
    }

    protected static double subtract(double a, double b) {
        return a - b;
    }

    protected static double multiply(double a, double b) {
        return a * b;
    }

    protected static double divide(double a, double b) {
        return a / b;
    }
}
