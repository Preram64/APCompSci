//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh 
//Date - 10/7/16
//Class - 4th Period
//Lab  - Quadratic

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
   	//add test cases
   	Scanner keyboard = new Scanner(in);

		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();

		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();

		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();

		Quadratic test = new Quadratic(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
		
		
		
		
		out.print("Enter a :: ");
			quadA = keyboard.nextInt();

		out.print("Enter b :: ");
			quadB = keyboard.nextInt();

		out.print("Enter c :: ");
			quadC = keyboard.nextInt();

		test.setEquation(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
		
		
		
		
		
		out.print("Enter a :: ");
			quadA = keyboard.nextInt();

		out.print("Enter b :: ");
			quadB = keyboard.nextInt();

		out.print("Enter c :: ");
			quadC = keyboard.nextInt();

		test.setEquation(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
		
		
		
		
		
	
		
		
		
		
	}
}