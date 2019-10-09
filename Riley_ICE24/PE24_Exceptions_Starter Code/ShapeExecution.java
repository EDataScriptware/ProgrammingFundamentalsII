import java.util.*;

/*
Author: Edward Riley
Date: 3/25/18
Purpose:  I must create an application to understand exceptions.
Instructor: Beiter
ICE23: User-Defined Exceptions
*/

public class ShapeExecution extends Exception
{
   double radius;
   
   public ShapeExecution(double newRadius)
   {
      radius = 0;
   }
   public void setRadius(double _radius)
   {
      radius = _radius;
   }
   
   public String toString()
   {
      return String.format("Exception Ocurred: ShapeExecution: Invalid Radius: " + radius);
   }


}