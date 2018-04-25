//-----------------------------------------------------------------------------
//AUTHOR: Suzanne Kaufman
//FILENAME: Lab8.java  Tester for class Arrays.java
//SPECIFICATIONS: finding the minimum, maximum, sum, and average of
//                numbers in an array
//FOR: CSE 110 - Week 7
//TIME SPENT: 3 hours
//----------------------------------------------------------------------------

public class Lab8 {

    public static void main(String[] args) {

        // Create an Arrays object using the first constructor
        Arrays arr1 = new Arrays(5);

        // Print the contents of the array in arr1
        System.out.println(arr1);

        // Call findMin, findMax, and calcAverage on arr1 and print their values
        System.out.println("Min: " + arr1.findMin());
        System.out.println("Max: " + arr1.findMax());
        System.out.println("Average: " + arr1.calcAverage());
        System.out.println();

        //Create a new array with three numbers
        int[] array = new int[3];
        array[0]=5;
        array[1]=10;
        array[2]=32;

        Arrays arr2 = new Arrays(array);

        System.out.println(arr2);
        System.out.println("Min: " + arr2.findMin());
        System.out.println("Max: " + arr2.findMax());
        System.out.println("Average: " + arr2.calcAverage());
        System.out.println();



    }
}

/* ---Output---
[ 3, 4, 8, 0, 5 ]
Min: 0
Max: 8
Average: 4.0

[ 5, 10, 32 ]
Min: 5
Max: 32
Average: 15.0
 */
