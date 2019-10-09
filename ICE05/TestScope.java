import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/24/18
Purpose: I must write a program to test my abilities in scope. 
Instructor: Beiter
ICE#05*/

public class TestScope
{
   public static void main(String[] args)
   {
      int num3 = 55;
      Scope scope = new Scope();
      System.out.println("Method 1: " + scope.method1());
      System.out.println("Method 2: " + scope.method2());

      scope.setNum3(num3 + scope.getNum3());

      System.out.println("Number 3 + 55 would be: " + scope.getNum3());

   
   }
   
   
   
}

