
package lab5;


public class Distance {
    private int feet,inch;
    public Distance(){
    feet=2;
    inch=3;
    }
    
   public Distance(int a, int b){
       feet=a;
       inch=b;
   }
   public void setfeet(int a){
       feet=a;
   }
   public void setinch(int b){
       inch=b;
   }
   public int getfeet(){
       return feet;
   }
   public int getinch(){
       return inch;
   }
   public Distance add(Distance Da){
       Distance d_new= new Distance(feet+Da.feet,inch+Da.inch);
       return d_new;
   }
   public void Display(){
       System.out.println("Feets: "+feet);
       System.out.println("Inches: "+inch);
   }
}
