import java.util.*;

/*
Author: Edward Riley
Date: 2/28/18
Purpose:  I must learn to understand how SuperClass and this. works. 
Instructor: Beiter
ICE17: super/this
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
   
   public String toString()
   {
      System.out.println("Inside Building toString");
      return "XXX";
      //return String.format("Building \n Owner Name: %s\n Address:  %s \n Squarefeet: %f " , getOwnerName(), getAddress(), getSquareFeet());
   }
   
     
}


