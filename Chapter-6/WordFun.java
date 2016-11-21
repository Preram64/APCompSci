//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordFun
{
	private String word;

	public WordFun(String w)
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