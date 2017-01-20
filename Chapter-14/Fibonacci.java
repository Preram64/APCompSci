//© A+ Computer Science  -  www.apluscompsci.com - 2017
//Name -
//Date -
//Class - 
//Lab  -


public class Fibonacci
{
	// instance variable to hold the list of fibo numbers
	private long [] fibo;
	

	// constructor
	public Fibonacci()
	{
		// we create the fibo array
		fibo = ??? ???[50];
		
		// now fill the array with the fibonacci numbers
		
		// the first two numbers are both 1
		fibo[0] = 1;
		fibo[1] = 1;
		
		
		// now fill in the rest of the numbers in the array
		for (int i=?;  i<fibo.???;  ???)
		{
			fibo[i] = fibo[???] + fibo[???];
		}
		
	}




	// toString() method
	// this method should return the list of numbers
	public String toString()
	{
		String output = "";
		
		
		// we need to loop through (traverse) the list of fibo numbers
		for (int i=?; i<fibo.????; ???)
		{
			output += fibo[?] + "\n";			
		}
		
		output += "\n";
		
		return output;
	}
	
	
	
}