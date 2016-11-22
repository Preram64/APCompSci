//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 9/28/16
//Class - 4th Period
//Lab  - Sums

public class Sum
{
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void sum( )
	{
		sum = one + two;
		
	}

	public void print( )
	{
		System.out.print(one + "+" + two + "==");
		System.out.printf("%.2f", sum);
		System.out.println();
		System.out.println();
	}
}
