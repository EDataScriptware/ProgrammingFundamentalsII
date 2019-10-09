import java.util.*;

/*
Author: Edward Riley
Date: 2/27/18
Purpose:  I must learn to understand how inheritance works. 
Instructor: Beiter
ICE16: Building
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
}