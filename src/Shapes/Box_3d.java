package Shapes;

public class Box_3d extends Box{

    private int weight;

    public Box_3d () {
        super(1,1,1);
        this.weight = 1;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Weight: " + weight + " kg");
    }
}
