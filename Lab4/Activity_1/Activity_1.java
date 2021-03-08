
package lab4;

public class Activity_1 {
    public static void main (String[] args){
    Circle c1 = new Circle();
    c1.setRadius(5);
    c1.CalculateCircumfrance( );
    int r = c1.getRadius();
    Circle c2 = new Circle(r);
    c2.setRadius(7);
    c2.CalculateCircumfrance( );
}

}
