package Shapes;

public class Triangle extends Shape{

    private int c;

    public Triangle(int a, int b, int c) {

        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    @Override
    public int getPerimetr() {
        return getA() + getB() + getC();
    }
}
