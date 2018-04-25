//Chapter 3 Comparing Strings Example

import java.util.*;

public class CompareStrings 
{
	//The program reads in three strings and sorts them alphabetically
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three strings: ");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		String s3 = scan.nextLine();
		
		//compare the first two strings and swap them
		//System.out.println("Adam".compareTo("David"));
		String temp;
		if(s1.compareTo(s2) > 0)
		{	temp = s1;
			s1 = s2;
			s2 = temp;
		}
		
		//compare the first and third and swap them
		if(s1.compareTo(s3) > 0)
		{	temp = s1;
			s1 = s3;
			s3 = temp;
		}	
		
		//compare the second and third and swap them
		if(s2.compareTo(s3) > 0)
		{	temp = s2;
			s2 = s3;
			s3 = temp;
		}
				
		System.out.println("The strings in alphabetical order are:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	

}


