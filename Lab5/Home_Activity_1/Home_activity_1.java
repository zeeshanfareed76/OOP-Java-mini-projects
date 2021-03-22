
package lab5;

public class Home_activity_1 {

    public static void main(String args[]) {
        Distance d1= new Distance();
        Distance d2= new Distance(5,3);
        Distance d3=d2.add(d1);
        d3.Display();
    }
}
