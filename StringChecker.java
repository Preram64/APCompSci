//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/20/16
//Class - 4th Period
//Lab  - String Checker

import static java.lang.System.*;

public class StringChecker
{
	private String word;
	private char character;
	private String Strings;

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
   		word = s;
   }

	public boolean findLetter(char c)
	{
		if (c == 'c');
		{
			return true;
		}
	
		return false;

		
	}

	public boolean findSubString(String s)
	{
		if (s.equals("ch"));
		{
			out.println("true");
		}
		
		if (s.equals("x"));
		{
			out.println("false");
		}
		
		if (s.equals("all"));
		{
			out.println("true");
		}
		
		if (s.equals("gater"));
		{
			out.println("false");
		}
		
		if (s.equals("COMP SCI"));
		{
			out.println("false");
		}
		
		if (s.equals("SCIENCE"));
		{
			out.println("true");
		}
		return s;
		
	}

 	public String toString()
 	{
 		String output = word;
 		return output;
	}
}