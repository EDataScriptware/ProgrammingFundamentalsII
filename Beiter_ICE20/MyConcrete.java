public class MyConcrete implements MyInterface  // #14, added implements MyInterface
{
   double conVar;    // must be between 10 and 20
   
   public MyConcrete() // #12 default constructor
   {
      this(15.0);  //  (could change conVar to double above too)
   }
   
   public MyConcrete(double _cv) // #11 parameterized constructor, changed to double
   {
      setConVar(_cv);
   }
   
   public double getConVar()  // #9
   {
      return conVar;
   }
   public void setConVar(double _cv)   // #10, changed to double too
   {
      if (_cv >=10 && _cv <=20)
         conVar = _cv;
      else
         System.out.println("Concrete Variable value out of range: " + _cv);
   }
   public void myConMethod()
   {
      System.out.println("I am concrete");
   }
   public void myInterMethod()   // #16 define method for interface signature
   {
      System.out.println("I am myInterMethod");
   }
}