import java.util.*;

/*
Author: Edward Riley
Date: 2/05/18
Purpose:  I must learn to understand inherited classes even further. 
Instructor: Beiter
ICE18: Polymorphism
*/

public class TestBuilding
{
   public static void main(String[] args)
   {
      int numBedrooms = 3;
      
      House h1 = new House("123 Main Street");
      Building b1 = new Building();
      Building b2 = new House("10 Maple Road");
      
            
      h1.setAddress("123 Main Street");
   
      System.out.println("Address: " + h1.getAddress().toString());
      System.out.println("Number of Bedrooms: " + h1.getNumBedrooms() + "\n");
      
      h1.setNumBedrooms(numBedrooms);
   
      if (!(h1.equals(b1)))
      {
         b1.setAddress("10 Maple Road");
         System.out.println("Updated Address: " + b1.getAddress());
         System.out.println("Updated Number of Bedrooms: " + h1.getNumBedrooms());
      }
      
      System.out.println("\n" + h1.toString());
   }

}
