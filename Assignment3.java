//***********************************************************
// Name: Suzanne Kaufman
// Title: Assignment 3
// Author: Suzy Kaufman
// Description: To declare and use variables, arithmetic expressions,
//              using scanner class, use selection statements to find a max value
// Time spent: 3 hours
// Date: 1/27/18
//
//
//    --------PART 1------------
/*		
 * 			1a) 10 9 8 7 6 5 4 2
 * 			1b) 5  15 
 * 
 * 			2. ***Code***
 * 			import java.util.Scanner;
			
			public class Assignment3
			{

			public static void main (String[] args)
			
			Scanner input = new Scanner (System.in);
	        System.out.print("Enter your name: ");
	        String str = input.next();
	        String reverse = "";
	        for(int i=str.length()-1; i>=0; i--)
	            reverse += str.charAt(i);
	        System.out.println(reverse); 
	        }
	        }
*/
//    --------PART 2------------


import java.util.Scanner;

public class Assignment3
{

	public static void main (String[] args)
	{
		   Scanner input = new Scanner(System.in);
		   
		    System.out.println("Please enter the first number: ");// ask user to enter a number
		    int num1 = input.nextInt();
		    
		    System.out.println("Please enter the second number :");// ask user to enter a second number
		    int num2 = input.nextInt();
		    
		    System.out.println("The GCD of " + num1 + " and " + num2 + " is " +  calGcd(num1,num2) + "."); 
		    //will print out the greatest common denominator of the two inputed numbers after the calculation
		    
		    input.close();//closes input scanner
	}
	
		public static int calGcd(int num1, int num2)//begin calculation of both inputed numbers
		{
		    int gcd = 1; //start with 1
		    if(num1>num2) //if number 1 is greater than number 2
		    {
		        for(int i = num2; i >=1; i--) // i = number 2
		        {
		            if(num1%i ==0 && num2%i ==0) //calculate the divisables of i
		            {
		                return i;
		            }
		        }//cycle to find a number that i has in common with j  
		    }
		    else
		    {
		        for(int j = num1; j >=1; j--) // j = number 1
		        {
		            if(num1%j==0 && num2% j==0)//calculate the divisables of j
		            {
		                return j;
		            }
		        }//cycle to find a number that j has in common with i 
		    }   
		    return gcd; // return the lowest common number of each i and j
		  }
}