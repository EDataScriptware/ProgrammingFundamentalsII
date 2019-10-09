import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/22/18
Purpose: I must write a program that turns a programming language into a pizza. 
Instructor: Beiter
ICE#04: Pizza Classes*/


public class Pizza
{
   String PizzaToppings;
   int PizzaDiameter;
   double PizzaPrice;
   //Private by default.
   
   public Pizza()
   {
   PizzaToppings = "toppings";
   PizzaDiameter = 0;
   PizzaPrice = 0;
   }
   
   public Pizza(String toppings, int diameter, double price) //parameterized constructor
   {
   PizzaToppings = toppings;
   PizzaDiameter = diameter;
   PizzaPrice = price; 
   }
   
   public String toString()
   {
      return ("I like to have " + PizzaToppings + " on my " + PizzaDiameter + " inches pizza, it costs me $" + PizzaPrice);
   }

 public void setName (String toppings)
   {
      PizzaToppings = toppings;
   }
   
   public String getToppings()
   {
      return PizzaToppings;
   }
   
   
   public void setDiameter(int diameter)
   {
      PizzaDiameter = diameter;
   }
   
   public int getDiameter()
   {
   return PizzaDiameter;
   }

public void setPrice (double price)
   {
      PizzaPrice = price;
   }
   
   public double getBark()
   {
   return PizzaPrice;
   }

}

