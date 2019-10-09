import java.util.*;

/*
Author: Edward Riley
Date: 2/27/18
Purpose:  I must learn to understand how inheritance works. 
Instructor: Beiter
ICE16: Building
*/

class TestBuilding
{
   public static void main(String args[])
   {
      House house1 = new House();
      Scanner sc = new Scanner(System.in);
   
      String address;
      double squareFootWarehouse;
      double squareFootHouse;
      
      System.out.print("Enter the address: ");
      address = sc.nextLine();
      house1.setAddress(address);
      System.out.println(house1.address);
      
      System.out.println("Enter the squarefoot for House: ");
      squareFootHouse = sc.nextDouble();
      house1.setSquareFeet(squareFootHouse);
   
      Warehouse warehouse1 = new Warehouse();
      System.out.print("Enter the squarefoot for Warehouse: ");
      squareFootWarehouse = sc.nextDouble();
      warehouse1.setSquareFeet(squareFootWarehouse);
   
      System.out.println("House square feet: " + house1.squareFeet);
      System.out.println("Warehouse square feet: " + warehouse1.squareFeet);

      
      
   
   
   }

}