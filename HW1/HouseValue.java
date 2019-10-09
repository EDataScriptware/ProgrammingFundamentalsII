import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/19/18
Purpose: I must write a program that best calculates the square footage of house by using length and width. 
Instructor: Beiter
HW#1 PART C: House Value*/
public class HouseValue
{

   public static void main(String [] args)
   {
   
   double width = 40;
   double length = 80;
   double squareFootage = 100;
   
   double value = width * length * squareFootage;
   /*Here, I write out the variable declarations ahead of time so that I may alter it in case of errors or subject to change. */
   
   System.out.println("The square footage of the house is 3200 square feet.");
   System.out.println("THe value of the house is $" + value);
   }

}