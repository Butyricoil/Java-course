package Shapes;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box() {

    }

    public void setValues(int length, int width, int height) {

        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void getValues(int length, int width, int height) {
        System.out.println("length = " + length + "width = " + width + "height = " + height);
    }

    public void showInfo() {
        System.out.println("Box info:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public double volume() {
        return length * width * height;
    }

    public Box increase(Box another) {
        another.length = this.length * 2;
        another.width = this.width * 2;
        another.height = this.height * 2;

        return another;
    }

    public int compare(Box another) {
        if (this.volume() > another.volume()) {
            return 1;
        } else if (this.volume() < another.volume()) {
            return -1;
        } else {
            return 0;
        }
    }
}
