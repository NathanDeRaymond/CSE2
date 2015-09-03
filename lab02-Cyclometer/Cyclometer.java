   // Nathan DeRaymond
   // 9/3/2015
   // CSE 2 Lab 02 -- Cyclometer
   
   // This program will determine the distance traveled by bicycle for two trips using
   // data gathered from the trips (time and wheel rotations)
   
   // Defining class
    public class Cyclometer {
            
        // main method required for every java program
        public static void main(String[] args) {
            
            // Defining the variables and data types used in the program
            
                // These are the input data taken during the bicycle trips
                int secsTrip1=480;    // Time in seconds of the first trip
                int secsTrip2=3220;   // Time in seconds of the second trip
                int countsTrip1=1561; // Number of front wheel rotations of the first trip
                int countsTrip2=9037; // Number of front wheel rotations of the second trip
            
                // These are other constants and intermediate variables to store distances and output results
                double wheelDiameter=27.0, // This is the wheel diameter in inches
                PI=3.14159,            // This is the value of pi
                feetPerMile=5280,      // This is a feet to miles conversion factor
                inchesPerFoot=12,      // This is the inch to foot conversion factor
                secondsPerMinute=60;   // This is the seconds to minute conversion factor
                double distanceTrip1, distanceTrip2, totalDistance; // These will be used later to store the 
                                                                    // trip distances when they are calculated
             
             // Printing out the raw data of the trip, the time (converted to minutes) and counts of wheel rotation
             //  The conversion from seconds to minutes takes place within the print statement
             
                System.out.println("Trip 1 took "+
                    (secsTrip1/secondsPerMinute)+" minutes and had "+
                    countsTrip1+" counts.");      // outputs time and wheel rotations of the first trip
                System.out.println("Trip 2 took "+
                    (secsTrip2/secondsPerMinute)+" minutes and had "+
                    countsTrip2+" counts.");      // outputs time and wheel rotations of the second trip
                    
            // Now the distances of the bicycle trips will be calculated:
            //  The cirumference of the bicycle wheel is multiplied by how many times it rotated during a trip.
            //  This gives the linear distance traveled
            //  The result is in inches, and then is converted to miles
            
                distanceTrip1=countsTrip1*wheelDiameter*PI;
                    // Above gives distance in inches
                    // (for each count, a rotation of the wheel travels
                    // the diameter in inches times PI)
                distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles (Trip 1)
                distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles (Trip 2)
                totalDistance=distanceTrip1+distanceTrip2; // This computes the total distance of both trips by summation

                
            // Print out the output data -- the distances of trip 1, trip 2, and their combined total (all in miles)
            
                System.out.println("Trip 1 was "+distanceTrip1+" miles");
                System.out.println("Trip 2 was "+distanceTrip2+" miles");
                System.out.println("The total distance was "+totalDistance+" miles");
            
        } // end of main method
        
    } // end of class