import java.util.Scanner;
import java.util.*;


/*
Author: Edward Riley
Date: 2/11/18
Purpose: I must write a program to perform a magic squares.
Instructor: Beiter
HW:04 - PART B - Magic Squares
*/

class TestMagicSquares
{
   public static void main(String[] args)
   {
      //INITALIZED VARS AND SETUPS
      Scanner sc = new Scanner(System.in);
      Squares sq = new Squares();
      String xChecker = "";
      int enteredNumber = 0;
      boolean validation = false;
      
       
   
      do
      {
         System.out.print("Enter an integer (X/x to exit): ");
         if(!sc.hasNextInt())
         {
            xChecker = sc.next();
         //If input = x print success
            if ((xChecker.equals("X")) || (xChecker.equals("x")))
            {
            
               validation = true;
               break;
            }
                
            // if checker equals x
            if  (!xChecker.equals("X") && !xChecker.equals("x"))
            {
               System.out.println("***    Invalid Data Entry   ***");                          
               validation = false; 
             
            
            }
           
         }
         else 
         {
         //ENTERED NUMBER IS INSERTED INTO ARRAY LIST
            enteredNumber = sc.nextInt();
            sq.add(enteredNumber);
            validation = false;
         } 
      
      
      
      }
      
      while (validation == false);
   
      
      
      //sq.add(enteredNumber);
      
      // check to make sure all the numbers are in the array list before you do the next step
      /* for (int i = 0; i < sq.numberList.size(); i++)
      {
         System.out.println("Entered Numbers: " + sq.numberList.get(i));
      }*/
      
      //STEP ONE: ENSURE IT IS A SQUARE!
      boolean squareChecker = sq.isSquare();
      
      if (squareChecker == false)
      {
         System.out.println("Step 1. Numbers do not make a square: Program Stopped!");
         System.out.println("PRESS ANY KEYS TO CONTINUE!");
         sc.nextLine();
         System.exit(0);
      
      }
      //ITS A SQUARE!
      else 
      {
         System.out.println("Step 1. Numbers make a square!");
      }
      
      //STEP TWO: ENSURE NUMBERS ARE NOT UNIQUE!
      boolean uniqueChecker = sq.isUnique();
      
      if (uniqueChecker == true)
      {
         System.out.println("Step 2. Numbers are not unique: Program Stopped!");
         System.out.println("PRESS ANY KEYS TO CONTINUE!");
         sc.nextLine();
         System.exit(0);
      
      }
      //UNIQUE!
      else 
      {
         System.out.println("Step 2. Numbers are unique!");
      }
      
      boolean magicChecker = sq.isMagic();
      //STEP THREE! DOES IT ADD TOGETHER CORRECTLY?!
      if (magicChecker = true)
      {
      System.out.println("Step 3. Numbers do not add together correctly: Program Stopped!");
         System.out.println("PRESS ANY KEYS TO CONTINUE!");
         sc.nextLine();
         System.exit(0);
      }
      else 
      {
         System.out.println("IT'S A MAGIC NUMBER!");
      }
      
      
   }
}