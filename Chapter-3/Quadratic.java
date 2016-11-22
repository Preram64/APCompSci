//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/7/16
//Class - Period 4
//Lab  - Quadratic 

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;


	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;		

 	}

	public void calcRoots( )
	{
		rootOne = ((-1 * b) + (Math.sqrt((b * b) - (4 * a *c)))) / (2 * a);
		rootTwo = ((-1 * b) - (Math.sqrt((b * b) - (4 * a *c)))) / (2 * a);

	}

	public void print( )
	{
		System.out.println();
		System.out.println();
		System.out.print("rootone :: ");
		System.out.printf("%.2f\n", rootOne);
		System.out.print("roottwo :: ");
		System.out.printf("%.2f\n", rootTwo);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}
}