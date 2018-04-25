//***********************************************************
// Name: Suzanne Kaufman
// Title: Lab 6 - SuperHero Driver Program 
// Author: Suzy Kaufman
// Description: Driver program for Class SuperHero.java
// Time spent: 4 hours
// Date: 2/11/18
//***********************************************************


package CSE;

import java.util.*;

public class Lab6 {
	
	public static void main(String[] args) {

	//new scanner created
	Scanner scan = new Scanner(System.in);
	
	//new super hero created Spider-Man
	System.out.println("Creating Spider-Man ......");	
	SuperHero spiderman = new SuperHero("Spider-Man", "Peter Parker", 0);
	
	
	//read in the your hero identity 
	
	
	//ask user to enter a super hero name
		System.out.println("\nWhat is the name of your super hero?");
		String heroName = scan.nextLine(); 
		
		System.out.println("What is his secret identity: ");
		String secretIdentity = scan.nextLine();
			
	// Create the hero called yourHero, who saved 10 people 
		System.out.println("Creating your super hero ......");
		SuperHero yourHero = new SuperHero(heroName, secretIdentity, 10);
		
		
	// Call recordSave on spiderman with 100 as the input
		System.out.println("\nSpider-Man just saved a bus with 100 lives on board!");
		spiderman.recordSave(100);
		
	
	//Kill spiderman twice
	System.out.println("During his heroic efforts, spiderman was shot twice by police!");
	spiderman.killHero(); //once
	spiderman.killHero(); //twice
	
	//kill your hero once
		System.out.print("\nYour hero has saved a falling kid,");
		yourHero.recordSave();
		
	//Add 1 to your hero's lives saved
		System.out.println(" but was shot once by police in his efforts.");
		yourHero.killHero();
	
		
		System.out.println("\n ---- Superhero information -----");
	
	//Store the number of heros in an int called numHeros 
		System.out.println("There are " + SuperHero.getNumberOfHeroes() + " known superheros.");
		spiderman.printSuperHeroRecord();
	
		System.out.println();
	
	//print the record of yourHero
		yourHero.printSuperHeroRecord();
	
	
	}
	
/* Output: 
 * Creating Spider-Man ......

What is the name of your super hero?
Iron Man
What is his secret identity: 
Tony Stark
Creating your super hero ......

Spider-Man just saved a bus with 100 lives on board!
During his heroic efforts, spiderman was shot twice by police!

Your hero has saved a falling kid, but was shot once by police in his efforts.

 ---- Superhero information -----
There are 2 known superheros.
Heros' Name: Spider-Man
Secret Identity: Peter Parker
Status: Dead
Number of lives saved: 100

Heros' Name: Iron Man
Secret Identity: Tony Stark
Status: Alive
Number of lives saved: 11
 * 

*/
}
