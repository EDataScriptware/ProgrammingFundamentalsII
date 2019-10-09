/*
Author: Edward Riley
Date: 1/22/18
Purpose: I must write a program that turns a programming language into a pizza. 
Instructor: Beiter
ICE#04:  Pizza Classes*/

public class TestPizza
{
   public static void main(String[] args)
   {
      Pizza pizza1 = new Pizza();
      Pizza pizza2 = new Pizza("pepporini", 6, 9.99);
      Pizza pizza3 = new Pizza("cheese", 12, 13.99);
      Pizza pizza4 = new Pizza("sausage", 18, 15.99);

      
      System.out.println(pizza1.toString());
      System.out.println(pizza2.toString());
      System.out.println(pizza3.toString());
      System.out.println(pizza4.toString());

   }

}