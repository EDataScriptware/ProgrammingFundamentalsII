import java.util.*;

/*
Author: Edward Riley
Date: 2/28/18
Purpose:  I must learn to understand how SuperClass and this. works. 
Instructor: Beiter
ICE17: super/this
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

    public String toString()
   {
      return String.format("House \n Owner Name: " + getOwnerName() + "\n Address: " + getAddress() + "\n Squarefeet:  " + getSquareFeet() + "\n Number of Bedrooms: " + getNumBedrooms());
   }

}
