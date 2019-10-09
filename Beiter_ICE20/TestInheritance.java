// #21
public class TestInheritance
{
   public static void main(String [] args)
   {
      //MyInterface mif1 = new MyInterface();  // #22
      // could not compile because MyInterface is abstract, could
      // not be instantiated
      
      MyConcrete mc1 = new MyConcrete();  // #23
      // Yes, this compiled because MyConcrete is instantiatable
      
      MyInheritedClass mic1 = new MyInheritedClass(); // #24
      // Yes, this compiled too because MyInheritedClass is instantiatable
      
      // #25
      mic1.myInterMethod();
      // this printed "I am myInterMethod"
      // this was declared in MyInterface
      // this was defined in MyConcrete
      // Declaring is the method signature, defining is the method body
      
      // #26
      mic1.myConMethod();
      // this displayed "I am concrete"
      // this was defined in MyConcrete
      // paper says "defined", they were declared in different classes but
      //  both were defined in MyConcrete
      
      // #27
      System.out.println(mic1.getConVar() );
      // I called method getConVar
      // this was defined in MyConcrete
      // Output was 10.0
      
      // #28
      MyInheritedClass mic2 = new MyInheritedClass(30);
      // no error occured
      
      // #29
      System.out.println(mic2.getConVar() );
      // Now I got an error message "Concrete Variable value out of range: 30.0"
      // Output was 0.0
      // The value defaulted to 0 because it was never properly initialized yet
      
      // #30
      MyInheritedClass mic3 = new MyInheritedClass(12);
      
      // #31
      System.out.println(mic3.getConVar() );
      // Yes, the output was 12.0!  All Done!
   }
}