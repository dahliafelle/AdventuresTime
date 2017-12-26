package PatternTasks.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Email newEmail = new Email.Builder()
                .setTo("svetlana.baliuk@gmail")
                .setCc("dahlia.felle@gmail.com")
                .setSubject("test Builder pattern")
                .setBody("Hello")
                .isAttachment(false)
                .builder();
        System.out.println(newEmail);
    }
}
