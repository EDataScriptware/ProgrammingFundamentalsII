import javax.swing.*;
import java.awt.*;

/*
Author: Edward Riley
Date: 4/8/18
Purpose:  I must create a series of different layout applications 
Instructor: Beiter
ICE32: Layout Managers
*/


public class MyBorderLayout
{

   public static void main (String [] args)
   {
   
      
      
      JFrame jf = new JFrame("My FlowLayout Manager");
      
      jf.setLayout(new BorderLayout(2, 2));
      
      jf.setSize(400, 200);
      JLabel jl = new JLabel("Enter text");
      
      jf.add(jl, BorderLayout.EAST);
      
      JTextField jtf = new JTextField(5);
      
      jf.add( jtf, BorderLayout.WEST);
      
      JButton jb = new JButton("OK");
      
      jf.add(jb, BorderLayout.SOUTH);
      
      jf.pack();
      
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
   
      
   
   
   }



}