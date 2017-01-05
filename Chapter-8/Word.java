//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;



	public Word()
	{
		word = "";	
	}



	public Word(String s)
	{
		setString(s);
	}



	public void setString(String s)
	{
		word = s;
	}



	// get the first character of word
	public char getFirstChar()
	{
		char ch = 0;
		ch = word.charAt(0);	
		return ch;
	}



	// get the last character of word
	public char getLastChar()
	{
		char ch = 0;
		ch = word.charAt(word.length() - 1);
		return ch;
	}



	public String getBackWards()
	{
		String back="";
		
		for(int i = word.length() - 1; i>-1; i--)
			back = back + word.charAt(i);
			
		// add a loop to get each character of word and 
		// join it (concatenate) onto back
		// back = back + word.charAt(?);
		
		
		
		
		return back;
	}



 	public String toString()
 	{
 		// return the value of your instance variable word
 		return word; // replace me
	}
}
