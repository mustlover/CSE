//-----------------------------------------------------------------------------
//AUTHOR: Suzanne Kaufman
//FILENAME: Arrays.java Class for tester Lab8.java
//SPECIFICATIONS: finding the minimum, maximum, sum, and average of
//                numbers in an array
//FOR: CSE 110  Week 7
//TIME SPENT: 3 hours
//----------------------------------------------------------------------------

import java.util.*;

public class Arrays {

    //instance variable
    private int array[];
    private int count;


    //constructors
    public Arrays(int size) {
        this.array = new int[size];
        this.count = array.length;
        Random rand = new Random();
        for(int i = 0; i < count; i++) {
            array[i] = rand.nextInt(10);
        }
    }

    public Arrays(int[] arr) {
        this.array = arr;
        this.count = arr.length;
    }


    //findMin
    public int findMin() {
        int min = array[0]; // set min to the first element
        for (int i = 1; i < count; i++) {
            // Reassign min if there is a smaller element
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min; // Return the smallest element
    }

    //findMax
    public int findMax() {
        int max = array[0]; // set max to the first element
        for (int i = 1; i < count; i++) {
            // Reassign max if there is a larger element
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max; // Return the largest element
    }

    //calcSum
    private int calcSum() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //calcAverage
    public double calcAverage() {
        double average = 0;
        int sum = this.calcSum();
        average = sum / count;
        return average;
    }

    //toString()
    public String toString() {
        String output = "[ ";
        for (int i = 0; i < count; i++) {
            output += array[i];
            if (i != count - 1) {
                output += ", ";
            }
        }
        return output + " ]";
    }
}
