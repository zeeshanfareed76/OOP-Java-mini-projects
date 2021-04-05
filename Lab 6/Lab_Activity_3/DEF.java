
package lab6;

public class DEF {
public static int i ;
public String s;
 
 
 public static void displayStatic() //Static method
 {
     i=1;
 System.out.println("i:"+i);
 }
 
 public void display() //non static method
 {
 System.out.println("i:"+i);
 System.out.println("s:"+s);
 }
}

