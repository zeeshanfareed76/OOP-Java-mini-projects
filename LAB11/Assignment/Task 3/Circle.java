
package Assignment;


public class Circle implements Shape {
    private double r;
    
    Circle(double r){
        this.r=r;
    }

    public double area() {
        return 3.14*r*r;
    }
    
}
