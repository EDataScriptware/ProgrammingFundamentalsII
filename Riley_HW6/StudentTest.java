import java.util.*;

/*
Author: Edward Riley
Date: 3/01/18
Purpose:  I must create a record of students in college years varying on their undergraduate/graduate degrees. 
Instructor: Beiter
HW6: Students
*/


public class StudentTest
{
   public static void main(String args[])
   {
   
      String name = "";
      String id = "";
      int numCredits = 0;
      int yearLevel = 0;
      String researchArea = "";
      boolean firstValidation = false;
      boolean secondValidation = false;
      boolean stop = false;
      String choice = "";
      String trash = "";
   
   //INITIALIZED OBJECTS
   
      ArrayList collection = new ArrayList();
   
   Scanner sc = new Scanner(System.in);
   
      System.out.println("What type of student do you wish to enter?\n\t1. Undergrad\n\t2. Graduate\n\t3. Done");
      choice = sc.nextLine();
       
      do
      {      
         
         
      
      
         Grad grad = new Grad();
         Undergrad ungrad = new Undergrad();
         switch (choice)
         {
            case "1": 
               Scanner firstEnter = new Scanner(System.in);
               System.out.print("Student Name: ");
               name = firstEnter.nextLine();
               ungrad.setName(name);
            
               System.out.print("Student id: ");
               id = firstEnter.next();
               ungrad.setId(id);
            
               System.out.print("Number of Credits: ");
               secondValidation = false;
            //Integer Tester
               while (secondValidation != true)
               {
                  if (!firstEnter.hasNextInt())
                  {
                     firstEnter.next();
                     System.out.print("Invalid data - Please re-enter # credits: ");
                  }
                  else
                  {
                     numCredits = Integer.parseInt(firstEnter.next());
                     secondValidation = true;
                     ungrad.setNumCredits(numCredits);
                  }
               }//End while
            
               secondValidation = false; //resets back to false
            
               System.out.print("Level: ");
               secondValidation = false;
            //Integer Tester
               while (secondValidation != true)
               {
                  if (!firstEnter.hasNextInt())
                  {
                     firstEnter.next();
                     System.out.print("Invalid data - Please re-enter year level: ");
                  }
                  else
                  {
                     yearLevel = Integer.parseInt(firstEnter.next());
                     if (yearLevel <= 0)
                     {
                        System.out.print("Invalid data: Number cannot be below or equal to zero - Please re-enter year level:  ");
                     }
                     else if (yearLevel >= 5)
                     {
                        System.out.print("Invalid data: Number cannot be below or equal to zero - Please re-enter year level:  ");
                     }
                     else
                     {
                     
                        secondValidation = true;
                        ungrad.setYearLevel(yearLevel);
                     }
                  }
               }//End while
            
               collection.add(ungrad);
               secondValidation = false; //resets back to false
            
               firstValidation = true;
               break;//End Undergrad
            
            case "2":
               Scanner secondEnter = new Scanner(System.in);
               
               System.out.print("Student Name: ");
               name = secondEnter.nextLine();
               grad.setName(name);
            
               System.out.print("Student id: ");
               id = secondEnter.nextLine();
               grad.setId(id);
            
               System.out.print("Number of Credits: ");
               secondValidation = false;
            //Integer Tester
               while (secondValidation != true)
               {
                  if (!secondEnter.hasNextInt())
                  {
                     secondEnter.next();
                     System.out.print("Invalid data - Please re-enter # credits: ");
                  }
                  else
                  {
                     numCredits = Integer.parseInt(secondEnter.next());
                     secondValidation = true;
                     grad.setNumCredits(numCredits);
                  }
               }//End while
            
               System.out.print("Research Area: ");
               researchArea = secondEnter.next();
               grad.setResearchArea(researchArea);
                                          
               collection.add(grad);
               secondValidation = false; //resets back to false
            
               firstValidation = true;
               break;//End grad
            case "3":
               for (Object a : collection)
               {
                  if (a instanceof Undergrad)
                  {
                     System.out.println(a.toString());
                  }
                  else if (a instanceof Grad)
                  {
                     System.out.println(a.toString());
                  
                  }
                  else 
                  {
                     System.out.println("Unknown object type...");
                     collection.remove(0); 
                  }
               }
            
            
               System.exit(0);
               break;
            
            default: 
               System.out.println("Invalid input - Please re-enter");
               break;
         
         
         }//End Switch
      
         System.out.println("What type of student do you wish to enter?\n\t1. Undergrad\n\t2. Graduate\n\t3. Done");
         choice = sc.next();
         
         
      }
      
      while (stop != true); //It'll never end
   
   
   
   }


}