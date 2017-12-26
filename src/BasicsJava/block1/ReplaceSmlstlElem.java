package BasicsJava.block1;

public class ReplaceSmlstlElem {
    public static void main(String[] args) {
        double[] array = {1, -1, 2, 0, 1, 4, 5, 5, -1};
        double arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        double average = arraySum / array.length;

        System.out.println("Average sum is: " + average);

        double min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        System.out.println("min element is: " + min);

        int replacedNum = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == min) {
                replacedNum = j;

            }
        }

        array[replacedNum] = average;

        for (double anArray : array) {
            System.out.println(anArray);
        }

    }
}
