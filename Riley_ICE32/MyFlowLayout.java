import javax.swing.*;
import java.awt.*;

/*
Author: Edward Riley
Date: 4/8/18
Purpose:  I must create a series of different layout applications 
Instructor: Beiter
ICE32: Layout Managers
*/

public class MyFlowLayout
{

   public static void main (String [] args)
   {
   
      JFrame jf = new JFrame("My FlowLayout Manager");
      
      jf.setLayout(new FlowLayout()); 
      
      jf.setSize(75, 200);
      JLabel jl = new JLabel("Enter text");
      
      jf.add(jl);
      
      JTextField jtf = new JTextField(5);
      
      jf.add(jtf);
      
      JButton jb = new JButton("OK");
      
      jf.add(jb);
      
      jf.setVisible(true); 
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
   
      
   
   
   }



}