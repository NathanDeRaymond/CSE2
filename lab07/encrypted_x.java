/*

Nathan DeRaymond
10/8/2015
Lehigh University 

CSE2 -- lab 07 "encrypted x"

    In this lab, loops will be used to print out an "X" in the negative
space of a block of asterisks. The size of the block will be determined
by user input

*/



import java.util.Scanner;  // Importing the scanner class to read user input


public class encrypted_x {  // Setting up class

    
    public static void main (String[] args) {  // Setting up main method
    
    
        // This section is where variables will be declared
        
        
            Scanner scan = new Scanner (System.in);  // Constructing the scanner to read user input
            int size = 0;                            // This variable will determine the size of the "X"
            
            
        // This is where the user input will take place
        
        
            System.out.print("Please enter an integer value between 0 and 100: ");  // Prompting the user to enter data
            size = scan.nextInt ();                                             // accepting the user's input for size
            
            
        // This is where the program will check if the input is valid
        
        
            if (size <= 0 || size >= 100) {
                
                System.exit(-1);  // Exits program
                
            }
            
            
        // This is where the loops will take place to properly print the output 
        
        
            for (int a = 1; a <= size; a++) {  // This loop will print the right number of columns
                
                for (int b = 1; b <= size; b++) {  // This loop will print the right number of characters per row
                    
                    if (b == a || size - (a - 1) == b) {  // This loop will determine the location of the spaces based on the row
                    
                        System.out.print(" ");  
                        
                    } else {
                    
                        System.out.print("*");  //  Filling in the box
                    
                    }  // End of if loop 
                    
                }  // End of inner for loop
                
                System.out.println("");  // Going to a new line
                
            }  // End of outer for loop
    
        
    }  // End of main method
    
    
}  // End of class

