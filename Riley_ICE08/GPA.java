import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/31/18
Purpose: I must write a program that calculates my GPA for me. 
Instructor: Beiter
ICE#8: GPA*/

class GPA
{
   public double getPointsForGrade(String courseGrade)
   {
   int courseCredit;
      switch (courseGrade)
      {
      case "A": 
         return courseCredit = 4;
      case "a": 
         return courseCredit = 4;
      case "B": 
         return courseCredit = 3;
      case "b": 
         return courseCredit = 3;
      case "C": 
         return courseCredit = 2;
      case "c": 
         return courseCredit = 2;
      case "D": 
         return courseCredit = 1;
      case "d": 
         return courseCredit = 1;
      case "F": 
         return courseCredit = 0;
      case "f": 
         return courseCredit = 0;
      default: 
         return courseCredit = -1;
      }
      
      
   } 
   public double calcGpa(double sumPoints, double sumCredits)
      {
         double GPA = sumPoints / sumCredits;
         return (GPA);
      
      }
   
}