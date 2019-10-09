import java.util.*;

/*
Author: Edward Riley
Date: 3/25/18
Purpose:  I must create an application to understand exceptions.
Instructor: Beiter
ICE23: User-Defined Exceptions
*/

public class TestCircle2 
{
   public static void main(String[] args)
   {
      double radius = -5;
   
      Scanner sc = new Scanner(System.in);
      try 
      {
         ShapeExecution c1 = new ShapeExecution(radius);
         c1.setRadius(radius); //no idea what im doing now
      }
      catch (Exception e)
      {         ShapeExecution c1 = new ShapeExecution(radius);
      
         System.out.println(c1.toString());
      
      }
      
   
   }

}