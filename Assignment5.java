//***********************************************************
// Name: Suzanne Kaufman
// Title: Assignment 5 - Geek Driver Program 
// Author: Suzy Kaufman
// Description: Driver program for Class Geek.java
// Time spent: 4 hours
// Date: 2/11/18
//***********************************************************

/* Written Exercise Part 1 None*/


package CSE;

import java.util.*;

public class Assignment5 {

		
	public static void main(String[] args) {

		//new scanner created
		Scanner scan = new Scanner(System.in);

		int option;
		
		
		//print the menu
		printMenu();
		
		//create a new geek object
		Geek myGeek = new Geek("Geek");
		
		
		
	do {
		System.out.println("\nPlease enter an option: ");// ask user to enter in a command option
		option = scan.nextInt();
		
				
		switch (option) {
			case 1: //let the user know whats the Geeks name is
				System.out.println("\nYour Geeks name is: " + myGeek.getName());
				break;
				
			case 2:// tell the user how many questions they have asked
				System.out.println("The number of questions asked is " + myGeek.getNumberOfQuestions());
				break;
			
			case 3: //will add the two integers inputed by the user and tell the user if the sum is even or odd
				System.out.println("Please enter in 2 integers, and I will tell you if they are even or not!");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				if (myGeek.isEven(num1, num2)) 
				{
					System.out.println("The sum of the two are even!");
				}
				else
				{
					System.out.println("The sum of the two are odd!");
				}
				break;
			case 4://will add all the numbers between two integers
				System.out.println("Please enter in 2 integers, and I will tell you the sum "
						+ "\nof all the numbers in between including the ones you pick!");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				System.out.println("The sum of all numbers between and including " + num1 + " and " 
				+ num2 + " is " + myGeek.sum(num1, num2));
				break;
				
			case 5: // Will ask the user to input a year and then tell them if the year is a Leap year or not
				System.out.println("Enter a year and I will tell you if it is a leap year or not.");
				int year = scan.nextInt();
				if(myGeek.leapYear(year)) {
					System.out.println("The year entered IS a leap year!");
				}
				else 
				{
					System.out.println("The year entered is NOT a leap year!");
				}
				break;
				
			case 6: /// will re display the options menu
				printMenu();
				break;
				
			case 7: //exit system with note
				System.out.println("Thank you, have a great day!");
				break;

			default:
				System.out.println("Invalid Input! Please try again!");
		}
		
	}while (option != 7);
	
	
	}
			
		
	//printMenu()
	public static void printMenu() 
	{
		System.out.println("                         Command Options" +
			"\n------------------------------------------------------------------" + 
			"\n1: What is the Geeks name?" + 
			"\n2: How many questions were asked?" + 
			"\n3: Is the sum of two numbers even or odd?" + 
			"\n4: What is the sum of all the numbers between two numbers?" + 
			"\n5: Is this year a Leap Year? " + 
			"\n6: Display this menu again!" + 
			"\n7: Quit this program!" +
			"\n------------------------------------------------------------------");
	}//end print Menu	
		
		
	
}//end program

/* Output
 * 
 * 
Command Options
------------------------------------------------------------------
1: What is the Geeks name?
2: How many questions were asked?
3: Is the sum of two numbers even or odd?
4: What is the sum of all the numbers between two numbers?
5: Is this year a Leap Year? 
6: Display this menu again!
7: Quit this program!
------------------------------------------------------------------

Please enter an option: 
1

Your Geeks name is: Suzy

Please enter an option: 
2
The number of questions asked is 0

Please enter an option: 
3
Please enter in 2 integers, and I will tell you if they are even or not!
12
15
The sum of the two are odd!

Please enter an option: 
3
Please enter in 2 integers, and I will tell you if they are even or not!
2
4
The sum of the two are even!

Please enter an option: 
4
Please enter in 2 integers, and I will tell you the sum 
of all the numbers in between including the ones you pick!
25
15
The sum of all numbers between and including 25 and 15 is 220

Please enter an option: 
4
Please enter in 2 integers, and I will tell you the sum 
of all the numbers in between including the ones you pick!
12
52
The sum of all numbers between and including 12 and 52 is 1312

Please enter an option: 
5
Enter a year and I will tell you if it is a leap year or not.
1565
The year entered is NOT a leap year!

Please enter an option: 
5
Enter a year and I will tell you if it is a leap year or not.
2017
The year entered is NOT a leap year!

Please enter an option: 
5
Enter a year and I will tell you if it is a leap year or not.
2018
The year entered is NOT a leap year!

Please enter an option: 
5
Enter a year and I will tell you if it is a leap year or not.
1992
The year entered IS a leap year!

Please enter an option: 
6
Command Options
------------------------------------------------------------------
1: What is the Geeks name?
2: How many questions were asked?
3: Is the sum of two numbers even or odd?
4: What is the sum of all the numbers between two numbers?
5: Is this year a Leap Year? 
6: Display this menu again!
7: Quit this program!
------------------------------------------------------------------

Please enter an option: 
7
Thank you, have a great day!
*/

		
		