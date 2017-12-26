package BasicsJava.block3;

public class FindMax {
    public static void main(String[] args) {
        double max = 0;
        double[] d = {5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        for (int i = 0; i < d.length; i++) {
            if (d[i] >= max) {
                max = d[i];
            }
        }
        System.out.println(max);
    }
}
