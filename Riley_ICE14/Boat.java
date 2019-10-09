import java.util.*;

/*
Author: Edward Riley
Date: 2/14/18 (Valentine's Day)
Purpose: I must write a program to understand how ArrayList functions.
Instructor: Beiter
ICE14: ArrayList
*/

public class Boat
{
      //Color and prices have been initialized.
   String color = "";
   double price = 0;
   
   
   
   //Constructors added for ListArray
   public Boat(String color, double price)
   {
      setColor(color);
      setPrice(price);
      
   }
   
   //Constructors added for get & set.
   public String getColor()
   {
      return color;
   }
   
   public double getPrice()
   {
      return price;
   
   }

   public void setColor(String _color)
   {
      color = _color;
   
   }

   public void setPrice(double _price)
   {
      price = _price;
   }
   
   
   

}