//© A+ Computer Science  -  www.apluscompsci.com
//Name - Preethi Ramesh
//Date - 10/5/16
//Class - 4th Period
//Lab  - Miles Per Hour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours;
	private double minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0;
	}

	public MilesPerHour(int dist, int hrs, double mins)
	{
		setNums(dist,hrs,mins);

	}

	public void setNums(int dist, int hrs, double mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		
	}

	public void calcMPH()
	{
		double rate = hours + (minutes/60);
		mph = distance / rate;

	}

	public void print()
	{
		System.out.println();
		System.out.println(distance + " miles in" + " " + hours + " hours and" + " " + (int)minutes + " minutes = " + Math.round(mph) + " MPH.");
		System.out.println();
		System.out.println();
		System.out.println();

	}
}