import java.util.Scanner;
/*
Author: Edward Riley
Date: 1/31/18
Purpose: I must write a program that calculates my GPA for me. 
Instructor: Beiter
ICE#8: GPA*/

class TestGPA
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      GPA gpa = new GPA();
      
      int courseOneCredit =0;
      int sumCredits = 0;
      int sumPoints = 0;
      int counter = 0;
      boolean validator = false;
      String courseOneGrade;
      
      
      while (counter < 3)
      {
         counter++;
         System.out.print("Enter grade (one character): ");
         courseOneGrade = sc.nextLine();
         while (!validator)
         {
            while (courseOneGrade.length() != 1 )
            //while (!courseOneGrade)
            {
            //sc.nextLine();
               System.out.println("ERROR: Enter exactly one character: ");
               courseOneGrade = sc.nextLine();
            }
         
            if (gpa.getPointsForGrade(courseOneGrade) != -1)
            {
               validator = true;
            }
            else
            {
               validator = false;
               System.out.println("ERROR: Enter an actual grade!");
               courseOneGrade = sc.nextLine();
            }
         
         }
         
      
         System.out.print("Enter credits: ");
         courseOneCredit = sc.nextInt();
         do
         {
            while (!sc.hasNextInt() )
            {
               sc.nextLine(); //Somehow used to get ride of invalid user input line.
               System.out.print("ERROR: Enter a valid integer for number of credits: ");
               courseOneCredit = sc.nextInt(); //Safely assuming integer is entered.
            }  
            if (courseOneCredit < 0)
            {
               sc.nextLine();
               System.out.print("ERROR: Enter a postive integer: ");
               courseOneCredit = sc.nextInt();
               validator = false;
            }
            else 
            {
               validator = true;
            }
         } while (!validator);
       
         /*while (validator == false)
         {
           
               System.out.println(courseOneCredit);
            
               if (courseOneCredit < 0)
               {
               
                  courseOneCredit = sc.nextInt();
                  System.out.print("ERROR: Enter a positive integer: ");
                  System.out.println();
                  validator = false;
               }
               else if (!sc.hasNextInt())
               {
                  System.out.println("ERROR: Enter a positive integer");
                  courseOneCredit = sc.nextInt();
                  validator = false;
               }
               else
               {
                  validator = true;
               }
            */
            
         sumCredits += courseOneCredit;
         sumPoints += gpa.getPointsForGrade(courseOneGrade) * courseOneCredit;
             
           
      
      
         System.out.println("Sum Points:  " + sumPoints + "   Sum Credits: " + sumCredits);
         
      
      
      
         System.out.println("GPA: " + gpa.calcGpa(sumPoints, sumCredits));
      }
   
   
   }
}
