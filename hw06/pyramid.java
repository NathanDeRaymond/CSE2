// Nathan DeRaymond
// 10/6/2015
// CSE2 hw06 -- Pyramid

// This program will give practice writing nested loops and user inputed data.
// This is accomplished by printing a pyramid given a user input for the number
// of levels it should have.



import java.util.Scanner; // importing the scanner class for user input

public class pyramid {  // Defining class

    public static void main (String[] args) {  // Setting up main method
        
        
        // This is where the variables will be declared
        
            Scanner scan = new Scanner (System.in);  // Scanner is constructed to read iput
            
            int size = 0;                // Variable for the pyramid size
            int spaceNumber = 0;         // Variable to space out rows horizontally and align them vertically


        // This is where input will be set up
        
            System.out.print("What size pyramid? ");  // Prompting user to enter the desired pyramid size
            size = scan.nextInt ();                   // Accepting user input as value
            
            
        // This is where the loops will be to print the proper pyramid
        
            for (int a = 1; a <= size; a++) {
                
                spaceNumber = size - a;  // This dynamically determines the number of spaces before a given row
                
                
                for (int b = 1; b <= spaceNumber; b++) {  // This for loop will place spaces before the pyramid rows
                    
                     System.out.print (" ");  // Prints a space to help align rows
                     
                }  // End of first inner for loop
                
                
                for (int c = 1; c <= a * 2 - 1; c++) {  // This expression gives the number of blocks per pyramid row 
                                                        // (consecutive odd positive integers corresponding to row number)
                    
                    System.out.print("*");  // Printing the building blocks of the pyramid
                    
                }  // End of second inner for loop
                
                
                System.out.println("");  // Print to next line for the next row of the pyramid
                
            }  // End of outer for loop
        
    }  // End of main method
    
}  // End of class