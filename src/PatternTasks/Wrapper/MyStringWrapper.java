package PatternTasks.Wrapper;

public class MyStringWrapper implements IMyString {

    String upperCaseText;

    @Override
    public String capitalizeSymbols(String lowerCaseText) {
        upperCaseText = lowerCaseText.toUpperCase();
        return upperCaseText;
    }

}
