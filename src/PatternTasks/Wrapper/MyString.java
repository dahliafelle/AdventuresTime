package PatternTasks.Wrapper;


public class MyString {
    public static void main(String[] args) {
        MyStringWrapper myStringWrapper = new MyStringWrapper();
        myStringWrapper.capitalizeSymbols("hey hey hey");
        System.out.println(myStringWrapper.upperCaseText);
    }
}
