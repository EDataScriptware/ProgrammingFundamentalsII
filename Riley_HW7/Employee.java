import java.util.*;

/*
Author: Edward Riley
Date: 3/19/18
Purpose: I must be able to use salaried and hourly for employees. 
Instructor: Beiter
HW07: Interface
*/

public interface Employee
{
   final String COMPANY_NAME = "Super Employer Inc.";
   final String COMPANY_ADDRESS = "Rochester, NY";
   final int NUMBER_OF_WEEKS_PAID = 52;
   
   //Setters
   public void setPay (double _pay);
   
   //Methods
   public double calcAnnualPay();
   public double calcWeeklyPay();
   
}