//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 9/30/16
//Class - 4th Period
//Lab  - Circle

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;	
	}

	public void calculateArea( )
	{
		area = Math.PI * radius * radius;
	}

	public void print( )
	{
		System.out.print("The area is ::" + " ");
		System.out.printf("%.4f", area);
		System.out.println();
		System.out.println();
	}
}