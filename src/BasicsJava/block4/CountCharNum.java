package BasicsJava.block4;

import java.util.Scanner;

public class CountCharNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String sentense = input.nextLine();
        String newSentense = sentense.replaceAll(" ", "");
        int charCount = 0;
        char temp;

        for (int i = 0; i < newSentense.length(); i++) {
            temp = newSentense.charAt(i);
            if (temp != ' ' && temp != '.' && temp != '"' && temp != ',')
                charCount++;
        }
        System.out.println(charCount);
    }
}
