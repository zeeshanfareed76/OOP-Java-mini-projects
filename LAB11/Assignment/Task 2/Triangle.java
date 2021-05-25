package Assignment.Task2;

public class Triangle implements Shape {
    private int b;
    private int h;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return 0.5*b*h;
    }
}
