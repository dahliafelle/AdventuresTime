package Task7.Task_71;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {

    private String name;
    private String surname;
    private String dateOfCreation;

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
        return this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setSurname(String setSurname) {
        return this.surname = surname;
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
