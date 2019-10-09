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


public class MyGUI extends JFrame
{
   public static JButton jb;
   public static JMenuItem jmi;
   public static JMenuItem jmi2;
   JTextArea jta1;
   JTextArea jta2;
   
   public MyGUI()
   {
      JFrame jf = new JFrame("My GUI");
      
      jf.setSize(800, 400);
      jf.setLayout(new BorderLayout());
      
      jb = new JButton("Get");
      jf.add(jb,BorderLayout.SOUTH);
      
      jta1 = new JTextArea("Enter text: ", 10, 30);
      jf.add(jta1,BorderLayout.WEST);

      jta2 = new JTextArea("Enter more text: ", 10, 30);
      jf.add(jta2,BorderLayout.EAST);
      
      MyAdapter ma = new MyAdapter(jta1, jta2);   
      JMenuBar jmb = new JMenuBar();
      
      JMenu jm = new JMenu("File");
      jmb.add(jm);

      jmi = new JMenuItem("Clear");
      jm.add(jmi);
      jmi.addActionListener(ma);
      
      jmi2 = new JMenuItem("Exit");      
      jm.add(jmi2);
      jmi2.addActionListener(ma);
 
      jf.add(jmb,BorderLayout.NORTH);     
      jb.addActionListener(ma);
      
      jf.pack();
      jf.setVisible(true);
      jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
   
   }
   
   public static void main(String[] args)
   {
      MyGUIs mg = new MyGUIs();
   }
}