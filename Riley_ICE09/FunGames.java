import java.util.Scanner;

/*
Author: Edward Riley
Date: 2/05/18
Purpose: I must write a program to practice my String and Math utilities.
Instructor: Beiter
ICE:09 - PART A - Utilities*/

class FunGames
{

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      MyUtilities util = new MyUtilities();
      String userInputString = "";
   
      do 
      {
         
      
         System.out.println("Please type in one of the following letters: ");
         System.out.println("    a - to swap names");
         System.out.println("    b - to reverse letters");
         System.out.println("    c - to check anagram");
         System.out.println("    d - to randomize numbers");
         System.out.println("    x - to exit program");
         System.out.print("Enter choice: ");
         userInputString = sc.nextLine();
         if (userInputString.compareTo("a") == 0)
         {
         
            System.out.println("Enter your first and last name: ");
            String name = sc.nextLine();
            System.out.println(util.swap(name));
         
         }
         else if (userInputString.compareTo("b") == 0)
         {
            System.out.println("Reverse the following: ");
            String rev = sc.nextLine();
            System.out.println(util.reverse(rev));    
         }
         else if (userInputString.compareTo("b") == 0)
         {
            System.out.println("Reverse the following: ");
            String rev = sc.nextLine();
            System.out.println(util.reverse(rev));    
         }
         else if (userInputString.compareTo("c") == 0)
         {
            System.out.println("Check the following anagrams: ");
            String ana = sc.nextLine();
            System.out.println(util.anagram(ana));    
         }      
         else if (userInputString.compareTo("d") == 0)
         {
            System.out.print("Minimum: ");
            int min = sc.nextInt();
            System.out.println();
            System.out.print("Maximum: ");
            int max = sc.nextInt();
            sc.nextLine();
            System.out.println(util.randomize(min, max));    

         }            } while (userInputString.compareTo("x")!= 0);
   
   
   }
}