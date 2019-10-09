import java.util.*;

/*
Author: Edward Riley
Date: 3/19/18
Purpose: I must be able to use salaried and hourly for employees. 
Instructor: Beiter
HW07: Interface
*/

public class Payroll
{  
   public static void main(String[] args)
   {
      String name = "";
      String ssn = "";
      double hour = 0;
      double pay = 0;
      String choice = "";
      boolean stop = false;
      boolean validation = false;
      boolean secondValidation = false;
      int targetEmployee = 0;
      double hourlyRatePay = 0;
      
      Hourly hourly = new Hourly();
      Salaried salaried = new Salaried();
      ArrayList collection = new ArrayList();      
            
      do
      {
         while (secondValidation != true)
         {
            System.out.println("What do you want to do?");
            System.out.println("\n1\tCreate a new employee");
            System.out.println("2\tSet Pay");
            System.out.println("3\tShow Weekly Pay");
            System.out.println("4\tShow Annual Pay");
            System.out.println("5\tShow Summary");
            System.out.println("6\tQuit");
         
            Scanner sc01 = new Scanner(System.in);
            choice = sc01.next();
            validation = false;
            
            switch (choice)
            {
            
               case "1": 
                  while (validation != true)
                  { 
                     System.out.println("What type of employee would you like to create (Salaried or Hourly): ");
                     System.out.println("\t\t**PLEASE ENTER EITHER 'salaried' or 'hourly'**");
                     Scanner sc05 = new Scanner(System.in);
                     choice = sc05.next();
                     validation = false;
                  
                  
                     switch (choice)
                     {
                        case "salaried":
                        
                           System.out.print("Please enter the name: ");
                           Scanner sc02 = new Scanner(System.in);
                           name = sc02.nextLine();
                           salaried.setName(name);
                        
                           System.out.print("Please enter the social security number: ");
                           Scanner sc03 = new Scanner(System.in);
                           ssn = sc03.nextLine();
                           salaried.setSSN(ssn);
                        
                           validation = false;
                           while (validation != true)
                           {
                              System.out.print("Please enter the annual pay: $");
                           
                              Scanner sc04 = new Scanner(System.in);
                              if (!(sc04.hasNextDouble()))
                              {
                                 System.out.println("ERROR: You have entered a literal character, please try again...");
                              }
                              else
                              {
                                 pay = sc04.nextDouble();
                                 validation = true;
                              }
                           }
                           salaried.setPay(pay);
                           collection.add(salaried);
                           System.out.println("Employee " + collection.size() + " has been created.");
                        
                           break;
                        
                        case "hourly":
                           System.out.print("Please enter the name: ");
                           Scanner sc06 = new Scanner(System.in);
                           name = sc06.nextLine();
                           hourly.setName(name);
                        
                           System.out.print("Please enter the social security number: ");
                           Scanner sc07 = new Scanner(System.in);
                           ssn = sc07.nextLine();
                           hourly.setSSN(ssn);
                        
                           validation = false;
                           while (validation != true)
                           {
                              System.out.print("Please enter the hourly rate pay: ");
                           
                              Scanner sc08 = new Scanner(System.in);
                              if (!(sc08.hasNextDouble()))
                              {
                                 System.out.println("ERROR: You have entered a literal character, please try again...");
                              }
                              else
                              {
                                 hourlyRatePay = sc08.nextDouble();
                                 if (hourlyRatePay < 0)
                                 {
                                    System.out.println("ERROR: You have entered a number below than zero, please try again...");
                                 }
                                 else
                                 {
                                    validation = true;
                                 }
                              }
                           }
                           hourly.setPay(hourlyRatePay);
                           validation = false;
                        
                           while (validation != true)
                           {
                              System.out.print("Please enter the number of hours worked per week: ");
                           
                              Scanner sc09 = new Scanner(System.in);
                              if (!(sc09.hasNextDouble()))
                              {
                                 System.out.println("ERROR: You have entered a literal character, please try again...");
                              }
                              else
                              {
                                 hour = sc09.nextDouble();
                                 if (hour < 0)
                                 {
                                    System.out.println("ERROR: You have entered a number below than zero, please try again...");
                                 }
                                 else
                                 {
                                    validation = true;
                                 }
                              }
                              hourly.setHour(hour);
                           }
                           collection.add(hourly);
                           System.out.println("Employee " + collection.size() + " has been created.");
                        
                           break;
                        default: 
                           System.out.print("ERROR: Invalid Input, please try again: ");
                           break;
                        
                        
                     
                     
                     }//END SWITCH SALARIED.VS.HOURLY
                  } //VALIDATION FALSE
               
               
                  validation = false;
                  break;
               case "2":
                  validation = false;
               
                  while (validation != true)
                  {
                     if (collection.size() >= 2)
                     {
                        System.out.print("Which employee do you wish to user (enter 1 to " + collection.size() + ")");
                        Scanner sc10 = new Scanner(System.in);
                        if (!(sc10.hasNextInt()))
                        {
                           System.out.println("ERROR: You either entered a decimal number or a literal character, please try again...");                                             
                        }
                        else
                        {
                           targetEmployee = sc10.nextInt();
                           if (targetEmployee <= 0)
                           {
                              System.out.println("ERROR: You entered a 0 or lower... Please try again.");
                           }
                           else if (targetEmployee > collection.size())
                           {
                              System.out.println("ERROR: You entered a " + collection.size() + " or higher... Please try again.");
                           }
                           else 
                           {
                              validation = true;
                           }
                        }
                     }//END COLLECTION SIZE IF
                     else
                     {
                        targetEmployee = 1;
                     }
                     if (collection.get(targetEmployee - 1) instanceof Hourly)
                     {
                        Hourly hx = (Hourly)collection.get(targetEmployee - 1);
                        System.out.print("Please enter a new pay: ");
                        Scanner sc11 = new Scanner(System.in);
                        pay = sc11.nextDouble();
                        hx.setPay(pay);
                        validation = true;
                     
                     }                     
                     else if (collection.get(targetEmployee - 1) instanceof Salaried)
                     {
                        Salaried hx = (Salaried)collection.get(targetEmployee - 1);
                        System.out.print("Please enter a new pay: ");
                        Scanner sc11 = new Scanner(System.in);
                        pay = sc11.nextDouble();
                        hx.setPay(pay);
                        validation = true;
                     
                     }
                     else
                     {
                     //do nothing
                        validation = true;
                     }
                  
                  }// END VALIDATION
               
                  break;
               case "3":
                  validation = false;
               
                  while (validation != true)
                  {
                     if (collection.size() >= 2)
                     {
                        System.out.print("Which employee do you wish to user (enter 1 to " + collection.size() + ")");
                        Scanner sc10 = new Scanner(System.in);
                        if (!(sc10.hasNextInt()))
                        {
                           System.out.println("ERROR: You either entered a decimal number or a literal character, please try again...");                                             
                        }
                        else
                        {
                           targetEmployee = sc10.nextInt();
                           if (targetEmployee <= 0)
                           {
                              System.out.println("ERROR: You entered a 0 or lower... Please try again.");
                           }
                           else if (targetEmployee > collection.size())
                           {
                              System.out.println("ERROR: You entered a " + collection.size() + " or higher... Please try again.");
                           }
                           else 
                           {
                              validation = true;
                           }
                        }
                     }//END COLLECTION SIZE IF
                     else
                     {
                        targetEmployee = 1;
                     }
                     if (collection.get(targetEmployee - 1) instanceof Hourly)
                     {
                        Hourly hx = (Hourly)collection.get(targetEmployee - 1);
                        System.out.print("Weekly Pay: $" + hx.calcAnnualPay());
                        validation = true;
                     
                     }                     
                     else if (collection.get(targetEmployee - 1) instanceof Salaried)
                     {
                        Salaried hx = (Salaried)collection.get(targetEmployee - 1);
                        System.out.print("Weekly Pay: $" + hx.calcAnnualPay());
                     
                        validation = true;
                     
                     }
                     else
                     {
                     //do nothing
                        validation = true;
                     }
                  
                  }// END VALIDATION
               
                  validation = false;
                  break;
               case "4":
                  validation = false;
               
                  while (validation != true)
                  {
                     if (collection.size() >= 2)
                     {
                        System.out.print("Which employee do you wish to user (enter 1 to " + collection.size() + ")");
                        Scanner sc10 = new Scanner(System.in);
                        if (!(sc10.hasNextInt()))
                        {
                           System.out.println("ERROR: You either entered a decimal number or a literal character, please try again...");                                             
                        }
                        else
                        {
                           targetEmployee = sc10.nextInt();
                           if (targetEmployee <= 0)
                           {
                              System.out.println("ERROR: You entered a 0 or lower... Please try again.");
                           }
                           else if (targetEmployee > collection.size())
                           {
                              System.out.println("ERROR: You entered a " + collection.size() + " or higher... Please try again.");
                           }
                           else 
                           {
                              validation = true;
                           }
                        }
                     }//END COLLECTION SIZE IF
                     else
                     {
                        targetEmployee = 1;
                     }
                     if (collection.get(targetEmployee - 1) instanceof Hourly)
                     {
                        Hourly hx = (Hourly)collection.get(targetEmployee - 1);
                        System.out.print("Annual Pay: $" + hx.calcAnnualPay());
                        validation = true;
                     
                     }                     
                     else if (collection.get(targetEmployee - 1) instanceof Salaried)
                     {
                        Salaried hx = (Salaried)collection.get(targetEmployee - 1);
                        System.out.print("Annual Pay: $" + hx.calcAnnualPay());
                     
                        validation = true;
                     
                     }
                     else
                     {
                     //do nothing
                        validation = true;
                     }
                  
                  }// END VALIDATION
               
                  validation = false;
               case "5": 
                  for (Object a : collection)
                  {
                  
                     if (a instanceof Hourly)
                     {
                        System.out.print(a.toString());
                     
                     }                     
                     else if (a instanceof Salaried)
                     {
                        System.out.print(a.toString());
                     }
                     else
                     {
                     //do nothing
                        validation = true;
                     }
                  }
               case "6":
                  System.out.println("Exitting the program...");
                  System.exit(1);
                  break;
               
            }//END SWITCH
         
         }//END VALIDATION FOR SWITCH
      
      
      
      
      } while (stop != true); // END STOP LOOP
   
   
   } //END MAIN CLASS


} //END CLASS
