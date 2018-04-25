/*----------------------------------------------------------------------------------------
//AUTHOR: Suzanne Kaufman
//FILENAME: Lab2.java
//SPECIFICATION: problem solving, arithmetic expression, and input/output
//FOR: CSE 110-Lab #2
//TIME SPENT: 15 minutes
//DATE: 1/8/18
//----------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab2
{
	public static void main (String[] args)
	{
		double test1, test2, test3;
		final double NUM_TESTS = 3;

		Scanner input = new Scanner (System.in);

		System.out.println( "Hello student, let's begin! " ); //Welcome Statement

		System.out.print("Please enter the score on your first test: ");
		test1 = input.nextInt(); //read in the next integer and store it in test1
		
		System.out.print("Next, enter the score on your second test: ");
		test2 = input.nextInt(); //read in the next integer and store it in test2
		
		System.out.print("Finally, enter the score on your third test: ");
		test3 = input.nextInt(); //read in the next integer and store it in test3

		input.close();

		double average = (double)(test1 + test2 + test3) / (double)NUM_TESTS; //read variables entered in tests 1, 2, & 3 and Average them out

		System.out.println("Thank you, you currently have an average score of: " + average); //Closing Statement

	}

}