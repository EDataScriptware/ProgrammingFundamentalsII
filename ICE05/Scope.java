import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/24/18
Purpose: I must write a program to test my abilities in scope. 
Instructor: Beiter
ICE#05*/

public class Scope
{
   private int num1 = 22;
   private int num3 = 7;

   public int method1()
   {
      int num1 = 100;
      return num1;
   }
   public int method2()
   {
      return num1;
   }
   public double addSum()
   {
      int sum = 0;
      for (int k = 0; k < 10; k++)
      {
         sum = sum + k;
      }
      return sum;    
   }
   
  public int getNum3()
   {
      return num3;
   }
   
   public void setNum3(int _num3)
   {
       num3 = _num3;
   }
   
   
   
}