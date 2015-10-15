/*

Nathan DeRaymond
10/15/2015
CSE2 -- lab 08 Methods

    This lab will give practice writing methods that will return the mean and 
median of a set of ten data values as well as print out the results.

*/


import java.util.Scanner;  // Importing the scanner class

public class Methods {  // Defining public class

    // Here is where the methods for mean, median, and the print statement will be
    
    public static double mean(double[] array) {
        
        double sum = 0;   // variable for sum of elements
        double mean = 0;  // variable for mean
        
        for (int i = 0; i < array.length; i ++) {  
        
            sum += array[i];  // Summing the total values of all the elements
        }
        
        mean = sum / array.length;  // calculating a mean
                
        return mean;   // method returns the mean
           
    }
    
    public static double median(double[] array) {
        
        double median = 0;  // initializing varable to store medai value
        
        if (array.length % 2 == 0) { // median value for even number of elements
            
            if (array.length == 2) {  // Special case if the size of the array is 2
                median = mean(array);
            } else {
                median = (array[array.length/2 - 1] + array[array.length/2]) / 2;  // For all other even numbers
            }
           
        } else {
             median = array[array.length/2];  // median values for odd number of elements and when the size is 2
        }
         
        return median;  // Method returns the mean of the array
       
    }
    
    public static void printStatement (double mymean, double mymedian) {  // method to print the results
        
        System.out.println ("The mean value of the data is " + mymean);     // Prints out the mean
        System.out.println ("The median value of the data is " + mymedian); // Prints out median
        
    }
    
    
    
    // Here is the main method
    
    public static void main (String[] args) {
        
        // Here is where the variables will be declared
        
            Scanner scan = new Scanner (System.in);  // Constructing scanner
            
            int arraySize;   // How many variables the user inputs
            double[] dataValues;  // Initializing the array
            double meanOfData = 0;    // Creating variable to store mean
            double medianOfData = 0;  // Creating variable to store median
        
        // Asking for the user input
        
            System.out.print ("Please enter the number of data points you have: ");  // Ask user for number of data points
            arraySize = scan.nextInt();  // Accepting user input
        
            System.out.println ("Now enter the data in increasing order:");  // Asking the user to input the data
        
        // Now creating the array to store values
        
            dataValues = new double [arraySize]; // Defining the size of the array
        
            for(int i = 0; i < dataValues.length; i++) {  // This will create the array values
                
                dataValues[i] = scan.nextDouble();  // Reading the user's data points
                
            }  // End of for loop
        
        // Now calling the methods
            
            meanOfData = mean(dataValues);      // Calculates mean
            medianOfData = median(dataValues);  // Calculates median
            printStatement(meanOfData, medianOfData);  // Prints out results
        
        
    }  // End of main method
    
}  // End of class