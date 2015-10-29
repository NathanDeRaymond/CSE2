/*

Nathan DeRaymond
10/29/2015
CSE2 lab 10 -- Average (Arrays)

    In this lab, practice using and generating arrays will given.
This will be accomplished by generating an array of size "n" of
random numbers (between 0 and 100), printing the array
calculating their average, and printing the values equal to or
greater than that average. These calculations will all be done
through the use of for loops.

*/


import java.util.Scanner;  // Importing scanner class for user input

public class Average {  // Setting up class
    
    public static void main(String[] args) {  // Setting up main method
    
    // This section is where the variables used in the program are initialized
    
        Scanner input = new Scanner (System.in);  // Declaring and constructing a scanner to read input values
        int n = 0;                                // Variable to store the size of the array
        int arraySum = 0;                         // Variable to store the sum of all the elements in the array
        float arrayAverage = 0;                   // Variable to store the average value of the array elements
        int[] array;                              // Declaring an array of integers
        
    // Here is where the user's input is accepted and the array constructed
    
        // Prompting user to enter the desired array size
        System.out.print("Please enter the number of values you would like to store in an array: ");
        n = input.nextInt();  // Storing the value the user entered for the array size
        array = new int[n];   // This constructs the array with "n" number of elements
        
    // Here is where for loops are used to manipulate the array and the results shown
    
        for (int i = 0; i < n; i++) {               // This for loop assigns values for each element of the array
            array[i] = (int)(Math.random() * 100);  // Stores a random integer between 0 and 100 in each element
        }  // End of for loop
        
        for (int i = 0; i < n; i++) {           // This for loop prints the array
            System.out.println(array[i]);       // This statement prints the element at index number "i"
        }  // End of for loop
        
        for (int i = 0; i < n; i++) {  // This for loop sums the array elements
            arraySum += array[i];      // Adds the value of element at index "i" to the sum of all the previous elements
        }  // End of for loop
        
            // Section to calculate and print the average
        
            arrayAverage = (float) arraySum / n;  // Equation of average value of array elements
            System.out.println("The sum of the array elements is " + arraySum +
                                        " and the average of the array elements is " + arrayAverage); // Shows sum and average
            System.out.println("Here are the array elements greater than or equal to the average:");  // Sets up next output
            
            
        for (int i = 0; i < n; i++) {
            
            if (array[i] >= arrayAverage) {   // Shows the elements greater than or equal to the average of all the elements
                System.out.println(array[i]);  
            }  // End of if statement
            
        }  // End of for loop 
        
    }  // End of main method
    
}  // End of class