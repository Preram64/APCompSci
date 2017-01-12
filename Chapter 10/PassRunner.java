//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

// Lab Chapter 10 - #1  Password Check  2016-2017
// 

import static java.lang.System.*;

public class PassRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 10 - #1  PassWordCheck    2016-2017");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Preethi Ramesh");
		out.println();
		
		// This is the password from the word doc. You can change 
		// the password to anything you want
		PassWordCheck test = new PassWordCheck("mchammergohammer");
		test.check();
	} 
}