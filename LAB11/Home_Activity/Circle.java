
package lab11_ha;


public class Circle implements Shape {
      private double radius;
    
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double perimeter() {
       return 2 * Math.PI * radius;
    }
    
}
