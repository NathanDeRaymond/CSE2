   // Nathan DeRaymond
   // 9/15/2015
   // CSE 2 Homework 03 -- Part 2 -- Block
   
   // This assignment will be a program that calculates the volume and 
   // surface area of a block based on the user inputs for length,
   // width and heighth
   
   
   // Importing the scanner class so it can be used in the program
   import java.util.Scanner;
   
   
   // Defining class
    public class Block {
            
        // main method required for every java program
        public static void main(String[] args) {
        
        // Setting up the program to input values
        
        
            // These commands declare the instance of the scanner and the 
            // scanner constructor, which allows values to be input into
            // the program
            Scanner myScanner = new Scanner ( System.in ); 
            
            // Prompting the user to enter the input values for the dimensions
            
            System.out.print ("Enter the length of the block: ");    // prompt user for length
            double length = myScanner.nextDouble ();                 // enter the length
            
            System.out.print ("Enter the width of the block: ");     // prompt user for width
            double width = myScanner.nextDouble ();                  // enter the width
            
            System.out.print("Enter teh height of the block: ");    // prompt user for height
            double height = myScanner.nextDouble ();                // enter the height
            
        
        // This is where calculations will be run
        
            double volume = length * width * height; // Computes the volume
            
            double surfaceArea = (2 * length * width) + (2 * length * height) + 
                                        (2 * width * height);  // Computes the surface area
                                        
        
        // This is where the ouput statements will take place
         
            System.out.println ("The volume of the block with dimensions " + length + " x "
                                    + width + " x " + height + " is " + volume + "."); // Outputs the volume
            
            System.out.println ("The surface area of the block is " + surfaceArea + ".");
                    // Outputs the surface area
                    
                    
        } // end of main method
        
    } // end of class