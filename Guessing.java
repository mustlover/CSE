//Chapter 3 If Else Statements

import java.util.*;

public class Guessing 
{
	// Plays a single guessing game with the user.
	public static void main (String[] args)
	{
		final int MAX = 10;
		int answer, guess;
		Random generator = new Random(); //instantiating a Random object
		answer = generator.nextInt(MAX) + 1;
		
		System.out.print("I'm thinking of a number between 1 and " + MAX + ". Guess what it is: ");
		Scanner in = new Scanner(System.in);
		guess = in.nextInt();
		
		if (guess == answer)
		{
			System.out.println ("You got it! Good guessing!");
		}
		else
		{
			System.out.println ("That is not correct, sorry.");
			System.out.println ("The number was " + answer);
		}
	}
}
