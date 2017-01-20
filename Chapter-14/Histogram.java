//© A+ Computer Science  -  www.apluscompsci.com - 2017
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class Histogram
{
	
	// create an instance variable reference to an int array (DO NOT NEW IT HERE!)
	// make it private (the reference variable name should be histogramArray)
	// ????   ???[]   histogramArray;

	
	// initializer constructer (SAME NAME AS THE CLASS, NO RETURN VALUE)  
	public Histogram(String line)
	{
		setHistogramArray(line);
	}



	public void setHistogramArray(String line)
	{
		// create the int array with 10 variables (int boxes)
		// histogramArray = ???  ???[10];
		
		
		// we will put the String which contains a bunch of numbers
		// into a Scanner object so that we can get the numbers out
		// one at a time (in integer format)
		//Scanner scan = ???  ???? (line);
		
		
		// while (scan.hasNextInt()) // while the next element can be returned as an int
		{
			// we will get the next element out of the Scanner object as 
			// an int, so we create an int variable to hold the next number 			
			//int num = scan.??????();
			
			
			// we will use this num as the index in our histogramArray 
			// and add 1 to the location
			//histogramArray[???] = histogramArray[???] + 1;
		}
	}



	// we will return the numbers in the histogramArray one per line
	public String toString()
	{
		
		
		// we will store the entire output in a String variable called output
		String output="";
		
		
		
		for (int i = 0; i<10; i++)
		{
			// we will join (concatenate) onto output the next line of output
			// this line should contain the value of i plus " - " plus the value
			// of the ith histogramArray element, plus a new line marker
			// output  +=  ? + " - " + ??????[i] + "\n";
		}
		
		
		
		return ""; // change me (think about what you should be returning)
	}	
	
	
}