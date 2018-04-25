//-----------------------------------------------------------------------------
// AUTHOR: Suzanne Kaufman
// FILENAME: MovieSeating.java Class for Assignment7.java
// EXTRA CREDIT!
// SPECIFICATIONS: This program will read a series of customers' information
//// from a file specified by a user. A user will also specify the size
//// (the number of rows and columns for a movie theatre. Then the program
//// will try to assign each customer to a seat.
// FOR: CSE 110  Week 7
// TIME SPENT: 4 hours
//----------------------------------------------------------------------------
public class MovieSeating {


    private Customer[][] seating;


    public MovieSeating(int rowNum, int columnNum){
        seating = new Customer[columnNum][rowNum];
        for (int i=0;i<columnNum;i++){
            for (int j=0;j<rowNum;j++){
                seating[i][j]=new Customer();
            }
        }
    }

    private Customer getCustomerAt(int row, int col){
        return seating[col][row];
    }

    public boolean assignCustomerAt(int row, int col, Customer tempCustomer){
        Customer veryTempCustomer= seating[row][col];
        if (veryTempCustomer.getLastName().contains("???")){
            seating[row][col]=tempCustomer;
            return true;
        }
        return false;
    }

    public boolean checkBoundaries(int row, int col){
        if(row<0||col<0){
            return false;
        }
        if (col>seating[0].length){
            return false;
        }
        if (row>seating.length){
            return false;
        }
        return true;
    }

    public String toString(){
        String result = "The current seating \n"+"---------------------- \n";
        for (int i=0;i<seating[0].length;i++){
            for (int j=0;j<seating.length;j++){
                result += seating[i][j].toString() +" ";
            }
            result += "\n";
        }
        return result;
    }



}
