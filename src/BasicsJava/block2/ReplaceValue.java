package BasicsJava.block2;

public class ReplaceValue {
    public static void main(String[] args) {
        String[] s = {"12", "23", "34", "12", "56", "67"};

        for (int i = 0; i < s.length; i++) {
            if (s[i] == "12") {
                s[i] = "replaced";
            }
        }
        for (int j = 0; j < s.length; j++) {
            System.out.println(s[j]);
        }
    }
}
