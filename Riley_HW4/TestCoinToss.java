import java.util.Scanner;


/*
Author: Edward Riley
Date: 2/08/18
Purpose: I must write a program to perform a Coin Toss simulation with calculations. 
Instructor: Beiter
HW:04 - PART A - Coin Toss
*/

class TestCoinToss
{
   public static void main(String[] args)
   {
      
      Scanner sc = new Scanner(System.in);
      CoinToss cointoss = new CoinToss();
      
      int numberOfCoinFlip = 0;
      do {
         boolean validation = false;
         System.out.print("Enter integer number ( >= 2) coin tosses or 0 to Exit: ");
         numberOfCoinFlip = sc.nextInt();
      
         while (validation == false)
         {
         
            if (numberOfCoinFlip == 1)
            {
               validation = false;
               System.out.print("ERROR: Number must not be either a negative or one: Try again: ");
               numberOfCoinFlip = sc.nextInt();
            }
            else if (numberOfCoinFlip < 0)
            {
               validation = false;
               System.out.print("ERROR: Number must not be either a negative or one: Try again: ");
               numberOfCoinFlip = sc.nextInt();
            }
            else 
            {
               validation = true;
            }         
         }
      
         cointoss.coinToss(numberOfCoinFlip);
      }
      while (numberOfCoinFlip != 0);
   
            
      
      
   
   
   
   }
}
