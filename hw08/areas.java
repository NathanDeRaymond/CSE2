/*

Nathan DeRaymond
10/27/2015
CSE2 Homework 8 -- Areas

    This assignment will give practice overloading methods to calculate the 
area of either a circle, rectangle, or trapezoid depending on the user input.

*/

import java.util.Scanner; // Importing the scanner class 

public class areas {
    
    // Here is where the overloaded methods are written
    
        public static double area(int radius) {                 // Method for cicle with dimensions defined by parameters
        
            double areaCircle =  Math.PI * Math.pow(radius, 2);  // This line is the equatioin of area of a circle
            return areaCircle;                                   // This line returns the value for area of a circle to be used outside the method
        
        }  // End
    
        public static double area(int length, int width) {  // Method for rectangle with dimensions defined by parameters
        
            double areaRectangle = length * width;          // This line calculates the area of the rectangle
            return areaRectangle;                           // This line returns that value to be used in the rest of the code
        
        }  // End
    
        public static double area(int base1, int base2, int height) {  // Method for trapezoid with dimensions defined by parameters
        
            double areaTrapezoid = ((double)(base1 + base2) / 2) * height;     // This line calculates the area of the trapezoid
            return areaTrapezoid;                                      // This line returns that value to be used in the rest of the code
        
        }  // End
    
    // Here is the main method 
    
        public static void main(String[] args) {
        
            // Here the variables are declared and scanner constructed
        
                Scanner myScanner = new Scanner (System.in);  // Scanner to read user input
                int parameter1 = 0;  // Variable to store user input
                int parameter2 = 0;  // Variable to store user input
                int parameter3 = 0;  // Variable to store user input
                String shape = "";   // String to store user input for the shape he/she wants
        
            // Here is where the input is accepted, the calculations run, and the results shown 
            
                    // Prompting the user to enter which shape they want to find the area of
                    System.out.println("Please enter the shape (circle, rectangle, or trapezoid). Type \"stop\" to exit the program: " +shape);
                    shape = myScanner.next();  // Accepting the user's input
                    
  
                while(!shape.equalsIgnoreCase("stop")) {  // All calculations will take place inside this loop
                
                
                    if (shape.equals("circle")) {  // Calculates area of circle
                        
                        System.out.println("Please enter an integer value for the radius: ");  // Prompting user to enter radius
                        parameter1 = myScanner.nextInt();  // Accepting user input for radius in variable parameter1
                        
                        // Showing the user result of the area method
                        System.out.println("The area of the circle is " +area(parameter1)+ " units squared");  
                        
                    } else if (shape.equalsIgnoreCase("rectangle")) {  // Calculates area of rectangle
                        
                        System.out.println("Please enter integer values for the length and width respectively: ");  // Prompting user to enter dimensions
                        parameter1 = myScanner.nextInt();  // Accepting user input for length in variable parameter1
                        parameter2 = myScanner.nextInt();  // Accepting user input for width in variable parameter2
                        
                        // Showing the user result of the area method
                        System.out.println("The area of the rectangle is " +area(parameter1, parameter2)+ " units squared");  
                        
                    } else if (shape.equalsIgnoreCase("trapezoid")) {  // Calculates area of trapezoid
                        
                        System.out.println("Please enter integer values for base 1, base 2, and the height respectively: ");  // Prompting user to enter dimensions
                        parameter1 = myScanner.nextInt();  // Accepting user input for base 1 in variable parameter1
                        parameter2 = myScanner.nextInt();  // Accepting user input for base 2 in variable parameter2
                        parameter3 = myScanner.nextInt();  // Accepting user input for the height in variable parameter3
                        
                        // Showing the user result of the area method
                        System.out.println("The area of the trapezoid is " +area(parameter1, parameter2, parameter3)+ " units squared");  
                    
                    }  // End of if statement

                            
                    
                    // Re-assigning the value of shape for the next iteration of the loop
                    System.out.println("Please enter the shape (circle, rectangle, or trapezoid). Type \"stop\" to exit the program: ");
                    shape = myScanner.next();  // Accepting the user's input
                    
                    
                }    // End of while loop
        
        
        }  // End of main method
        
    
}  // End of class