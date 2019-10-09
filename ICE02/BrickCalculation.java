import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/19/18
Purpose: Second program to review on what we've learned in PF 1: (Mobile Domain). 
Instructor: Beiter
ICE#2 PART A: Brick Calculation
*/
public class BrickCalculation
{

   public static void main(String [] args)
   {
         Scanner sc = new Scanner(System.in);
/* I just realized that this is a must have for adding scanners as it allows you to read input message.*/

      double height = 2.5;
      double width = 3;
      double length = 6;
      
      double volumeOfBrick = height * width * length; 
      
      System.out.print("Please input the amount of bricks: ");
      double amountOfBricksInGolisano = sc.nextDouble();
      
      /*double amountOfBricksInGolisano = 75000;*/

      double totalVolumeBricks = volumeOfBrick * amountOfBricksInGolisano;
      /*Variable declarations as well as formula better now than magic numbers later as I deliver the statement as they're subject to change.
      */
     
      System.out.print("The total volume of these bricks are " + totalVolumeBricks + " inches cubes");
      
     
   }
}