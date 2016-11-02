//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 11/1/16
//Class - 4th Period
//Lab  - Odd/Even

import static java.lang.System.*;



public class NumberVerify
{
		
	public static boolean isOdd(int num)
	{
		if (num % 2 == 1 || num % 2 == -1)
		{
			return true;
		} 
		return false;
	}
	public static boolean isEven(int num)
	{
		if (num % 2 == 1 || num % 2 == -1)
		{
			return false;
		}
		return true;
	}
	
}