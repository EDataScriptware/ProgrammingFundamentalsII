import java.util.*;

/*
Author: Edward Riley
Date: 2/16/18
Purpose: I must write a program to understand how ArrayList functions work better.
Instructor: Beiter
ICE15: Foreach Loop and Instanceof
*/

class ArrListStuff
{
   public static void main(String[] args)
   {
      ArrayList collection = new ArrayList();   
      
      //HERE, I INITIALIZE BOAT AND CARS
      Boat boat1 = new Boat("Blue", 45000);
      Boat boat2 = new Boat("Red", 82000);
      Boat boat3 = new Boat("White", 64500);
      Car car1 = new Car("Volvo", 42000);
      Car car2 = new Car("BMW", 125000);
      Car car3 = new Car("Hummer", 55500);
   
   
      //HERE, I ADD SPECIFIC CARS/BOATS TO THE LIST 
      collection.add(boat1);
      collection.add(boat2);
      collection.add(boat3);
      collection.add(car1);
      collection.add(car2);
      collection.add(car3);
      
      double totalSum = 0;
   
      //I PRINT EACH OF COLOR AND PRICE
      for (Object a : collection)
      {
         if (a instanceof Car)
         {
            System.out.println(a.toString());
         }
         else if (a instanceof Boat)
         {
            System.out.println(a.toString());
            
         }
         else 
         {
            System.out.println("Unknown object type...");
            collection.remove(0); 
         }
      }
      double carTotalSum = 0;
      carTotalSum = car1.getPrice() + car2.getPrice() + car3.getPrice();
      
      double boatTotalSum = 0;
      boatTotalSum = boat1.getPrice() + boat2.getPrice() + boat3.getPrice();
      
      totalSum = carTotalSum + boatTotalSum;
      
      System.out.println("Total Cost: $" + totalSum);
   
   } 
}
