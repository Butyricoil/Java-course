package interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        ArrayList<Animal> animal = new ArrayList<Animal>();
        animal.add(cat);
        animal.add(dog);
        animal.add(bird);
        animal.add(fish);

        for (Animal animals : animal) {
            animals.eat();
        }

        Animal animal = new Dog();
        animal.eat();
        Dog dog = (Dog) animal;
        ((Dog) animal).run();

    }
}
