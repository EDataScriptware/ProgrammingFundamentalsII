import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PersonGUI extends JFrame implements ActionListener, ItemListener
{ 
   String firstName = "";
   String lastName = "";
   String address = "";
   String city = "";
   String state = "";
   String zipcode = "";
   ArrayList collection = new ArrayList();
   
   Person person = new Person();

   JFrame jFrame = new JFrame("Person Window");

   JPanel jPanelProfile = new JPanel();

   JTabbedPane myTabs = new JTabbedPane(JTabbedPane.TOP);

   JLabel jLabelFirstName = new JLabel("Enter First Name");

   JTextField firstNameTextField = new JTextField(15);

   JLabel jLabelLastName = new JLabel("Enter Last Name");

   JTextField lastNameTextField = new JTextField(15);
   
   JLabel jLabelAddress = new JLabel("Enter Address");
   
   JTextField addressTextField = new JTextField(40);

   JLabel jLabelCity = new JLabel("Enter City");

   JTextField cityTextField = new JTextField(10);

   JLabel jLabelState = new JLabel("Enter State");
   JComboBox jComboBoxStates = new JComboBox(new String [] { "Alabama", "Alaska", "Arizona", "Arkansas", "California",
        "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
        "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
        "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
        "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
        "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
        "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
        "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
        "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
        "Wisconsin", "Wyoming"});
      
   JButton jEnterButton = new JButton("ENTER");
   JButton jCountButton = new JButton("COUNT");
   
   JLabel jLabelZipcode = new JLabel("Enter Zip Code");
   
   JTextField zipcodeTextField = new JTextField(10);
   
   
   JMenu menu = new JMenu("Homework");
   
   JMenuBar menuBar = new JMenuBar();
   
   JMenuItem menuItemAbout = new JMenuItem("About");
   JMenuItem menuItemExit = new JMenuItem("Exit");
   

   public PersonGUI()
   { //PizzaGUI constructor
   
      jFrame.setSize(600, 550);
      jFrame.setResizable(false);
   
   
      jPanelProfile.setSize(jPanelProfile.getPreferredSize());
         
      jFrame.getContentPane().setLayout(new BorderLayout());
   
      jPanelProfile.add(jLabelFirstName);
   
      jPanelProfile.add(firstNameTextField);
   
      jPanelProfile.add(jLabelLastName);
   
      jPanelProfile.add(lastNameTextField);
   
      jPanelProfile.add(jLabelAddress);
   
      jPanelProfile.add(addressTextField);
   
      jPanelProfile.add(jLabelCity);
   
      jPanelProfile.add(cityTextField);
   
      jPanelProfile.add(jLabelState);
   
      jPanelProfile.add(jComboBoxStates);
   
      jPanelProfile.add(jLabelZipcode);
   
      jPanelProfile.add(zipcodeTextField);
      
      jPanelProfile.add(jEnterButton);
      jPanelProfile.add(jCountButton);
     
   
      jFrame.add(myTabs);
   
     
   
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      myTabs.addTab("Profile", jPanelProfile); 
   
        
      menu.add(menuItemAbout);
      menu.add(menuItemExit);
      
      menuItemAbout.addActionListener(this);
      menuItemExit.addActionListener(this);
      jEnterButton.addActionListener(this);
      jCountButton.addActionListener(this);
      
   
         
      menuBar.add(menu);
   
      jFrame.add(menuBar, BorderLayout.NORTH);
   
   
   
   
      jFrame.setVisible(true);
   
   
   
   } 
   public static void main(String [] args)
   {    
      PersonGUI myPersonGUI = new PersonGUI();
   }

   public void actionPerformed(ActionEvent ae)
   {    
      
         if(ae.getSource() == menuItemAbout)
         {       
            JOptionPane.showMessageDialog(null, "Author name: Edward Riley \nAssignment 11: 'PersonGUI Class' \nCourse Name: NACA-161 \nName of College: National Technical Institute for the Deaf \nCurrent Year: 2018");
         }
         if (ae.getSource() == menuItemExit)
         {         
            System.exit(1);
         
         }
         if (ae.getSource() == jEnterButton)
         {
         // firstname 
            firstName = firstNameTextField.getText();
            boolean firstNameValidation = false;
            if (firstName.length() > 10)
            {
               JOptionPane.showMessageDialog(null, "First name is too long");
            }
            else
            {
               try
               {
                  person.setFirstName(firstName);
                  firstNameValidation = true;
               }
               catch (BadValueException ee)
               {
                  System.out.println(ee.getMessage());
               
               }
            }//END FIRST NAME
         
            lastName = lastNameTextField.getText();
            boolean lastNameValidation = false;
            
            if (lastName.length() > 15)
            {
               JOptionPane.showMessageDialog(null, "Last name is too long");
            }
            else
            {
               try
               {
                  person.setLastName(lastName);
                  lastNameValidation = true;
               }
               catch (BadValueException ee)
               {
                  System.out.println(ee.getMessage());
               
               }
            }//END LAST NAME
         
            address = addressTextField.getText();
            boolean addressValidation = false;
            if (address.length() > 15)
            {
               JOptionPane.showMessageDialog(null, "Address is too long");
            }
            else
            {
               try
               {
                  person.setAddress(address);
                  addressValidation = true;
               }
               catch (BadValueException ee)
               {
                  System.out.println(ee.getMessage());
               
               }
            }//END ADDRESS
            city = cityTextField.getText();
            boolean cityValidation = false;
            if (city.length() > 15)
            {
               JOptionPane.showMessageDialog(null, "City is too long");
            }
            else
            {
               try
               {  
                  person.setCity(city);
                  cityValidation = true;
               }
               catch (BadValueException ee)
               {
                  System.out.println(ee.getMessage());
               
               }
            }//END CITY
         
            zipcode = zipcodeTextField.getText();
            boolean zipcodeValidation = false;
            if (lastName.length() > 15)
            {
               JOptionPane.showMessageDialog(null, "Zipcode is too long");
            }
            else
            {
               try
               {
                  person.setZipcode(zipcode);
                  zipcodeValidation = true;
               }
               catch (BadValueException ee)
               {
                  System.out.println(ee.getMessage());
               }
               
               
            }//END ZIPCODE
            
            try 
            {
               state = jComboBoxStates.getSelectedItem().toString();
               person.setState(state);
            }
            catch (BadValueException ee)
            {
               System.out.println(ee.getMessage());
            }
            
            if ((firstNameValidation != false) && (lastNameValidation != false) && (addressValidation != false) && (cityValidation != false) && (zipcodeValidation != false))
            {
               collection.add(person);
            }
            else
            {
            //do nothing
            }
            
      
      }//END BUTTON
      if (ae.getSource() == jCountButton)
         {
                        JOptionPane.showMessageDialog(null, "Number of People " + collection.size() +"!" );
         }
   
   
   }    
   public void itemStateChanged(ItemEvent ie)
   {   
   
   } 

} //END CLASS