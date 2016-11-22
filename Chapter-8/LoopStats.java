//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	// instance variables start and stop
	private int start, stop;



	public LoopStats()
	{
	}



	public LoopStats(int beg, int end)
	{
		
	}



	public void setNums(int beg, int end)
	{


	}


	public int getEvenCount()
	{
		int evenCount=0;

		// loop from start to stop inclusive
		// each time through the loop see if your
		//    loop variable is even, and if so,
		//    add 1 to evenCount


		return evenCount;
	}



	public int getOddCount()
	{
		int oddCount=0;

		// loop from start to stop inclusive
		// each time through the loop see if your
		//    loop variable is odd, and if so,
		//    add 1 to oddCount




		return oddCount;
	}



	public int getTotal()
	{
		int total=0;

		// loop from start to stop inclusive
		// each time through the loop add the
		// value of your loop variable to total




		return total;
	}
	
	
	
	public String toString()
	{
		// this has been done for you
		return start + " " + stop;
	}
}