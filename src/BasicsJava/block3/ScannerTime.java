package BasicsJava.block3;

import java.util.Scanner;

public class ScannerTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm learning how to read info from console, so I want to print your name many times \n Enter your name pls: ");
        String name = sc.next();
        System.out.println("Enter any number: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println(name);
        }

    }
}
