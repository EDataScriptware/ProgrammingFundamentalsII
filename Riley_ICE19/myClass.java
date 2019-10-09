import java.util.*;

/*
Author: Edward Riley
Date: 2/07/18
Purpose:  I must learn to understand abstract classes even further. 
Instructor: Beiter
ICE19: Abstract Classes
*/

  public abstract class myClass
{
   private int var1 = 0;
   private int var2 = 0;
   //Two argument constructor
   public myClass(int var1, int var2)
   {
      System.out.println("This is the superclass 2-argument constructor");
      var1 = 15;
      var2 = -5;
   
   }
   //Default constructor
   public myClass()
   {
      System.out.println("This is the superclass default constructor");
      var1 = 15;
      var2 = -5;
      
   }


   //Getters
   public int getVar1()
   {
      return var1;
   }
   public int getVar2()
   {
      return var2;
   }
   
   //Setters
   public void setVar1(int _var1)
   {
      if (_var1 < 10)
      {
         System.out.println("ERROR: BELOW 10");
      }
      else if (_var1 > 20)
      {
         System.out.println("ERROR: OVER 20");
      }
      else
      {
         var1 = _var1;
         System.out.println(_var1 + "_var1 has been added to var1");

      } 
   }
   public void setVar2(int _var2)
   {
      if (_var2 <= 0)
      {
         System.out.println("ERROR: OVER OR EQUAL TO ZERO");
      }
      else 
      {
         var2 = _var2;
         System.out.println(_var2 + "_var2 has been added to var2");
      }
   }
   
   //Abstract method
   public abstract void method1();
   

   //ToString   
   public String toString()
   {
      return String.format("ToString: \tvar1: " + var1 + " var2: " + var2);
   }

}