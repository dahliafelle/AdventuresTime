package BasicsJava.block3;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] matrix = {5, 9, 3, 2, 0, -4, -8, 3, 3, -4};
        int[] arrayReversed = ArrayReverse.makeReverse(matrix);

        for (int i = 0; i < arrayReversed.length; i++) {
            System.out.println(arrayReversed[i]);
        }
    }

    public static int[] makeReverse(int[] matrix) {

        int j = matrix.length;
        for (int i = 0; i < j / 2; i++) {

            int temp = matrix[i];
            matrix[i] = matrix[j - i - 1];
            matrix[j - i - 1] = temp;

        }
        return matrix;
    }
}
