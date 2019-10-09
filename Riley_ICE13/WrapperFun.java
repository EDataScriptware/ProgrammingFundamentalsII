import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/29/18
Purpose: I must comprehend how to use wrapper classes and command line arguments.
Instructor: Beiter
ICE#14: Wrapper Fun*/

class WrapperFun
{
   public static void main(String[] args)
   {
      System.out.println("Size of args array: " + args.length);
      
      if (args.length == 0)
      {
         System.out.println("No command line arguments entered.");
      }
      else
      {
      
         /*int first = Integer.parseInt(args[0]);
         int second = Integer.parseInt(args[1]);*/     
             System.out.println( args.length + " command-line arguments were entered");
         int intTotal = 0;
         int doubleTotal = 0;

            for (int i = 0; i < args.length; i++)
            {
               
               if (args[i].indexOf(".") >= 0)
               {
               
               /*System.out.println("Argument " + i +  " is " + (args[i]) );*/
                doubleTotal += Double.parseDouble(args[i]);
                }
                else
                {
                intTotal += Integer.parseInt(args[i]);

                
                }

               
            }
            System.out.println("Sum Total of Integer: " + intTotal);
            System.out.println("Sum Total of Double: " + doubleTotal);
        /* System.out.println("Total: " + (first + second));
         System.out.println("Product: " + first * second);*/
      
      }
   /*     
      double average = 3.5;
      int a = 5;
      int b = 6;
      
      System.out.println("Average: " + average);
      
      System.out.println("Hello" + a + b);
      System.out.println(a + b + "Hello" );
      System.out.println("Hello" + ((a + b)));
   
   */   
   
   }
}