import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/26/18
Purpose: I must write a program calculates groundspeed as well as flight time.
Instructor: Beiter
HW#02 - PART B: Airplane Flight Time*/

class FlightTime
{
   double airSpeed;
   double groundSpeed; 
   double nauticalMiles;
   
   public void calcTime(double airSpeed, double nauticalMiles)
   {
      
      double groundSpeed = (airSpeed + 325);
      System.out.println("The calculated groundspeed would be: " + groundSpeed);
      /*Calculates and gives output of groundspeed*/  
      double flightTime = nauticalMiles / groundSpeed;
      System.out.println("The flight time would be: " + flightTime);
      System.out.println();
      /*Calculates flight time and as well as providing*/
      int hour = (int) flightTime;     
      System.out.println("Hours are: " + (int) flightTime);
      /*Restricts it to display without decimals and saves it as hour to be able to subtract for minutes*/
      double minutes = (flightTime - hour) * 60;
            System.out.println("Minutes are: " + minutes);
      /*Provides an output*/
      
   }
   
   
}