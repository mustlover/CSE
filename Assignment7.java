/*-------------------------------------------------------------------------
// AUTHOR: CSE110 Instructor
// FILENAME: Assignnment7.java  Tester for MovieSeating.java
// SPECIFICATION: This program will read a series of customers' information
// from a file specified by a user. A user will also specify the size
// (the number of rows and columns for a movie theatre. Then the program
// will try to assign each customer to a seat.
// STUDENT: Suzanne Kaufman
// FOR: CSE 110 - Week 7
// TIME SPENT: 4 hours
//----------------------------------------------------------------------*/

//*** This program will read some information from a file and ***//
//** some information from a keyboard.                        ***//

import java.io.*;

public class Assignment7
{
    public static void main(String[] args) throws IOException
    {

        MovieSeating theatreSeating;
        Customer tempCustomer;
        int row, col, rowNum, columnNum;
        String line, fileName;


        // create InputStreamReader and BufferedReader object
        // to read input from a KEYBOARD.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);


        // Ask a user to enter a number of rows for a movie theatre seating from a KEYBOARD.
        System.out.println("Please enter a number of rows for a movie theatre seating.");
        rowNum = Integer.parseInt(stdin.readLine());

        // Ask a user to enter a number of columns for a movie theatre seating from a KEYBOARD.
        System.out.println("Please enter a number of columns for a movie theatre seating.");
        columnNum = Integer.parseInt(stdin.readLine());

        // instantiate a MovieSeating object
        theatreSeating = new MovieSeating(rowNum, columnNum);


        // get a file name read from a KEYBOARD.
        System.out.println("Please enter a file name (C:\\Users\\suzy\\IdeaProjects\\Java\\src\\customerData.txt)");
        fileName = stdin.readLine();
        //C:\Users\suzy\IdeaProjects\Java\src\customerData.txt


        // create FileReader and BufferedReader object to
        // read from a file.
        FileReader fr = new FileReader (fileName);
        BufferedReader inFile = new BufferedReader (fr);

        /*** reading a customer's information from a FILE ***/
        line = inFile.readLine();

        /*** we will read line by line until we read the end of a given file ***/
        while (line != null)
        {
            System.out.println("\nA customer information is read from a file.");
            // printing information read from a file.
            System.out.println(line);

            // creating a customer object using information from a file
            tempCustomer = new Customer(line);

            // Ask a user to decide where to seat a customer by asking for row and column of a seat
            System.out.println("Please enter a row number where the customer wants to sit.");
            row = Integer.parseInt(stdin.readLine());

            System.out.println("Please enter a column number where the customer wants to set.");
            col =  Integer.parseInt(stdin.readLine());

            // Checking if the row number and column number are valid (exist in the theatre that we created.)
            if (theatreSeating.checkBoundaries(row, col) == false)
            {
                System.out.println("\nrow or column number is not valid.");
                System.out.println("A customer " + tempCustomer.getFirstName() + " " + tempCustomer.getLastName() + " is not assigned a seat.");
            }
            else
            {
                // Assigning a seat for a customer
                if (theatreSeating.assignCustomerAt(row, col, tempCustomer) == true)
                {
                    System.out.println("\nThe seat at row " + row + " and column " + col + " is assigned to the customer " + tempCustomer.toString());
                    System.out.println(theatreSeating);
                }
                else
                {
                    System.out.println("\nThe seat is taken.");
                }
            }

            // Read next line in a FILE
            line = inFile.readLine();

        }

        // Closing the file
        inFile.close();

    }

}
/* ---OUTPUT---
Please enter a number of rows for a movie theatre seating.
3
Please enter a number of columns for a movie theatre seating.
3
Please enter a file name (C:\Users\suzy\IdeaProjects\Java\src\customerData.txt)
C:\Users\suzy\IdeaProjects\Java\src\customerData.txt

A customer information is read from a file.
Roseann Pindrock 111111111 3 4
Please enter a row number where the customer wants to sit.
0
Please enter a column number where the customer wants to set.
2

The seat at row 0 and column 2 is assigned to the customer R.P.
The current seating
----------------------
?.?. ?.?. R.P.
?.?. ?.?. ?.?.
?.?. ?.?. ?.?.


A customer information is read from a file.
Suzy Kaufman 222222222 6 5
Please enter a row number where the customer wants to sit.
0
Please enter a column number where the customer wants to set.
1

The seat at row 0 and column 1 is assigned to the customer S.K.
The current seating
----------------------
?.?. S.K. R.P.
?.?. ?.?. ?.?.
?.?. ?.?. ?.?.


A customer information is read from a file.
Jenna Fraze 333333333 4 3
Please enter a row number where the customer wants to sit.
2
Please enter a column number where the customer wants to set.
2

The seat at row 2 and column 2 is assigned to the customer J.F.
The current seating
----------------------
?.?. S.K. R.P.
?.?. ?.?. ?.?.
?.?. ?.?. J.F.


A customer information is read from a file.
Megan Duso 555666777 4 5
Please enter a row number where the customer wants to sit.
0
Please enter a column number where the customer wants to set.
1

The seat is taken.

A customer information is read from a file.
Alexis Tomarkin 666888999 16 5
Please enter a row number where the customer wants to sit.
0
Please enter a column number where the customer wants to set.
2

The seat is taken.

A customer information is read from a file.
Elizabeth Traverso 777777777 43 23
Please enter a row number where the customer wants to sit.
1
Please enter a column number where the customer wants to set.
1

The seat at row 1 and column 1 is assigned to the customer E.T.
The current seating
----------------------
?.?. S.K. R.P.
?.?. E.T. ?.?.
?.?. ?.?. J.F.


A customer information is read from a file.
Aaron Burdick 888888888 2 4
Please enter a row number where the customer wants to sit.
0
Please enter a column number where the customer wants to set.
0

The seat at row 0 and column 0 is assigned to the customer A.B.
The current seating
----------------------
A.B. S.K. R.P.
?.?. E.T. ?.?.
?.?. ?.?. J.F.


Process finished with exit code 0
 */