//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
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
		name="";
		howBig = 0;

	}

	public Monster(String n, int size)
	{
		name = n;
		howBig = size;

	}

	public String getName()
	{
		return name; // return the name of this monster
	}
	
	public int getHowBig()
	{
		return howBig; // return the value of howBig for this monster
	}
	
	public boolean isBigger(Monster other)
	{
		// is this monster bigger than Monster other?
		// howBig  or  getHowBig() is for this monster
		// other.howBig  or  other.getHowBig() is for Monster other
		
		// if (getHowBig() > other.getHowBig())
		//     return ????;
		if (getHowBig() > other.getHowBig())
			return true;	
		return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		// use isBigger() as an example
		
		if (getHowBig() < other.getHowBig())
			return true;
		return false;
	}

	public boolean namesTheSame(Monster other)
	{
		// don't use ==
		// you should call the equals method
		// and send (pass) it the other monster's name
		// if ( name.????? (????) )
		//    return ????
		if (getName().equals(other.getName()))
			return true;
		return false;
	}
	
	public String toString()
	{
		// return the name of this monster followed by a space
		// and then the size of this monster
		 
		return getName() + " " + getHowBig(); // change this (see above)
	}
}
