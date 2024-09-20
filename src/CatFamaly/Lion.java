package CatFamaly;

public class Lion extends CatFamily{

    public Lion() {
        super(4,2, true);
        setCanEatPerson(true);
    }


    @Override
    public void eat() {
    super.eat();
    System.out.println("антилопу");
    }
}

