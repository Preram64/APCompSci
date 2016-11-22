//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

// Lab Chapter 7 - #1  Grade    2015

// Uses files GradeCheck.java and Grade.java

// HINT:  Look back at previous programs that you have
//        written to help you.
//        Draw a picture of your Grade object.
//        Look at your doc file to see the correct output.

public class GradeCheck
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #1  Grade    2015");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Preethi Ramesh");
		out.println();		
		out.println();		
		
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a number grade :: ");
		int grade = keyboard.nextInt();
		Grade test = new Grade(grade);
		out.println(test);
		out.println();
	
		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		
		
		
		// Step 3:
		// read in the grade that the user enters and store it
		//    in an int variable called grade
		// you will need to call one of the next methods in
		//    the Scanner object and have it return the value
		//    that was typed in by the user as an int
		//??? grade = keyboard.????????();
		
		
		
		// Step 4:
		// create a new Grade object and send
		// the value of grade to the constructor
		//    make sure that your reference variable
		//    refers to a Grade object 
	    //???? test = ??? ??????(?????);
		
		
		// Step 5:
		// use out.println(...) to print out the results
		//    you will need to call your Grade object's toString() method
		//out.?????????(test.to???);
		
		
		// Step 6: print a blank line
		// out.?????????
		//out.??????
		
		
		
		
		// add more test cases
		// make sure that your above code works before 
		//     adding more test cases
		
		
		
	}
}