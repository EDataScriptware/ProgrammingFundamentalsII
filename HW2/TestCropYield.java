import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/26/18
Purpose: I must write a program thhat calculates the number of bags of seeds that the farmer needs to order.
Instructor: Beiter
HW#02 - PART C: Crop Yield*/

class TestCropYield
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      CropYield crop = new CropYield();
      double numPlantsPerAcre;
      double numBagsOfSeed;
      /*We prepare beginning for Scanner and Crop class*/
      System.out.print("Please enter your target seed rate: ");
      numBagsOfSeed = sc.nextDouble();      
      /*User inputs number bags of seed*/
      System.out.print("Please enter the number of acres to plant: ");
      numPlantsPerAcre = sc.nextDouble();
      /*User inputs number of acres per acres to plant*/
      System.out.println();
      
      crop.CalcCropYield(numBagsOfSeed, numPlantsPerAcre);
      /*We transfer over the provided information as the calculations is being done and we receive output*/
     
   }

}