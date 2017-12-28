package Task7.Task_72;

public class StudentwithBuilder {

    private String name;
    private String surname;
    private String dateOfCreation;

    @Override
    public String toString() {
        return  "Student name: \n'" + this.name
                + " " + this.surname
                + "'\n Date of Creation is: " + this.dateOfCreation;
    }

    private StudentwithBuilder(){}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    private StudentwithBuilder(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.dateOfCreation= builder.dateOfCreation;
    }

    //Builder Class
    public static class Builder {
        private String name;
        private String surname;
        private String dateOfCreation;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public StudentwithBuilder builder() {
            return new StudentwithBuilder(this);
        }
    }
}
