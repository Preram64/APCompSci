//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/3/16
//Class - 4th Period
//Lab  - Average

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void average( )
	{
		average = (one + two) / 2; 

	}
	
	public void print( )
	{
		System.out.print(one + " " + "+" + " " + two + " " + "has an average of" + " ");
		System.out.printf("%.2f", average);
		System.out.println();
		System.out.println();
		
	}
}