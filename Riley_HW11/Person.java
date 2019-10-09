import java.util.*;

/*
Author: Edward Riley
Date: 3/25/18
Purpose:  I must create a list of a person and their personal information while being able to recently learned I/O and Exception. 
Instructor: Beiter
HW10: Person
*/

public class Person 
{
   String firstName = "";
   String lastName = "";
   String address = "";
   String city = "";
   String state = "";
   String zipcode = "";
   
   //Initialized Constructor
   public Person()
   {
      firstName = "No First Name Entered";
      lastName = "No Last Name Entered";
      address = "No Address Entered";
      city = "No City Entered";
      state = "No State Entered";
      zipcode = "No Zipcode Entered";
   }
   
   //Getters
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return lastName;
   }
   public String getAddress()
   {
      return address;
   }
   public String getCity()
   {
      return city;
   }
   public String getState()
   {
      return state;
   }
   public String getZipcode()
   {
      return zipcode;
   }
   
   //Setters
   public void setFirstName(String _firstName) throws BadValueException
   {
      if (_firstName.length() > 10)
      {
         throw new BadValueException("First name is too long");
      }
      else
      {
         firstName = _firstName;
      }
   }
   
   public void setLastName(String _lastName) throws BadValueException
   {
      if (_lastName.length() > 15)
      {
         throw new BadValueException("Last name is too long");
      }
      else
      {
         lastName = _lastName;
      }
   
   }
   public void setAddress(String _address) throws BadValueException
   {
      if (_address.length() > 60)
      {
         throw new BadValueException("Address is too long");
      }
      else
      {
         address = _address;
      }
   }
   public void setCity(String _city) throws BadValueException
   {
      if (_city.length() > 20)
      {
         throw new BadValueException("City is too long");
      }
      else
      {
         city = _city;
      }  
   }
   public void setState(String _state) throws BadValueException
   {
      if (_state.length() > 100)
      {
         throw new BadValueException("State is too long");
      }
      else
      {
         state = _state;
      }   
   }
   public void setZipcode(String _zipcode) throws BadValueException
   {
      if (_zipcode.length() == 6)
      {
         throw new BadValueException("Zipcode is not exactly 5");
      }
      else
      {
         zipcode = _zipcode;
      }    
   }

   public String toString()
   {
      return String.format("\nProfile: \nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nAddress: " + getAddress() + "\nCity: " + getCity() + "\nState: " + getState() + "\nZipcode: " + zipcode);
   }
   
}