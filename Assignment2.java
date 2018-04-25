//***********************************************************
// Name: Suzanne Kaufman
// Title: Assignment 2
// Author: Suzy Kaufman
// Description: To declare and use variables, arithmetic expressions,
//              using scanner class, use selection statements to find a max value
// Time spent: 2 hours
// Date: 1/10/18
//
//
//    --------PART 1------------
/*

		1a) TRUE
		1b) FALSE
		1c) TRUE
		1d) TRUE

		2.		***Code***

				Scanner in = new Scanner (System.in);

				String fname, lname;

				System.out.print("Enter your first name: ");
				fname = in.next();

				System.out.print("Enter your last name: ");
				in.nextLine();
				lname = in.nextLine();

				System.out.println("Welcome " + fname + " " + lname);

		3.  Hy
*/
//    --------PART 2------------


import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment2
{

	public static void main (String[] args)
	{
		//Prints out the menu for user to see
		System.out.println("Welcome to the In-N-Out Burger Menu:" );
		System.out.println("_____________________________________________" );
		System.out.println("Hamburger $2.75");
		System.out.println("Cheesburger $3.25");
		System.out.println("French Fries $2.50");
		System.out.println("Shake and Beverage $1.50\n\n");

		//declares value to cost of items on menu
		double HAMBURGER_PRICE = 2.75;
		double CHEESEBURGER_PRICE = 3.25;
		double FRIES_PRICE = 2.50;
		double DRINK_PRICE = 1.50;

		//Declare variables
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();

		Scanner scan = new Scanner(System.in);

		//declares integer value to each item
		int item1, item2, item3, item4;

		//tells user to input a integer value to each item
		System.out.print("How many hamburger(s) would you like to buy?: " );
		item1 = scan.nextInt();
		System.out.print("How many cheeseburger(s) would you like to buy?: " );
		item2 = scan.nextInt();
		System.out.print("How many French Fries would you like to buy?: " );
		item3 = scan.nextInt();
		System.out.print("How many drinks would you like to buy?: " );
		item4 = scan.nextInt();
		System.out.println("\n\n");

		//declares total cost for each item
		double totalBurgerCost = item1 * HAMBURGER_PRICE;
		double totalCheeseCost = item2 * CHEESEBURGER_PRICE;
		double totalFriesCost = item3 * FRIES_PRICE;
		double totalDrinkCost = item4 * DRINK_PRICE;

		//declares value for total number of items purchased
		int totalItems = item1 + item2 + item3 + item4;

		//declares total cost for all items sold
		double totalBill = totalBurgerCost + totalCheeseCost + totalFriesCost + totalDrinkCost;

		//Prints total cost each item purchased
		System.out.println("Total cost for the hamburger(s): " + fmt1.format (totalBurgerCost));
		System.out.println("Total cost for cheeseburger(s): " + fmt1.format (totalCheeseCost));
		System.out.println("Total cost for french fries: " + fmt1.format (totalFriesCost));
		System.out.println("Total cost for drink(s) is: " + fmt1.format (totalDrinkCost));
		System.out.println("\n");

		//Determines which item costs the most and tells user
		if(totalBurgerCost > totalCheeseCost && totalBurgerCost > totalFriesCost && totalBurgerCost > totalDrinkCost){
			System.out.println("Your Hamburgers cost the most.");
		}
		else if(totalCheeseCost > totalBurgerCost && totalCheeseCost > totalFriesCost && totalCheeseCost > totalDrinkCost){
			System.out.println("Your Cheeseburgers cost the most.");
		}
		else if(totalFriesCost > totalBurgerCost && totalFriesCost > totalCheeseCost && totalFriesCost > totalDrinkCost){
			System.out.println("Your French Fries cost the most.");
		}
		else{
			System.out.println("Your Drinks cost the most.");
		}
		System.out.println("\n");

		//Tells user total cost of all items purchased
	 	System.out.println("Total cost for your order is: " + fmt1.format (totalBill));
	 	System.out.println("\n");

		//Tells user total number of items purchased
		System.out.println("The total number of items purchased today is: " + totalItems);
		System.out.println("\n");


		System.out.println("Thank you and have a good day!");


		//end program
		}


}
