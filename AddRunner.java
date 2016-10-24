//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/17/16
//Class - 4th Period
//Lab  - Add Runner

import static java.lang.System.*;

public class AddRunner
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);
		
		demo.setStrings("sally","sue");
		demo.add();
		out.println(demo);
		
		demo.setStrings("computer","science");
		demo.add();
		out.println(demo);
		
		demo.setStrings("uil","contests");
		demo.add();
		out.println(demo);

		//add more test cases		
	}
}