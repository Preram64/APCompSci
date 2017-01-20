//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  - 

// Lab Chapter 14 - #3  OddAndEvens    2017

// Uses files OddsAndEvensRunner.java and OddsAndEvens.java

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.

import java.util.Arrays;

public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 14 - #3  OddsAndEvens    2017");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Preethi Ramesh");
		System.out.println();		
		System.out.println();		


		// the main method has been finished for you
		int [] one = {2,4,6,8,10,12,14};
		int [] two = {1,2,3,4,5,6,7,8,9};

		
		System.out.println("Odds  - " + Arrays.toString(OddsAndEvens.getAllOdds(one)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(one)));
		System.out.println();
		
		
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(two)));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(two)));
		System.out.println();
		
		 // look how else we can do this! 
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(new int[]{2,10,20,21,23,24,40,55,60,61})));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(new int[]{2,10,20,21,23,24,40,55,60,61})));


	}
}