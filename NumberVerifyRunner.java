//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 11/1/16
//Class - 4th Period
//Lab  - Odd/Even


import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		
		
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		
		
		
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		
		
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
	
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		
		
	
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
	
		System.out.println( num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		//add in more test cases
	}
}