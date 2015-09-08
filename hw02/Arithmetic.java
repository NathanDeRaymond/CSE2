   // Nathan DeRaymond
   // 9/8/2015
   // CSE 2 Homework 02 -- Arithmetic
   // This program will calculate the cost of various items bought in a store along
   // with the taxes on the items and the total cost
   
   // Defining class
    public class Arithmetic {
            
        // add main method
        public static void main(String[] args) {
            
            
            //This section declares the input variables for the items and their values
            
            
                //Number of pairs of socks
                int nSocks = 3;
                //Cost per pair of socks
                //(‘$’ is part of the variable name)
                double sockCost$ = 2.58;
                
                //Number of drinking glasses
                int nGlasses = 6;
                //Cost per glass
                double glassCost$ = 2.29;
               
                //Number of boxes of envelopes
                int nEnvelopes = 1;
                //cost per box of envelopes
                double envelopeCost$ = 3.25;
                
                // This is the PA sales tax
                double taxPercent = 0.06;
                
                
            // This sections holds all the calculations and intermediate variables
            
            
                // Adding up the cost for the individual items
                
                    // Total cost of socks
                    double totalSockCost$ = nSocks * sockCost$;
                    // Sales tax of socks
                    double totalSocksTax$ = taxPercent * totalSockCost$;
                
                    // Total cost of drinking glasses
                    double totalGlassCost$ = nGlasses * glassCost$;
                    // Sales tax of drinking glasses
                    double totalGlassTax$ = taxPercent * totalGlassCost$;
                
                    // Total cost of envelope boxes
                    double totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
                    // Sales tax of evelope boxes
                    double totalEnvelopeTax$ = taxPercent * totalEnvelopeCost$;
                
                // Now calculating the total costs
                
                    // Total item cost with no tax
                    double totalItemCost$ = totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$;
                
                    // Total tax cost
                    double totalTaxCost$ = totalEnvelopeTax$ + totalGlassTax$ + totalSocksTax$;
                
                    // Total cost of the entire transaction
                    double totalCost$ = totalItemCost$ + totalTaxCost$;
                
                // This section will convert the double values into meaningful numbers (cost with only two decimal places)
                    
                    totalSocksTax$ = ((int) (totalSocksTax$ * 100)) / 100.0;
                    totalGlassTax$ = ((int) (totalGlassTax$ * 100)) / 100.0;
                    totalEnvelopeTax$ = ((int) (totalEnvelopeTax$ * 100)) / 100.0;
                    totalItemCost$ = ((int) (totalItemCost$ * 100)) / 100.0;
                    totalTaxCost$ = ((int) (totalTaxCost$ * 100)) / 100.0;
                    totalCost$ = ((int) (totalCost$ * 100)) / 100.0;
                    
            // Now its time to ouput the data in an understandable format
            
                // This section prints out the data for the individual items
                    
                    // This is for socks
                    System.out.println("For socks,");
                    System.out.println(    "    " + nSocks + " pairs of socks were bought");
                    System.out.println(    "    The cost of a pair was $"+ sockCost$);
                    System.out.println(    "    The cost of all the socks was $" + totalSockCost$);
                    System.out.println(    "    The tax for all the socks was $" + totalSocksTax$);
                    System.out.println(""); // This is just a blank line to help read
                    
                    // This is for the drinking glasses
                    System.out.println("For drinking glasses,");
                    System.out.println(    "    " + nGlasses + " drinking glasses were bought");
                    System.out.println(    "    The cost of a drinking glass was $"+ glassCost$);
                    System.out.println(    "    The cost of all the drinking glasses were $" + totalGlassCost$);
                    System.out.println(    "    The tax for all the drinking glasses was $" + totalGlassTax$);
                    System.out.println("");
                    
                    // This is for the envelopes
                    System.out.println("For envelopes,");
                    System.out.println(    "    "+ nEnvelopes + " envelope boxes were bought");
                    System.out.println(    "    The cost of an evelope box was $"+ envelopeCost$);
                    System.out.println(    "    The cost of all the envelope boxes were $" + totalEnvelopeCost$);
                    System.out.println(    "    The tax for all the envelope boxes was $" + totalEnvelopeTax$);
                    System.out.println("");
                    
                    // These are the totals of the items
                    System.out.println("The total cost of purchases before sales tax was $" + totalItemCost$);
                    System.out.println("The total sales tax of the purchases was $" + totalTaxCost$);
                    System.out.println("The total cost of the entire transaction was $" + totalCost$);
                    
                    
        }            
    }            
                
                    