package BasicsJava.block2.task4;

public class Car {
    String carModel;
    int carYear;
    double carEngine;
    String carPatrolType;

    public Car() {
    }

    public Car(String carModelInput, int carYearInput, String carPatrolTypeInput, double carEngineInput) {

        carModel = carModelInput;
        carYear = carYearInput;
        carPatrolType = carPatrolTypeInput;
        carEngine = carEngineInput;
    }

    public String getModel() {
        return carModel;
    }

    public String setModel(String carModelInput) {

        return carModel = carModelInput;
    }

    public int getCarYear() {

        return carYear;
    }

    public int setCarYear(int carYearInput) {

        return carYear = carYearInput;
    }

    public double getCarEngine() {

        return carEngine;
    }

    public double setEngine(double carEngineInput) {

        return carEngine = carEngineInput;
    }

    public String getCarPatrolType() {

        return carPatrolType;
    }

    public String setCarPatrolType(String carPatrolTypeInput) {

        return carPatrolType = carPatrolTypeInput;
    }
}