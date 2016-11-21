//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/19/16
//Class - 4th Period
//Lab  - String Ripper

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper(String s)
	{
		setString(s);
	}
	
   public void setString(String s)
   {
   		word = s;
   }	

	public String ripString(int x, int y)
	{
		String letters = word;
		String sub = letters.substring(x,y);
		return sub;
	}

 	public String toString()
 	{
 		String output = word;
 		return output;
	}
}
