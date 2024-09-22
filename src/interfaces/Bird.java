package interfaces;

public class Bird extends Animal implements AbleToFly, AbleaToRun{

    @Override
    public void eat() {
        System.out.println("Птичий корм");

    }

    @Override
    public void fly() {
        System.out.println("Птица летает!");
    }

    @Override
    public void run() {
        System.out.println("Птица бежит!");
    }
}
