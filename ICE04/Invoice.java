import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/22/18
Purpose: I must write a program to create an invoice. 
Instructor: Beiter
ICE#04 - PART C: Invoice Classes*/


public class Invoice
{
   String Id;
   String Name;
   int Quantity;
   double Price;
   //Private by default.
   
   public Invoice()
   {
   Id = "N";
   Name = "name";
   Quantity = 0;
   Price = 0;
   }
   
   public Invoice(String ids, String names, int quantitys, double prices) //parameterized constructor
   {
   Id = ids;
   Name = names;
   Quantity = quantitys; 
   Price = prices;
   }
   
   public String toString()
   {
      return (Id + " " + Name + " " + Quantity + " " + Price + " " + (Price * Quantity));
   }


}

