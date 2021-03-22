
package lab5;

public class Fraction {
    private int numerator;
	private int denominator;
        
        public Fraction() 
	{
		numerator = 5;
		denominator = 3;
	}

	public Fraction(int n, int d) 
	{
		numerator = n;
		denominator = d;
	}

	public void setNumerator(int n) 
	{
		numerator = n;
	}
	public void setDenominator(int d)
	{
		denominator = d;
	}

	public void displayFraction()
	{
		System.out.print(numerator + "/" + denominator);
	}

	public boolean equals(Fraction f)
	{
		int num1, num2;
		int num3, num4;
		int num5 = 1;
		for (int i = 2; i <= Math.min(numerator, denominator); i++) 
		{

			if (numerator % i == 0 && denominator % i == 0)
				num5 = i;
		}

		num1 = numerator / num5;
		num2 = denominator / num5;

		int otherGcf = 1;
		for (int i = 2; i <= Math.min(f.numerator, f.denominator); i++) 
		{
			
			if (f.numerator % i == 0 && f.denominator % i == 0)
				otherGcf = i;
		}

		num3 = f.numerator / otherGcf;
		num4 = f.denominator / otherGcf;

		return (num1 == num3 && num2 == num4);

}
}