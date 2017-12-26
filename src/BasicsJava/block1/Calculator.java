package BasicsJava.block1;

import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    void getData() {
        System.out.println("Enter Number : ");
        double num1 = scan.nextDouble();
        System.out.println("Select operation you want: \n" + "Select + to Add \n Select - to Subtract \n Select * for Multiplication \n Select / to Divide \n ...");
        char operator = scan.next().charAt(0);
        System.out.println("Enter Next Number : ");
        double num2 = scan.nextDouble();
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("enter smth...");
                break;
        }
    }
}
