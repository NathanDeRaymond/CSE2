/*

Nathan DeRaymond
10/22/2015
CSE2 lab 9

    This lab will give practice writing and overloading methods by 
simultating flips of a coin.

*/


import java.util.Scanner;   // Importing the scanner class to read user input

public class Coin_Flipping {  // Setting up the class

    // Here is where the methods will be
    
    public static void flip() {
    
        int heads = 0;
        int tails = 0;
        
        int x = (int) (Math.random() * 10);  // Variable to store a random integer number 
        
        if ( x % 2 == 0) {                 // Case for heads 
           heads += 1;                      // Increment tails
        } else {                           // Case for tails
           tails += 1;                      // Increment heads
        }
        
        System.out.println("tail " + tails + " head " + heads);  // Printing the results of tails and heads
        
    }
    
    public static void flip(int n) {      // This method will simulate the results for "n" number of coin flips
        
        for (int i = 1; i <= n; i++) {    
            
            flip();
            
        }
        
    }


    // Now for the main method, where the program will actually be run
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);  // Constructing scanner to accept user input
        
        System.out.print("Please enter a number between 0 and 100: ");  // Prompting user to enter a number
        int flipNumber = scan.nextInt ();                               // Accepting input
         
        if (flipNumber == 0) {
            flip();
        } else if (flipNumber <= 100 && flipNumber > 0) {
            flip(flipNumber);
        } 
        
    }  // End of main method

}  // End of class