package CatFamaly;

public class CatFamily {

    protected int legs;
    protected int eyes;
    protected boolean canEatPerson;

    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        legs = 4;
        eyes = 2;
        canEatPerson = true;
    }

    public void eat() {
        System.out.print("Кушаю ");
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }
}
