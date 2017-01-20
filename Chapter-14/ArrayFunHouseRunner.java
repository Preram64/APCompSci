//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh 
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

// Lab Chapter 14 - #1  ArrayFunHouse    2017

// Uses files ArrayFunHouseRunner.java and ArrayFunHouse.java

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.


public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 14 - #1  ArrayFunHouse    2017");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Preethi Ramesh");
		System.out.println();		
		System.out.println();		


		int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(one,7));
		System.out.println("before removing all 7s " + Arrays.toString(one));
		one = ArrayFunHouse.removeVals(one,7);
		System.out.println("new array with all 7s removed " + Arrays.toString(one));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(one,7));
		System.out.println();		
		System.out.println();		




		// add one more test case (make sure you use array variable two)
		int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
	
		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-16  =  " + ArrayFunHouse.getSum(two,3,16));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(two,2,9));
		System.out.println("# of 0s  =  " + ArrayFunHouse.getCount(two,0));
		System.out.println("# of 3s  =  " + ArrayFunHouse.getCount(two,3));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(two,7));
		System.out.println("before removing all 7s " + Arrays.toString(two));
		two = ArrayFunHouse.removeVals(two,7);
		System.out.println("new array with all 7s removed " + Arrays.toString(two));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(two,7));
		System.out.println();		
		System.out.println();	


	}
}