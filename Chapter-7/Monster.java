//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Monster
{
	private String name;
	private int howBig;	

	public Monster()
	{


	}

	public Monster(String n, int size)
	{


	}

	public String getName()
	{
		return ""; // return the name of this monster
	}
	
	public int getHowBig()
	{
		return 0; // return the value of howBig for this monster
	}
	
	public boolean isBigger(Monster other)
	{
		// is this monster bigger than Monster other?
		// howBig  or  getHowBig() is for this monster
		// other.howBig  or  other.getHowBig() is for Monster other
		
		// if (getHowBig() > other.getHowBig())
		//     return ????;
		
		return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		// use isBigger() as an example
		
		
		return false;
	}

	public boolean namesTheSame(Monster other)
	{
		// don't use ==
		// you should call the equals method
		// and send (pass) it the other monster's name
		// if ( name.????? (????) )
		//    return ????
		
		return false;
	}
	
	public String toString()
	{
		// return the name of this monster followed by a space
		// and then the size of this monster
		 
		return ""; // change this (see above)
	}
}