//***********************************************************
// Name: Suzanne Kaufman
// Title: Lab 6 - SuperHero Class 
// Author: Suzy Kaufman
// Description: Class for Driver program Lab6.java
// Time spent: 4 hours
// Date: 2/11/18
//***********************************************************


package CSE;

public class SuperHero {
	
	//instance variables set to private to protect encapsulation
	
	private static int numberOfHeroes;
	private String heroName;
	private String secretIdentity;
	private int numberOfLifeChances;
	private int numberOfPeopleSaved;
	
	//two constructors
	
	public SuperHero(String initHeroName, String initSecretIdentity, int initPeopleSaved) {
		numberOfHeroes++; // One more hero created
		numberOfLifeChances = 2; // start the hero with two lives
		heroName = initHeroName;
		secretIdentity = initSecretIdentity;
		numberOfPeopleSaved = initPeopleSaved;
	}
	
	public SuperHero(String myHeroName) {
		numberOfHeroes++; // One more hero created
		numberOfLifeChances = 2; // start the hero with two lives
		heroName = myHeroName;
		secretIdentity = "unknown";
		numberOfPeopleSaved = 0; // set to 0
	}
		
	//getNumbeOfHeros()
	public static int getNumberOfHeroes() 
	{
		return numberOfHeroes;
	}

	//recordSave()
	public void recordSave() 
	{
		numberOfPeopleSaved++;
	}
	
	//2nd recordSave()
	public void recordSave(int num) 
	{
		//increment numberOfPeopleSaved by number
		numberOfPeopleSaved += num;
	}
	
	//killHero()
	public void killHero() {
		if(numberOfLifeChances == 0) 
		{
			System.out.println("Your hero has died!");
		}
	else 
		{
			numberOfLifeChances --;
		}
	}
				
			
	//printSuperHeroRecord()
	public void printSuperHeroRecord() 
	{
		System.out.println("Heros' Name: " + heroName);
		System.out.println("Secret Identity: " + secretIdentity);
		if(numberOfLifeChances == 0)
		{
			System.out.println("Status: Dead");
		}
		else
		{
			System.out.println("Status: Alive");
		}
		
		System.out.println("Number of lives saved: " + numberOfPeopleSaved);
	}


}
