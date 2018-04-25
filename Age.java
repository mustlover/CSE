//Chapter 3 If Else Statements

import java.util.Scanner;

public class Age
{
//Reads the user's age and print comments accordingly.
	
	public static void main (String[] args)
	{
		final int MINOR = 21;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your age: "); //prompt
		int age = scan.nextInt();
		
		System.out.println ("You entered: " + age);
		
		if (age < MINOR)
			System.out.println ("Youth is a wonderful thing. Enjoy.");
		
		System.out.println ("Age is a state of mind.");
	}
}