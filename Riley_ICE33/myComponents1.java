import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myComponents1 extends JFrame implements ActionListener, ItemListener
{
   JFrame jf = new JFrame("My Components");
   JPanel jp = new JPanel();
   JButton jbl = new JButton("South Button");
   
   JPanel jp2 = new JPanel();
   JCheckBox jckbx1 = new JCheckBox("Center checkbox 1");
   JCheckBox jckbx2 = new JCheckBox("Center checkbox 2");
   
   JMenuBar jmb = new JMenuBar();
   JMenu jm = new JMenu("My Menu");
   JMenuItem jmi1 = new JMenuItem("First");
   JMenuItem jmi2 = new JMenuItem("Second");
   JMenuItem jmi3 = new JMenuItem("Third");
   
   JPanel jp3 = new JPanel();
   JCheckBox jckbx1west = new JCheckBox("West checkbox One");
   JCheckBox jckbx2west = new JCheckBox("West checkbox Two");
   
   JPanel jp4 = new JPanel();
   ButtonGroup bg1 = new ButtonGroup();
   JRadioButton jrb1 = new JRadioButton("RB 1");
   JRadioButton jrb2 = new JRadioButton("RB 2");
   JRadioButton jrb3 = new JRadioButton("RB 3");
   
   public static void main(String [] args)
   {
      myComponents1 mc1 = myComponents1();
   }
   
   public myComponents1()
   {
      jf.setSize(300, 400);
      jf.setLayout(newBorderLayout());
   
      jp.add(jb1);
      jf.add(jp,BorderLayout.SOUTH);
      jp2.setLayout(new GridLayout(0,1,0,50));
   
      jckbx1.addActionListener(this);
      jckbx2.addActionListener(this);
      jp2.add(jckbx1);
      jp2.add(jckbx2);
      jf.add(jp2,BorderLayout.CENTER);
   
      jm.add(jmi1);
      jm.add(jmi2);
      jm.add(jmi3);
      jmb.add(jm);
      jf.add(jmb,BorderLayout.NORTH);
   
      jmi1.addActionListener(this);
      jmi2.addActionListener(this);
      jmi3.addActionListener(this);
   
      jp3.setLayout(new GridLayout(0,1));
      jp3.add(jckbx1west);
      jp3.add(jckbx2west);
      jf.add(jp3,BorderLayout.WEST);
   
      jp4.setLayout(new GridLayout(0,1));
      jp4.add(jrb1);
      jp4.add(jrb2);
      jp4.add(jrb3);
      bg1.add(jrb1);
      bg1.add(jrb2);
      bg1.add(jrb3);
   
      jf.add(jp4,BorderLayout.EAST);
   
      jrb1.addItemListener(this);
      jrb2.addItemListener(this);
      jrb3.addItemListener(this);
   
      jf.pack();
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void actionPerformed(ActionEvent ae)
   {
      System.out.println("I've been clicked " + ae.getSource());
   
      if (ae.getSource() == jckbx1)
      {
         JOptionPane.showMessageDialog(jckbx1, "Checkbox 1 was clicked");
      }
      if (ae.getSource() == jckbx2)
      {
         JOptionPane.showMessageDialog(jckbx2, "Checkbox 2 was clicked");
      }
      if (ae.getSource() == jbl)
      {
         JOptionPane.showMessageDialog(jckbx1, "South Button was clicked");
      }
      
      switch (ae.getActionCommand() )
      {
         case "Center checkbox 1": JOptionPane.showMessageDialog(null, "Checkbox 1 was clicked"); 
            break;
         case "Center checkbox 2": JOptionPane.showMessageDialog(null, "Checkbox 2 was clicked"); 
            break;
      
         case "First": JOptionPane.showMessageDialog(null, "First menu item was clicked");
            break;
         case "Second": JOptionPane.showMessageDialog(null, "First menu item was clicked");
            break;
         case "Third": JOptionPane.showMessageDialog(null, "First menu item was clicked");
            break;
            case "South Button": JOptionPane.showMessageDialog(null, "South Button was clicked");
         break;
         
      }
      
      public void itemStateChanged(ItemEvent ie) //????
      {
         if (jrb1.isSelected() )
         {
            JOptionPane.showMessageDialog(this, "First radio button is selected");
         }
      if (jrb2.isSelected() )
         {
            JOptionPane.showMessageDialog(this, "First radio button is selected");
         }
      if (jrb3.isSelected() )
         {
            JOptionPane.showMessageDialog(this, "First radio button is selected");
         }
      }
      
   
   
   }
}

