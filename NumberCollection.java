package CSE;

public class NumberCollection{
	
	//instance variables
	private int count;
	private int[] numberArray;
	private int[] temp;
	
	//constructor
	public NumberCollection(int arraySize)
	{
		numberArray = new int[arraySize];
		count = 0;		
	}
		
	//methods
	
	//method indexOf()
	private int indexOf(int searchingNum)
	{
		int index = -1;

		for(int i = 0; i < numberArray.length; i++)
		{
			if(numberArray[i] == searchingNum)  //When argument equals number in 'i' index
				index = i;  // Sets the return value equal to the index of the number found
		}					// else returns -1

		return index;
	}
	
	//method doubleArrayCapacity()
	private void doubleArrayCapacity()
	{
		if(count == numberArray.length) //if the count is equal to the length
		{
			NumberCollection[] temp; //making a temporary array for the copy
			temp = new NumberCollection[numberArray.length * 2]; //doubling the length
		}

			for(int i = 0; i <numberArray.length; i++)
				temp[i] = numberArray[i]; //loop to copy old array onto temporary

			numberArray = temp; //copying temporary back to numberArray
	}
	
	//method addNumber()
	public boolean addNumber(int numberToAdd)
	{
		boolean flag = false;

		if (numberArray.length == count)
			doubleArrayCapacity(); //doubling array if over the length

		if (indexOf(numberToAdd) == -1)
			flag = true; //if number entered is already in array, this won't add. 

		numberArray [count] = numberToAdd; //adds number to last index in array
		count++; //continue count
		return flag;
	}
	
	//method findMax()
	public int findMax()
	{
		int max = 0;

		for(int i = 0; i < numberArray.length; i++)
		{
			if(numberArray[i] > max)
				max = numberArray[i]; //copying larger values to max
		}
		return max;
	}
	
	//method findMin()
	public int findMin()
	{
		int min = numberArray[0]; //sets initial value to first term

		for(int i = 0; i < numberArray.length; i++) //scans for smaller terms
		{
			if(numberArray[i] <min)
				min = numberArray[i]; //if smaller, assigns to minimum
		}

		return min;
	}
	
	//method computeSum()
	public int computeSum()
	{
		int sum = 0; // sets sum to zero

		for(int i = 0; i < numberArray.length; i++) //scans all number in array
		{
			sum += numberArray[i]; //adds the numbers entered into the array to get a sum
		}

		return sum;
	}
	
	//method toString()
	public String toString()
	{
		String array = "{"; //Tells string to add { before the array listed

		for(int i = 0; i < numberArray.length; i++) //Scan numbers entered into array
			array += numberArray[i] + " "; // capture and display numbers listed in array

		array += "}"; //Tells string to add } after the array listed

		return array;
	}
	
}

/*---OUTPUT---

Please enter a size for the array.

5

Command Options
-----------------------------------
a: add an integer in the array
b: display the array
c: compute and display the maximum
d: compute and display the minimum
e: compute and display the sum
?: display the menu again
q: quit this program


Please enter a command or type ?
a

Please enter an integer to add.
12

12 successfully added.

Please enter a command or type ?
b

{12 0 0 0 0 }

Please enter a command or type ?
a

Please enter an integer to add.
213

213 successfully added.

Please enter a command or type ?
a

Please enter an integer to add.
64

64 successfully added.

Please enter a command or type ?
a

Please enter an integer to add.
123

123 successfully added.

Please enter a command or type ?
a

Please enter an integer to add.
5

5 successfully added.

Please enter a command or type ?
b

{12 213 64 123 5 }

Please enter a command or type ?
c

The maximum is: 213

Please enter a command or type ?
d

The minimum is: 5

Please enter a command or type ?
e

The sum is: 417

Please enter a command or type ?
f
Invalid input!

Please enter a command or type ?
q


*/
