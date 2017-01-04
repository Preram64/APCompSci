//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 11/28/16
//Class -
//Lab  -

import static java.lang.System.*; 

public class MorseCode
{
	private char letter;

	public MorseCode(char let)
	{
		setChar(let);
	}

	public void setChar(char let)
	{
		letter = let;
	}

	public String getMorseCode()
	{
		String morse="";
		
		switch (letter)
		{
			case 'A' : morse = ".-"; break;
			case 'B' : morse = "-..."; break;
			case 'C' : morse = "-.-."; break;
			case 'D' : morse = "-.."; break;
			case 'E' : morse = "."; break;
			case 'F' : morse = "..-."; break;
			case 'G' : morse = "--."; break;
			case 'H' : morse = "...."; break;
			case 'I' : morse = ".."; break;
			case 'J' : morse = ".---"; break;
			case 'K' : morse = "-.-"; break;
			case 'L' : morse = ".-.."; break;
			case 'M' : morse = "--"; break;
			case 'N' : morse = "-."; break;
			case 'O' : morse = "---"; break;
			case 'P' : morse = ".--."; break;
			case 'Q' : morse = "--.-"; break;
			case 'R' : morse = "-"; break;
			case 'U' : morse = "..-"; break;
			case 'V' : morse = "...-"; break;
			case 'W' : morse = ".--"; break;
			case 'X' : morse = "-..-"; break;
			case 'Y' : morse = "-.--"; break;
			case 'Z' : morse = "--.."; break;
			case '0' : morse = "-----"; break;
			case '1' : morse = ".----"; break;
			case '2' : morse = "..---"; break;
			case '3' : morse = "...--"; break;
			case '4' : morse = "....-"; break;
			case '5' : morse = "....."; break;
			case '6' : morse = "-...."; break;
			case '7' : morse = "--..."; break;
			case '8' : morse = "---.."; break;
			case '9' : morse = "----."; break;
			default: break;
			
		}
		
		
		// use a switch statement to get the morse code String
		//    for the instance variable letter
		
		// switch(?????)
		// {
		//     case ??? : morse = ".-"; break;
		//     add more cases
		//
		// }
		
		return morse;		
	}

	public String toString()
	{
		// this method has been completed for you
		return letter + " is " + getMorseCode() + " in morse!";
	}
}
