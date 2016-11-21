
+//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	   WordFun test = new WordFun("Hello World");
	   out.println(test);
	   
	   test.setWord("Jim Bob");
	   out.println(test);
	   
	   test.setWord("Computer Science");
	   out.println(test);
	   
	   test.setWord("UIL TCEA");
	   out.println(test);
	   
	   test.setWord("State Champions");
	   out.println(test);
	   //add more test cases

	}
}