import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/26/18
Purpose: I must write a program thhat calculates the number of bags of seeds that the farmer needs to order.
Instructor: Beiter
HW#02 - PART C: Crop Yield*/

class CropYield
{
   double numSeedsPerBag = 80000;
   double numBagsOfSeed;
   double numPlantsPerAcre = 28000;
   double numAcres;
   /*We begin with 80,000 seeds in each bag and plants in each acre.*/
   public void CalcCropYield(double numBagsOfSeed, double numAcres)
   {
     double solution = (numPlantsPerAcre * numAcres) / numSeedsPerBag;
      /*Solution calculations of how much we need*/
      System.out.println("The number of bags of seed required for " + numAcres + " is " + solution);
      /*Output*/ 
      solution = 1 + solution;
      /*To avoid decimals due to possible situations that may occur such as 3.7 will be converted to (int) 3 so we had 3.7 + 1 = (int) to change it to 4 so we overestimate the expectations*/
      System.out.println("The number of bags of seed that needs to be ordered is " + (int) solution);
      /*Output*/
      
   }


}