// #17
public class MyInheritedClass extends MyConcrete implements MyInterface
{
   // #18
   public MyInheritedClass(double _v1)
   {
      super(_v1);
   }
   
   // #19
   public MyInheritedClass()
   {
      this(10);
   }
}