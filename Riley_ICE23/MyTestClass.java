import java.util.*;

/*
Author: Edward Riley
Date: 3/21/18
Purpose:  I must create an application to understand exceptions.
Instructor: Beiter
ICE23: User-Defined Exceptions
*/

public class MyTestClass
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      MyClass mc = new MyClass();
      MyClass mc2 = new MyClass();
      boolean validation = false;
      
      try
      {
         mc.setIntVar(-10);
         System.out.println("TRY SUCCESS");
      }
      catch(NumberOutOfRangeException e)
      {
         System.out.println("ERROR: " + e.toString());
      }
      try
      {
         mc.setDblVar(50);
         System.out.println("TRY SUCCESS");
      }
      catch(NumberOutOfRangeException e)
      {
         System.out.println("ERROR: " + e.toString());
      }
      
      
      
      try
      {
      //TESTING
         while (validation != true)
         {
            System.out.print("Enter a number: ");
         
            try
            {
               mc.setDblVar(sc.nextDouble());
               System.out.println("TRY SUCCESS");
            }
            catch(NumberOutOfRangeException e)
            {
               System.out.println("ERROR: " + e.toString());
            }
         
         }
            
      
      }catch(Exception e)
      {
         System.out.println("Something went wrong...");
      }
   
   }

}

