//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class NumberCompareRunner
{
	public static void main( String args[] )
	{
	   NumberCompare test = new NumberCompare(5,6);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	   
	   
	   
	   
	   test.setNums(45,66);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	   
	   
	   
	   
	   test.setNums(-25,10324);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	   
	   
	   
	   
	   test.setNums(324,12312);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	   
	   
	  
	   
	   test.setNums(34,33);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	   
	   
	   
	   
	   test.setNums(45,66);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");

		//add more test cases


	}
}