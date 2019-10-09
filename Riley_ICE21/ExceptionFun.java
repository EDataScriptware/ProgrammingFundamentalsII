import java.util.*;

/*
Author: Edward Riley
Date: 2/19/18
Purpose:  I must learn to understand the functions of Exceptions.
Instructor: Beiter
ICE21: Exceptions

*/

public class ExceptionFun
{
   public static void main(String[] args)
   {
      int enteredNumber = 0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      try
      {
         enteredNumber = sc.nextInt();
      }
      catch (InputMismatchException e)
      {
         System.out.println(e.toString());
      }
      catch (Exception e)
      {
         System.out.print("Sorry, but you need to enter a whole number.");
      }
      
   }



}