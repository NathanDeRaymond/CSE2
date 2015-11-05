/*

Nathan DeRaymond
11/5/2015
CSE2 -- lab 11 Sorting and Merging Arrays

    In this lab, practice will be given for manipulating arrays by
writing a method to sort an array in increasing order of element
magnitude and merging two arrays together 

*/

public class Arrays {
    
    public static void sort(int[] array) {
        int lowestelement = 0;             // Variable to store lowest element in search
        int referenceposition = 0;         // Varialbe to store position of lowest element array
        for(int i = 0; i < array.length; i++) {   // Loop to access all positions of the array
            
         referenceposition = i;                   // Starting the refence position (value getting compared) at the beginning
            for(int j = i+1; j < array.length; j++) {
             
                if (array[referenceposition] > array[j]) { // Determines if element at "j" is lower than the initial element
                    referenceposition = j; // If it is, than the reference position is changed so that it is now at the lowest element
                    
                }  // End of if statement
                
            }  // End of nested for loop
            
            // These three statements switch the starting value with the lowest value found
            
            lowestelement = array[referenceposition];  // Assigning value to lowest element found in search to a variable
            array[referenceposition] = array[i];       // Placing the start element at the reference position
            array[i] = lowestelement;                  // Placing lowest element at start
            
            // Now the starting position is incremented and the process is repeated
            
        }  // End of outer for loop
    
            
        
    }  // End of sorting method
    
    public static void main (String[] args) {
        
        // Creating first array
        
            int[] array1 = new int[20]; 
                for(int i = 0; i < 20; i++) {
                    array1[i] = (int)(Math.random() * 100);
                }
            sort(array1);                          // Sorting first array
            for(int i = 0; i < 20; i++) {          // Printing sorted array
                System.out.print(array1[i] + " "); 
            }
        
        System.out.printf("\n");  // Printing blank line for readability
        
        // Creating second array
        
            int[] array2 = new int[10];
                for(int i = 0; i < 10; i++) {
                    array2[i] = (int)(Math.random() * 100);
                }
            sort(array2);                          // Sorting second array
            for(int i = 0; i < 10; i++) {          // Printing second array
                System.out.print(array2[i] + " "); 
            }
            
        System.out.printf("\n");  // Printing blank line for readability
        
        // Creating the third array by combining the previous two
        
            int[] array3 = new int[30];
            
            for(int i = 0; i < 30; i++) {     // merging array1 and array2 together to fill up array3
                if (i < 20) {
                    array3[i] = array1[i];
                } else if (i >= 20) {
                    array3[i] = array2[i-20];
                }
            }
            
            sort(array3);
            for(int i = 0; i < 30; i++) {          // Printing second array
                System.out.print(array3[i] + " "); 
            }
        
        System.out.printf("\n");  // Printing blank line for readability
        
    }  // End of main method
    
}  // End of class