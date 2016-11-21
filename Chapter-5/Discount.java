//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh 
//Date - 11/3/16
//Class - 4th Period 
//Lab  - Discount 

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	private static double bill;
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double amt)
	{
		if( amt > 2000 )
		{
			bill = amt * .85;
			
		}
		else
		{
			bill = amt;
		}
		
		return bill;
	}
}
