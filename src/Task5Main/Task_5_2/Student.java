package Task5Main.Task_5_2;

public class Student {
    protected String firstName;
    protected String lastName;

    protected Student() {
    }

    protected void enrollCourse() {
        System.out.println("Student " + firstName + " " + lastName + " enrolled the course");
    }

    protected void startStudy() {
        System.out.println("Student " + firstName + " " + lastName + " started studying");
    }

    protected void finishStudy() {
        System.out.println("Student " + firstName + " " + lastName + " finished studying");
    }

    protected void getScore() {
        System.out.println("Congratulations! Student " + firstName + " " + lastName + " got highest score!");
    }

    protected void graduate() {
        System.out.println("Congratulations! Student " + firstName + " " + lastName + " graduated this year!");
    }

    public String getLastName() {
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

}
