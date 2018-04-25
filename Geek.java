//***********************************************************
// Name: Suzanne Kaufman
// Title: Assignment 5 - Geek Class 
// Author: Suzy Kaufman
// Description: Class for Driver program Assignment5.Java
// Time spent: 4 hours
// Date: 2/11/18
//***********************************************************


package CSE;

public class Geek {
	
	//instance variables set to private to protect encapsulation
	
	private String name = "Suzy";
	private int numQuestions;
	

	//constructor
	public Geek(String name) {
		name = name;
		numQuestions = 0;
	}
	
	//getName()
		public String getName() 
		{
			return name;
		}
		
	//getNumberOfQuestions()
	public int getNumberOfQuestions() 
	{
		return numQuestions;
	}

	//isEven()  calculates the sum of two numbers entered by the user
	//and determines if the sum is even or odd. 
	public boolean isEven(int num1, int num2) {
		numQuestions++;
		if ((num1 + num2) % 2 == 0) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	//sum()  
	//calculates the sum of all the number between and including
	//the two numbers the user entered.
	public int sum(int num1, int num2) {
		numQuestions++;
		int sum = 0;
		if (num1 < num2) 
		{
			for(int i = num1; i <= num2; i++) 
			{
				sum += i;
			}
		}
		else if (num1 > num2) 
		{
			for(int i = num2; i <= num1; i++) 
			{
				sum += i;
			}
		}
		else 
		{
			sum = num1;
		}
		return sum;
	}
	

	//leapYear()
	//Determines if the year entered was a leap year
	public boolean leapYear(int year) {
		numQuestions++;
		if (year % 4 == 0) 
		{
			if (year % 400 == 0  && year % 100 !=0) 
			{
				return false;
			} 
			else 
			{
			return true;
			}
		}
		else 
		{
			return false;
		}
	}
}

	
/*Output
 * 
 *                          Command Options
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




