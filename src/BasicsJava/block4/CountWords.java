package BasicsJava.block4;

public class CountWords {


    public static void main(String[] args) {

        String text = "Some test, string, to cont number of chars";
        String delimiter = "\\s";
        String[] words = text.split(delimiter);
        System.out.println(words.length);
    }
}
