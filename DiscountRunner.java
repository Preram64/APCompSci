//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh 
//Date - 11/3/16
//Class - 4th Period 
//Lab  - Discount 

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();  
		System.out.printf("Bill after discount :: " + "%.2f" , Discount.getDiscountedBill(amt));
		System.out.println();
		System.out.println();
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();  
		System.out.printf("Bill after discount :: " + "%.2f" , Discount.getDiscountedBill(amt));
		System.out.println();
		System.out.println();
		
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();  
		System.out.printf("Bill after discount :: " + "%.2f" , Discount.getDiscountedBill(amt));
		System.out.println();
		System.out.println();
		
		
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();  
		System.out.printf("Bill after discount :: " + "%.2f" , Discount.getDiscountedBill(amt));
		System.out.println();
		System.out.println();
		
		
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();  
		System.out.printf("Bill after discount :: " + "%.2f" , Discount.getDiscountedBill(amt));
		System.out.println();
		System.out.println();
		

	}
}