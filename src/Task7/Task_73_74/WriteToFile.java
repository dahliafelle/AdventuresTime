package Task7.Task_73_74;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class WriteToFile {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        Student stud1 = new Student("Vasya","Pupkin");
        Student stud2 = new Student("Ivan","Ivanovich");
        Student stud3 = new Student("Alesha","Popovich");

        Student[] students = {stud1,stud2,stud3};

        mapper.writeValue(new File("students.json"), students);

    }
}
