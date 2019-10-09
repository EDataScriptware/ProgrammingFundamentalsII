import java.util.*;

/*
Author: Edward Riley
Date: 2/10/18
Purpose:  I must create an application simulating an appliance shop.
Instructor: Beiter
HW8: Abstract
*/

 public class Household extends Appliance
{
   String applianceType = ""; //Kitchen and Laundry
   double weight = 0; //less 10 pounds, 10 to 50 pounds, over 50 pounds
   double totalCost = 0;
   
   public Household()
   {
      brandName = "No Brand Given";
      applianceType = "No Type Given";
      weight = 0;
   }
   
   //Getters
   public String getApplianceType()
   {
      return applianceType;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   
   //Setters
   public void setApplianceType(String _applianceType)
   {
      applianceType = _applianceType;
   }
   
   public void setWeight(double _weight)
   {
      weight = _weight;
   }
   
   
   public double getShippingCost()// returns cost based on weight
   {
      if (getWeight() < 0)
      {
         totalCost = 0.0;
         return totalCost; //invalid - returns 0
      }
      else if (getWeight() < 10)
      {
         totalCost = 5.50;
         
         return totalCost; //charges $5.50
      }
      else if ((getWeight() > 10) && (getWeight() < 50))
      {
         totalCost = 25.0;
         return totalCost;
      }
      else 
      {
         totalCost = 100.0;
         return totalCost;//Charges $100.00
      } 
   }
   
   public String toString()
   {
      return String.format("\n\t\tHousehold Appliance:\n" + "\nBrand Name: " + getBrandName() + "\nType of Household Applaince: " + getApplianceType() + "\nWeight of Appliance: " + getWeight()  + " lbs" + "\nShipping Cost: $" + getShippingCost());
   }

}