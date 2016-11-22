//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 9/30/16
//Class - 4th Period 
//Lab  - Rectangle

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		perimeter = 2*length + 2*width;
	}

	public void print( )
	{
		System.out.println("The perimeter is ::" + " " + perimeter);
	}
}
