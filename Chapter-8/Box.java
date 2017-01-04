//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box
{
	// instance variable
	private String word;



	// default constructor
	// SAME NAME AS THE CLASS and no return type
	public Box()
	{
		
		
		// initialize word to the empty string ""	
	}



	// initializer constructor 
	// SAME NAME AS THE CLASS and no return type
	// String variable s is created and receives a beginning value 
	//    to store in our instance variable word
	public Box(String s)
	{
		setWord(s);
	} 


	// modifier or setter method
	// String variable s is created and receives a new value 
	//    to store in our instance variable word
	public void setWord(String s)
	{
		word = s;	
	} 


	public void print( )
	{
		// you will need a loop here
		// the loop should run word.length() times
		// each time through your loop you will print the value of word
		
		 for (int length = 0; length <= word.length()-1; length++)
		 	System.out.println(word);
		 	System.out.println();
		 	System.out.println();
		// {
			   // print out your word (use println, not print)
		// }
		
		
		// after the loop add 2 blank lines
		
		
	}
}
