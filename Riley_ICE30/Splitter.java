import java.util.*;
import java.io.*;

/*
Author: Edward Riley
Date: 4/2/18
Purpose:  I must create a Modularization application. 
Instructor: Beiter
ICE29: Modularization
*/

public class Splitter
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      boolean validation = true;
      String line = ""; 
      StringBuffer s = new StringBuffer();
      
      File file = new File("words.txt");
      FileWriter fw = null;
      //BufferedWriter bw = null;
      
      PrintWriter pw = null;
      
      try
      {
         fw = new FileWriter(file);
         //BufferedWriter = newBuferredWriter(fw); does not work well with StringBuffer
         pw = new PrintWriter(file); //works well
         
         System.out.println("Enter words or X or quit");
         while ((line.compareTo("X") != 0) && (line.compareTo("x") != 0))
         {
            s.append(line); //appending to string s
            s.append (" "); //space between string
         //bw.writeline(line + " ")
            System.out.println("Enter words or exit: ");
            line = sc.nextLine();
         }
         pw.println(s);
      
      
      }
      catch (Exception e)
      {
         System.out.println("ERROR: " + e.toString());
      }
      
      //#5
      try
      {
         //bw.flush();
         //bw.close();
         
         pw.flush();
         pw.close();
      
      }
      catch (Exception e)
      {
         System.out.println("ERROR: " + e.toString());
      }
      
      //#6
   
      FileReader fr = null;
      Scanner pr = null;
      
      try
      {
         fr = new FileReader(file);
         pr = new PrintReader(file);
         line = "";
         while (pr.hasNextLine() )
         {
         
         //#7
            line = pr.nextLine();
         //#8
            System.out.println(line);
         //#9
            String[] tokens = line.split(" ");
         // #10
            System.out.println("Result with standard for loop: ");
            for (int i = 0; i < tokens.length; i++)
            {
               System.out.println(tokens[i]);
            }
         //#11
            System.out.println("Result with enchanced for loop: ");
            for (String s2: tokens)
            {
               System.out.println(s2);
            }
         } 
      }
      catch (Exception e)
      {
         System.out.println("ERROR: " + e.toString());
      }
      //#12
      System.out.println("Part Two");
      Strng numString = "10,20,30,40,50";
      //#13
      String[] nums = numString.split(",");    
      //#14
      int number = 0;
      int sum = 0;
      for (String n: nums)
      {
         System.out.println(n);
         //#15
         try
         {
            number = Integer.parseInt(n);
            sum += number;
         }
         catch (Exception e)
         {
            System.out.println("ERROR: " + e.toString());
         }
      }
      System.out.println("Sum of all integers: " + sum);
      
      //#16
      System.out.println("Part Three");
      String numString2 = "10,,20,,,30,40,,,,50";
      String[] nums2 = numString2.split(",");
      number = 0;
      
     
      
      
   }
}
