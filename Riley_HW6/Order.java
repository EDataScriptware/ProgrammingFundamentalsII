import java.util.*;

/*
Author: Edward Riley
Date: 2/28/18
Purpose:  I must create a collection of arraylist for customers to be able to track their specific pant orders. 
Instructor: Beiter
HW6: Pants Shop
*/

public class Order
{
   //Initializes Variables
   String ownerName = "";
   String pantsType = "";
   String pantsColor = "";
   double waistLength = 0;
   double waistHeight = 0;
   double baseCost = 0;
   
   //Initialized Constructor
   public Order()
   {
      ownerName = "No Owner Name";
      pantsType = "No Pants Type";
      baseCost = 0;
      pantsColor = "No Pants Color";
      waistLength = 0;
      waistHeight = 0;
   }
   
      
   //Initializes Get
   public String getOwnerName()
   {
      return ownerName;
   }
   
   public String getPantsType()
   {
      return pantsType;
   }
   
   public String getPantsColor()
   {
      return pantsColor;
   }   
   
   public double getWaistLength()
   {
      return waistLength;
   } 
   
   public double getWaistHeight()
   {
      return waistHeight;
   } 
   public double getBaseCost()
   {
      return baseCost;
   }
   
   //Initializes Set
   public void setOwnerName(String _ownerName)
   {
      ownerName = _ownerName;
   }
   
   public void setPantsType(String _pantsType)
   {
      pantsType = _pantsType;
   }
   
   public void setPantsColor(String _pantsColor)
   {
      pantsColor = _pantsColor;
   }
   
   public void setWaistLength(double _waistLength)
   {
      waistLength = _waistLength;
   }
   public void setWaistHeight(Double _waistHeight)
   {
      waistHeight = _waistHeight;
   }
   public void setBaseCost(double _baseCost)
   {
      baseCost = _baseCost;
   } 
   
   public String toString()
   {
     return String.format(ownerName + "\t\t " + getPantsType() + "\t\t " + getPantsColor() + "\t\t " + getWaistLength() + "\t\t\t\t " + getWaistHeight() + "\t\t\t $" + getBaseCost() );
   }
   
}