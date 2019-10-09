import java.util.*;

/*
Author: Edward Riley
Date: 3/21/18
Purpose:  I must create an application to understand combination of method and exceptions at once.
Instructor: Beiter
ICE22: Methods and Exceptions
*/

public class CalcPay
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner (System.in);
      double hours = 0;
      double hrRate = 0;
      boolean validation = false;
      double total = 0;
      
      while (validation != true)
      {
         System.out.print("Enter number of hours: ");
         try
         {
            hours = sc.nextDouble();
            validation = true;
         }
         catch (Exception e)
         {
            sc.nextLine();
            System.out.println("INVALID HOURS: " + e.toString());
         }
      
      
      }
      validation = false;
      while (validation != true)
      {
         System.out.print("Enter hourly rate: $");
         try
         {
            hrRate = sc.nextDouble();
            validation = true;
         }
         catch (Exception e)
         {
            sc.nextLine();
            System.out.println("INVALID HOURLY RATE: " + e.toString());
         }
         
         total = hours * hrRate;
         System.out.println("Total: $" + total);
         
      
      
      
      
      }
      
   
   
   
   }




}