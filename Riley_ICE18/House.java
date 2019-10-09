import java.util.*;

/*
Author: Edward Riley
Date: 2/05/18
Purpose:  I must learn to understand inherited classes even further. 
Instructor: Beiter
ICE18: Polymorphism
*/

public class House extends Building
{
   int numBedrooms = 0;
   public House(String address)
   {
      address = "123 Main Street";
      numBedrooms = 1;
   }
   
   //Getters
   public int getNumBedrooms()
   {
      return numBedrooms;
   }
   
   //Setters
   public void setNumBedrooms(int _numBedrooms)
   {
      numBedrooms = _numBedrooms;
   
   }
   
   public String toString()
   {
      return String.format("Address: " + getAddress() + "\tNumber of Bedrooms: " + getNumBedrooms());
   }
   
}