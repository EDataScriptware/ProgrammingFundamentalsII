import java.util.*;

/*
Author: Edward Riley
Date: 2/18/18
Purpose: I must write a program to collect information about the customer's personal identification and their automobile. 
Instructor: Beiter
HW05: Automobile
*/

public class Automobile
{
   //Color and basePrices have been initialized.
   String firstName = "";
   String lastName = "";
   String color = "";
   String brand = "";
   String typeOfCar = "";
   boolean airConditoner = false;
   boolean heatSeats = false;
   double basePrice = 0;
   double optionalPrice = 0;
   String fullName = "";
   
   
   
   //Constructors added for ListArray
   public Automobile(String firstName, String lastName, String color, String brand, String typeOfCar, boolean airConditoner, boolean heatSeats, double basePrice, double optionalPrice)
   {
      setFirstName(firstName);
      setLastName(lastName);
      setColor(color);
      setBrand(brand);
      setTypeOfCar(typeOfCar);
      setAirConditioner(airConditoner);
      setHeatSeats(heatSeats);
      setBasePrice(basePrice);  
      setOptionalPrice(optionalPrice);  
   }
   
   
      //Constructors added for get
   public boolean getAirConditioner()
   {
      return airConditoner;
   }
   public boolean getHeatSeats()
   {
      return heatSeats;
   }

   public String getLastName()
   {
      return lastName;
   }
   public String getBrand()
   {
      return brand;
   }
   public String getTypeOfCar()
   {
      return typeOfCar;
   }

   public String getFirstName()
   {
      return firstName;
   }
   
   
   public String getColor()
   {
      return color;
   }
   
   public double getBasePrice()
   {
      return basePrice;
   }
   public double getOptionalPrice()
   {
      return optionalPrice;
   }
    //Constructors added for get
   public void setFirstName(String _firstName)
   {
      firstName = _firstName;
   }
   public void setLastName(String _lastName)
   {
      lastName = _lastName;
   }
   public void setColor(String _color)
   {
      color = _color;
   }
   public void setBrand(String _brand)
   {
      brand = _brand;
   }
   public void setTypeOfCar(String _typeOfCar)
   {
      typeOfCar = _typeOfCar;
   }
   public void setAirConditioner(boolean _airConditoner)
   {
      airConditoner = _airConditoner;
   }
   public void setHeatSeats(boolean _heatSeats)
   {
      heatSeats = _heatSeats;
   }
   public void setBasePrice(double _basePrice)
   {
      basePrice = _basePrice;
   }
   public void setOptionalPrice(double _optionalPrice)
   {
      optionalPrice = _optionalPrice;
   }
   
   
   public String toString()
   {   
      String heatSeatsString = "";
      String airConditionerString = "";
      
      if (heatSeats != true)
      {
         heatSeatsString = "No";
      }
      else 
      {
          heatSeatsString = "Yes";
      }
     if (airConditoner != true)
      {
         airConditionerString = "No";
      }
      else 
      {
          airConditionerString = "Yes";
      }
   
         return String.format("Customer's Name: " + firstName + " " + lastName + " || Color: " + color + " || Brand: " + brand + " || Type of Car: " + typeOfCar + "|| Air Conditioner: " + airConditionerString +  "|| Heat Seats: " + heatSeatsString + " || Base Price: $" + basePrice + "|| Optional Price: $" + optionalPrice);
   }




}