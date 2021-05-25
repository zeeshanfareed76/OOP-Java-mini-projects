package Assignment.Task2;


public class Runner {

    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(7, 6);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6, 5);       
        System.out.println("Area of Circle: "+circle.area());
        System.out.println("Area of triangle: "+triangle.area());
        System.out.println("Area of rectangle: "+rectangle.area());
    }
    
}
