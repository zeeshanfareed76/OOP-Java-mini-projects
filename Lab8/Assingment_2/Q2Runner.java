
package lab8;
public class Q2Runner {
    public static void main(String[] args) {
        
        Computer c=new Computer(8,8192, 51200, 3072);
        c.Display();

        Laptop l=new Laptop(4,3,6,4,8,4096,327680,1740);
        l.Display();
    }
}