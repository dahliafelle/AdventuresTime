package BasicsJava.block2;

import java.util.Arrays;

public class UniqueSorted {
    public static void main(String[] args) {
        //OLD fashion way
        int[] matrix = {1, 6, 3, 3, 4, 5, 5, 6, 0};
        int[] uniqueValues = onlyUnique(matrix);

        for (int i = 0; i < uniqueValues.length; i++) {

            System.out.println(uniqueValues[i]);
        }
    }

    public static int[] onlyUnique(int[] matrix) {
        boolean[] tempMatrix = new boolean[matrix.length];
        int removeItems = 0;

        for (int j = 0; j < matrix.length; j++) {
            if (!tempMatrix[j]) {
                int temp = matrix[j];

                for (int k = j + 1; k < matrix.length; k++) {
                    if (temp == matrix[k]) {
                        tempMatrix[k] = true;
                        removeItems++;
                    }
                }
            }
        }
        int[] onlyUniqueMatrix = new int[matrix.length - removeItems];

        for (int i = 0, j = 0; i < matrix.length; i++) {
            if (!tempMatrix[i]) {

                onlyUniqueMatrix[j++] = matrix[i];
            }
        }
        Arrays.sort(onlyUniqueMatrix);
        return onlyUniqueMatrix;

    }
}
