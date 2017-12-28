package Task7.Task_75;



import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private String dateOfCreation;
    Gender gender;

    public Student(){}
    public Student(String setName, String setSurname, Gender gender) {
        name = setName;
        surname = setSurname;
        this.gender = gender;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        dateOfCreation = sdf.format(new Date());
    }

//    public Gender getGender() {
//        return gender;
//    }
//
//    public Gender setGender(Gender setgender) {
//
//       return this.gender =  setgender;
//    }

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
      return  "Student name: " + this.name
              + " " + this.surname
              + "\n Gender: " + gender
              + "\n Date of Creation is: " + this.dateOfCreation;
    }
}
