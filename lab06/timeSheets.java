/*

Nathan DeRaymond
10/1/2015
CSE2 lab 06 -- Time Sheets

    This lab will give practice using nested loops and user input
by writing a program that will calculate the total payroll of the
employees based on the data that the user will input.

*/



import java.util.Scanner;   // Import the scanner class to receive input

public class timeSheets  {  // Defining class

    public static void main (String[] args) {  // Setting up main method
        
        // This is where the variables will be declared
        
            Scanner scan = new Scanner (System.in);  // Declaring the scan variable to read input values
            
            int timeSheetNumber = 0;     // Stores how many time sheets
            int payPerHour = 0;          // Stores pay per hour
            int hoursWorkedPerDay = 0;   // Stores hours worked in one day
            int hoursWorkedWeek = 0;     // Stores hours worked in a week
            int employeePay = 0;         // Stores total pay an employee works in week
            double totalPayroll = 0;     // Stores the total employee pay roll
            
        // This is where user input and calculations will take place
        
            // Prompting user to start enter the number of timesheets to be used and reading their input
            System.out.print("Please enter the number of employee timesheets to be read in: "); 
            timeSheetNumber = scan.nextInt ();  // Variable that stores the number of time sheets
            
            // This section will loop code to repeat calculations for every employee and keep track of the total payroll
            for (int a = 1; a <= timeSheetNumber; a++) {
                
                // Asking user to enter pay per hour for an employee
                System.out.print ("Please enter an integer value for the employee's pay per hour in cents: ");
                payPerHour = scan.nextInt ();  // Accepting user input for pay per hour
                
                // Prompting the user to enter the number of hours the employee worked per day
                System.out.println ("Please enter 5 integer values corresponding to the hours worked each weekday");
                
                // This for loop will ask for the number of hours this employee worked from Monday to Friday
                for (int b = 1; b <= 5; b++) {
                
                    hoursWorkedPerDay = scan.nextInt ();                   // accepting user input for hours worked per day
                    hoursWorkedWeek = hoursWorkedWeek + hoursWorkedPerDay; // Stores total hours an employee work in the week
                    
                }  // End of the inner for loop
                
                
                employeePay = hoursWorkedWeek * payPerHour; // Calculating the payroll for an employee
                totalPayroll = totalPayroll + employeePay;  // Adding up the payrolls and keeping track of the total
                
                hoursWorkedWeek = 0;  // Resetting hours worked per week for the next employees
                employeePay = 0;      // Resetting the pay for the next employee
                
            }  // End of the outer for loop
            
        // Now returning the total payroll in dollars:
            
            totalPayroll = totalPayroll / 100;  // converting cents to dollars
            System.out.println ("The total payroll for all the employees is " + totalPayroll + " dollars");
        
    }  // End of main method
    
}  // End of class