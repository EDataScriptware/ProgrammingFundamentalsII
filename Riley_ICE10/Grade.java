import java.util.Scanner;
import java.util.*;

/*
Author: Edward Riley
Date: 2/05/18
Purpose: I must write a program to calculate grades by using arrays..
Instructor: Beiter
ICE:09 - PART B -  ARRAYS*/

class Grade 
{
   double[] arrGrades;
   double maximum = 0;
   double minimum = 100;

   public Grade(int _size)
   {
      arrGrades = new double[_size];
      for (int i = 0; i < arrGrades.length; i++)
      {
         arrGrades[i] = 10.5;
      }
           
   }
   public int getSize()
   {
      return arrGrades.length;
   }
   public double getGrade(int _pos)
   {
      return arrGrades[];
   }
   public boolean setGrade(int _pos, double _grades)
   {
      if (_pos >= 0 && _pos < getSize() )
      {
         arrGrades[_pos] = _grades;
         return true;
      }
      else 
      {
         return false; //array out of range
      }
   }
   public double avgGrade()
   {
      double total = 0;
      for (double g : arrGrades)
      {
         total += g;
      }
      return total /getSize() ;
      
   }
   public double maxGrade()
   {
         
         
      for (int i = 0; i < getSize(); i++)
      {
         if (arrGrades[i] > maximum)
         {
            maximum = arrGrades[i];
         }
         
      } 
      return maximum;
   }


   public double minGrade()
   {
         
         
      for (int i = 1; i < getSize(); i++)
      {
         if (arrGrades[i] < minimum)
         {
            minimum = arrGrades[i];
         }
         
      } 
      return minimum;
   }
   
   public boolean numBGrades(double number)
   {
      if (number < 80)
      {
         return false;
      }
      else if (number > 90)
      {
         return false;
      }
      else
      {
         return true;
      }
   }


}
