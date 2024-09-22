package interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        ArrayList<AbleaToRun> animals = new ArrayList<>();
        AbleToFly ableToFly = new Bird();



        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
//        animals.add(fish);
        System.out.println("\n");
        ableToFly.fly();
        System.out.println("\n");
        for (AbleaToRun animal : animals) {
            animal.run();
        }
    }
}
