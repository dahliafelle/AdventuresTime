package BasicsJava.block3.Caclulator;

import java.util.Scanner;

public class CalcData {

    public Scanner sc = new Scanner(System.in);

    public double inputA() {
        System.out.println("Enter first number: ");
        double numA = Double.parseDouble(sc.next());
        return numA;
    }

    public double inputB() {
        System.out.println("Enter second number: ");
        double numB = Double.parseDouble(sc.next());
        return numB;
    }

    public String inputAction() {
        System.out.println("Pls enter \n + to add\n - to subtract\n * for multiplication\n / to divide ");
        String action = sc.next();
        return action;
    }
}