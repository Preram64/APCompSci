//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/17/16
//Class - 4th Period
//Lab  - Strings - Adding Strings

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;


   public AddStrings(String one, String two)
   {
   		setStrings(one,two);
   }

   public void setStrings(String one, String two)
   {
   		first = one;
   		last = two;
   }

 	public void add( )
 	{
 		sum = first + " " + last + "\n\n";
	}

 	public String toString()
 	{
		System.out.println("first :: " + first);
		System.out.println("second :: " + last);
		System.out.print("sum :: ");
 		
 		return sum;
 

	}
}
