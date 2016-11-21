//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo))
			return true;
		else
			return false;
	}

	public String toString()
	{
		if (checkEquality() == true)
			return wordOne + " does have the same letters as " + wordTwo + "\n";
		else 
			return wordOne + " does not have the same letters as " + wordTwo + "\n";	
	}
}