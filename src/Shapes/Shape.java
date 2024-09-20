package Shapes;

public class Shape {

    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getPerimetr() {
        return 0;
    }

    public void showPerimetr() {
        System.out.println("Perimeter = " + getPerimetr());
    }
}

