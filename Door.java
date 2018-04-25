//*****************************
//Name: Suzanne Kaufman
//Title: Door.java
//Description: Class door created for Lab 5 creating separate classes
//Time Spent: 1.5 hours 
//Date: 2/4/18
//*****************************

public class Door { //PT 1 Define Class: "Door" class created
	
		 
	//PT 2:  instance variables and made private
	private String name;  // hold value for name of door
	private String state;  // hold value for state of door
	
	
	// PT 3 Constructor: constructs a Door with name and state
	public Door (String newName, String newState) {
		name = newName;
		state = newState;
	}	
	
	//PT 4 Accessor Method: 
	public String getName() { //Gets the name of the door
		return name;
	}
	public String getState() { //Gets the state of the door
		return state;
	}
		
	//PT 5 Mutator Method: allows you to change the value of variables
	public void setState(String newState) { //allow change of variable state
		state = newState;
	}
	public void setName(String newName) { //allow change of variable name
		name = newName;
	}
	
	//PT 6 Other Method: invoking a method to change the value of instance variable
	public void open() { // invoke open
		state = "open";
	}
	public void closed() { // invoke closed
		state = "closed";
	}
	
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