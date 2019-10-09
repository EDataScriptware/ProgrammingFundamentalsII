import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/22/18
Purpose: I must write a program that best calculates the DOLLAR price of an item and converted to YEN.
Instructor: Beiter
ICE#03: Monetary Value*/
public class MonetaryValue
{

   public static void main(String [] args)
   {
   
       String fullName;
       char id; 
       double price;
       double tax;
       double finalPrice;
       double total;
       
         Scanner sc = new Scanner(System.in);
   
      System.out.print("Customer Name: ");
      fullName = sc.nextLine();
      
      System.out.print("Item ID: ");
      id = sc.nextLine().charAt(0); // To retrieve only the first position otherwise corruption(?)
      
      System.out.print("What is the price of an item in $: ");
      price = sc.nextDouble();
      
      System.out.print("Sales Tax: ");
      tax = sc.nextDouble();
      
      total = price * tax / 100;
      System.out.printf("The total amount of taxes on the item is: $%.2f", total);
      System.out.println();
      
      finalPrice = total + price;
      System.out.printf("The final price of the item is: $%.2f", finalPrice);
      System.out.println();
      final long CONVERT = 555555555; //Removed a single 5 - accuracy is misleading now. 
      int yen = (int)(finalPrice  * CONVERT);
      
      System.out.println("Alice Bob ordered " + id + ", which costs Y " + yen);
      
      
   
   }
}