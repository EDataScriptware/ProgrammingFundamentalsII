import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/24/18
Purpose: I must write a program balances monthly rents.
Instructor: Beiter
ICE#6: Apartment*/

class TestApartment
{
   public static void main(String[] args)
   {
      double rentEntry;
      Scanner sc = new Scanner(System.in);
      
      Apartment apartment = new Apartment();
      System.out.println("Original Value: $" + apartment.getMonthlyRent());
      System.out.println("Inputted Value: $-9999.00");
      apartment.setMonthlyRent(-9999.00);
      boolean validRent = apartment.setMonthlyRent(-9999.00);
      if (!validRent)
      {
         System.out.println("Inputted data is invalid, no change to rent");
      }
      /*-9999.00 is inputed and we receive value*/
      System.out.println(apartment.streetAddress);
      apartment.setMonthlyRent(apartment.monthlyRent);
   
      /*We fetch the street address.*/
   
      System.out.print("Please enter monthly rent: ");
      rentEntry = sc.nextDouble();
      apartment.setMonthlyRent(rentEntry);
   } /*User's data is inputted and we receive value*/

}