package Task5Main.Task_5_7;

import Interfaces.IChillable;

class Student implements IChillable {

    public void drinkBeer(int amount) {
        System.out.println("Student' record is " + amount + "l of beer");

    }

    public void playGames(int hours) {
        System.out.println("You already played " + hours + "! Its time to rest");
    }
}
