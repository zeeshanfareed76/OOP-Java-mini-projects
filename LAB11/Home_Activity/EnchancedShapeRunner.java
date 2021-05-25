
package lab11_ha;

public class EnchancedShapeRunner {
    public static void main(String[] args) {
       Shape triangle=new Triangle(5,3,4);
        System.out.println("Perimeter of Triangle = "+triangle.perimeter());
        System.out.println();
        
        Shape rectangle=new Rectangle(7,5);
        System.out.println("Perimeter of Rectangle = "+rectangle.perimeter());
        System.out.println();
        
        Shape circle=new Circle(11.4);
        System.out.println("Perimeter of Circle = "+circle.perimeter());
        
    }
    
}
