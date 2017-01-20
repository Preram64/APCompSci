//© A+ Computer Science  -  www.apluscompsci.com - 2017
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  - 

import java.lang.System;
import java.lang.Math;

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.
//        There are some sample pictures below to help you.
	
		  	
public class ArrayFunHouseTwo
{
	// goingUp() will return true if all numbers
	// in numArray are in increasing order
	// [1,2,6,9,23] returns true
	// [9, 11, 13, 8]  returns false since 13 is greater than 8
	public static boolean goingUp(int[] numArray)
	{
		for(int i = 1; i < numArray.length; i++)
		{
			if(numArray[i - 1] < numArray[i])
				return false;
			
		}
			
			
			
			
			
			
		// You will need to loop through the elements
		// starting with position 1.
		// Each time through the loop check to see if
		// the i-1 element is greater than the i element
		// and if so then the array is NOT going up, so
		// return false;
			return true;
		
	}



	// goingDown() will return true if all numbers
	// in numArray are in decreasing order
	// [31,12,6,2,1] returns true
	// [31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{
		// You will need to loop through the elements
		// starting with position 1.
		// Each time through the loop check to see if
		// the i-1 element is less than the i element
		// and if so then the array is NOT going down, so
		// return false;
		for(int i = 1; i < numArray.length; i++)
		{
			if(numArray[i - 1] < numArray[i])
				return false;
				
		}
		return true;
	}



	// getCountValuesBiggerThanX will return an array that contains
	// count number of values that are larger than parameter x
	// [1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	// NOTE: The return type of this method is  int[]
	//       You will be returning a new array that you create and fill
	public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
	{
		// Step 1:
		// create the array that you will be returning
		// the parameter count will be the size of the new array that you create

		int size = numArray.length;
		int [] tempArray = new int[size];
		
		
		
		// Step 2:
		// Now you will need to copy  count  elements from numArray
		//  	that are bigger than x to the tempArray.
		 		
		// You will need to traverse numArray, so you need a for loop,
		// but you will also need to keep track of where to put each 
		// element into the tempArray.
		
		int k = 0;  // position in tempArray that will receive the next element
		
		for (int i = 1;  k < count && i < numArray.length; i++)
		{
				if(numArray[i] > x)
				{
					tempArray[k] = numArray[i];
					k++;;
				}
				
				
				// if the number in position i of numArray is bigger than x, then copy it
				// to tempArray and increment k so that it once again is the
				// position in tempArray that will receive the next element
			
		}
		
		return tempArray;  // change me (what is it that you need to return?????)
	}
	
	
}


// {1,2,3,4,5,6,7,8,9,10};

// Is it goingUp?  Why?
// Is it goingDown?  Why?

// index i (position)   0      1     2     3      4     5     6     7      8     9        
//                   -----------------------------------------------------------------
// numArray -->      |  1  |   2  |  3  |  4   |  5  |  6  |  7  |  8   |  9  |  10  |
//                   -----------------------------------------------------------------




// {1,2,3,9,11,20,30};

// Is it goingUp?  Why?
// Is it goingDown?  Why?

// index i (position)   0      1     2     3      4     5     6           
//                   ---------------------------------------------
// numArray -->      |  1  |   2  |  3  |  9   |  11 |  20 |  30 |
//                   ---------------------------------------------


// {1,2,3,9,11,3,30};

// Is it goingUp?  Why?
// Is it goingDown?  Why?

// index i (position)   0      1     2     3      4     5     6           
//                   ---------------------------------------------
// numArray -->      |  1  |   2  |  3  |  9   |  11 |  3  |  30 |
//                   ---------------------------------------------



