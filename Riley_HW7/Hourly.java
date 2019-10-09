import java.util.*;

/*
Author: Edward Riley
Date: 3/19/18
Purpose: I must be able to use salaried and hourly for employees. 
Instructor: Beiter
HW07: Interface
*/

public class Hourly implements Employee
{  
   final double REGULAR_HOUR = 40;
   final double OVERTIME_RATE = 1.5;
   String name = "";
   String ssn = "";
   double hour = 0;
   double pay = 0;
  
   public Hourly()
   {
    name = "No Name";
    ssn = "000-00-0000";
    hour = 0;
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
   public double getHour()
   {
      return hour;
   }
    
   //Setters
   public void setPay(double _pay)
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
   public void setHour(double _hour)
   {
      hour = _hour;
   }
   
   
   
   public double calcAnnualPay()
   {
      double annualPay = calcWeeklyPay() * NUMBER_OF_WEEKS_PAID;
      return (annualPay);
   }
   public double calcWeeklyPay()
   {
      double weeklyPay = 0;
      if (hour <= REGULAR_HOUR)
      {
         weeklyPay = (hour * REGULAR_HOUR);
      }   
      else
      {
         weeklyPay = (hour * REGULAR_HOUR) + ((hour - REGULAR_HOUR) * REGULAR_HOUR * OVERTIME_RATE);
      }
      return (weeklyPay);
   }
   
   
   
   public String toString()
   {
      return String.format("\t\tHourly \nName: " + name + "\nSSN: " + ssn + "\nHours:" + hour + " hours" + "\nCurrent Pay: $" + pay + "\nAnnual Pay: $" + calcAnnualPay() + "\nWeekly Pay: $" + calcWeeklyPay());
   }
   
}