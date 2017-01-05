//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 8 - #6  Word    2016

// Uses files WordRunner.java and Word.java


public class WordRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 8 - #6  Word    2016");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Preethi Ramesh");
		out.println();		
		out.println();		

		
		// STEP 1: **************************************************
		// create a Word object and pass it the String "Hello"
		//     this will store "Hello" inside the object 
		
		Word obj = new Word("Hello");
		
		
		
		// STEP 2: **************************************************
		// print out "Original Word: " and join onto it
		//    what the toString() method of obj returns
		
		out.println("Original Word: " + obj);
		
		
		
		// STEP 3: **************************************************
		// print out 
		// First Letter:  and then the first letter of word
		// call a method of the Word object referenced by obj 
		
		out.println("First Letter:  " + obj.getFirstChar());
		
		
		// STEP 4: **************************************************
		// print out 
		// Last Letter:  and then the last letter of word
		// call a method of the Word object referenced by obj 
		
		out.println("Last Letter:   " + obj.getLastChar());
		
		
		
		// STEP 5: **************************************************
		// print out 
		// Backwards:  and then the word backwards
		// call a method of the Word object referenced by obj 
		
		out.println("Backwards:     " + obj.getBackWards());
		
		
		
		// Step 6: **************************************************
		out.println();
		out.println();
		
		
		obj.setString("Jukebox");
		out.println("First Letter:  " + obj.getFirstChar());
		out.println("Last Letter:   " + obj.getLastChar());
		out.println("Backwards:     " + obj.getBackWards());
		out.println();
		out.println();
		
		obj.setString("TCEA");
		out.println("First Letter:  " + obj.getFirstChar());
		out.println("Last Letter:   " + obj.getLastChar());
		out.println("Backwards:     " + obj.getBackWards());
		out.println();
		out.println();
		
		obj.setString("UIL");
		out.println("First Letter:  " + obj.getFirstChar());
		out.println("Last Letter:   " + obj.getLastChar());
		out.println("Backwards:     " + obj.getBackWards());
		out.println();
		out.println();
		
		
		// add test cases
		
		
				
	}
}
