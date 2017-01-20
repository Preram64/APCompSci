//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

// Lab Chapter 14 - #6  Fibonacci    2017

// Uses files FibonacciRunner.java and Fibonacci.java

// HINT:  Look at sample arrays to understand what you need to do in your code.
//		  DRAW PICTURES and walk through what you need to do.
//        If you don't know what needs to be done, you certainly cannot give
//        instructions to the computer to tell it what to do.


public class FibonacciRunner
{
	public static void main(String args[])
	{
		System.out.println("Lab Chapter 14 - #6  Fibonacci    2017");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name here ************************************
		String x = "????????  ????????????????";
		
		System.out.println("My name is " + verifyName(x));
		System.out.println();		
		System.out.println();		


		// create a Fibonacci object
		Fibonacci fiboObject = new Fibonacci();
		
		
		if (isOk(x))
		{
			// call the toString() method of the object and print the results
			System.out.println(fiboObject);
		}

		System.out.println();		
		System.out.println();		
	}
	
	
























































	public static boolean isOk(String name)
	{		
		if (name.equals("????????  ????????????????"))
		{
			return false;
		}
		
		return true;
	}

	
	public static String verifyName(String name)
	{		
		if (name.equals("????????  ????????????????"))
		{
			String output = "\n";
			
			for (int i=1; i<=100; i++)
				output += "I DID NOT PUT MY NAME ON THE OUTPUT. OH NO!!!!!!!!!!!!!!!   NO GRADE!\n";		
			
			return output;
		}
		
		return name;
	}
	
}