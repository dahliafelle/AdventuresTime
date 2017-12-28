package Task7.Task_73_74;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.io.IOException;

public class ReadFromFIle {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        File file = new File("students.json");


        Student[] student;
        student = mapper.readValue(file, Student[].class);
        for (int i=0; i<student.length; i++) {
            System.out.println(student[i]);
        }
    }
}