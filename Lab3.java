//************************************************************
//Name: Suzanne Kaufman
//Title: CSE 110 Lab3.java
//Description: Use of String method, and use of (if, if-else) statements
//Time Spent: 1 hour
//Date: 1/10/2018
//*************************************************************

import java.util.Scanner;

public class Lab3
{
	public static void main (String[] args)
	{
		//Set up variables
		Scanner input = new Scanner(System.in);

		String s1, s2;

		//User is asked to enter in a string of words or word

		System.out.print("Enter a string of words: ");
		s1 = input.nextLine();
		System.out.print("Enter another string of words: ");
		s2 = input.nextLine();


			// If Else statement to compare String 1 with String 2 and see if they are the
			// Same or different in what words are used

			if(s1.equals(s2)){
			System.out.println("The strings are the same");
			}
			else {
			System.out.println("The strings are NOT the same");
			}

		//Calculation of the string by character length
		int s1length = s1.length();
		int s2length = s2.length();


			// If Else statement to compare String 1 with String 2 and see if they are the
			// Same or different in character length and tell user is they are equal or not
			// and if not, which is greater or less than the other

			if(s1length==(s2length)){
			System.out.println("The strings have the same length");
			}
			else if(s1length>=(s2length)){
				System.out.println("\"" + s1 +"\"" + " is longer than " + "\"" + s2 +"\"");
			}
			else{
				System.out.println("\"" + s1 +"\"" + " is shorter than " + "\"" + s2 +"\"");
			}
	}
}