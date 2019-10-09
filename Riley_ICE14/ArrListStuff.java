import java.util.*;

/*
Author: Edward Riley
Date: 2/14/18 (Valentine's Day)
Purpose: I must write a program to understand how ArrayList functions.
Instructor: Beiter
ICE14: ArrayList
*/

class ArrListStuff
{
   public static void main(String[] args)
   {
      Boat boatClass = new Boat("", 0);
      
      //I have created an object named Inventory. 
      ArrayList Inventory = new ArrayList();
      
      
      //I have created an object named boats with Boat as class.
      ArrayList <Boat> boats = new ArrayList<Boat>();
      
      
      //Here, I begin to plug in the values.
      Boat b1 = new Boat("Blue", 125000);      
      //Here, I add these values to ArrayList.
      Inventory.add(b1);
      
      //boatColor and boatPrice are established and usable.
      String boatColor1 = b1.getColor();
      double boatPrice1 = b1.getPrice();
      
      //I print them out here for basic repetition. 
      /*System.out.println("The color is " + boatColor1 + " | " + "The price is $" + boatPrice1);*/
      
      //I prepare for the next batch of similar to b1.  I begin to plug in the values.
      Boat b2 = new Boat("Red", 45500);
      Boat b3 = new Boat("Blue", 67250);
      Boat b4 = new Boat("White", 48400);
      Boat b5 = new Boat("Blue", 97600);
      //I add them to ListArray
      Inventory.add(b2);
      Inventory.add(b3);
      Inventory.add(b4);
      Inventory.add(b5);
      Boat b = (Boat)(Inventory.get(0));
      //I create a new variable to make it usable.
      String boatColor2 = b2.getColor();
      double boatPrice2 = b2.getPrice();
      String boatColor3 = b3.getColor();
      double boatPrice3 = b3.getPrice();
      String boatColor4 = b4.getColor();
      double boatPrice4 = b4.getPrice();
      String boatColor5 = b5.getColor();
      double boatPrice5 = b5.getPrice();
      //I prepare the variables.
      double totalBoatCost = 0;
      double totalBlueCost = 0;
      String boatColor10 = "";
      double boatPrice10 = 0;
      
            //I print them out all at once while I add them together at the same time by using a FOR LOOP.
      for (int i = 0; i < Inventory.size(); i++)
      {
         Boat b10 = (Boat) Inventory.get(i);
         boatColor10 = b10.getColor();
         boatPrice10 = b10.getPrice();
         
         System.out.println("The color is " + boatColor10 + " | " + "The price is $" + boatPrice10);
         totalBoatCost += boatPrice10;
         if (boatColor10.equals("Blue"))
         {  //If the boat is blue, it will add each other here. 
            totalBlueCost =+ boatPrice10;
         }
      }
      //The part where print all information out. 
      System.out.println("The Total Cost of All Boats: $" + totalBoatCost);
      System.out.println("The Total of All Blue Boats: $" + totalBlueCost);
      
   } 

}