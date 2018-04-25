//************************************************************
//Name: Suzanne Kaufman
//Title: Assignment1.java
//Description:
//Time Spent: 1 hour
//Date: 1/10/18
//*************************************************************

	/*
	 * Part 1:
	 * a. The title of the program and the public class do not match. temp should be capital "T".
	 * b.   1. program expects an ')' between Celsius and Temperature;
	 *      2. Because there is no beginning quotation, the string is considered to be unclosed.
	 *      3. because there is no beginning quotation , the expression is considered illegal.
	 * c. the line is expected to have a semicolon at the end of the first println statement.
	 * d. the program has reached the end but there is no bracing to finalize the program on the last line.
	 * e. the variable "fahrenheit" could not be found, variable has not been declared. variables must match.
	 *
	 * Part 2:
	 * 1a. Mystery has the value of 5
	 * 1b. Mystery now has the value of 3
	 * 1c. Mystery now has the value of 4
	 *
	 * 2a. 0
	 * 2b. 3.3333333333333335
	 * 2c. 2
	 * 2d. 4.3
	 * 2e. 0.24806201550387597
	 * 2f. 1
	 * 2g. 1
	 *
	 *
	 * PART 3 Program
	 */

	import java.util.Scanner;
	import java.text.NumberFormat;

public class Assignment1 {

	//Main method (where the program starts executing Tip Calculator Program)
	public static void main (String[] args)	{

	//Welcome statement to the program
		System.out.println("Welcome to Suzanne's Tip Calculator.");
		System.out.println(""); //This statement is a break to separate the input items
		System.out.println("");
		// NUmberFormat object formats output into currency format
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		//declare variables to be used in calculator
		double billAmount;
		int tipPercent;

		Scanner scan = new Scanner(System.in);

		//Here user enters in the amount of the bill before added tip
		System.out.println("Please enter the total bill after taxes: $");
		billAmount = scan.nextDouble();
		System.out.println("");
		System.out.println("");

		//Here user enters in the tip percent in whole numbers
		System.out.println("We recommend 10-20% based on your service.");
		System.out.println("How much would you like to tip?: ");
		tipPercent = scan.nextInt();
		System.out.println("");

		//Declared variables to be used in final bill calculation
		double tipAmount = billAmount * tipPercent / 100;
		double totalBill = billAmount + tipAmount;
		System.out.println("");

		//Here the tip will be calculated, then added to the bill, and give the user a grant total
		System.out.println("Total Tip Amount: " + fmt.format(tipAmount));
		System.out.println("");

		System.out.println("Final Bill Amount: " + fmt.format(totalBill));
		System.out.println("");

		//This statement just informs the tipper to fill out their bill
		System.out.println("If this is correct, please fill out your bill with the above two amounts.");
		System.out.println("Thank you and have a good day!");

		//End Program

	}
}
