package Task7.Task_73_74;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    public String name;
    public String surname;
    public String dateOfCreation;

    public Student(){}
    public Student(String setName, String setSurname) {
        name = setName;
        surname = setSurname;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        dateOfCreation = sdf.format(new Date());
    }

    public String setDateOfCreation(String setDateOfCreation) {
       return this.dateOfCreation = setDateOfCreation;
    }

    public String getDateOfCreation() {

        return  dateOfCreation;
    }

    public String setName(String setName) {
        return this.name = setName;
    }

    public String getName() {
        return name;
    }

    public String setSurname(String setSurname) {
        return this.surname = setSurname;
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
