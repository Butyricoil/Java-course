package Shapes;

public class Main {

    public static void main(String[] args) {

//        Box box = new Box();
//        Box_3d box_3d = new Box_3d();
//        box.showInfo();
//        box_3d.showInfo();

        Rectangle rec = new Rectangle(10,20);
        Triangle tri = new Triangle(10, 20,5);

        rec.showPerimetr();
        tri.showPerimetr();

    }
}
