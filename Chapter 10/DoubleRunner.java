//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 10 - #2  BiggestDouble    2016-2017


public class DoubleRunner
{
	public static void main(String[] args)
	{
		out.println("Lab Chapter 10 - #2  BiggestDouble    2016-2017");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Preethi Ramesh");
		out.println();
		
		
		
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);  // calls toString()
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(14.51,6.17,71.8,1.0);
		System.out.println(run); 
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(41.15,816.7,17.8,19.0);
		System.out.println(run); 
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(884.5,16.7,7.8,9.0);
		System.out.println(run); 
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(4.5,-465.7,677.8,9.0);
		System.out.println(run); 
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(4.5,16.7,-7.8,-9.0);
		System.out.println(run); 
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		//add more test cases - use your set method
				
	}
}