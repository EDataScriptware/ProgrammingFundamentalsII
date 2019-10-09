import java.util.Scanner;
import java.util.ArrayList;

/*
Author: Edward Riley
Date: 2/09/18
Purpose: I must write a program to calculate grades by using lists..
Instructor: Beiter
ICE:12 - PART B -  LISTS*/

public class Course
{
      int credits;
      String grade;
      
 
      
      public Course(int _c, String _g)
      {
         credits = _c;
         grade = _g;
      }
      public String getGrade()
      {
         return grade;
      }
      public int getCredits()
      {
         return credits;
      }
      


}
