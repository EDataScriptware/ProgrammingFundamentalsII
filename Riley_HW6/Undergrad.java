import java.util.*;

/*
Author: Edward Riley
Date: 3/01/18
Purpose:  I must create a record of students in college years varying on their undergraduate/graduate degrees. 
Instructor: Beiter
HW6: Students
*/

public class Undergrad extends Student 
{
   int yearLevel = 0;
   final int CREDIT_HOUR = 517;
   
   public Undergrad()
   {
      this.yearLevel = 0;
   }
   
   
   //Getters
   public int getYearLevel()
   {
      return yearLevel;
   }
   
   //Setters
   public void setYearLevel(int _yearLevel)
   {
      yearLevel = _yearLevel;
   }

   
   //Calculates tuition
   public double calcTuition()
   {
      double tuition = 0.00;
      tuition = numCredits * CREDIT_HOUR; 
    
      return tuition;
   }
   
   public String toString()
   {
      return String.format("Undergraduate Student: " +
         "\n\t\tStudent Name: \t\t\t" + name + 
         "\n\t\tStudent ID: \t\t" + id + 
         "\n\t\tCredits: \t\t\t" + numCredits + 
         "\n\t\tYear Level: \t\t" + yearLevel +
         
         "\n\t\tTuition: \t\t\t$" + calcTuition());
   }


}