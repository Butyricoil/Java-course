package Shapes;

public class Ractangle extends Shape {

    public Ractangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int Perimeter() {
        return super.Perimeter() * 2;
    }
}