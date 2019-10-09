import java.util.*;

/*
Author: Edward Riley
Date: 2/28/18
Purpose:  I must learn to understand how SuperClass and this. works. 
Instructor: Beiter
ICE17: super/this
*/

public class Warehouse extends Building
{

   int numLoadingDocks;
   
   public Warehouse()
   {
      setAddress(address);
      setSquareFeet(squareFeet);
      setOwnerName(ownerName);
      
      this.numLoadingDocks = 0;
   }
  
   public void setNumLoadingDocks(int numLoadingDocks)
   {
      if (numLoadingDocks > 0)
      {
         this.numLoadingDocks = numLoadingDocks;
      }
      else if (numLoadingDocks < 0)
      {
         this.numLoadingDocks = 1;
      }
      else
      {
      
      }
      
   }
   public int getNumLoadingDocks()
   {
      return numLoadingDocks;
   }
   
   
    public String toString()
   {
      return String.format("Building \n Owner Name: " + getOwnerName() + "\n Address: " + getAddress() + "\n Squarefeet:  " + getSquareFeet() + "\n Number of Loading Docks: " + getNumLoadingDocks());
   }
}