import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/19/18
Purpose: I must write a program that best calculates the gas costs of both premium and regular.  
Instructor: Beiter
HW#1 PART D: Gas Costs*/

public class GasCost
{

   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
   
      double rateOfRegularGas = 1.99;
      double rateOfPremiumGas = 2.59;
      /*It is ideal for me to begin out the rate of both gases at the beginning. */ 
   
      System.out.print("Enter the number of gallons: ");
      int numberOfGallonsGas = sc.nextInt();
      
      double costOfRegularGas = rateOfRegularGas * numberOfGallonsGas;
      double costOfPremiumGas = rateOfPremiumGas * numberOfGallonsGas;
       /* I put the costs together before I print them out. */  
               
      System.out.println("");
      System.out.println("Cost for " + numberOfGallonsGas + " gallons of regular gas at $" + rateOfRegularGas + " is $" + costOfRegularGas );
      System.out.println("Cost for " + numberOfGallonsGas + " gallons of premium gas at $" + rateOfPremiumGas + " is $" + costOfPremiumGas );
   
   }
}

