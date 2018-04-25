//*****************************
//Name: Suzanne Kaufman
//Title: Lab5.java
//Description: Creating separate classes. In conjunction with Door.java
//Time Spent: 1.5 hours
//Date: 2/4/18
//*****************************



//A class to test the Door class.
public class Lab5 
{
      /*
        Tests the methods of the Door class
        @param args not used
     */
	
     public static void main(String[] args)
     {
        // Create a Door object, frontDoor which is initially open
        Door frontDoor = new Door("Front", "open");
        System.out.println("The front door is " + frontDoor.getState());
        System.out.println("Expected:  open");
       
        // Create a second Door object, backDoor which is initially closed
        Door backDoor = new Door("Back", "closed");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected:  closed");
        
        // Create a third Door object, sideDoor which is initially open
        Door sideDoor = new Door("Side", "open");
        System.out.println("The side door is " + sideDoor.getState());
        System.out.println("Expected:  open" + '\n'); 	//because there are two sets of variable, a 
        												//space between each set is necessary to distinguish 
        												//from original to changed

        // Use the mutator to change the state variable of the backDoor object
        backDoor.setState("open");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected:  open");
        
        // Use the mutator to change the state variable of the sideDoor object
        sideDoor.setState("closed");
        System.out.println("The side door is " + sideDoor.getState());
        System.out.println("Expected:  closed");

        // Use the mutator to change the name variable of the backDoor object
        backDoor.setName("Kitchen");
        System.out.println("The back door is called " + backDoor.getName());
        System.out.println("Expected:  Kitchen");

        // Complete the class as described in Part 8 of the Assignment
        
        /*PT 7 Testing door class (fail or executable?)
	 	Original program
	 		The front door is open
			Expected:  open
			The back door is closed
			Expected:  closed
			
			The back door is open
			Expected:  open
			The back door is called Kitchen
			Expected:  Kitchen
		
		Adding in third Door Object Side Door (open and then closed)
			The front door is open
			Expected:  open
			The back door is closed
			Expected:  closed
			The side door is open
			Expected:  open
			
			The back door is open
			Expected:  open
			The side door is closed
			Expected:  closed
			The back door is called Kitchen
			Expected:  Kitchen
		
		*/
		
     }
  }
