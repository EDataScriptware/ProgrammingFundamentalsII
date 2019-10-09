import java.util.*;

/*
Author: Edward Riley
Date: 2/05/18
Purpose:  I must learn to understand inherited classes even further. 
Instructor: Beiter
ICE18: Polymorphism
*/

public class Building
{
   protected String address = "";
   
   
   public Building()
   {
      address = "No address given";
   }
   
   //Get address
   public String getAddress()
   {
      return address;
   }
   
   //Set address
   public void setAddress(String _address)
   {
      address = _address;
   }



}