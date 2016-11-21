//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/18/16
//Class - 4th Period
//Lab  - First and Last

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		System.out.println( "word :: " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		
		
		demo.setString("World");
		System.out.println( "word :: " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		
		
		demo.setString("Jukebox");
		System.out.println( "word :: " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		
		
		demo.setString("TCEA");
		System.out.println( "word :: " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		
		
		demo.setString("UIL");
		System.out.println( "word :: " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		//add more test cases	
		
	}
}
