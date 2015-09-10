   // Nathan DeRaymond
   // 9/10/2015
   // CSE 2 Lab 03 -- Check
   
   // This lab will demonstrate how to get input data from a user.
   // To accomplish this, a user will input data about a dinner bill
   // and the program will divide the cost among how many are paying.
   // This program will utilize the scanner class
   
   // Importing the scanner class so it can be used in the program
   import java.util.Scanner;
   
   
   // Defining class
    public class Check {
            
        // main method required for every java program
        public static void main(String[] args) {
        
        // Setting up the program to input values
        
        
            // These commands declare the instance of the scanner and the 
            // scanner constructor, which allows values to be input into
            // the program
            Scanner myScanner = new Scanner ( System.in ); 
            
            // Prompting the user to input the value of the check
            System.out.print ("Enter the original cost of the check in the form xx.xx: ");
            // accepting the user's input for the check amount
            double checkCost = myScanner.nextDouble ();
            
            // Prompting the user for a tip percentage
            System.out.print ("Enter the percentage tip that you wish to pay in a whole number (in the form xx) : ");
            // accepting user's input for tip percentage
            double tipPercent = myScanner.nextDouble ();
            
            // Prompting the user for the number of people who ate dinner
            System.out.print ("Enter the number of people who went out to dinner: ");
            // Accepting the user input for the number of people
            int numPeople = myScanner.nextInt ();
            
            
        // This section is where the calculations will take place
        
        
            double totalCost;       // initializing variable to store the total cost
            double costPerPerson;   // initializing variable to store the cost per person
            int dollars,            // This variable gives the whole dollar amount of cost
                dimes, pennies;     // These variables give the decimal value of the cost (how many cents)
        
            tipPercent /= 100;                        // converting whole value of tip percent into a decimal
            totalCost = checkCost * (1 + tipPercent); // gives total cost
            costPerPerson = totalCost/numPeople;      // gives cost per person
            
            dollars = (int) costPerPerson;              // Get the whole amount in dollars by dropping the decimal
            dimes = (int) (costPerPerson * 10) % 10;    // Get the amount of dimes
            pennies = (int) (costPerPerson * 100) % 10; // Get the amount of pennies 
            // the "%" sign gives the modulus after division
        
        
        // This section is where the output statement will be
        
        
            System.out.println ("Each person in the group owes $" + dollars + '.' + dimes + pennies);
            // This is the final statement of the program, which print out the screen
            // the amount of money each person will owe
        
        } // end of the main method
    
    } // end of the class
            