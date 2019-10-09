public interface MyInterface
{
   //private int var;  // #3 missing initialization
   //#4
   final double INTER_CONST = 10.0;
   
   public void myInterMethod(); // added ; here
// #5 interface methods cannot have a body/definition   
//    {
//       System.out.println("Hello");
//    }
}