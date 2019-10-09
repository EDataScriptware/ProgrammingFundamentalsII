import java.util.Scanner;

/*
Author: Edward Riley
Date: 2/05/18
Purpose: I must write a program to become a Calculator
Instructor: Beiter
HW:03 - PART B - Calculator*/

class TestCalculator
{
   public static void main(String[] args)
   {
      Calculator calc = new Calculator();
      Scanner sc = new Scanner(System.in);
   
      double num1 = 0;
      double num2 = 0;
      String operator;
      double total = 0;
   
      System.out.print("Enter number 1: ");
      num1 = sc.nextDouble();
   
      System.out.print("Enter number 2: ");
      num2 = sc.nextDouble();
   
      sc.nextLine();
      System.out.print("Enter operation: +, -, x, or /: ");
      
      operator = sc.nextLine();
      
     if (operator.equals("+"))
     {
      System.out.println(calc.plus(num1, num2));
     }
     else if (operator.equals("-"))
     {
    System.out.println(calc.subtract(num1, num2));
     }
     else if (operator.equals("*"))
     {
     System.out.println(calc.multiply(num1, num2));
     } 
     else if (operator.equals("/"))
     {
       if (num2 == 0)
       {
         System.out.println(Double.NaN);
       }
       else
       {
       System.out.println(calc.divide(num1, num2));
       }   
     } 
   
   
   
   
   }
}