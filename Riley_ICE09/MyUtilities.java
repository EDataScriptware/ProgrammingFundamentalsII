import java.util.Scanner;

/*
Author: Edward Riley
Date: 2/05/18
Purpose: I must write a program to practice my String and Math utilities.
Instructor: Beiter
ICE:09 - PART A -  Utilities*/

class MyUtilities
{

   public String swap(String _fullName)
   {
   
      String swappedName = "";   
      int spacePos = _fullName.indexOf(" ");
      String firstName = _fullName.substring(0, spacePos);
      String lastName = _fullName.substring(spacePos + 1);
   
      swappedName = lastName + ", " + firstName;
      return swappedName;
   }
   
   public String reverse(String _input)
   {
      String reverseString = "";
      for (int i = _input.length() - 1; i >= 0; i--)
      {
         reverseString += _input.charAt(i);
      }
      return reverseString; 
   }
   public boolean anagram(String _input)
   {
      String _reverse = reverse(_input);
      if (_reverse.compareToIgnoreCase(_input) == 0)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
   public double randomize(int _min, int _max)
   {
      double r = Math.random();
      int range =  _min - _max;
      int nbr = (int)(Math.round(range * r));
      return (_min + nbr);
   
   }


}