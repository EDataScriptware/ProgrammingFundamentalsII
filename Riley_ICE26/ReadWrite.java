import java.util.*;
import java.io.*;

/*
Author: Edward Riley
Date: 3/25/18
Purpose:  I must create an application to how to write a textfile through programming.
Instructor: Beiter
ICE26: FILE IO - WRITING
*/

public class ReadWrite
{
   public static void main(String[] args)
   {
   
      FileWriter fw = null;
   
      try
      {
         fw = new FileWriter("out.txt");
      
      }
      catch(IOException ioe)
      {
         System.out.println("Error Opening File: " + ioe.toString());
      }
   
   
   
      String s = "This is the first file I am writing";
      
      try
      {
      /*
         fw.write(s);
         s = "This is line number two";
         fw.write("\n");
         fw.write(s);
      
         fw.flush();
         
         for (int i = 1; i <= 25; i++)
         {
         fw.write("\nThis is line number " + i);
         }
         fw.flush();*/
         
         fw.write("   1527  ");
         fw.flush();
      }
      catch (IOException ioe)
      {
         System.out.println("Error Writing File: " + ioe.toString());
      }
      
      
      try
      {
         fw.close();
      }
      catch (IOException ioe)
      {
         System.out.println("Error Closing File: " + ioe.toString());
      }
      
      FileReader fr = null;
      try
      {
         fr = new FileReader("out.txt");
      }
      catch (IOException ioe)
      {
         System.out.println("Error Reading File: " + ioe.toString());
      }
      
      int i = -1;
      try
      {
         String newString = "";
         i = fr.read();
         
         while (i != -1)
         {
            newString += (char) i;
            
            System.out.print((char) i);
            i = fr.read();
            
         
            
         } 
         System.out.print("New String is: " + newString);
         
         newString = newString.trim();
         System.out.println("Trimmed String is: " + newString);
         
         int convertedNumber = Integer.parseInt(newString);
         System.out.println("Sum: " + (convertedNumber + 450));
         
      }
      catch (IOException ioe)
      {
         System.out.println("Error Reading File: " + ioe.toString());
      }
   
   }


}
