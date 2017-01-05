//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 8 - #1  CoolNumbers    2016

// Uses files CoolNumbersRunner.java and CoolNumbers.java


public class CoolNumbersRunner
{
	public static void main( String[] args )
	{
		out.println("Lab Chapter 8 - #1  CoolNumbers    2016");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Preethi Ramesh");
		out.println();		
		out.println();		


		// NOTE:
		// You do not need to create a CoolNumbers object.
		//    Since the methods are marked as static, they
		//    are already in RAM memory in the class section.
		//    Static methods are also known as class methods
		//    since they belong to the class and not each 
		//    individual object. 
		System.out.println( CoolNumbers.countCoolNumbers(250) + " cool numbers between 6 - " + 250);
		System.out.println( CoolNumbers.countCoolNumbers(1250) + " cool numbers between 6 - " + 1250);
		System.out.println( CoolNumbers.countCoolNumbers(2250) + " cool numbers between 6 - " + 2250);
		System.out.println( CoolNumbers.countCoolNumbers(5500) + " cool numbers between 6 - " + 5500);
		System.out.println( CoolNumbers.countCoolNumbers(9500) + " cool numbers between 6 - " + 9500);
		System.out.println( CoolNumbers.countCoolNumbers(23500) + " cool numbers between 6 - " + 23500);
		System.out.println( CoolNumbers.countCoolNumbers(32500) + " cool numbers between 6 - " + 32500);
	
		
		
		// add more test cases
		
		
	}
}
