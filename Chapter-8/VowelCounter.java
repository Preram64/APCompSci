//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		
		int count = 0;
		
		String output = "";
		
		// you will receive a String called s with the data
		
		
		// STEP 1:
		// you will need to create an int variable for your count
		//    it should be set to 0



		// STEP 2:
		// you will need to create a String variable to hold the output
		//    it should be set to the empty String to start  ""
		
		
		
		// STEP 3:
		// you will need to loop through the String and look at each character
		
		for (int i=0;  i < s.length();  i++)
		{
			  // each time through the loop you need to get the character at the i position
			  char ch = s.charAt(i);
			  
			 // you will now need an if else statement to see if the character is a vowel
			  //    or you may want to use a switch statement
			  
			  if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
			  {
			  		// add your count to your output
			  		output = output + count;
			  		count ++;
			  		
			  		if (count == 10)
			  			count = 0;
			  		count = count;
			  		
			  		// add 1 to your count
			  		
			  		// see if your count == 10, and if so, set it to 0
			  }
			  else
			  {
			  			// add your character ch to your output
			  			output=output+ch;
			  			
			  }
			  
		}
		
		return output;  // return the new String that you created 
	}
}


