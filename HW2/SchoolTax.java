import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/24/18
Purpose: I must write a program that calculates school taxes in New York. 
Instructor: Beiter
HW#02 - PART A: School Tax*/

class SchoolTax
{

   double appraisedValue;
   final double TAXRATE = 18.8324;
   final double INTERESTS = 0.035;
   final int NUMBEROFPAYMENTS = 3;
   /*PReparing constants*/

   public void CalcTax(double appraisedValue)
   {       
      /*Calculations as well as output acting as behavior.*/
      double cost = (appraisedValue / 1000) * TAXRATE;
      System.out.println("The school tax due is $" + cost);
      double oneThirdCost = ((cost * INTERESTS) + cost) / numbersOfPayment;
      System.out.println();
      System.out.println("You may choose to make quarterly payments of $" + oneThirdCost);
               
   }
  
}
