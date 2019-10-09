import java.util.Scanner;
import java.util.ArrayList;

import java.util.*;
/*
Author: Edward Riley
Date: 2/11/18
Purpose: I must write a program to perform a magic squares.
Instructor: Beiter
HW:04 - PART B - Magic Squares
*/

public class Squares
{
   Scanner sc = new Scanner(System.in);
   ArrayList<Integer> numberList = new ArrayList<Integer>();
  
     
   

   
   int first, second;
    
   public void add(int i)
   {
      numberList.add(i);
      
   }  //end of constructor
        
        
   public boolean isSquare()
   {
   
   //Here, we attempt to find the square root and determine whether number of inputs that has been given is a perfect square.   
      if (Math.sqrt(numberList.size()) != (int)(Math.sqrt(numberList.size())) ) 
      {
         return false;
      
      }
      else 
      {
         return true;
      }
   }//end of boolean is Square
   public boolean isUnique()
   {
   //  System.out.println(numberList.size() + "");
    
      int array [] = new int[numberList.size()];
      int [][] valueArray = new int[numberList.size()][numberList.size()];
      boolean matchFound = true;
      int count = numberList.size()/2;
      int limit = 0;
      for (int i = 0; i < numberList.size(); i++)
      {
         if(numberList.get(i)!=null)
         {
            array[i] = numberList.get(i);
          //  System.out.println(array[i]);
         }
      }
    
    
    
      for (int i = 0; i < numberList.size(); i++)
      {
         for (int j = 0; j < numberList.size(); j++)
         {
         
            if(limit != array.length)
            {
            
               valueArray[i][j] = array[limit];
               limit++;
               System.out.println( valueArray[i][j] + " At " + i + " " + j);
               
            }
            else
            {
            
            
            }
         
            
         }//end of for j
      
      }//end of for i
      
   //Here, I attempt to check duplication. 
      for (int row = 0; row < valueArray.length; row++)
      {
         for (int col = 0; col < valueArray[row].length; col++)
         {
            int num = valueArray[row][col];
            for (int otherCol = col + 1; otherCol < valueArray.length; otherCol++)
            {
               if (num == valueArray[row][otherCol])
               {
                  return true;
               }
            }
         
         
         
            return false;
         }
         
      
      
      }//end of ir
      
      
      
      
       
      // nothing was found in the loop therefore return false;
      return true;
   
   }//end of Is Unique
   
   
   public boolean isMagic()
   { 
      //SETTING 2D ARRAY
      int [][] valueArray = new int[numberList.size()][numberList.size()];

      double rowsSum = 0;
      double colsSum = 0;
      boolean validation = true;
            
               //Here, we add up the sums in each specific row for later to use.    
         
      for (int rows = 0; rows <= numberList.size(); rows++)
      {
         for (int cols = 0; cols < numberList.size(); cols++)
                  
         {
            rowsSum += rows;
         }
      }
         
      //Here, we add up the sums in each specific columns for later to use.
      for (int cols = 0; cols < numberList.size(); cols++)
      {
         for (int rows = 0; rows < numberList.size(); rows++)
         {
            colsSum += cols;
         }
         
      }
      //LEFT TO RIGHT DIAGONAL
      int lrTotals = 0;
      for (int col = 0; col < numberList.size(); col++)
      {
         lrTotals += valueArray[col][col];
      }
   //RIGHT TO LEFT DIAGONAL
   int rlTotals = 0;
   for (int row = 0; row < numberList.size(); row++)
    {
                   rlTotals += valueArray[row][numberList.size() - row - 1];
    }
     
     //IF THEY DO NOT MATCH TOGETHER CORRECTLY - REPORT FALSE AS IT IS NOT A MAGIC NUMBER!
      if (colsSum != rowsSum)
      {
         return false;
      }
      else if (lrTotals != rowsSum)
      {
         return false;
      }
      else if (rlTotals != rowsSum)
      {
         return false;
      }
      else if (rlTotals != lrTotals)
      {
         return false;
      }
      else if (colsSum != rlTotals)
      {
         return false;
      }
      else if (colsSum != lrTotals)
      {
           return false;
      }
      else 
      {
         return true;
      }
   }
               


}
   
   
   
   
