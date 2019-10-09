import java.util.*;

/*
Author: Edward Riley
Date: 2/07/18
Purpose:  I must learn to understand abstract classes even further. 
Instructor: Beiter
ICE19: Abstract Classes
*/

public class Subclass extends myClass
{
   //No arguments
   public Subclass()
   {
   System.out.println("This is a subclass default constructor\n " + super.toString());
   }
   //Two arguments
   public Subclass(int var1, int var2)
   {
   System.out.println("This is a subclass two arguments constructor\n " + super.toString());
   }

   public void method1()
   {
      System.out.println("I am method1!");
   }

}

