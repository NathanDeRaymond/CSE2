/*

Nathan DeRaymond
11/5/2015
CSE2 -- lab 12 Sorting and Merging Arrays

    In this lab, practice will be given for manipulating arrays and
using the "try-catch" statement by moving a element at any given 
index in an array to the end and shifting the displaced elements to the left

*/

import java.util.Scanner; // Importing scanner class

public class move_array {

public static void main (String args[]) {
    
    // Here is where the variables are declared
    
        int[] random_array;
        int array_size = 0;                      // Declaring and initializing the desired array size 
        int index_value = 0;                     // Declaring and initializing the index value to be assigned by a user
        Scanner input = new Scanner (System.in); // Creating scanner to read input
        int temporary_value = 0;                 // Declaring a temporary variable so no values are lost when shifting elements
        
    // Here is where user input is asked for and stored by the program, the values tested for validity,
    // and the array allocated from the user input for the array's size
    
        System.out.print("Please enter a value for the size of the array: ");
        array_size = input.nextInt ();
        
        try {
            random_array = new int[array_size -1];
        } catch (Exception e) {
            System.out.println("Not a valid array size");
            System.exit(0);
        }
        
        
    
    // Here is where the array is allocated and initialized with random numbers from 0 to 100
    
        random_array = new int[array_size];
    
        for(int i = 0; i < array_size; i++) {
            random_array[i] = (int)(Math.random() * 100);
        }
        
    // Here is where the user will asked for input to determine which elemennt he/she wants to move to the end of the 
    // array by entering its index location
     
        System.out.print("Please enter an index location for the value at that spot to be moved: ");
        index_value = input.nextInt ();
        
        try {
            temporary_value = random_array[index_value];
        } catch (Exception e) {
            System.out.println("Not a valid index");
            System.exit (0);
        }
        
    // Here is where the original array is printed
    
        System.out.println("The original array is");
        for (int i = 0; i < array_size; i++) {
            System.out.print(random_array[i] + " ");
        }
        System.out.println("");
        
    // Here is where the arrays will be shifted and the desired value moved to the end
    
        System.out.println("The adjusted array is")
    
        try {
            for(int i = index_value; i < array_size - index_value; i++ ) {

                random_array[i] = random_array[i + 1];
                random_array[i + 1] = random_array[i + 2];
            } // End of for loop
        } catch (Exception e) { // This will catch if the index goes out of bounds of the array
            
        }
        
    // Here is where the desired value is placed at the end of the array and the new array printed
        
        random_array[array_size - 1] = temporary_value;
        
        for (int i = 0; i < array_size; i++) {
            System.out.print(random_array[i] + " ");
        }
        
        System.out.println("");
    
} // End of main method
    
} // End of class