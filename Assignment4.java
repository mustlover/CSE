//*****************************
//Name: Suzanne Kaufman
//Title: Assignment4.java in conjunction with Triangle.java
//Description: Building a program using loops, classes, instance variables, methods
//				object construction, constructors, and encapsulation
//Time Spent: 1.5 hours
//Date: 2/4/18

/*
 Part 1  (None)
 Part 2 programming (see below)
 */
//*****************************

import java.awt.geom.*;
import java.util.Scanner;
public class Assignment4 
{

   //===========================================================
   // Create and determine properties of various triangles.
   //===========================================================
   public static void main (String[] args) 
   {
      Scanner console = new Scanner(System.in);
      int num1, num2, num3;
      String another;
    	 
      
      //repeat until the user enters 'n'
      do
      {
         //get the input
      	 System.out.println("Enter the sides of the triangle: ");
      	 num1 = console.nextInt();
      	 num2 = console.nextInt();
      	 num3 = console.nextInt();

         //create the Triangle
         Triangle myTriangle = new Triangle (num1, num2, num3);

         //print the Triangle
      	 System.out.println(myTriangle.toString() + " triangle:");
      	 
      	 //check the if triangle is isosceles
      	 if (myTriangle.is_isosceles())
      		 System.out.println("\tIt is isosceles");
      	 else
      		 System.out.println("\tIt is not isosceles");
      	 
      	//check the if triangle is equilateral
      	 if (myTriangle.is_equilateral())
      		 System.out.println("\tIt is equilateral");
      	 else
      		 System.out.println("\tIt is not equilateral");
      	 
      	//check the if triangle is scalene
      	 if (myTriangle.is_scalene())
      		 System.out.println("\tIt is scalene");
      	 else
      		 System.out.println("\tIt is not isosceles");
      	 
      	 //find if the user wants to repeat
      	 System.out.println();
      	 System.out.println("Check another triangle (y/n)? ");
      	 another = console.next();
      	 
      } while (another.equalsIgnoreCase("y"));

	}//end main method
}// end class Assignment4

