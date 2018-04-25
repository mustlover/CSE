/* Chapter 2 Examples from the Math class:

	 - max, min
	 - abs
	 - sqrt, cbrt
	 - pow
	 - random
	 - Math.PI

*/


import java.util.Scanner;

public class MathEx
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		//read two numbers from the user
		int num1, num2;
		System.out.print("Enter two numbers: ");
		num1 = in.nextInt();
		num2 = in.nextInt();

		//Math.max(a, b) to get the larger of two numbers
		//Math.min(a, b) to get the smaller of two numbers
		System.out.println("\nThe larger value is: " + Math.max(num1, num2));
		int min = Math.min(num1, num2);
		System.out.println("The smaller value is: " + min);

		//Math.abs(num) to get the absolute value of a number
		System.out.println("\nThe absolute value of num1: " + Math.abs(num1));
		System.out.println("The absolute value of num2: " + Math.abs(num2));

		//Math.sqrt(num) to get the square root of a number
		//Math.cbrt(num) to get the cube root of a number
		System.out.println("\nThe square root  of num1: " + Math.sqrt(num1));
		System.out.println("The cube root  of num2: " + Math.cbrt(num2));

		//Math.pow(num, exp) to get the num^(exp)
		System.out.println("\n2^5: " + Math.pow(2, 5));
		System.out.println("\n2^-1: " + Math.pow(2, -1));
		System.out.println("\n4^(1/2): " + Math.pow(4, 1.0/2.0));

		//Math.random() to get a random number in the range [0.0, 1.0)
		//To get a random int between [a, b] use:
		//		(int) (Math.random() * (b-a+1) + a)
		System.out.println("\nrandom1: " + Math.random()*(num2)); //[0.0, num2)
		System.out.println("random2: " + Math.random() * num2 + num1); // [num1, num2+num1)
		System.out.println("random3: " + (int) (Math.random() *(num2-num1)+num1));// [num1, num2)

		// Math.PI
		System.out.println("\nPI = " + Math.PI);



	}//end main

}//class

