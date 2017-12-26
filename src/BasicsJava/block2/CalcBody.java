package BasicsJava.block2;

import java.util.Scanner;

public class CalcBody {

    public void result() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter operation: \n  add \n subtract \n  multiply \n  divide");
        String operation = scan.next();

        System.out.println("Now please enter 1st number for the operation: ");
        double numA = Double.parseDouble(scan.next());

        System.out.println("Now please enter 2nd number for the operation: ");
        double numB = Double.parseDouble(scan.next());


        switch (operation) {
            case ("add"):
                System.out.println(add(numA, numB));
                break;
            case ("subtract"):
                System.out.println(subtract(numA, numB));
                break;
            case ("multiply"):
                System.out.println(multiplicate(numA, numB));
                break;
            case ("divide"):
                System.out.println(divide(numA, numB));
                break;
            default:
                System.out.println("enter smth...");
                break;
        }

    }

    public double add(double numA, double numB) {
        return numA + numB;
    }

    public double subtract(double numA, double numB) {
        return numA - numB;
    }

    public double multiplicate(double numA, double numB) {
        return numA * numB;
    }

    public double divide(double numA, double numB) {
        return numA / numB;
    }

}

