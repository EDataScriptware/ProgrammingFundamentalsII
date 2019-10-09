import java.util.Scanner;

/*
Author: Edward Riley
Date: 2/04/18
Purpose: I must write a program to figure out bills for Vinny VanGo's company.
Instructor: Beiter
HW:03 Tattoo*/

class Tattoo
{

   public boolean validDimension(double dimension)
   {
      if (dimension > 50)
      {
         return (false);
      
      } 
      else if (dimension < 1)
      {
         return (false);
      
      }
      else 
      {
         return (true);
      }
     
   }
   
   public double calcSize(double width, double height)
   {
      double size = width * height;
      return (size);
   }
   
   public double calcEmbossChg(double size)
   {
      double embossing = 15.00;
      double embossChg = size * embossing;
      return (embossChg);
   }
   
   public double calcColorChg(String color)
   {
      double colorChg;
      double additionalChg = 7.50;
      switch (color)
      {
         case "1": 
            colorChg = 12.00;
            break;
         case "2":
            colorChg = 18.00;
            break;
         case "3":
            colorChg = additionalChg + 18.00;
            break;
         case "4": 
            colorChg = (additionalChg * 2) + 18.00;
            break;
         case "5": 
            colorChg = (additionalChg * 3) + 18.00;
            break;
         case "6": 
            colorChg = (additionalChg * 4) + 18.00;
            break;
         case "7": 
            colorChg = (additionalChg * 5) + 18.00;
            break;
         case "8": 
            colorChg = (additionalChg * 6) + 18.00;
            break;
         default:
            colorChg = -1;
            break;
      }
      return (colorChg);
   }   
   
   public double calcStockChg()
   {
      double charge = 20.00;
      return (charge);
   }
   
   public double calcCustomChg(double numHrs)
   {
      double customDesignChg = 45.00;
      double total = 45.00 * numHrs;
      return (total);
   }
   
   public double calcTotal(double colorChg, double embossChg, double designChg)
   {
     double total = colorChg + embossChg + designChg;
     return (total);
   }
       

}