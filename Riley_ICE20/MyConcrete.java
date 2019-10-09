import java.util.*;

/*
Author: Edward Riley
Date: 2/09/18
Purpose:  I must learn to understand doubleerface classes even further. 
Instructor: Beiter
ICE20: Interface Class
*/

public class MyConcrete implements MyInferface
{
   double conVar = 15;
   public MyConcrete()
   {
      this(15.0);
   }
   
   public MyConcrete(double _conVar)
   {
      setConVar(_conVar);
   }
   
   public void myConMethod()
   {
      System.out.println("I am concrete");
   }
   
   public double getConVar()
   {
      return conVar;
   }
   
   public void setConVar(double _conVar)
   {
      if (_conVar >= 10 && _conVar <= 20)
      {
      
      conVar = _conVar;
      }
      else
      {
         System.out.println("Concrete Variable value out of range: " + _conVar);
      }
      
   }
   
   public void myInterMethod()
   {
   System.out.println("I am myInterMethod");
   }
   
   
   
   
   
}