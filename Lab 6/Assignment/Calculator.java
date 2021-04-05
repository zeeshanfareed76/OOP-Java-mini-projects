
package lab6;

    public class Calculator {

    public static int sum(int a, int b){
        return (a+b);
    }
    public static int multiply(int a, int b){
        return (a*b);
    }
    public static double divide(double a, double b){
        return (a/b);
    }
    
     public static int modulus(int a, int b){
        return (a%b);
    }
     public static double sine(double a){
         double ra = Math.toRadians(a);
        return (Math.sin(ra));
    }
     public static double cos(double b){
         double rb = Math.toRadians(b);
        return (Math.cos(rb));
    }
     public static double tan(double c){
         double rc = Math.toRadians(c);
        return (Math.tan(rc));
    }
}

