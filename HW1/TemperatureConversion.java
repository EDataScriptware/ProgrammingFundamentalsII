import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/19/18
Purpose: Second program to review on what we've learned in PF 1: (Mobile Domain). 
Instructor: Beiter
HW#1 PART B: Temperature Conversion*/
public class TemperatureConversion
{

   public static void main(String [] args)
   {
   
      double fahrenheit = 70.6;
   
      double celsius = (5.0/9.0) * ((fahrenheit - 32));
      /* It is a common error that a person would forget to add ".0" behind decimal expecting for a right answer without a 0. */
      
      System.out.println("The temperature in fahrenheit is " + fahrenheit);
      System.out.print("The temperature in celsius is " + celsius);
      
   }
   
}
