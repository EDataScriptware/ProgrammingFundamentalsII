import java.util.Scanner;
import java.util.ArrayList;

/*
Author: Edward Riley
Date: 2/09/18
Purpose: I must write a program to calculate grades by using lists.
Instructor: Beiter
ICE:09 - PART B -  LISTS*/

public class TestGrades
{
   //Delcare the course class , connect to course class
      
   public static void main(String[] args)
   {
      int cre = 0;
      String s = "default";
   
      Course crs = new Course(cre ,s );

   
   
      ArrayList <Course> gradeList = new ArrayList<Course>();
      int gradePoints = 0;
      gradeList.add(new Course(4, "A"));
      gradeList.add(new Course(4, "B"));
      gradeList.add(new Course(3, "C"));
      gradeList.add(new Course(0, "A"));
      int size = gradeList.size();
      String grade = crs.getGrade();
      int course = crs.getCredits();
      
      //Call the course getGrade method
      

    switch (grade)
      {
         case "A": 
         gradePoints = 4;
         break;
         
         case "B":
         gradePoints = 3;
         break;
         
         case "C":
         gradePoints = 2;
         break;
         
         case "D":
         gradePoints = 1;
         break;
         
         case "F":
         gradePoints = 0;
         break;
         
         default:
         gradePoints = -1;
         break;
      
      
      }
   


            
      System.out.println("Credits   Grades");
      for (Course c: gradeList)
      {
         System.out.println(c.getCredits() + "\t\t\t\t" + c.getGrade());
         
      }
     
     int totalCredits = 0;
     for (Course c: gradeList)
     {
      totalCredits += c.getCredits();
     }
     double counter = 0;
     for (int i = 0; i < gradeList.size(); i++) 
     {
     counter++;
      }
      
     System.out.println("Total Credits: " + totalCredits);
     }
     
         
}