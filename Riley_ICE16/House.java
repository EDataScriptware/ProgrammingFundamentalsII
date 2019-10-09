import java.util.*;

/*
Author: Edward Riley
Date: 2/27/18
Purpose:  I must learn to understand how inheritance works. 
Instructor: Beiter
ICE16: Building
*/

public class House extends Building
{
   int numBedrooms;
   
   public House()
   {
      /*setAddress(address);
      setSquareFeet(squareFeet);
      setOwnerName(ownerName);*/      
      this.numBedrooms = 0;
   }
   
   public int getNumBedrooms()
   {
      return numBedrooms;
   }
   
   public void setNumBedrooms(int numBedrooms)
   {
      if (numBedrooms > 0)
      {
       this.numBedrooms = numBedrooms;  
      }
      else if(numBedrooms < 0)
      {
      
       //automatically set bedrooms to 1
       this.numBedrooms = 1;
      
      }
   
      else
      {
      
      //do nothing
      
      }
      
   }



}
