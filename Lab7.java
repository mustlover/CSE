//***********************************************************
// Name: Suzanne Kaufman
// Title: Lab 7 - Basic Arrays
// Author: Suzy Kaufman
// Description: Allow the user to input 5 integers into an array,
//              then print out the cache of the array, 
//              after adding 1 to each value entered. 
// Time spent: 2 hours
// Date: 2/17/18
//***********************************************************

package CSE;

import java.util.*;

public class Lab7 {
	
	public static void main(String[]args) {

	int SIZE = 5;
	int[] arrayofsize = new int[SIZE];
	int index = 0;
	
	
	Scanner in = new Scanner(System.in);
	
	while(index < arrayofsize.length)
	{
		arrayofsize[index] = in.nextInt();
		index++;
	}
	
	System.out.println("Processing array, please stand by...........");
	System.out.println();
	
	for (int i = 0; i<arrayofsize.length; i++)
		System.out.println(arrayofsize[i]+1);
		System.out.println();
	}
	
}

/* -- OUTPUT --
 
		-5
		8
		12
		74
		-2
		Processing array, please stand by...........
		
		-4
		9
		13
		75
		-1
 */

