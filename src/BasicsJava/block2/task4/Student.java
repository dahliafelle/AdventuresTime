package BasicsJava.block2.task4;

import java.util.Random;

public class Student {
    boolean isHuman;
    int age;
    String race;
    String firstName;
    String lastName;

    public Student(String raceInput, boolean isHumanInput) {
        isHuman = isHumanInput;
        race = raceInput;

    }

    public Student(String firstNameInput, String lastNameInput, boolean isHumanInput, String raceInput) {
        firstName = firstNameInput;
        lastName = lastNameInput;
        isHuman = isHumanInput;
        race = raceInput;
        age = setAge();

        if (isHuman) {
            System.out.println("U R human. OK ");
        }
        if (!isHuman) {
            System.out.println("Go back to your planet, undefined creature");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRace() {
        return race;
    }

    public int setAge() {
        for (int i = 0; i < 1; i++) {
            Random randNumber = new Random();
            age = randNumber.nextInt(100) + 1;
        }
        return age;
    }

    public String setFirstName(String firstNameInput) {
        return this.firstName = firstNameInput;
    }

    public boolean setHuman(boolean isHumanInput) {
        return isHuman = isHumanInput;
    }

    public String setLastName(String lastNameInput) {
        return lastName = lastNameInput;
    }

    public void setRace(String raceInput) {
        this.race = raceInput;
    }
}
