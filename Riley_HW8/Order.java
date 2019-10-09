import java.util.*;

/*
Author: Edward Riley
Date: 2/10/18
Purpose:  I must create an application simulating an appliance shop.
Instructor: Beiter
HW8: Abstract
*/

public class Order
{
   public static void main(String[] args)
   {
     //Initialized Preparations
      Household hh = new Household();
      Electronics ee = new Electronics();
      ArrayList collection = new ArrayList();
     
     //Long Initialized Vars
      boolean stop = false;
      boolean validation = false;
      String choice = "";
      int count = 0; //Number of items ordered
      String brandName = ""; //Brand of an item being ordered
      final double PARKING_FEE = 0.03; //0.03 of total shipping cost
      String applianceType = ""; //Kitchen and Laundry
      double weight = 0; //less 10 pounds, 10 to 50 pounds, over 50 pounds
      double totalCost = 0;
      String electronicsType = "No Type Given";
      String size = "No Size Given";
      double currentCost = 0; //One single item cost
      double subTotal = 0.00; //Of all item costs bundled together
      double totalPackingCost = 0; //Bundled together to be able to be charged by Packing Fee
      int electronicsCount = 0;
      boolean secondValidation = false;
      
     
      do
      {
         currentCost = 0; //reset to 0
         count = count + 1; //Adds object count for each loop
         hh.setCount(count);
         ee.setCount(count);
         System.out.println("\nCurrent Subtotal: $" + subTotal );
         while (validation != true)
         {
            System.out.println("Do you want to purchase Household Appliance or Electronic Appliances? \n1) Household Appliances\n2) Electronic Appliances");
            System.out.print("\nEnter your choice: ");
            validation = false; 
         
            Scanner sc = new Scanner(System.in);
            choice = sc.next();
            switch (choice)
            {
               case "1": 
                  validation = false;
                  System.out.println("Household Appliance Brands Selection:\n1) Wolf\n2) LG\n3) Whirlpool\n4) SHARP\n5) Samsung");
                  while (validation != true)
                  {
                     Scanner sc1 = new Scanner(System.in);
                     choice = sc1.next();
                     switch (choice)
                     {
                        case "1": 
                           brandName = "Wolf";
                           currentCost = 24.99;
                           validation = true;
                           break;
                        case "2": 
                           brandName = "LG";
                           currentCost = 42.35;
                           validation = true;
                           break;
                        case "3": 
                           brandName = "Whirlpool";
                           currentCost = 41.95;
                           validation = true;
                           break;
                        case "4": 
                           brandName = "SHARP";
                           currentCost = 22.70;
                           validation = true;
                           break;
                        case "5": 
                           brandName = "Samsung";
                           currentCost = 67.96;
                           validation = true;
                           break;
                        default: 
                           System.out.println("ERROR - Incorrect input... Please try again!");
                           validation = false;
                     }//End switch
                  
                  } //End while loop  
                  hh.setBrandName(brandName);
                  validation = false;
                  System.out.println("Household Appliance Type Selection:\n1) Vaccuum\n2) Fan\n3) Coffee Maker\n4) Steam Ironner");
                  while (validation != true)
                  {
                     Scanner sc2 = new Scanner(System.in);
                     choice = sc2.next();
                     switch (choice)
                     { 
                        case "1": 
                           applianceType = "Vaccuum";
                           currentCost = currentCost + 54.99;
                           validation = true;
                           break;
                        case "2": 
                           applianceType = "Fan";
                           currentCost = currentCost + 4.99;
                           validation = true;
                           break;
                        case "3": 
                           applianceType = "Coffee Maker";
                           currentCost = currentCost + 14.99;
                           validation = true;
                           break;
                        case "4": 
                           applianceType = "Steam Ironner";
                           currentCost = currentCost + 25.98;
                           validation = true;
                           break;
                        default: 
                           System.out.println("ERROR - Incorrect input... Please try again!");
                           validation = false;
                     }//End switch
                     
                  }//End while loop
                     
                  hh.setApplianceType(applianceType);
                  validation = false; //reset to false
                     
                  while (validation != true)
                  {
                     Scanner doubleChecker = new Scanner(System.in);
                     System.out.print("Please enter the approximate weight (lbs) of object: ");
                     
                     if (!(doubleChecker.hasNextDouble()))
                     {
                        System.out.println("ERROR - Incorrect input... Please try again!");
                     }
                     else 
                     {
                        weight = doubleChecker.nextDouble();
                        hh.setWeight(weight);
                        totalPackingCost = hh.getShippingCost();
                        validation = true;
                     }//end if else
                  }//end while loop
                     
                     //END CALCULATIONS
               
                  subTotal = subTotal + currentCost;
                  collection.add(hh);
                  break;
               
               case "2":
                  electronicsCount = electronicsCount + 1; 
                  validation = false;
                  System.out.println("Electronics Appliance Brands Selection:\n1) Sony\n2) RCA\n3) SEARS\n4) TOSHIBA\n5) GE");
                  while (validation != true)
                  {
                     Scanner sc4 = new Scanner(System.in);
                     choice = sc4.next();
                     switch (choice)
                     {
                        case "1": 
                           brandName = "Sony";
                           currentCost = 32.49;
                           validation = true;
                           break;
                        case "2": 
                           brandName = "RCA";
                           currentCost = 19.35;
                           validation = true;
                           break;
                        case "3": 
                           brandName = "SEARS";
                           currentCost = 71.90;
                           validation = true;
                           break;
                        case "4": 
                           brandName = "Toshiba";
                           currentCost = 21.42;
                           validation = true;
                           break;
                        case "5": 
                           brandName = "GE";
                           currentCost = 107.96;
                           validation = true;
                           break;
                        default: 
                           System.out.println("ERROR - Incorrect input... Please try again!");
                           validation = false;
                     }//End switch
                  
                  } //End while loop  
                  ee.setBrandName(brandName);
               
                  validation = false;//reset to false
                  System.out.println("Electronic Appliance Type Selection:\n1) Refridgerator\n2) Dishwasher\n3) Coffee Maker\n4) Microwave");
                  while (validation != true)
                  {
                     Scanner sc5 = new Scanner(System.in);
                     choice = sc5.next();
                     switch (choice)
                     { 
                        case "1": 
                           electronicsType = "Refridgerator";
                           currentCost = currentCost + 54.99;
                           validation = true;
                           break;
                        case "2": 
                           electronicsType = "Dishwasher";
                           currentCost = currentCost + 134.99;
                           validation = true;
                           break;
                        case "3": 
                           electronicsType = "Coffee Maker";
                           currentCost = currentCost + 14.99;
                           validation = true;
                           break;
                        case "4": 
                           electronicsType = "Microwave";
                           currentCost = currentCost + 45.99;
                           validation = true;
                           break;
                        default: 
                           System.out.println("ERROR - Incorrect input... Please try again!");
                           validation = false;
                     }//End switch
                     
                  }//End while loop
                  ee.setElectronicsType(electronicsType);
                  validation = false; //reset to false
                  System.out.println("The following size choices are available for your " + electronicsType + "\n1) Large \n2) Medium \n3) Small");
                  while (validation != true)
                  {
                  
                     Scanner sc6 = new Scanner(System.in);
                     choice = sc6.next();
                     switch (choice)
                     {
                        case "1": 
                           size = "Large";
                           validation = true;
                           break;
                     
                        case "2": 
                           size = "Medium";
                           validation = true;
                           break;
                     
                        case "3":
                           size = "Small";
                           validation = true;
                           break;
                     
                        default:
                           System.out.println("ERROR - Incorrect input... Please try again!");
                           validation = false;
                           break;
                     
                     }//end switch
                     ee.setSize(size);
                  }//end while loop
                     
                     //END - PREPARE CALCULATIONS
               
                  subTotal = subTotal + currentCost;
                  collection.add(ee);
                  break;
               
                  
               default:   //household and electronics not picked  
                  System.out.println("ERROR - Incorrect input... Please try again!");
                  validation = false;
                  break;
                  
            } //End of entire switch
         }
            
         System.out.print("Would you like to purchase another appliance (Y/N): ");
         
         validation = false;
         secondValidation = false;
         while (secondValidation != true)
         {
            Scanner sc7 = new Scanner(System.in);
            choice = sc7.next();
            switch (choice)
            {
               case "Y": 
                  stop = true;
                  secondValidation = true;
                  break;
               case "y": 
                  stop = true;
                  secondValidation = true;
                  break;
               case "N":
                  stop = false;
                  secondValidation = true;
                  break;
               case "n":
                  stop = false;
                  secondValidation = true;
                  break;
               default:
                  System.out.println("ERROR - Incorrect input... Please try again!");
                  validation = false;
                  break;
            }//end switch
            
         } //end validation loop
      
      } while (stop != false); //end stop/continue  loop     
      
      for (Object a : collection)
      {
         if (a instanceof Household)
         {
            System.out.println(a.toString());
            Household h = (Household) a; // cast a as Household
            totalCost += h.getShippingCost();
         }
         else if (a instanceof Electronics)
         {
            System.out.println(a.toString());
            Electronics h = (Electronics) a; // cast a as Household
            totalCost += h.getShippingCost();
         }
      
      
      }
      System.out.println();
      System.out.println("Shipping Costs: $" + totalCost);
      System.out.println("Subtotal Costs: $" + subTotal);

      totalCost += subTotal;
      System.out.println("\nTotal Cost: $" + (totalCost));
   
      
      
      
      
   }//end Main
   
}//end Class
   
