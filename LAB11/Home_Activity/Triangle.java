package lab11_ha;

public class Triangle implements Shape {

    private int base;
    private int height;
    private int width;

    Triangle(int base, int height,int width) {
        this.base = base;
        this.height = height;
        this.width=width;
    }

    @Override
    public double perimeter() {
        return base + height + width;

    }

}
