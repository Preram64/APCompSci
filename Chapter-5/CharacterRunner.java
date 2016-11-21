//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char character;

	public void setChar(char c)
	{	
		character = c;
	}

	public char getChar()
	{
		return character;
	}

	public boolean isUpper( )
	{
		if (character >= 65 && character <= 90 )
		{
			return true;
		}
		return false;
	}

	public boolean isLower( )
	{
		if (character >= 97 && character <= 122 )
		{
			return true;
		}
			return false;
	}
	
	public boolean isNumber( )
	{
		if (character >= 48 && character <= 57)
		{
			return true;
		}
		return false;
	}	

	public int getASCII( )
	{
		return character;
	}

	public String toString()
	{
		if (isUpper() == true)
		{
			return"" + getChar() + "is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		else if (isLower() == true)
		{
			return"" + getChar() + "is an lowercase character. ASCII == " + getASCII() + "\n";
		}
		else if 
		{
			return "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";	  
`		}
}
		
		
		
		
		
		

	}
}
