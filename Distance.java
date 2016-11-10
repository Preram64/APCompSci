//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne,yOne,xTwo,yTwo);
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;

	}

	public String determineClosest()
	{
		double distanceA = ((x1*x1)-(y1*y1)); 
		double distanceB = ((x2*x2)-(y2*y2));
		String answer = "";
		
		if (distanceA < distanceB)
		{
			answer = "A is closer to (0,0)";
		}
		
		else
		{
			answer = "B is closer to (0,0)";
		}
		
		return answer;

	}
	
	public String toString()
	{
		return determineClosest();
	}
}