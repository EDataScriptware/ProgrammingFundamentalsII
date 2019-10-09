import java.util.*;

/*
Author: Edward Riley
Date: 2/09/18
Purpose:  I must learn to understand interface classes even further. 
Instructor: Beiter
ICE20: Interface Class

*/


public class TestInheritance
{
   public static void main(String [] args)
   {
   
      
      MyConcrete mc = new MyConcrete();  // #23
      // Yes, this compiled because MyConcrete is instantiatable
      
      MyInheritedClass mi = new MyInheritedClass(); // #24
      // Yes, this compiled too because MyInheritedClass is instantiatable
      
      // #25
      mi.myInterMethod();
      // this printed "I am myInterMethod"
      // this was declared in MyInterface
      // this was defined in MyConcrete
      // Declaring is the method signature, defining is the method body
      
      // #26
      mi.myConMethod();
      // this displayed "I am concrete"
      // this was defined in MyConcrete
      // paper says "defined", they were declared in different classes but
      //  both were defined in MyConcrete
      
      // #27
      System.out.println(mi.getConVar() );
      // I called method getConVar
      // this was defined in MyConcrete
      // Output was 10.0
      
      // #28
      MyInheritedClass my2 = new MyInheritedClass(30);
      // no error occured
      
      // #29
      System.out.println(my2.getConVar() );
      // Now I got an error message "Concrete Variable value out of range: 30.0"
      // Output was 0.0
      // The value defaulted to 0 because it was never properly initialized yet
      
      // #30
      MyInheritedClass my3 = new MyInheritedClass(12);
      
      // #31
      System.out.println(my3.getConVar() );
      // Yes, the output was 12.0!  All Done!
   }
}