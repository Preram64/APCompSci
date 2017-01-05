//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleOne
{
	// instance variable word is declared
	private String word;
	
	

	// default constructor
	// SAME NAME AS THE CLASS and no return type
	public TriangleOne()
	{
		word="";
	}



	// initializer constructor 
	// SAME NAME AS THE CLASS and no return type
	// String variable s is created and receives a beginning value 
	//    to store in our instance variable word
	public TriangleOne(String s)
	{
		setWord(s);
	} // String variable s is erased or destroyed at the end of this constructor
	
	

	// modifier or setter method
	// String variable s is created and receives a new value 
	//    to store in our instance variable word
	public void setWord(String s)
	{
		word = s;
	} // String variable s is erased or destroyed at the end of this method




	public void print( )
	{
		for ( int i = word.length(); i >= 0; i--)
			System.out.println(word.substring(0,i));
	}
}
