package Task5Main.Task_5_7;

import Interfaces.*;

public class PhdStudent implements IWorkable {
    @Override
    public void work(int hours) {
        System.out.println("You worked " + hours + " hours today");
    }

    @Override
    public void getPaid(int payment) {
        System.out.println("Your payment per hour is: " + payment);
    }
}
