//*****************************
//Name: Suzanne Kaufman
//Title: Triangle.java
//Description: Class Triangle created for Assignment 4
//Time Spent: 5 hours
//Date: 2/4/18

/*
 Part 1  (None)
 Part 2 programming (see below)
 */
//*****************************


public class Triangle {//PT 1 Define Class: "Triangle" class created

			 
		//instance variables, private to protect encapsulation
		private int side1, side2, side3; // hold value for triangle sides 1, 2, & 3
		private String another; // holds value 'y' or 'n' to continue with another triangle
			
		
		//constructor to initialize the instance variables to some user defined
		public Triangle(int s1, int s2, int s3) {
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}
		
		//method needs to be converted to a String for printing
		public String toString() {
			String res = (side1 + " " + side2 + " " + side3);
			return res; //returns result of string
		}
		
		private int largest() //helper method used to determine which side is longest
		{
			if (side1 > side2 && side1 > side3)
			return side1;
			else if
				(side2 > side1 && side2 > side3)
				return side2;
				else return side3;
		}
		
		private int shortest() //helper method used to determine which side is shortest
		{
			if (side1 < side2 && side1 < side3)
				return side1;
				else if
					(side2 < side1 && side2 < side3)
					return side2;
					else return side3;
		}
		
		public boolean is_isosceles() //recalls if the three sides form a isosceles triangle
		{
			return ((side1 == side2 && side2 != side3) || (side1 != side2 && side3 == side1) || (side3 == side2 && side3 != side1));
		}	
		
		public boolean is_equilateral() //recalls if the three sides form a equilateral triangle
		{
			return (side1 == side2 && side2 == side3);
		}
		
		public boolean is_scalene() //recalls if the three sides form a scalene triangle
		{
			return (side1 != side2 && side2 != side3 && side3 != side1);
		}
		
		
}//end class
		