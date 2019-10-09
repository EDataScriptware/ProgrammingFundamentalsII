import java.util.Scanner;

/*
Author: Edward Riley
Date: 2/04/18
Purpose: I must write a program to figure out bills for Vinny VanGo's company.
Instructor: Beiter
HW:03 Tattoo*/

class TestTattoo
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Tattoo tat = new Tattoo();
   
      boolean validation = false;
      double width = 0;
      double height = 0;
      double size = 0;
      String colorChoice = "";
      String designChoice = "";
      double designCharge = 0;
      double designHour = 0;
      double colorChg = 0;
      double totalCost = 0;
      double embossChg = 0;
      
   
      System.out.println("Skin Deep Tattoo");
      System.out.println("               Standard Design Charge                      $20.00");
      System.out.println("               Custom Design Charge                        $45.00/hour");
      System.out.println("               Emboss Charge                               $15.00/sq inch of design");
      System.out.println("               Coloring changes: ");
      System.out.println("                         One color:                        $12.00");
      System.out.println("                         Two color:                        $18.00");
      System.out.println("                         Each additonal color:             $7.50");
      System.out.println();
   
      System.out.print("Enter width of design (must be 1.0 - 50.0 inches): ");
      //width = sc.nextDouble();
   
      while (validation == false)
      {
         if ((!sc.hasNextDouble() ))
         {
            System.out.println("ERROR: EXITING PROGRAM");
            System.exit(5000);
         
         }
         else 
         {
            width = sc.nextDouble(); // we know it is a double now because it passed the previous condition
            validation = tat.validDimension(width);
            if (validation == false)
            {            System.out.println("ERROR: EXITING PROGRAM");
               System.exit(5000);
            
            }
            else 
            {
               validation = true;
            }
         }
         System.out.print("Enter height of design (must be 1.0 - 50.0 inches): ");
         
         height = sc.nextDouble();
      
         while (validation == false)
         {
            if ((!sc.hasNextDouble() ))
            {
               System.out.println("ERROR: EXITING PROGRAM");
               System.exit(5000);
            
            }
            else 
            {
               height = sc.nextDouble(); // we know it is a double now because it passed the previous condition
               validation = tat.validDimension(height);
               if (validation == false)
               {            System.out.println("ERROR: EXITING PROGRAM");
                  System.exit(5000);
               
               }
               else 
               {
                  validation = true;
               }
            }  
         }
         size = tat.calcSize(width, height);
         embossChg = tat.calcEmbossChg(size);
      
      
         sc.nextLine();
         System.out.print("Enter a number of colors in design (must be 1 - 8): ");
         colorChoice = sc.nextLine();
         colorChg = tat.calcColorChg(colorChoice);
         if (colorChg == -1)
         {
            System.exit(0);
         }
         System.out.print("Enter choice for design: (Stock S/s or Custom C/c): ");
         designChoice = sc.nextLine();
         switch (designChoice)
         {
            case "S": 
               designCharge = tat.calcStockChg();
               break;
         
            case "s":
               designCharge = tat.calcStockChg();
               break;
         
            case "C":
               System.out.print("Enter number of hours of design time: ");
               designHour = sc.nextDouble();
               designCharge = tat.calcCustomChg(designHour);
            
               break;
         
            case "c":
               System.out.print("Enter number of hours of design time: ");
               designHour = sc.nextDouble();
               designCharge = tat.calcCustomChg(designHour);
               break;
         }
         totalCost = tat.calcTotal(colorChg, embossChg, designCharge);
         System.out.println();
         
         System.out.println("Your color charge will cost $" + colorChg);
         System.out.println("Your emboss charge will cost $" + embossChg);
         System.out.println("Your design charge will cost $" + designCharge);

         
         
         System.out.println("Your tattoo will cost $" + totalCost);
      }
   }
}
