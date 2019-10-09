import java.util.*;

/*
Author: Edward Riley
Date: 2/28/18
Purpose:  I must learn to understand how SuperClass and this. works. 
Instructor: Beiter
ICE17: super/this
*/

public class SuperThis
{
   public static void main(String args[])
   {
   
   House house1 = new House();
   Warehouse warehouse1 = new Warehouse();
   Building building1 = new Building();
   
   System.out.println(house1.getNumBedrooms() );
   System.out.println(warehouse1.getNumLoadingDocks() );
   System.out.println("testing kjb");
   System.out.println("kjb address: " + building1.getAddress() );
   System.out.println("kjb sqrft  : " + building1.getSquareFeet() );
   System.out.println("kjb owner  : " + building1.getOwnerName() );
   System.out.println(warehouse1.toString() );
System.out.println("testing kjb after");
   }
   


}