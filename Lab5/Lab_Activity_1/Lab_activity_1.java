
package lab5;

public class Lab_activity_1 {

    public static void main(String args[]) {
    ObjectPass p = new ObjectPass();
    p.value = 7;
    System.out.println("Before calling: " + p.value);
    p.increment(p);
    System.out.println("After calling: " + p.value);

    }
}
