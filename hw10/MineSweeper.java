/* 

Nathan DeRaymond
11/11/2015
CSE 02 -- Homework 10

In this program, practicce will be given in writing and manipulating 2-D 
arrays by writing a minesweeper game based on user input

*/

import java.util.Scanner; // Import scanner to read user input

public class MineSweeper {

public static void main (String[] args) {
    
    // Declaring variables and constructing scanner
    
        Scanner myScanner = new Scanner (System.in);  // Construct scanner to read input
        char[][] board;    // Declaaring an array of string for the board
        int boardSize;     // Variable to store the size of the board
        int mineNumber;    // Varialbe to stort the number of mines
        
    // Asking user for initial input
        
        System.out.print("Please enter a number between two and thirty for the board size: "); // Prompting user to enter size
        boardSize = myScanner.nextInt ();  // Accepting user input
        
        while(boardSize < 2 || boardSize > 30) {  // Asks the user to re-input values until a valid size is found
            System.out.print("Not a valid input, enter another number: ");  // Prompt user to enter valid number
            boardSize = myScanner.nextInt ();  // Accepting user input
        } // End of loop
        
        System.out.print("Please enter the number of mines to be placed on the board: "); // Asking for number of mines
        mineNumber = myScanner.nextInt ();  // Accepting user input
        
        while(mineNumber < 1 || mineNumber > (boardSize*boardSize)) {  // Keeps running until the input is proper
            System.out.print("Not a valid input, enter another number: ");  // Prompt user to enter valid number
            mineNumber = myScanner.nextInt ();  // Accepting user input
        } // End of loop
        
    // Developing the board
    
        // Creating a default board
    
            board = new char[boardSize][boardSize]; // Allocating the array of board so it is the proper size
            // These loops will initialize values in each element of the board
            for(int i = 0; i < boardSize; i++) { // This for loop accesses the row number
                for(int j = 0; j < boardSize; j++) { // This for loop accesses the column number
                    board[i][j] = '0'; //  Assigning a default value of 0 to all the cells
                }
            }
            
        // Adding in the mines
        
            int rowSpot;       // temporary variables to determine where a mine 
            int columnSpot;    // is placed on the board
            int count = 0;     // Sentinel variable to stop while loop
            while (count < mineNumber) {
                rowSpot = (int)(Math.random() * boardSize);    // Random coordinates for where the 
                columnSpot = (int)(Math.random() * boardSize); // mine will be placed
                
                if (board[rowSpot][columnSpot] != 'M') {   // Checks if a mine is already at that location
                    board[rowSpot][columnSpot] = 'M';    // Placing mine at a random index
                    count = count + 1;                   // Increment count 
                } // End of if statement
                
            } // End of loop
  
        // Updating other cells adjacent to mines to show how many mines they contact
        
            for(int i = 0; i < boardSize; i++) { // This for loop accesses the row number
                for(int j = 0; j < boardSize; j++) { // This for loop accesses the column number
                    if (board[i][j] == 'M') {  // Check for mines

                                                               
                                increment(board, i, j);       // Method to increment the cells adjacent to a mine
                         
                    }  // End of if statement
                }  // End of inner for loop
            }  // End of outer for loop
            
    // Printing the final board
    
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                
                System.out.print(board[i][j] + " ");
            } // End of inner for loop
            System.out.println("");
        } // End of outer for loop
        
        
} // End of main method 

public static void increment(char[][] board, int i, int j) { 
// This method increments the count of adjacent cells next to a mine

for (int counter1 = i; counter1 < i + 3; counter1++) {      // these for loops access a mini 3x3 array around a mine
    for(int counter2 = j; counter2 < j + 3; counter2++) {   // in order to modify those values

        try { // this statement will run the following code and test for runtime errors
            if(board[counter1-1][counter2-1] != 'M') {  // Does not increment locations that have mines
                board[counter1-1][counter2-1] = (char)(board[counter1-1][counter2-1] + 1); // adds 1 if a cell is next to a mine
            } // End if statement
        } catch (IndexOutOfBoundsException e) {  // Stops runtime errors when mine is at the edge of the board
        
        } // End of try catch statement
   

    } // end of inner loop

} // end of outer loop

} // end of method

                          

} // End of class