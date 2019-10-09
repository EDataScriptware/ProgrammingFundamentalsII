import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/24/18
Purpose: I must write a program that calculates school taxes in New York. 
Instructor: Beiter
HW#02 - PART A: School Tax*/

public class TestSchoolTax
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      double appraisedValue;
      SchoolTax schooltax = new SchoolTax();
      /*Preparing Scanner & preparing to call the method from different class.*/
      System.out.print("Enter appraised market value of house: ");
      appraisedValue = sc.nextDouble();
      System.out.println();
      /*User inputs appraised value*/
      System.out.println("On a house appraised at $" + appraisedValue);
      schooltax.CalcTax(appraisedValue);
      /*Output*/
  
   }
}