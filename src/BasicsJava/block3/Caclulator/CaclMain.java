package BasicsJava.block3.Caclulator;

public class CaclMain {
    public static void main(String[] args) {
        CalcData inputNum = new CalcData();
        CaclFunction a = new CaclFunction();
        String action;

        action = inputNum.inputAction();
        double numA = inputNum.inputA();
        double numB = inputNum.inputB();
        switch (action) {
            case "+":
                System.out.println("result is: ");
                System.out.println(a.add(numA, numB));
                break;
            case "-":
                System.out.println("result is: ");
                System.out.println(a.subtract(numA, numB));
                break;
            case "*":
                System.out.println("result is: ");
                System.out.println(a.multiplicate(numA, numB));
                break;
            case "/":
                System.out.println("result is: ");
                System.out.println(a.divide(numA, numB));
                break;
        }
    }
}
