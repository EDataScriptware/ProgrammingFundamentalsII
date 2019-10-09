import java.util.Scanner;
import java.util.Random;


/*
Author: Edward Riley
Date: 2/08/18
Purpose: I must write a program to perform a Coin Toss simulation with calculations. 
Instructor: Beiter
HW:04 - PART A - Coin Toss
*/

class CoinToss
{
   public void coinToss(int numberOfCoinFlip)
   {
  
      double headTotal = 0;
      double headConsecutive = 0;
      double tailsTotal = 0;
      double tailsConsecutive = 0;
      double longestHeadStreak = 0;
      double longestTailStreak = 0;
      Random randomGenerator = new Random();
      double n = randomGenerator.nextDouble();
      int counter = 0;
      
      int[] coinFlipList = new int[numberOfCoinFlip];
   
      for (int row = 0; row < numberOfCoinFlip; row++)
      {   counter++;
                        
                        
                    
         if (randomGenerator.nextDouble() <= 0.50)
         {
            coinFlipList[row] = 'h';
            System.out.println("H");
                            
         }
         else
         {
            coinFlipList[row] = 't'; // TAILS
            System.out.println("T");
         
         }
      }
     
      for (int row = 0; row < numberOfCoinFlip; row++)
      {
         if (coinFlipList[row] == 'h')
         {
            headTotal++;
            headConsecutive++;
            if (headConsecutive > longestHeadStreak)
            {
               longestHeadStreak = headConsecutive;
            
            }
            tailsConsecutive = 0;
         }
         else if (coinFlipList[row] == 't')
         {
            tailsTotal++;
            tailsConsecutive++;
            if (tailsConsecutive > longestTailStreak)
            {
               longestTailStreak = tailsConsecutive;
            }
         
            headConsecutive = 0;
         }
                        
      }
               System.out.print("Number of Coin Tosses = " + counter);
               double headFraction = headTotal / numberOfCoinFlip;
               double tailFraction = tailsTotal / numberOfCoinFlip;
               
               if (longestTailStreak > longestHeadStreak)
               {
                  System.out.println("Longest run is " + longestTailStreak + " tails.");
                  
                  }
                  else 
                  {
                     System.out.println("The longest run is " + longestHeadStreak + " heads.");
                  }
               System.out.println("Fraction of Heads = " + headFraction);
               System.out.println("Fraction of Tails = " + tailFraction);


   }
   

}