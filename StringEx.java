//Chapter 2 String class Example

import java.util.Scanner;

public class StringEx
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);

		// Declare String variable
		String fname, lname;

		// read in a String with nexa nd nextLine
		System.out.print("Enter your first name: ");
		fname = in.next();

		System.out.print("Enter your last name: ");
		in.nextLine();
		lname = in.nextLine();

		System.out.println("\nfname = " + fname);
		System.out.println("\nlname = " + lname);


		// Use CharAt method to get a character at a location in a string
		// "Suzy" - 'S' - 0, 'U' - 1, 'Z' - 3, 'Y' - 4
		System.out.println("charAt(0) = " + fname.charAt(0));
		char myChar = lname.charAt(5);
		System.out.println("myChar = " + myChar);


		// Use lenth to get the length of a String
		// and together with charAt to get the name character in a new String
		System.out.println("fname is " +fname.length() + " characters long" );
		System.out.println("lname is " +lname.length() + " characters long" );
		System.out.println("last char in lname= " +lname.charAt(lname.length()-1));


		// substring methods
		// substring (startIndex, endIndex)
		System.out.println("nsubstring(1,3) = " + fname.substring(1,3));
		String mySub = lname.substring(2,5);
		System.out.println("mySub = " + mySub);


		// substring(starIndex)
		System.out.println("nsubstring(1) = " + fname.substring(1));


		// toUpperCase and toLowerCase

		System.out.println(fname.toUpperCase());
		System.out.println(lname.toLowerCase());

	}
}
