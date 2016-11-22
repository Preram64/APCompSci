//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
	// instance variables (attributes, properties, fields)
    private String sentence;
    private char lookFor;


	// default constructor
	public LetterRemover()
	{
		// call the setter method with default values
	}



	// add in a second constructor
	// it should receive a beginning value for sentence and for lookFor
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}



	public String removeLetters()
	{
		String cleaned=sentence;
		
		
		// look at the String cleaned to see if it contains the lookFor character
		// use the String's  indexOf(lookFor) to find the position of the character 
		//    if it exists
		
		int pos = cleaned.???????(lookFor);
		
		while (pos >= 0)
		{
			// get the substring to the left and right of the character position (pos)
			//    and get a new cleaned value 
			cleaned = cleaned.substring(0,?) + cleaned.substring(?);
			
			// now look for the character again and get its position (pos) in the String
			// pos = ???;
			
		}
		
		
		
		return cleaned;
	}



	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}