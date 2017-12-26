package Task5Main.Task_5_7;

import Interfaces.IWorkable;

public class MasterStudent implements IWorkable {
    @Override
    public void getPaid(int payment) {
        System.out.println("Your payment per hour is: " + payment);
    }

    @Override
    public void work(int hours) {
        System.out.println("You worked " + hours + "today");
    }


}
