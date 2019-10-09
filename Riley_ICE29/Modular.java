import java.util.*;
import java.io.*;

/*
Author: Edward Riley
Date: 4/2/18
Purpose:  I must create a Modularization application. 
Instructor: Beiter
ICE30: Modularization
*/

public class Modular
{
   static Table table = new Table();
   static ArrayList<Table> orderList = new ArrayList<Table>();

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
   
      Modular order = new Modular();
   
      while (order.askForMoreTables(sc) )
      {
         int opt = 0;
         while (opt != 3)
         {
            try   
            {
               opt = order.getAttributeOption(sc);
               switch (opt)
               {
                  case 1: order.changeColor(sc); 
                     break;
                  case 2: order.changeNumLegs(sc);
                     break;
                  case 3: orderList.add(table);
                     table = new Table();
                     break;
                  default: System.out.println("ERROR: Please select the correct choice.");
               }
            
            }
            catch (Exception e)
            {
               System.out.println("ERROR: Invalid option entered - failed to execute: " + e.toString() + "\n");
               order.displayAllTables();
               System.exit(0);
            }
         
         }
      }
      order.displayAllTables();
   }
   
   private boolean askForMoreTables(Scanner sc)
   {
      try
      {
         System.out.print("Would you like to order a new table (y or n): ");
         String input = sc.nextLine();
      
         if ((input.charAt(0)== "y") || (input.charAt(0)== "n"))
         {
            return true;
         }
         else 
         {
            return false; //fail input
         }
      }
      catch (Exception e)
      {
         return false;
      }
   }
   
   private void changeColor(Scanner sc)
   {
      int color = 0;
      try
      {
         while (!(table.setTableColor(color)))
         {
            System.out.print("\n1. Brown\n2. Black\n3. White\nEnter a color between 1-3: ");
            color = sc.nextInt();
         }
      
      
      }
      catch (Exception e)
      {
         System.out.println("ERROR: Invalid input: " + e.toString());
         System.exit(0);
      }     
   }
   private void changeNumLegs(Scanner sc)
   {
      int numLegs = 0;
      try
      {
         while (!(table.setNumLegs(numLegs)))
         {
            System.out.println("1. 3 Legged Table\n2. 4 Legged Table");
            System.out.print("Enter option 1 or 2: ");
            numLegs = sc.nextLine();
         }
      }
      catch (Exception e)
      {
         System.out.println("ERROR: Invalid input: " + e.toString());
         System.exit(0);
      }
   }
   private int getAttributeOption(Scanner sc)
   {
      int option = 0;
      try
      {
         do
         {
            System.out.println("1. Set table color\n2. Set number of legs\n3. Add table to order");
            System.out.print("Enter 1, 2, or 3: ");
            option = sc.nextLine();
         } while ((option < 1) || (option > 3));
      }
      catch (Exception e)
      {
         System.out.println("ERROR: Invalid input: " + e.toString());
         System.exit(0);
      }
      return option;
      
      
   }
   
   private void displayAllTables()
   {
      for (Table t: orderList)
      {
      System.out.println(t.getTableColorValue() + " table with " + t.getNumLegsValue() + " legs.");
      }
   
   }
   
      
      
}
   
   
   
