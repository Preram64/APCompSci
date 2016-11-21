//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class WordFun2
{
	public static String moveEmAround(String a, int x)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String makeUpper()
	{	
		word = word.toUpperCase();
		return word;
	}

	public String addHyphen()
	{
		word = word.replaceAll(" ","-");
		return word;
	}

	public String toString()
	{
		return word + "\n\n" + makeUpper() + "\n\n" + addHyphen() + "\n\n";
	}
}