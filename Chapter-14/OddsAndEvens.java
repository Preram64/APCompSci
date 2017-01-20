//© A+ Computer Science  -  www.apluscompsci.com - 2017
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.
//        There are some pictures to help you at the bottom of this file.


public   class   OddsAndEvens
{
	
	// this finds how many odd or even numbers are in the array
	// if odd is true, it counts the number of odd numbers in array
	// if odd is false, it counts the number of even numbers in array
	
	private static int countEm(int[] array, boolean odd)
	{
		int count = 0; 
			
		if (odd)  
		{
			// in here, count the number of odd numbers in array
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] % 2 == 1)
				{
					count++;
				}
			}
			// loop through (traverse) the array starting at position 0
			// each time through the loop check and see if the ith
			// element is an odd number, and if so add one to count
			// How do you see if the ith element is an odd number?
			//     array[i] % 2 == 1
			
		}
		else
		{
			
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] % 2 == 0)
				{
					count++;
				}
			}	// in here, count the number of even numbers in array
			
			
			
		}
		
		return count;  // change me (what is it that you need to return?)
	}
	
	
	
	// this creates an array and fills it with all of the even numbers from array
	// see a picture below to help you understand better 
	public static int[] getAllEvens(int[] array)
	{
		
		// STEP 1: *********************************************************************
		// first we will get the number of even numbers in array
		// notice that the FALSE parameter tells the method to count the number of EVENS
		int numEvens = countEm(array,false);
		
		
		
		// STEP 2: *********************************************************************
		// create a temporary array that can hold the correct number of elements
		int [] tempArray = new int[numEvens];
		
		
		
		
		// STEP 3: *********************************************************************
		// Now you will need to copy all of the elements from array
		//  	that are even numbers to the tempArray.
		 
		
		// You will need to traverse array, so you need a for loop,
		// but you will also need to keep track of where to put each 
		// element into the tempArray.
		
		int k = 0;  // position in tempArray that will receive the next element
		
		for (int i=0;  i<array.length; i++)
		{
				if(array[i] % 2 == 0)
				{
					tempArray[k] = array[i];
					k++;
				}
				
				// if the number in position i of array is even, then copy it
				// to tempArray and increment k so that it once again is the
				// position in tempArray that will receive the next element
			
		}
		
		
		
		
		// STEP 4: *********************************************************************
		return tempArray;  // change me (what is it that you need to return?)
		
	}




	// this creates an array and fills it with all of the odd numbers from array
	public static int[] getAllOdds(int[] array)
	{
		// look at how you did  getAllEvens
		// make sure that your solution to getAllEvens works before you start this code
		int k = 0;
		int numOdds = countEm(array,true);
		int [] tempArray = new int[numOdds];
		
		for (int i=0;  i<array.length; i++)
		{
				if(array[i] % 2 == 1)
				{
					tempArray[k] = array[i];
					k++;
				}
		}
		return tempArray;   // change me (what is it that you need to return?)		
	}
}


// A picture can help you immensely in seeing what has to be done
// Let use 1,2,3,4,5,6,7,8,9 as sample data
// How big should the tempArray be?
// Next, how would you copy the even numbers from array to tempArray? 

// index i (position)   0      1     2     3      4     5     6     7      8       
//                   ----------------------------------------------------------
// array -->         |  1  |   2  |  3  |  4   |  5  |  6  |  7  |  8   |  9  |
//                   ----------------------------------------------------------


// index k (position)   0      1     2     3           
//                   ---------------------------
// tempArray -->     |     |      |     |      |
//                   ---------------------------




// How big should the tempArray be?
// How would you copy the odd numbers from array to tempArray? 

// index i (position)   0      1     2     3      4     5     6     7      8       
//                   ----------------------------------------------------------
// array -->         |  1  |   2  |  3  |  4   |  5  |  6  |  7  |  8   |  9  |
//                   ----------------------------------------------------------


// index k (position)   0      1     2     3      4     5          
//                   ---------------------------------------
// tempArray -->     |     |      |     |      |     |     |
//                   ---------------------------------------



