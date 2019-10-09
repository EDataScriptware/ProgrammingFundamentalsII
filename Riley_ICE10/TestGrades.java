import java.util.Scanner;

/*
Author: Edward Riley
Date: 2/05/18
Purpose: I must write a program to calculate grades by using arrays..
Instructor: Beiter
ICE:09 - PART B -  ARRAYS*/

class TestGrades
{
   

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int students = 0;
      System.out.print("How many students: ");
      students = sc.nextInt();
      
      Grade gr = new Grade(students);   
      for (int i = 1; i < (gr.getSize() + 1); i++)
      {
         System.out.println("Enter a grade for student " + i + ": ");
         double assignGr = sc.nextInt();
         gr.setGrade(i,assignGr);
      }
      boolean numBValidation = false;
      while (students <= 0)
      {
         System.out.print("Number of students cannot be under or equal to 0");
         students = sc.nextInt();
      }
   
   // students = sc.nextInt();
      for (int i = 1; i < gr.getSize(); i++)
      {
         System.out.println("Pos: " + i + "  Grade: " + gr.getGrade(i));
      }
      System.out.print("Enter the student number: ");
      int student = sc.nextInt() - 1;;
      System.out.print("Enter the student's new grade: ");
      double grade = sc.nextDouble();
      if (! gr.setGrade(student, grade))
      {
         System.out.println("Invalid student number was entered.");
      
      }
   
      System.out.println("Average: " + gr.avgGrade());
      System.out.println("Maximum Grade: " + gr.maxGrade());
      double maximum = gr.maxGrade();
      System.out.println("Minimum Grade: " + gr.minGrade());
     
      
   }
         
}