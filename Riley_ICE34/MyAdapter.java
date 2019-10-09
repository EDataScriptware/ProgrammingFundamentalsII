import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
Author: Edward Riley
Date: 4/13/18
Purpose:  I must create a user defined adapter and be able to utilize TextArea.
Instructor: Beiter
ICE35: User-Defined Adapter
*/

public class MyAdapter implements ActionListener
{
   public void actionPerformed(ActionEvent ae)
   {
      if (ae.getSource() == MyGUI.jb)
      {
         jtextarea2.setText(jtextarea1.getText());
      }
      
      if (ae.getSource() == MyGUI.jmi)
      {
         jtextarea2.setText("");
      }
      
      if (ae.getSource() == MyGUI.jmi2)
      {
         System.exit(0);
      }
      
   }
   
   private MyGUI gui;
   
   
   public MyAdapter(MyGUI _gui)
   {
      gui = _gui;
   }
   
   private JTextArea jtextarea1;
   private JTextArea jtextarea2;
   
   
   public MyAdapter(JTextArea jta1, JTextArea jta2)
   {
   
      jtextarea1 = jta1;
      jtextarea2 = jta2;
      
   }
}