import java.util.*;
import java.io.*;

/*
Author: Edward Riley
Date: 3/25/18
Purpose:  I must create a list of a person and their personal information while being able to recently learned I/O and Exception. 
Instructor: Beiter
HW10: Person
*/

public class PersonTest
{

   public static void main(String[] args)
   {
   
      String firstName = "";
      String lastName = "";
      String address = "";
      String city = "";
      String state = "";
      String zipcode = "";
      boolean validation = false;
      boolean stop = false;
      String choice = "";
      
      ArrayList<Person> collection = new ArrayList<Person> ();
      do
      {
         Person person = new Person();
         
         stop = false;
         validation = false;
         while (validation != true)
         {
            System.out.print("Enter your first name: ");
            Scanner sc01 = new Scanner(System.in);
            firstName = sc01.nextLine();
            
            try 
            {
               person.setFirstName(firstName);
               validation = true; 
            }
            catch(BadValueException ee)
            {
               System.out.println(ee.getMessage());
               validation = false;
            }
         }
         validation = false; //reset to false
         while (validation != true)
         {
            System.out.print("Enter your last name: ");
            Scanner sc02 = new Scanner(System.in);
            lastName = sc02.nextLine();
            
            try 
            {
               person.setLastName(lastName);
               validation = true; 
            }
            catch(BadValueException ee)
            {
               System.out.println(ee.getMessage());
               validation = false;
            }
         }
         
         validation = false; //reset to false
         while (validation != true)
         {
            System.out.print("Enter your address: ");
            Scanner sc03 = new Scanner(System.in);
            address = sc03.nextLine();
            
            try 
            {
               person.setAddress(address);
               validation = true; 
            }
            catch(BadValueException ee)
            {
               System.out.println(ee.getMessage());
               validation = false;
            }
         }
         
         validation = false; //reset to false
         while (validation != true)
         {
            System.out.print("Enter your city: ");
            Scanner sc04 = new Scanner(System.in);
            city = sc04.nextLine();
            
            try 
            {
               person.setCity(city);
               validation = true; 
            }
            catch(BadValueException ee)
            {
               System.out.println(ee.getMessage());
               validation = false;
            }
         }
         
         validation = false; //reset to false
         while (validation != true)
         {
            System.out.print("Enter your state: ");
            Scanner sc05 = new Scanner(System.in);
            state = sc05.nextLine();
            
            try 
            {
               person.setState(state);
               validation = true; 
            }
            catch(BadValueException ee)
            {
               System.out.println(ee.getMessage());
               validation = false;
            }
         }
         
         validation = false; //reset to false
         
         while (validation != true)
         {
            System.out.print("Enter your zipcode: ");
            Scanner sc06 = new Scanner(System.in);
            if (!(sc06.hasNextInt()))
            {
               System.out.println("Error: It is not a numeral!");
               validation = false;
            }
            else
            {
               zipcode = sc06.nextLine();
               try 
               {
                  person.setZipcode(zipcode);
                  validation = true; 
               }
               catch (BadValueException ee)
               {
                  System.out.println(ee.getMessage());
                  validation = false;
               }
            }
         }
         
         collection.add(person);
         
         validation = false;
         while (validation != true)
         {
            System.out.print("Would you like to make another profile (Y/N): ");
            Scanner sc07 = new Scanner(System.in);
            choice = sc07.next();
         
         
            switch (choice)
            {
               case "Y":
                  stop = true;
                  validation = true; 
                  break;
               case "y":
                  stop = true;
                  validation = true; 
                  break;
               case "N":
                  stop = false;
                  validation = true; 
                  break;
               case "n":
                  stop = false;
                  validation = true; 
                  break;
               default: 
                  System.out.println("ERROR INPUT - PLEASE TRY AGAIN");
                  validation = false;
                  break;
            }
         }
      } while (stop == true); //stop
      
      for (Object a : collection)
      {
         System.out.println(a.toString());
      }
      
      File file = new File("list.txt");
      
   
      FileWriter fw = null;
      BufferedWriter bw = null;
      if (file.exists() )
      {
         try 
         {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
         
         }// end try
         catch (Exception e)
         {
         
            System.out.println("ERROR: " + e.toString());
         
         } // end catch
      }
      else
      {
         try
         {
            System.out.println("The file doesn't exist yet.");
         //6) Write the following to text to the file one line at a time: This is the first line of my file
         
            for (Person p1 : collection)
            {
               bw.write(p1.getFirstName() );
               bw.write(p1.getLastName() );
               bw.write(p1.getAddress() );
               bw.write(p1.getCity() );
               bw.write(p1.getState() );
               bw.write(p1.getZipcode() );
            }
           
         
            bw.flush();
            bw.close();
         }
         catch (Exception e)
         {
            System.out.println("ERROR: " + e.toString());
         }
      
      }
     
     
     
   }//END MAIN
}//END OF CLASS