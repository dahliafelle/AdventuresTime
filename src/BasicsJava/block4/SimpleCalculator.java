package BasicsJava.block4;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter action + - * /");
        char action = scan.next().charAt(0);
        System.out.println("enter first number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        int b = scan.nextInt();

        switch (action) {
            case ('+'):
                System.out.println("result: ");
                System.out.println(a + b);
                break;
            case ('-'):
                System.out.println("result: ");
                System.out.println(a - b);
                break;
            case ('*'):
                System.out.println("result: ");
                System.out.println(a * b);
                break;
            case ('/'):
                System.out.println("result: ");
                System.out.println(a / b);
                break;
            default:
                System.out.println("..you're stupid ^^ ");
        }
    }
}

