
package lab5;

import java.util.Scanner;

public class Assignment {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numerator, denominator;
	Fraction f1 = new Fraction();
        f1.setNumerator(3);
        f1.setDenominator(15);
        System.out.print("Enter numerator: ");
	numerator = input.nextInt();
	System.out.print("Enter denominator: ");
	denominator = input.nextInt();
	Fraction f2 = new Fraction(numerator, denominator);
	if (f1.equals(f2)) {
		f1.displayFraction();
		System.out.print(" is equal to ");
		f2.displayFraction();
	} else{
		f1.displayFraction();
		System.out.print(" is not equal to ");
		f2.displayFraction();
	}
	
}
}

