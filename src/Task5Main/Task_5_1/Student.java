package Task5Main.Task_5_1;

public class Student {
    private String firstName;
    private String lastName;

    protected String getLastName() {
        return lastName;
    }

    public String setLastName(String lastNameInput) {
        return this.lastName = lastNameInput;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstNameInput) {
        return this.firstName = firstNameInput;
    }

    void enrollCourse() {
        System.out.println("Student " + firstName + " " + lastName + " enrolled the course");
    }

    void startStudy() {
        System.out.println("Student " + firstName + " " + lastName + " started studying");
    }

    void finishStudy() {
        System.out.println("Student " + firstName + " " + lastName + " finished studying");
    }

    void getScore() {
        System.out.println("Congratulations! Student " + firstName + " " + lastName + " got highest score!");
    }

    void graduate() {
        System.out.println("Congratulations! Student " + firstName + " " + lastName + " graduated this year!");
    }


}
