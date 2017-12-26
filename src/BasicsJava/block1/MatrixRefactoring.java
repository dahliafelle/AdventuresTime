package BasicsJava.block1;

import java.util.Arrays;

public class MatrixRefactoring {
    public static void main(String[] args) {

        int[] matrix = {1, 3, 4, 5, 4, 3, 2, 2, 2, 2};
        int[] dlt = MatrixRefactoring.getDeleted(matrix);

        int[] reverse = MatrixRefactoring.getReversed(matrix);

        for (int k = 0; k < reverse.length; k++) {
            System.out.println(reverse[k]);
        }
        System.out.println("\n");
        for (int i = 0; i < dlt.length; i++) {
            System.out.println(dlt[i]);
        }
    }

    //sort matrix
    public static int[] getSorted(int[] matrix) {
        int[] sortedMatrix = MatrixRefactoring.getReversed(matrix);
        Arrays.sort(matrix);
        return sortedMatrix;
    }

    //get unique values, and delete duplicates
    public static int[] getDeleted(int[] matrix) {
        boolean[] newMatrix = new boolean[matrix.length];
        int removeItems = 0;

        for (int j = 0; j < matrix.length; j++) {
            if (!newMatrix[j]) {
                int temp = matrix[j];
                for (int k = j + 1; k < matrix.length; k++) {
                    if (temp == matrix[k]) {
                        newMatrix[k] = true;
                        removeItems++;
                    }
                }
            }
        }
        int[] deletedMatrix = new int[matrix.length - removeItems];

        for (int i = 0, j = 0; i < matrix.length; i++) {
            if (!newMatrix[i]) {

                deletedMatrix[j++] = matrix[i];
            }
        }
        getSorted(deletedMatrix);
        return deletedMatrix;
    }

    //reverse matrix
    public static int[] getReversed(int[] matrix) {
        int left = 0;
        int right = matrix.length - 1;

        while (left < right) {
            // swap the values at the left and right indices
            int temp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;
            left++;
            right--;
        }
        return matrix;
    }
}
