// Nathan DeRaymond
// 9/24/2015
// CSE lab 04 -- Special Calculator

// This lab is a modification of the previous lab "calculator."
// This lab will be an exercise using "while" loops by repeatedly
// asking the user for an input until they type in the characters
// "n" or "N" 



    // Importing the java utility scanner. This allows users to input data  
    import java.util.Scanner;

    // Defining the class
    public class CalculatorSpecial {
            
            // the main method that is required for every java program
            public static void main (String[] args) {
                
                
                // Defining a scanner variable to allow user inputs
                Scanner myScanner = new Scanner (System.in);
                
                
                char y; // defining a character to test the user's input to stop the program
                System.out.println("Type 'n' or 'N' to stop "); // Asking user for the key to stop the program
                y = myScanner.next ().charAt(0); // reads the input value for "y" and assigns it that value

                
                while (y!='n' && y!='N')  { // beginning of while loop, the statement in parentheses is the condition that will run or stop the loop
         
                    
                            // prompting the user to enter the first value
                            System.out.print ("Please enter the first integer value: ");
                            int a = myScanner.nextInt ();
                            
                            // prompting the user to enter the second value
                            System.out.print ("Please enter the second integer value: ");
                            int b = myScanner.nextInt ();
                            
                            // prompting the user to enter an operator
                            System.out.print ("Please enter a simple arithmetic operator (+,-,*,/): ");
                            char operator = myScanner.next ().charAt(0);
                        
                    
                        // This section is where the "switch" command and calculations will take place
                    
                        switch (operator) {  // the argument of this statement is the variable that will be checked
                            
                            case '+':  // if the "+" sign is the operator variable, a and b will be summer
                                System.out.println ("The result of " +a+ " plus " +b+ " is " + (a + b));  // output result
                            break;
                            
                            case '-':  // if the "-" sign is the operator variable, b will be subtracted from a
                                System.out.println ("The result of " +a+ " minus " +b+ " is " + (a - b)); // output result
                            break;
                            
                            case '*':  // if the "*" sign is the operator variable, a and b will be multiplied
                                System.out.println ("The result of " +a+ " times " +b+ " is " + (a * b)); // output results
                            break;
                            
                            case '/':  // if the "/" sign is the operator variable, a will be divided by b
                                System.out.println ("The result of " +a+ " divided by " +b+ " is " + ((double) a /(double) b));  // output results
                            break;          // The integer types here are explicitly cast to doubles so that division can produce the proper result
                                            // if the a is not divisible by b.
                            
                            default:  // if none of the cases are matched, this section of the switch statement will be executed
                                System.out.println ("Illegal operator");  // printing out 'illegal operator' 
                            break;
                        
                        } // end of switch statement
                        
                    System.out.println("Type 'n' or 'N' to stop "); // Asking user for the correct input to stop the program.
                    y = myScanner.next ().charAt(0);                // These two lines let the user re-enter values for "y" so the while loop can be stopped
                    
                } // end of the while loop
                
            } // end of main method
            
     } // end of class