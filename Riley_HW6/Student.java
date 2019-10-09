import java.util.*;

/*
Author: Edward Riley
Date: 3/01/18
Purpose:  I must create a record of students in college years varying on their undergraduate/graduate degrees. 
Instructor: Beiter
HW6: Students
*/


public class Student
{
   String name = "";
   String id = "";
   int numCredits = 0;
   
   public Student()
   {
      name = "No name value";
      id = "No ID value";
      numCredits = 0;
   }

   //Getters
   public String getName()
   {
      return name;
   } 
   
   public String getId()
   {
    return id;
   }
   
   public int getNumCredits()
   {
    return numCredits;
   }
   
   //Setters
   public void setName(String _name)
   {
      name = _name;
   }
   
   public void setId(String _id)
   {
      id = _id;
   }
   
   public void setNumCredits(int _numCredits)
   {
      numCredits = _numCredits;
   }
   
   public double calcTuition()
   {
      return 0.0;
   }
   
   public String toString()
   {
      return String.format("Student Name: " + name +  "\nStudent ID: " + id + "\nCredits: " + numCredits);
   }
  

}