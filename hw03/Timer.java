   // Nathan DeRaymond
   // 9/15/2015
   // CSE 2 Homework 03 -- Part 1 -- Timer
   
   // This assignment will be a program that calculates the remaining time
   // until dinner is to be started by prompting the user for teh current
   // time and the time that dinner will start
   
   
   // Importing the scanner class so it can be used in the program
   import java.util.Scanner;
   
   
   // Defining class
    public class Timer {
            
        // main method required for every java program
        public static void main(String[] args) {
        
        // Setting up the program to input values
        
        
            // These commands declare the instance of the scanner and the 
            // scanner constructor, which allows values to be input into
            // the program
            Scanner myScanner = new Scanner ( System.in ); 
            
            // Prompting the user to enter the input values for the times
            System.out.print ("Enter the current time: ");
            // Accepting input for the current time
            int currentTime = myScanner.nextInt ();
            
            // Prompting the user to enter input values for time of dinner
            System.out.print ("Enter the time that you will be eating dinner: ");
            // Accepting input for dinner time
            int dinnerTime = myScanner.nextInt ();
            
        // This section will run the calculations to determine the time until dinner
        
            int timeUntilDinner = dinnerTime - currentTime;  // gives the time until dinner
            
            int minutes, hours;  // defining variables to store the number of minutes and hours
            
            hours = (int) (timeUntilDinner / 100); // This operation isolates the first two numbers of 
                                                   // the time until dinner, the number of hours
            minutes = (int) (timeUntilDinner % 100);  // This operation isolate the last two numbers of 
                                                      // the time until dinner, the number of minutes
                                                      
        // This section is where the output statement will take place
            
            
            System.out.println ("You have " + hours + " hours and " + minutes + " minutes until dinner.");
                // print out the time in hours and minutes until dinner is served
                
        }  // end of main method
        
    } // end of class
            