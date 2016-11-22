 //© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/3/16
//Class - 4th Period
//Lab  - Line

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;
		

	public Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{

		slope = (yTwo - yOne)/(xTwo - xOne);

	}

	public void print( )
	{
		System.out.print("the slope is" + " ");
		System.out.printf("%.2f\n", slope);
		
	}
}