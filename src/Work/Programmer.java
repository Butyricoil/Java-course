package Work;

public class Programmer implements Work, Driver {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }

    @Override
    public void drive() {
        System.out.println("Водит машину");
    }
}
