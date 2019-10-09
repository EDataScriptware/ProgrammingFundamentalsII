import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/22/18
Purpose: I must write a program to create an invoice. 
Instructor: Beiter
ICE#04 - PART C: Invoice Classes*/



public class TestInvoice
{
   public static void main(String[] args)
   {
      Invoice invoice1 = new Invoice();
      Invoice invoice2 = new Invoice("A", "Edward", 5, 4.59);
      Invoice invoice3 = new Invoice("B", "Gregory", 2, 19.99);
      Invoice invoice4 = new Invoice("C", "Karen", 7, 1.99);

      
      System.out.println(invoice1.toString());
      System.out.println(invoice2.toString());
      System.out.println(invoice3.toString());
      System.out.println(invoice4.toString());

   }

}