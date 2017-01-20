//© A+ Computer Science  -  www.apluscompsci.com - 2017
//Name - Preethi Ramesh
//Date -
//Class -
//Lab  - 

import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class TheRace
{
	private int playerOnesPosition; // the position of player one on the track (0-17)
	private int playerTwosPosition; // the position of player two on the track (0-17)
		
	private int[] track;  // an array representing the track  A value of 0=normal, 1 or 2 a player, 8=mine, 9=candy
	
	private int whosTurn;     // who's turn it is (1 or 2)
	
	String winner = "";  // no one has won yet
	
	
	public TheRace()
	{
		
		playerOnesPosition = -1; // beginning position of player 1
		playerTwosPosition = -1; // beginning position of player 2
			
			
		// create an int array with 25 variables	
		track  =  ???  ?????[25];  // all positions have been set to 0 (normal spot)
		
		
		// Math.random();
		
		// get a random number between 0.0 and 0.999...
		int r = (int) (Math.?????*(track.length-6)) + 4;  // place a mine randomly on the track
		track[r] = 8;  // 8 is a mine



		// get a random number between 0.0 and 0.999...
		r = (int) (Math.?????*(track.length-6)) + 4;  // place a piece of candy randomly on the track
		track[r] = 9;   // 9 is candy
		
		
		
		// get a random number between 0.0 and 0.999...
		whosTurn = (int) (Math.?????*2) + 1; // 1 or 2
		
	}
	
	
	// returns true if the race is still going
	// returns false if the race is over and somebody has one
	public boolean play()
	{
			// no winner, so let's move
			if (whosTurn == 1)
			{
				// player one gets to move
				
				int originalPosition = playerOnesPosition;
				
				// we will get the number of positions to move
				int positionsToMove = (int)(Math.random()*3)+1;
				
				// and now we add it to our position
				playerOnesPosition += positionsToMove;
				
				// we now check to make sure that we do not go past the end
				// of our array and get an out of bounds exception
				if (playerOnesPosition >= track.????)
				{
					// we will set our position to the last position in the array
					playerOnesPosition = track.?????-1;
				}


				if (track[playerOnesPosition] == 9)
				{
					// Yeah! candy  move again
					positionsToMove = (int)(Math.random()*3)+1;
					playerOnesPosition += positionsToMove;
					
					// we now check to make sure that we do not go past the end
					// of our array and get an out of bounds exception
					if (playerOnesPosition >= track.?????)
					{
						// we will set our position to the last position in the array
						playerOnesPosition = track.?????-1;
					}					
				}
				
				
				if (track[playerOnesPosition] == 8) // Oh no, a mine!!!!
				{
					// go back to position 0 (we landed on a mine)
					track[playerOnesPosition] = 0; // get rid of the mine
					playerOnesPosition = 0;
					track[0] = 1;
				}
				
				if (track[playerOnesPosition] == 2) // I landed on the other player
				{
					// send player 2 back to position 0 
					playerTwosPosition = 0;
					track[0] = 2;
				}
				
				
				if (originalPosition >= 0)
					track[originalPosition] = 0; // remove player 1 from original position
				track[playerOnesPosition] = 1;  // put player 1 on the track in the new position
				
				// check to see if player one has won
				// are we on the last position?
				if (playerOnesPosition == track.????-1)
				{
					winner = "1";
					return false; // race is over
				}
				
				// change whosTurn to 2
				whosTurn = 2;
				return true; // keep playing
			}
			else
			{
				// handle player two's move
				// make sure that player one's code works before doing this!!!!!!!!!!!!!!!!!!!!!!!!!!
			
				if(whosTurn == 2)
				{
					// use code from above as a guide for here. Think in terms of player 2
				}

				
				// change whosTurn to 1
				whosTurn = 1;
				return true; // keep playing
			}
			
		
	}
	
	public String getWinner()
	{
		if (winner.equals(""))
			return "";
			
		return "Player " + winner + " is the winner.";
  	} 
  	
  	
  	
 	public String toString()
  	{
  		// return your array as a String for printing purposes
  		return Arrays.toString( ???? );
  	}
  	
  	
}