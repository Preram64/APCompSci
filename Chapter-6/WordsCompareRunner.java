//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare test = new WordsCompare("abe","ape");
		out.println(test);
		
		test.setWords("giraffe", "gorilla");
		out.println(test);
		
		test.setWords("one", "two");
		out.println(test);
		
		test.setWords("fun", "funny");
		out.println(test);
		
		test.setWords("123", "19");
		out.println(test);
		
		test.setWords("193", "1910");
		out.println(test);
		
		test.setWords("goofy", "godfather");
		out.println(test);
		
		test.setWords("funnel", "fun");
		out.println(test);

	}
}