//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class - 
//Lab  -

import java.util.Arrays;

// Lab Chapter 14 - #2  ArrayFunHouseTwo    2017

// Uses files ArrayFunHouseTwoRunner.java and ArrayFunHouseTwo.java

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.


public class ArrayFunHouseTwoRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 14 - #2  ArrayFunHouseTwo    2017");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Preethi Ramesh");
		System.out.println();		
		System.out.println();		


		// the main method has been finished for you

		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		int[] three = {9,8,7,6,5,4,3,2,1-1,-2};
		int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};


		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(four));

		System.out.println("\n\n"+Arrays.toString(one));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(four));
		System.out.println("\n\n");

		System.out.println(Arrays.toString(four));
		int[] updated = ArrayFunHouseTwo.getCountValuesBiggerThanX(four, 7, 9);
		System.out.println("first 7 values greater than 9  " + Arrays.toString(updated));
		updated = ArrayFunHouseTwo.getCountValuesBiggerThanX(four, 5, 15);
		System.out.println("first 5 values greater than 15  " + Arrays.toString(updated));
		
	}
}