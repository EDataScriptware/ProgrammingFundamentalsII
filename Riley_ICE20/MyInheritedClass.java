import java.util.*;

/*
Author: Edward Riley
Date: 2/09/18
Purpose:  I must learn to understand interface classes even further. 
Instructor: Beiter
ICE20: Interface Class

*/
public class MyInheritedClass extends MyConcrete implements MyInferface
{
   public MyInheritedClass(double conVar)
   {
      super(conVar);
   }
   
   public MyInheritedClass()
   {
      this(10);
   }
}