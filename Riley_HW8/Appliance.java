import java.util.*;

/*
Author: Edward Riley
Date: 2/10/18
Purpose:  I must create an application simulating an appliance shop.
Instructor: Beiter
HW8: Abstract
*/

 public abstract class Appliance
{
   int count = 0; //Number of items ordered
   String brandName = ""; //Brand of an item being ordered
   final double PACKING_FEE = 0.03; //0.03 of total shipping cost
   
   //Getters
   public int getCount()
   {
      return count;
   }
   public String getBrandName()
   {
      return brandName;
   }
   
   //Setters
   public void setCount(int _count)
   {
      count = _count;
   }
   
   public void setBrandName(String _brandName)
   {
      brandName = _brandName;
   }
   
   public abstract double getShippingCost();
   
   public String toString()
   {
      return String.format("Numbers of Item Ordered: " + getCount() + "\nBrand Name: " + getBrandName());
   }
   
   



}