
package lab6;

public class Home_Activity_2 {
    public static void main(String args[]) {
        ObjectCounter o1 = new ObjectCounter();
        ObjectCounter o2 = new ObjectCounter();
        ObjectCounter o3 = new ObjectCounter();
        ObjectCounter o4 = new ObjectCounter();
        System.out.println("Number of Objects Created: " + ObjectCounter.getcObj());
        ObjectCounter.delete(o3);
        System.out.println("Number of Objects Deleted: " + ObjectCounter.getdObj());
        System.out.println("Number of Objects present: " + ObjectCounter.getcObj());
    }
}
