/*

Nathan DeRaymond
9/30/2015
Homework 5 -- Average Grade
   
        This program will give practice in using while and if loops in java.
    To accomplish this, the average grade will be calculated from a series
    of grades entered by a user.

*/



import java.util.Scanner; // importing the scanner class to be used to read values from user input

    public class averageGrade {   // defining class
    
        public static void main(String[] args) {   // setting up the main method
            
            // setting up the code to accept user input

                  Scanner scan = new Scanner (System.in);  // constructing scanner
                  
            // Declaring the variables
            
                int numberOfGrades = 0;  // this variable will count how many grades are enter
                double gradeTotal = 0;   // this variable will hold the sum of all the grades entered
                double gradeAverage;     // variable that will store the average grade
                  
                System.out.println("Please begin to enter grades. A value of 999 will return the average.");
                // this print statement gives the user the proper instructions
                
                 
            // Now for the calculations
            
                while (true) { // Creating a nested if statment in a while loop for the calculations
                               // This will let the user keep inputing grades until he/she wishes to stop
                               
                    System.out.print("Enter another grade: "); // This statement will prompt the user to enter another grade
                    double grade = scan.nextDouble ();         // declaring variable to store grade user enters
            
                        if (grade == 999) {   // exits the loop if user enters "999"
                            break;
                        }
                        
                        else if (grade >= 0 && grade <= 100) { // executes if grade is between 0 and 100
                            gradeTotal = gradeTotal + grade;   // adding all of the valid grades entered
                            numberOfGrades += 1;               // Counting the number of valid grades entered
                            
                        }
                        
                        else {   // execute if the grade entered is not between 0 and 100 or not 999
                            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                        }  // end of if loop
                        

                        
                }  // end of while loop
     
            gradeAverage = gradeTotal / numberOfGrades;                  // Calculating the average grade
            System.out.println("The average grade is " + gradeAverage);  // Returning the average grade

        }  // end of main method
          
    }  // end of class