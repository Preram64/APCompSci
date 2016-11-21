//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 11/14/16
//Class - 4th Period 
//Lab  - Character

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
	}

	public CharacterAnalyzer(char c)
	{
	}

	public void setChar(char c)
	{
	}

	public char getChar()
	{
		return '-';
	}

	public boolean isUpper( )
	{
		return false;
	}

	public boolean isLower( )
	{
		return false;
	}
	
	public boolean isNumber( )
	{
		return false;
	}	

	public int getASCII( )
	{
		return 0;
	}

	public String toString()
	{
		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
	}
}
