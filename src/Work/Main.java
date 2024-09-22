package Work;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ChiefCook chifCook = new ChiefCook();
        Director director = new Director();
        Programmer programmer = new Programmer();

        ArrayList<Work> workList = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();

        workList.add(chifCook);
        workList.add(director);
        workList.add(programmer);

        drivers.add(programmer);
        drivers.add(chifCook);

        System.out.println("================================================================");
        for (Work w : workList) {
            w.work();
        }
        System.out.println("================================================================");
        System.out.println("----------------------------------------------------------------");

        for(Driver d : drivers) {
            d.drive();
        }
        System.out.println("----------------------------------------------------------------");
    }
}