import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/19/18
Purpose: Second program to review on what we've learned in PF 1: (Mobile Domain). 
Instructor: Beiter
ICE#2 PART B: Book Calculation
*/
public class BookCalculation
{

   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
 
     double bookstoreBookCost = 75; 
     double purchase = bookstoreBookCost - 0.5 * bookstoreBookCost;
/* Handling portion of purchase costs*/

     int numWeeks = 16;
     double weeklyCost = 4;
     double rent = numWeeks * weeklyCost;
     /*Handling portion of renting costs*/
     
     double difference = purchase - rent;
     System.out.print("The difference would be... " + difference);
 
 
 
 
    
   }
   
}
      
     
