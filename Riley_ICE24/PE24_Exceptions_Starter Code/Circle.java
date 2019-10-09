import java.util.*;

/*
Author: Edward Riley
Date: 3/25/18
Purpose:  I must create an application to understand exceptions.
Instructor: Beiter
ICE24: User-Defined Exceptions
*/

public class Circle 
{      // Student Starter code
   private double radius;    // circle radius

   /**
    * Construct Circle with given radius
    * @param inRadius radius of the Circle
    */
   public Circle(double inRadius ) throws Exception
   {
      // implement body here
      if (inRadius < 0.0)
      {
         throw new Exception();
      }
      else 
      {
         radius = 0;
      }
      
   }

   /**
    * Returns the radius of this Circle
    * @return the radius of this Circle
    */
   public double getRadius() 
   {
      return radius;
   }

   /**
    * Sets the radius of this Circle
    * @param newRadius new radius of this Circle
    */
   public void setRadius(double newRadius) throws Exception
   {
   	// implement body here
      if (newRadius < 0.0)
      {
         throw new Exception();
      }
      else 
      {
         radius = newRadius;
      }
   }

   /**
    * Returns the area of this Circle
    * @return the area of this Circle
    */
   public double area() 
   {
      return Math.PI * radius * radius;
   }

   /**
    * Stretches Circle size by multiplying
    * the radius by the given factor.
    * @param factor stretch factor
    */
   public void stretchBy(double factor ) throws Exception
   {
      // implement body here
      if (factor <= 0.0)
      {
         throw new Exception();
      }
      else 
      {
         radius = factor * radius;
      }
      
   }

   /**
    * Returns a string representation of this Circle.
    * @return a string representation of this Circle
    */
   public String toString() 
   {
     // implement body here
      return "Circle: " + radius;
   }
}
