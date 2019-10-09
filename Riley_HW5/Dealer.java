import java.util.*;

/*
Author: Edward Riley
Date: 2/18/18
Purpose: I must write a program to collect information about the customer's personal identification and their automobile. 
Instructor: Beiter
HW05: Automobile
*/

class Dealer
{
   public static void main(String[] args)
   {  
      Scanner sc = new Scanner(System.in);
      
      ArrayList collection = new ArrayList();
      boolean stop = false;

      do 
      {   
      String firstName = "";
      String lastName = "";
      String color = "";
      String brand = "";
      String choice = "";
      boolean validation = false;
      String typeOfCars = "";
      boolean airConditioner = false;
      boolean heatSeats = false;
      double optionalPrice = 0;
      double airConditionerPrice = 2000;
      double heatSeatsPrice = 750;
      double baseCarPrice = 0;
      double totalPrice = 0;
      
      
         System.out.print("Please enter your first name (MAX CHAR: 10): ");
         firstName = sc.next();
         if (firstName.length() > 10) 
         {
         //IF is triggered if the character goes over 10 characters. 
            firstName = firstName.substring(0, 10);
            System.out.println("Your first name has went over the given MAX CHAR (10) limit. Your first name has been shortened to... " + firstName);
         }         
      
         System.out.print("Please enter your last name (MAX CHAR: 15): ");
         lastName = sc.next();
         if (lastName.length() > 10) 
         {
         //IF is triggered if the character goes over 10 characters. 
            lastName = lastName.substring(0, 10);
            System.out.println("Your last name has went over the given MAX CHAR (15) limit. Your last name has been shortened to... " + lastName);
         } 
      //Following choices have been made out for user. 
         System.out.println("Here is the following color choices available for your car...");
         System.out.println("1) Red");
         System.out.println("2) Blue");
         System.out.println("3) Black");
         System.out.println("4) White");
         System.out.println("5) Green");
         System.out.println("6) Orange");
         System.out.println("7) Magenta");
         System.out.println("Which of the following color choices would you like to select: ");
      
         while (validation != true)
         {//Color choices - will reloop if incorrect choice has been made.
            choice = sc.next();
         
            switch (choice)
            {
               case "1": 
                  color = "Red";
                  validation = true;
               
                  break;
               case "2":
                  color = "Blue";
                  validation = true;
               
                  break;
               case "3":
                  color = "Black";
                  validation = true;
               
                  break;
               case "4": 
                  color = "White";
                  validation = true;
               
                  break;
               case "5":
                  color = "Green";
                  validation = true;
               
                  break;
               case "6":
                  color = "Orange";
                  validation = true;
               
                  break;
               case "7":
                  color = "Magenta";
                  validation = true;
               
                  break;
               default: 
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            }//Switch ends here.
         
         } //While loop ends here.
      
         validation = false; //Reset to false for later use.
         choice = "0"; //Reset to 0 for later use.
      
      //Following choices have been made out for user. 
         System.out.println("Here is the following brand choices available for your new car...");
         System.out.println("1) Hyundai");
         System.out.println("2) Ford");
         System.out.println("3) Toyota");
         System.out.println("4) Jeep");
         System.out.println("5) Lada");
         System.out.println("6) Subaru");
         System.out.println("7) Dodge");
         System.out.println("8) Chevrolet");
         System.out.println("Which of the following brand choices would you like to select: ");
      
         while (validation != true)
         {//Brand choices - will reloop if incorrect choice has been made.
            choice = sc.next();
         
            switch (choice)
            {
               case "1": 
                  brand = "Hyundai";
                  baseCarPrice = 55000;
                  validation = true;
                  break;
               
               case "2":
                  brand = "Ford";
                  baseCarPrice = 32500;
                  validation = true;
                  break;
               
               case "3":
                  brand = "Toyata";
                  baseCarPrice = 44000;
                  validation = true;
                  break;
               
               case "4": 
                  brand = "Jeep";
                  baseCarPrice = 22700;
                  validation = true;
                  break;
               
               case "5":
                  brand = "Lada";
                  baseCarPrice = 80900;
                  validation = true;
                  break;
               
               case "6":
                  brand = "Subaru";
                  baseCarPrice = 74000;
                  validation = true;
                  break;
               
               case "7":
                  brand = "Dodge";
                  baseCarPrice = 25000;
                  validation = true;
                  break;
               
               case "8":
                  brand = "Chevrolet";
                  baseCarPrice = 91200;
                  validation = true;
                  break;
               
               default: 
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            }//Switch ends here.
         
         } //While loop ends here.
      
         validation = false; //Reset to false for later use.
         choice = "0"; //Reset to 0 for later use.
      
         System.out.println("Here is the following type of car choices available...");
         System.out.println("1) Sport");
         System.out.println("2) Compact");
         System.out.println("3) Convertible");
         System.out.println("4) Luxury");
         System.out.println("5) Sedan");
         System.out.println("6) Crossover");
         System.out.println("7) Executive");
         System.out.println("Which of the following type of car would you like to select: ");
      
         while (validation != true)
         {//Type Of Car choices - will reloop if incorrect choice has been made.
            choice = sc.next();
         
            switch (choice)
            {
               case "1": 
                  typeOfCars = "Sport";
                  baseCarPrice = 40000 + baseCarPrice;
                  validation = true;
               
                  break;
               case "2":
                  typeOfCars = "Compact";
                  baseCarPrice = 25000 + baseCarPrice;
               
                  validation = true;
               
                  break;
               case "3":
                  typeOfCars = "Convertible";
                  baseCarPrice = 35000 + baseCarPrice;
               
                  validation = true;
               
                  break;
               case "4": 
                  typeOfCars = "Luxury";
                  baseCarPrice = 80000 + baseCarPrice;
               
                  validation = true;
               
                  break;
               case "5":
                  typeOfCars = "Sedan";
                  baseCarPrice = 75000 + baseCarPrice;
               
                  validation = true;
               
                  break;
               case "6":
                  typeOfCars = "Crossover";
                  baseCarPrice = 15000 + baseCarPrice;
               
                  validation = true;
               
                  break;
               case "7":
                  typeOfCars = "Executive";
                  baseCarPrice = 140000 + baseCarPrice;
               
                  validation = true;
               
                  break;
               
               default: 
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            }//Switch ends here.
         
         } //While loop ends here.
      
         validation = false; //Reset to false for later use.
         choice = "0"; //Reset to 0 for later use.
      
         System.out.print("Would you like an upgraded air conditoner: (Y/N): "); 
         while (validation != true)
         {
            choice = sc.next();
            switch (choice)
            {
               case "Y": 
                  airConditioner = true;
                  totalPrice += airConditionerPrice;
                  validation = true;
                  break;
               case "y": 
                  airConditioner = true;
                  totalPrice += airConditionerPrice;
                  validation = true;
                  break;
               case "N": 
                  airConditioner = false;
                  validation = true;
                  break;
               case "n": 
                  airConditioner = false;
                  validation = true;
                  break;
               default:
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            
            }//switch ends here
         
         }//while loop ends here
      
         validation = false; //Reset to false for later use.
         choice = "0"; //Reset to 0 for later use.
      
      
         System.out.print("Would you like a heat seat installed (Y/N): "); 
         while (validation != true)
         {
            choice = sc.next();
            switch (choice)
            {
               case "Y": 
                  heatSeats = true;
                  totalPrice += heatSeatsPrice;
                  validation = true;
                  break;
               case "y": 
                  heatSeats = true;
                  totalPrice += heatSeatsPrice;
                  validation = true;
                  break;
               case "N": 
                  heatSeats = false;
                  validation = true;
                  break;
               case "n": 
                  heatSeats = false;
                  validation = true;
                  break;
               default:
                  System.out.print("ERROR: You have selected an incorrect choice | Try Again: ");
                  validation = false; //Loop is restarted due to incorrect choice. 
                  break;
            
            }//switch ends here
         
         }//while loop ends here
       validation = false; //Reset to false for later use.
         choice = "0"; //Reset to 0 for later use.

         totalPrice += baseCarPrice;//Inserting baseCarPrice into totalPrice
         optionalPrice = heatSeatsPrice + airConditionerPrice;
         System.out.println("Your current cost for " + brand + "car without additional upgrades: $" + baseCarPrice);
      
         System.out.println("Your total cost for " + brand + "car with additional upgrades: $" + totalPrice);
      
         Automobile auto = new Automobile(firstName, lastName, color, brand, typeOfCars, airConditioner, heatSeats, baseCarPrice, optionalPrice);
         collection.add(auto);
         
         System.out.print("Do you wish to make another car order (Y/N): ");
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

         
      
      }  while (stop != false);
      
       for (Object a: collection)
       {
                   System.out.println(a.toString());
       }
       
   
   }


}
