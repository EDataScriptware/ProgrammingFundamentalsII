import java.util.*;

/*
Author: Edward Riley
Date: 3/21/18
Purpose:  I must create an application to understand exceptions.
Instructor: Beiter
ICE23: User-Defined Exceptions
*/

public class MyClass
{
   int intVar = 5;
   double dblVar = 1005.05;
   public MyClass()
   {
      intVar = 0;
      dblVar = 0;
   }
   
   public MyClass(int _intVar, double _doubleVar)
   {
      try 
      {
         setIntVar(_intVar);
      }
      catch(NumberOutOfRangeException e)
      {
         System.out.println("ERROR: " + e.toString());
      }
      try
      {
         setDblVar(_doubleVar);
      }
      catch(NumberOutOfRangeException e)
      {
         System.out.println("ERROR: " + e.toString());
      }  
   }

//Getters
   public int getIntVar()
   {
      return intVar;
   }
   public double getDblVar()
   {
      return dblVar;
   }

//Setters
   public void setIntVar(int _intVar) throws NumberOutOfRangeException
   {
      if ((_intVar >= 0) && (_intVar <= 100))
      {
         intVar = _intVar;
      }
      else
      {
         throw new NumberOutOfRangeException(_intVar);
      }
   }
   public void setDblVar(double _dblVar) throws NumberOutOfRangeException
   {
      if (_dblVar < 40)
      {
         dblVar = _dblVar;
      }
      else
      {
         throw new NumberOutOfRangeException(_dblVar);
      }
   }



}