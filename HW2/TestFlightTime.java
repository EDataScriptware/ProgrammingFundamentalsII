import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/26/18
Purpose: I must write a program calculates groundspeed as well as flight time.
Instructor: Beiter
HW#02 - PART B: Airplane Flight Time*/

public class TestFlightTime
{
   public static void main(String[] args)
   {
   double airSpeed;
   double nauticalMiles;
   FlightTime flightTime = new FlightTime();

   Scanner sc = new Scanner(System.in);
   /*Preparing Scanner and calling from different class*/
   System.out.print("Enter distance of flight in nautical miles: ");
   nauticalMiles = sc.nextDouble();
   /*User inputs nautical miles*/
   System.out.println();
   System.out.println("Enter the average windspeed in knots per hour: ");
   System.out.println("    use a minus ( - ) to indicate a headwind, and an unsigned number ( no + sign is needed) to indicate a tail wind.");
   System.out.print("Average speed of wind in knots per hour is: ");
   airSpeed = sc.nextDouble();
   /*User inputs average windspeed in knots per hour*/
   flightTime.calcTime(airSpeed, nauticalMiles);
   /*Airspeed and nautical miles are transferred over to do calculations as we receive output*/
   }
}