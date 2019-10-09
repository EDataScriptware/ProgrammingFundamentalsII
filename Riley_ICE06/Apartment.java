import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/24/18
Purpose: I must write a program balances monthly rents.
Instructor: Beiter
ICE#6: Apartment*/

class Apartment
{
   String streetAddress;
   double monthlyRent;
    


   public Apartment()
   {
      streetAddress = "10 East Street";
      monthlyRent = 550.00;
      /*Original values*/
   }
   
   public String getStreetAddress()
   {
      return streetAddress;
   }
   
   public double getMonthlyRent()
   {
      return monthlyRent;
   }
  
   public void setStreetAddress(String _streetAddress)
   {
      this.streetAddress = _streetAddress;
   }
   public boolean setMonthlyRent(double _monthlyRent)
   {
      if (_monthlyRent >= 0)
      {
         this.monthlyRent = _monthlyRent;
         System.out.println("No change of value");
         return true;
      }
      else 
      {
       System.out.println("Updated value: " + this.monthlyRent);
       return false;
      }
   }

   

}