import java.util.*;

/*
Author: Edward Riley
Date: 2/10/18
Purpose:  I must create an application simulating an appliance shop.
Instructor: Beiter
HW8: Abstract
*/

 public class Electronics extends Appliance
{
   String ElectronicsType = ""; //Kitchen and Laundry
   String size = ""; //Small, Medium Heavy
   double totalCost = 0;
   
   public Electronics()
   {
      brandName = "No Brand Given";
      ElectronicsType = "No Type Given";
      size = "No Size Given";
   }
   
   //Getters
   public String getElectronicsType()
   {
      return ElectronicsType;
   }
   
   public String getSize()
   {
      return size;
   }
   
   //Setters
   public void setElectronicsType(String _ElectronicsType)
   {
      ElectronicsType = _ElectronicsType;
   }
   
   public void setSize(String _size)
   {
      size = _size;
   }
   
   public double getShippingCost()
   {
      if (count < 0)
      {
         return 0; //error
      }
      else if (count < 5)
      {
         totalCost = count * 25.00; //Under 5 - count x 25
         return totalCost;
      }
      else
      {
         totalCost = count * 15.50; //Over 5 - count x 15.50
         return totalCost;
      }
   }
   public String toString()
   {
      return String.format("\n\t\tElectronic Appliance:\n" + "\nBrand Name: " + getBrandName() + "\nType of Electronic: " + getElectronicsType() + "\nSize of Electronic: " + getSize() + "\nShipping Cost: $" + getShippingCost());
   }
}