import java.util.*;

/*
Author: Edward Riley
Date: 3/21/18
Purpose:  I must create an application to understand  exceptions.
Instructor: Beiter
ICE23: User-Defined Exceptions
*/

public class NumberOutOfRangeException extends Exception
{

   NumberOutOfRangeException()
   {
      super("The number is out of range.");
   }

   NumberOutOfRangeException(int x)
   { 
      super("Number " + x + " is out of range.");
   }

   NumberOutOfRangeException(double x)
   {
      super("Number " + x + " is out of range.");
   }

   NumberOutOfRangeException(String x)
   {
      super("Number/Letter " + x + " is out of range.");
   }

}