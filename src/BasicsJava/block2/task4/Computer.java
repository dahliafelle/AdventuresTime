package BasicsJava.block2.task4;

public class Computer {
    double ramGHz; //volume
    int hddGB;  // volume in GB
    String processor;  //name, like intel core i5, amd phantom etc
    String model; //like lenovo t-555

    public Computer(String modelInput, String processorInput) {
        model = modelInput;
        processor = processorInput;
    }

    public Computer(double ramGHzInput, int hddGBInput) {
        hddGB = hddGBInput;
        ramGHz = ramGHzInput;
        if (hddGB < 2 && ramGHz < 1) {
            System.out.println("sell this sh*t and buy new laptop (PC)");
        }
    }

    public double getRamGHz() {
        return ramGHz;
    }

    public double setRamGHz(double ramGHzInput) {
        return ramGHz = ramGHzInput;
    }

    public int getHddGB() {
        return hddGB;
    }

    public int setHddGB(int hddGBInput) {
        return hddGB = hddGBInput;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public String setModel(String modelInput) {
        return model = modelInput;
    }

    public String setProcessor(String processorInput) {
        return processor = processorInput;
    }
}
