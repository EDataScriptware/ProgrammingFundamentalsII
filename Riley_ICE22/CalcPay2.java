import java.util.*;

/*
Author: Edward Riley
Date: 3/21/18
Purpose:  I must create an application to understand combination of method and exceptions at once.
Instructor: Beiter
ICE22: Methods and Exceptions
*/

public class CalcPay2
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner (System.in);
      double hours = 0;
      double hrRate = 0;
      boolean validation = false;
      double total = 0;
      final int NUMBER_OF_WEEKS = 52;
      
      while (validation != true)
      {
      
         System.out.print("Enter number of hours: ");
         hours = getDouble(sc);
         if ((hours < 0) || (hours > 60))
         {
            System.out.println("Number must be between 0-60");
         }
         else
         {
            validation = true;
         }
      
      
      } //end validation
      validation = false;
      while (validation != true)
      {
      
         System.out.print("Enter hourly rate: $");
         hrRate = getDouble(sc);
         if ((hrRate <= 5.15) || (hrRate >= 25.00))
         {
            System.out.println("Number must be between $5.15 - $25.00");
         }
         else
         {
            validation = true;
         }
      
      
      } //end validation
      
      total = hrRate * hours * NUMBER_OF_WEEKS;
      System.out.println("Total: $" + total);
      
   }
   public static double getDouble(Scanner s)
   {
      boolean validation = false;
      double nbr = 0;
      
      while (validation != true)
      {
      
         try 
         {
            nbr = s.nextDouble();
            validation = true;
         }
         catch(Exception e)
         {
            s.nextLine();
            System.out.println("Invalid input: " + e.toString());
         }
      
      
      
      }
      return nbr;
   }
   
   public static double getInt(Scanner s)
   {
      boolean validation = false;
      double nbr = 0;
      
      while (validation != true)
      {
      
         try 
         {
            nbr = s.nextInt();
            validation = true;
         }
         catch(Exception e)
         {
            s.nextLine();
            System.out.println("Invalid input: " + e.toString());
         }
      
      
      
      }
      return nbr;
   }


}