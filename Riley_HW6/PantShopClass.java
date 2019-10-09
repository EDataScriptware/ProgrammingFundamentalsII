import java.util.*;

/*
Author: Edward Riley
Date: 2/28/18
Purpose:  I must create a collection of arraylist for customers to be able to track their specific pant orders. 
Instructor: Beiter
HW6: Pants Shop
*/

public class PantShopClass
{
   public static void main(String args[])
   {
      //Initialized Outer Loop
      boolean stop = false;
      Scanner sc = new Scanner(System.in);
      ArrayList collection = new ArrayList();
      System.out.println("\t\tWelcome to Riley's Custom Made Pants... \n\t\tPlease follow the following instructions below...");
      do {
         Order order1 = new Order();
      
      //Initialized Inner Loop
         String ownerName = "";
         String pantsType = "";
         String pantsColor = "";
         double waistLength = 0;
         double waistHeight = 0;
         double baseCost = 0;
         boolean validation = false;
         String choice = "";
      
      
      //User inputs their full name.
         System.out.print("Enter your full name: ");
         ownerName = sc.nextLine();
         order1.setOwnerName(ownerName);
      
      //Following choices have been made out for user. 
         System.out.println("Here is the following pants type choices are available....");
         System.out.println("1) Cargo");
         System.out.println("2) Jeans");
         System.out.println("3) Sweatpants");
         System.out.println("4) Khakis");
         System.out.println("5) Drawstring");
         System.out.println("Which of the following pants type choices would you like to select: ");
         while (validation != true)
         {//Pants Type choices - will reloop if incorrect choice has been made.
            choice = sc.next();
          
            switch (choice)
            {
               case "1":
                  pantsType = "Cargo";
                  baseCost = 21.99;
                  validation = true;
                  break; 
               case "2":
                  pantsType = "Jeans";
                  baseCost = 13.49;
                  validation = true;
                  break; 
               case "3":
                  pantsType = "Sweatpants";
                  baseCost = 7.79;
                  validation = true;
                  break; 
               case "4":
                  pantsType = "Khakis";
                  baseCost = 24.99;
                  validation = true;
                  break; 
               case "5":
                  pantsType = "Drawstring";
                  baseCost = 26.99;
                  validation = true;
                  break; 
               default: 
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            }//switch ends here
            //Pants Type is stored into pantsType
            order1.setPantsType(pantsType);
            order1.setBaseCost(baseCost);
         }//while ends here
         validation = false;
      
      //Following choices have been made out for user. 
         System.out.println("Here is the following pants color choices are available....");
         System.out.println("1) Blue");
         System.out.println("2) Grey");
         System.out.println("3) Black");
         System.out.println("4) Biege");
         System.out.println("5) Tan");
         System.out.println("Which of the following pants color choices would you like to select: ");
      
         while (validation != true)
         {//Pants Type choices - will reloop if incorrect choice has been made.
            choice = sc.next();
          
            switch (choice)
            {
               case "1":
                  pantsColor = "Blue";
                  validation = true;
                  break; 
               case "2":
                  pantsColor = "Grey";
                  validation = true;
                  break; 
               case "3":
                  pantsColor = "Black";
                  validation = true;
                  break; 
               case "4":
                  pantsColor = "Biege";
                  validation = true;
                  break; 
               case "5":
                  pantsColor = "Tan";
                  validation = true;
                  break; 
               default: 
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            }//switch ends here
            //Pants Type is stored into pantsType
            order1.setPantsColor(pantsColor);
             
         }//while ends here
         validation = false;
      
         System.out.print("Please enter the waist size in inches (MIN: 5 | MAX: 45): ");
      
         while (validation != true)
         {
         
            if (!sc.hasNextDouble())
            {
               sc.next();
               System.out.print("ERROR: You have entered a literal character | Please Try Again: ");
            }
            else
            {
               waistLength = Double.parseDouble(sc.next());
            
               if (waistLength < 5)
               {
                  System.out.print("ERROR: You have entered a number below than 5 | Please Try Again: ");
               
               
               }
               else if (waistLength > 45)
               {
                  System.out.print("ERROR: You have entered a number higher than 45 | Please Try Again: ");
               
               }
               else 
               {
                  validation = true;
               }
            }//end if/else
         }//end while
         sc.nextLine();
        
         order1.setWaistLength(waistLength);
         
         validation = false; //Reset to false
      
      
         System.out.print("Please enter the inside leg size in inches (MIN: 10 | MAX: 35): ");
      
         while (validation != true)
         {
         
            if (!sc.hasNextDouble())
            {
               sc.next();
               System.out.print("ERROR: You have entered a literal character | Please Try Again: ");
            }
            else
            {
               waistHeight = Double.parseDouble(sc.next());
            
               if (waistHeight < 10)
               {
                  System.out.print("ERROR: You have entered a number below than 10 | Please Try Again: ");
               
               
               }
               else if (waistHeight > 35)
               {
                  System.out.print("ERROR: You have entered a number higher than 35 | Please Try Again: ");
               
               }
               else 
               {
                  validation = true;
               }
            }//end if
         }//end while
         sc.nextLine();
        
         order1.setWaistHeight(waistHeight);
      
         validation = false; //reset to false
      
      
      
         collection.add(order1);
         
         System.out.print("Do you wish to make another pants order (Y/N): ");
         while (validation != true)
         {
            choice = sc.next();
            switch (choice)
            {
               case "Y": 
                  stop = true;
                  validation = true;
                  break;
               case "y": 
                  stop = true;
                  validation = true;
                  break;
               case "N": 
                  stop = false;
                  validation = true;
                  break;
               case "n": 
                  stop = false;
                  validation = true;
                  break;
               default:
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            }//switch ends here
         
         }//while loop ends here           
         sc.nextLine();
      } while (stop != false);
      
      System.out.println("Owner Name\t\tPants Type\t\tPants Color\t\tWaist Size\t\tInside Leg Size\t\tCost");
      for (Object a: collection)
      {
         System.out.println(a.toString());     
      }
      
   }
}


