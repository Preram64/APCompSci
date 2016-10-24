//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/20/16
//Class - 4th Period
//Lab  - Name

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name(String s)
	{
		setName(s);
	}

   public void setName(String s)
   {
   		name = s;
   }

	public String getFirst(int x, int y)
	{		
		String letters = name;
		String sub = letters.substring(x,y);
		return sub;
	}

	public String getLast(int x, int y)
	{
		String letters = name;
		String sub = letters.substring(x,y);
		return sub;
	}

 	public String toString()
 	{
 		String output = name;
 		return output;
	}
}