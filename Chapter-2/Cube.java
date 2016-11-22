//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 9/30/16
//Class - 4th Period
//Lab  - Cube

public class Cube
{
	private double side;
	private double surfaceArea;

	public void setSide(double s)
	{
		side = s;	
	}

	public void calculateSurfaceArea( )
	{
		surfaceArea = 6 * Math.pow(side, 2);
	}

	public void print( )
	{
		System.out.print("The surface area is :: ");
		System.out.printf("%.0f", surfaceArea);
		System.out.println();
		System.out.println();
		System.out.println();
				
	}
}