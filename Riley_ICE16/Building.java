import java.util.*;

/*
Author: Edward Riley
Date: 2/27/18
Purpose:  I must learn to understand how inheritance works. 
Instructor: Beiter
ICE16: Building
*/

class Building
{
   String address = "No address specified";
   double squareFeet =  0.0;
   String ownerName = "No Owner";
   int numBedrooms = 0;
   int numLoadingDocks = 0;
      
   
   //Three instances
   public Building()
   {
      setAddress(address);
      setSquareFeet(squareFeet);
      setOwnerName(ownerName);
   }
   

   
   
   //Get constructors
  
   public String getAddress()
   {
      return address;
   }
   public double getSquareFeet()
   {
      return squareFeet;
   }
   public String getOwnerName()
   {
      return ownerName;
   }
   
   
   //Set constructors
   public void setAddress(String address)
   {
      this.address = address;
   }
   public void setSquareFeet(double squareFeet)
   {
      this.squareFeet = squareFeet;
   }
   public void setOwnerName(String ownerName)
   {
      this.ownerName = ownerName;
   }     
    }


