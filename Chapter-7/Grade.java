//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Grade
{

	private int numGrade;

	public Grade(int grade)
	{
		setGrade(grade);
	}

	public void setGrade(int grade)
	{
		numGrade = grade;
	}

	public String getLetterGrade( )
	{
		String letGrade="";
		
		if (numGrade >= 90)
			letGrade = "A";
		else if (numGrade >= 80 && numGrade < 90)
			letGrade = "B";
		else if (numGrade >= 70 && numGrade < 80)
			letGrade = "C";
		else if (numGrade >= 60 && numGrade < 70)
			letGrade = "D";
		else
			letGrade = "F";	
			
		return letGrade;
	}
	
	// this method has been done for you
	public String toString()
	{
		return numGrade + " is a " + getLetterGrade();
	}
}