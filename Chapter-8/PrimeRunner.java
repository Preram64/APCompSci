//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

// Lab Chapter 8 - #9  Prime    2016

// Uses files PrimeRunner.java and Prime.java


public class PrimeRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 8 - #9  Prime    2016");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Preethi Ramesh");
		out.println();		
		out.println();		
		
		// STEP 1: **************************************************
		// create a Prime object and pass it 24
		//     this will store 24 inside the object 
		
		Prime obj = new  Prime(24);
		out.println(obj);
		out.println();

		// STEP 2: **************************************************
		// print out what the toString() method of obj returns
		
		obj.setPrime(7);
		out.println(obj);
		out.println();
			
		obj.setPrime(100);
		out.println(obj);
		out.println();
			
		obj.setPrime(113);
		out.println(obj);
		out.println();
			
		obj.setPrime(65535);
		out.println(obj);
		out.println();
			
		obj.setPrime(2);
		out.println(obj);
		out.println();
			
		obj.setPrime(7334);
		out.println(obj);
		out.println();
		
		obj.setPrime(7919);
		out.println(obj);
		out.println();
		
		obj.setPrime(1115125003);
		out.println(obj);
		out.println();
		
		
		// add test cases
		
		
		
		
	}	
}
