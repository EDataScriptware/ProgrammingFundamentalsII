import java.util.*;

/*
Author: Edward Riley
Date: 3/19/18
Purpose: I must be able to use salaried and hourly for employees. 
Instructor: Beiter
HW07: Interface
*/

public class Salaried implements Employee
{
   final double HEALTH_INSURANCE_DEDUCTION = 125.50;
   String name = "";
   String ssn = ""; //Social Security Number
   double pay = 0;
   
   public Salaried()
   {
      name = "No Name";
      ssn = "000-00-0000";
      pay = 0;
   
   }

   //Getters
   public String getName()
   {
      return name;
   }
   public String getSSN()
   {
      return ssn;
   }
   
   public double getPay()
   {
      return pay;
   }
   
   
   //Setters
   public void setPay (double _pay)
   {
      pay = _pay;
   }
   public void setName(String _name)
   {
      name = _name;
   }
   public void setSSN(String _ssn)
   {
      ssn = _ssn;
   }
   
   
   
   public double calcAnnualPay()
   {
      double annualPay = pay - (NUMBER_OF_WEEKS_PAID * HEALTH_INSURANCE_DEDUCTION);
      return (annualPay);
   }
   
   
   public double calcWeeklyPay()
   {
      double weeklyPay = (pay / NUMBER_OF_WEEKS_PAID) - HEALTH_INSURANCE_DEDUCTION;
      return (weeklyPay);
   }
   
   public String toString()
   {
      return String.format("\t\tSalaried \nName: " + name + "\nSSN: " + ssn + "\nCurrent Pay: $" + pay + "\nAnnual Pay: $" + calcAnnualPay() + "\nWeekly Pay: $" + calcWeeklyPay());
   }
   

}
