//************************************************************
//Name: Suzanne Kaufman
//Title: CSE 110 Lab4.java
//Description: Use of conditional (if-else) statements
//Time Spent: 2 Hours
//Date: 1/10/2018
//*************************************************************
import java.util.Scanner;

public class Lab4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("This program will calculate the total, average, smallest, largest, even and odd of all numbers enterd.");
		System.out.println("\n");
		System.out.println("Please enter a series of numbers (type zero to stop): ");

		// integers by value
		int n = in.nextInt();
		int evenNumber = 0, oddNumber = 0;
		int count = 0;
		double total = 0;
		int largest = n, smallest = n;


			// start of loop
			while (n != 0) // continue loop as long as 0 is not entered
			{
			    total += n; // add the number to the total
			    count++; // increase count

				// calculate how many even and odd numbers the user inputted
			    if (n % 2 == 0) {
			        evenNumber++;
			    } else {
			        oddNumber++;
			    }

				// find the largest and smallest of all numbers
			    largest = Math.max(n, largest);
			    smallest = Math.min(n, smallest);

			    n = in.nextInt();
			}
			// end loop
			System.out.println("The smallest integer entered is: " + smallest);
			System.out.println("The largest integer entered is: " + largest);
			System.out.println("Total number of integers entered is: " + count);
			System.out.println("Total even integers entered is: " + evenNumber);
			System.out.println("Total odd integers entered is: " + oddNumber);
			
			

			if (count > 0 )
			{
				double average = total / count;
				System.out.println("The average value of all integers entered is: " + average);
			}
			else
					{
			System.out.println("Warning: No data entered.");

		}
	}
}
