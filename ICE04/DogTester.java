/*
Author: Edward Riley
Date: 1/22/18
Purpose: I must write a program that turns a programming language into a dog. 
Instructor: Beiter
ICE#04: Dog Classes*/

public class DogTester
{
   public static void main(String[] args)
   {
      Dog dog1 = new Dog();
      Dog dog2 = new Dog("Fifi", "yellow", "yip");
      Dog dog3 = new Dog("Loco", "black", "bark");
      
      System.out.println(dog1.toString());
      System.out.println(dog2.toString());
      System.out.println(dog3.toString());
   }

}