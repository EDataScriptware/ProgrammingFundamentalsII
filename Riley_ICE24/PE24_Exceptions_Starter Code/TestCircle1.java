import java.util.*;

/*
Author: Edward Riley
Date: 3/25/18
Purpose:  I must create an application to understand exceptions.
Instructor: Beiter
ICE23: User-Defined Exceptions
*/

public class TestCircle1 
{
   public static void main(String[] args)
   {
      double radius = 5;
   
      Scanner sc = new Scanner(System.in);
      try 
      {
      Circle c1 = new Circle(radius);
      c1.setRadius(radius);
      System.out.println(c1.toString());
      }
      catch (Exception e)
      {
      System.out.println("BELOW THAN ZERO");
      }
      
   
   }

}