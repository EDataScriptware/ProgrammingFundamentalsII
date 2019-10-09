
// Programming Fund. II
// Ms. Karen Beiter
// Dec. 1, 2017
// ICE35
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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