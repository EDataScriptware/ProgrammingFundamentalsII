import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/29/18
Purpose: I must write a program that does my math for me.
Instructor: Beiter
ICE#7: My Math*/

class TestMyMath
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      double number;
      System.out.println("---------ABSOLUTE VALUE----------");
      System.out.print("Please enter your number for absolute value: ");      
      number = sc.nextDouble();
      MyMath a = new MyMath();
   
      if (number <= 0)
      {
         System.out.println(a.absValue(number));
      }
      else 
      {
         System.out.println(number);
      }
      
      System.out.println("---------POWER----------");
      System.out.print("Please enter your base number: ");      
      number = sc.nextDouble();
      System.out.print("Please enter your number for power value (0-4): ");      
      int power = sc.nextInt();
      System.out.println(a.Power(number, power));
      
      System.out.println("---------EVEN/ODD----------");
      System.out.print("Please enter your base number: ");      
      int singleNumber = sc.nextInt();
      
      if (a.EvenOrOdd(singleNumber)!= 0)
      {
         System.out.println("ODD!");
      }
      else 
      {
         System.out.println("EVEN!");
      }
      
   }
}