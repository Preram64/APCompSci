//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/24/16
//Lab  - Leap Year

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	private boolean truth;
	private int year;
	
	public LeapYear(int y)
	{
	 	setLeapYear(y);	
	}
	
	
	public void setLeapYear(int y)
	{
		year = y;
	}
	
	
	public boolean isLeapYear( int year )
	{
		if(year % 4  == 0)
		{
			return true;
		}
		
			return false;

	}
	


}
