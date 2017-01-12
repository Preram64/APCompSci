//© A+ Computer Science  -  www.apluscompsci.com - 2016
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PassWordCheck
{
	private String realPassword;

	public PassWordCheck(String rp)  // initialization constructor
	{
		setPassword(rp);
		
	}

	public void setPassword(String rp)
	{
			realPassword = rp;
	}
	
	
	
	public void check() // this is where all the code will go
	{
		realPassword = "whs";
		Scanner keyboard = new Scanner(System.in);
		boolean passwordCorrect = false;
		String password;
		// start your do...while loop here
		do
		{
			out.print("Enter a password :: ");
			password = keyboard.next();	
		// prompt the user to enter a password
		// see labs from Chapter 5 to review how to do input
		
		if(password.equals(realPassword))
		{
			out.print("VALID");
			passwordCorrect = true;
			out.println();
		
		}
		
		else
		{
			out.print("INVALID");
			out.println();

		}// if the input password equals the realPassword
		// set your boolean variable equal to true 
		// and print "VALID"
		// else, print "INVALID"
		
		
		
		
		
		
		}
		while(passwordCorrect == false);  // continue so long as boolean variable is false
		
		
		
		
	}
}