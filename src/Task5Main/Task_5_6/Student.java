package Task5Main.Task_5_6;

import java.lang.String;

public class Student {

    private String name;
    private String surname;

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + "@" + Integer.toHexString(hashCode());
    }

    public String setName(String nameInput) {

        return this.name = nameInput;
    }

    public String getName() {
        return name;

    }

    public String setSurname(String surnameInput) {

        return this.surname = surnameInput;
    }

    public String getSurname() {
        return surname;
    }

}
