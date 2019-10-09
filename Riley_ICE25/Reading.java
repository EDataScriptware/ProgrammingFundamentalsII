import java.util.*;
import java.io.*;

/*
Author: Edward Riley
Date: 3/28/18
Purpose:  I must create an application to perform a reading on a file. 
Instructor: Beiter
ICE25: FILE IO - READING
*/

public class Reading
{
   public static void main(String[] args)
   {
      File f = new File("in.txt");
      FileReader inputStream = null;
   
      
      if (f.exists() == true)
      {
         try
         {
            FileReader fr = new FileReader(f);
            
            int i = 0;
            String newString = "";
         
            while (i != -1)
            {
               newString += (char) i;
            
               System.out.print((char) i);
               i = fr.read();
            
            } 
         }
         catch (IOException ioe)
         {
            System.out.println("ERROR CODE: " + ioe.toString());
         }
         catch (NullPointerException npe)
         {
            System.out.println("ERROR CODE: " + npe.toString());
         }
         
      }
      else
      {
         System.out.println("DOES NOT EXIST");
      }
   
   
   
   
   }
}