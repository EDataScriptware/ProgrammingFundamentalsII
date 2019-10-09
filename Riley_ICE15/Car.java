import java.util.*;

/*
Author: Edward Riley
Date: 2/16/18
Purpose: I must write a program to understand how ArrayList functions work better.
Instructor: Beiter
ICE15: Foreach Loop and Instanceof
*/


public class Car

{
      //Name and prices have been initialized.
   public String name = "";
   public double price = 0;
   
   
   
   //Constructors added for ListArray
   public Car(String _name, double _price)
   {
      setName(_name);
      setPrice(_price);
      
   }
   
   //Constructors added for get & set.
   public String getName()
   {
      return name;
   }
   
   public double getPrice()
   {
      return price;
   
   }

   public void setName(String _name)
   {
      name = _name;
   
   }

   public void setPrice(double _price)
   {
      price = _price;
   }
   
   public String toString()
   {   
         return String.format("This is the brand: " + name + " This is the cost: $" + price);
   }
   
   
   

}