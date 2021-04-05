
package lab6;

import java.util.Scanner;

public class Assignment {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = in.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = in.nextInt();
        System.out.println("Sum is: "+ Calculator.sum(a,b));
        System.out.println("Product is: "+ Calculator.multiply(a,b));
        System.out.println("Division is: "+ Calculator.divide(a,b));
        System.out.println("Remainder is: "+ Calculator.modulus(a,b));
        System.out.println("Sine is: "+ Calculator.sine(90));
        System.out.println("cos is: "+ Calculator.cos(180));
        System.out.println("tan is: "+ Calculator.tan(45));
    }
}


