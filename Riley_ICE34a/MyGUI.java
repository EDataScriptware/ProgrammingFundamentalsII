
// Programming Fund. II
// Ms. Karen Beiter
// Dec. 1, 2017
// ICE35
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
      jta2 = new JTextArea("Enter more text: ", 10, 30);
      jf.add(jta1,BorderLayout.WEST);
      jf.add(jta2,BorderLayout.EAST);
      
      MyAdapter ma = new MyAdapter(jta1, jta2);
      
      JMenuBar jmb = new JMenuBar();
      JMenu jm = new JMenu("File");
      // JMenuItem jmi = new JMenuItem("Clear");
      jmi = new JMenuItem("Clear");
      
      jmb.add(jm);
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
      MyGUI mg = new MyGUI();
   }
}