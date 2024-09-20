package Shapes;

public class Rectangle extends Shape {

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int getPerimetr() {
        return (getA() + getB()) * 2;
    }

}