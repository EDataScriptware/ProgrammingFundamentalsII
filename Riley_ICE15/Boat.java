import java.util.*;

/*
Author: Edward Riley
Date: 2/17/18
Purpose: I must write a program to understand how ArrayList functions work better.
Instructor: Beiter
ICE15: Foreach Loop and Instanceof
*/

public class Boat
{
      //Color and prices have been initialized.
   String color = "";
   double price = 0;
   
   
   
   //Constructors added for ListArray
   public Boat(String _color, double _price)
   {
      setColor(_color);
      setPrice(_price);
      
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
   
   public String toString()
   {   
      return String.format("This is the color: " + color + " This is the cost: $" + price);
      
      
   }
}