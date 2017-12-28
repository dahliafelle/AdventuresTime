package Task7.Task_72;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Student {

    private String name;
    private String surname;
    private String dateOfCreation;

    Random rand = new Random();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    public Student() {
        name = String.valueOf(new StringBuilder("StudName").append(rand.nextInt(100)));
        surname = String.valueOf(new StringBuilder("StudSurname").append(rand.nextInt(1000)));
        dateOfCreation = sdf.format(new Date());
    }

    public String setDateOfCreation(String setDateOfCreation) {
        return this.dateOfCreation = setDateOfCreation;
    }

    public String getDateOfCreation() {

        return  dateOfCreation;
    }

    public String setName(String name) {

        return this.name;
    }

    public String getName() {
        return name;
    }

    public String setSurname(String surname) {

        return this.surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return  "Student name: \n'" + this.name
                + " " + this.surname
                + "'\n Date of Creation is: " + this.dateOfCreation;
    }
}