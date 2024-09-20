package CatFamaly;

public class Cat extends CatFamily{

    public Cat() {
        super(4, 2, true);
        setCanEatPerson(false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Вискас");
    }

}
