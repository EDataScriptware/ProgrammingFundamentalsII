import java.util.Scanner;

/*
Author: Edward Riley
Date: 1/22/18
Purpose: I must write a program that turns a programming language into a dog. 
Instructor: Beiter
ICE#04: Dog Classes*/


public class Dog
{
   String MyName;
   String MyColor;
   String MyBark;
   //Private by default.
   
   public Dog()
   {
   MyName = "name";
   MyColor = "color";
   MyBark = "bark";
   }
   
   public Dog(String name, String color, String bark) //parameterized constructor
   {
   MyName = name;
   MyColor = color;
   MyBark = bark; 
   }
   
   public String toString()
   {
      return (MyName + " is " + MyColor + " and likes to " + MyBark);
   }


   public void setName (String name)
   {
      MyName = name;
   }
   
   public String getName()
   {
      return MyName;
   }
   
   
   public void setColor (String color)
   {
      MyColor = color;
   }
   
   public String getColor()
   {
   return MyColor;
   }

public void setBark (String bark)
   {
      MyBark = bark;
   }
   
   public String getBark()
   {
   return MyBark;
   }

}

