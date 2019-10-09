import java.util.*;

/*
Author: Edward Riley
Date: 3/01/18
Purpose:  I must create a record of students in college years varying on their undergraduate/graduate degrees. 
Instructor: Beiter
HW6: Students
*/

public class Grad extends Student 
{
   //Initialized variable
   String researchArea = "";
   final int CREDIT_HOUR = 713;
   
   public Grad()
   {
      this.researchArea = "";
   }
   
   //Getter
   public String getResearchArea()
   {
      return researchArea;
   }
   
   //Setter
   public void setResearchArea(String _researchArea)
   {
      researchArea = _researchArea;
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
      return String.format("Graduate Student: " +
         "\n\t\tStudent Name: \t\t" + name + 
         "\n\t\tStudent ID: \t\t" + id + 
         "\n\t\tCredits: \t\t\t" + numCredits + 
         "\n\t\tResearch Area: \t" + researchArea +
         
         "\n\t\tTuition: \t\t\t$" + calcTuition());
   }
   
}