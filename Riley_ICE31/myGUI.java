import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

/*
Author: Edward Riley
Date: 4/4/18
Purpose:  I must create a Graphic User Interface or known as... GUI.
Instructor: Beiter
ICE31: Introduction to GUI
*/

public class myGUI
{

   public static void main(String[] args)
   {



   JFrame jf = new JFrame("My First GUI"); //This is where you create JFrame with a task bar title.
   
   jf.setLayout(new FlowLayout());
   jf.setSize(500, 200);

   JButton myButton = new JButton("MyButton"); //This is where you create the button for it. 
   jf.add(myButton);//This is where you add the button.
   JButton MyNewButton = new JButton("MyNewButton"); //This is where you create the button for it. 
   jf.add(MyNewButton);//This is where you add the button.

   
   
   jf.setVisible(true); //Reveal what is on the frame.
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Once you press X, program shuts down. 
   
   }
   

}
