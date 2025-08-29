
package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main_Class extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin)
    {
        this.pin = pin;
        
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
      Image i2 = i1.getImage().getScaledInstance(1300,645,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel l3 = new JLabel(i3);
      l3.setBounds(0,0,1300,645);
      add(l3); 
      
      JLabel label = new JLabel("Please Select Your Transaction");
      label.setForeground(Color.white);
      label.setFont(new Font("System",Font.BOLD,22));
      label.setBounds(370,140,400,30);
      l3.add(label);
      
      b1 = new JButton("DEPOSIT");
      b1.setBounds(340,208,150,28);
      b1.setBackground(new Color(65,125,128));
      b1.setForeground(Color.white);
      b1.addActionListener(this);
      l3.add(b1);
      
      b2 = new JButton("CASH  WITHDRAWL");
      b2.setBounds(566,208,150,28);
      b2.setBackground(new Color(65,125,128));
      b2.setForeground(Color.white);
      b2.addActionListener(this);
      l3.add(b2);
      
      b3 = new JButton("FAST  CASH");
      b3.setBounds(340,246,150,28);
      b3.setBackground(new Color(65,125,128));
      b3.setForeground(Color.white);
      b3.addActionListener(this);
      l3.add(b3);
      
      b4 = new JButton("MINI  STATEMENT");
      b4.setBounds(566,246,150,28);
      b4.setBackground(new Color(65,125,128));
      b4.setForeground(Color.white);
      b4.addActionListener(this);
      l3.add(b4);
      
      b5 = new JButton("PIN  CHANGE");
      b5.setBounds(340,282,150,28);
      b5.setBackground(new Color(65,125,128));
      b5.setForeground(Color.white);
      b5.addActionListener(this);
      l3.add(b5); 
        
      b6 = new JButton("BALANCE  ENQUIRY");
      b6.setBounds(566,282,150,28);
      b6.setBackground(new Color(65,125,128));
      b6.setForeground(Color.white);
      b6.addActionListener(this);
      l3.add(b6);
        
      b7 = new JButton("EXIT");
      b7.setBounds(566,320,150,28);
      b7.setBackground(new Color(65,125,128));
      b7.setForeground(Color.white);
      b7.addActionListener(this);
      l3.add(b7);
        
        
     setLayout(null);
     setSize(1300,1080);
     setLocation(0,0);
     setVisible(true);  
              
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Deposit(pin);
            setVisible(false);
        }
        else if(e.getSource()==b7)
        {
            System.exit(0);
        }
        else if(e.getSource()==b2)
        {
            new Withdrawl(pin);
            setVisible(false);
        }
        else if (e.getSource()==b6)
        {
            new BalanceEnquiry(pin);
            setVisible(false);
        }
        else if (e.getSource()==b3)
        {
           new FastCash(pin);
           setVisible(false); 
        }
        else if (e.getSource()==b5)
        {
           new Pin(pin);
           setVisible(false); 
        }
        else if (e.getSource()==b4)
        {
           new Mini(pin);
        }
    }
            
            
            
    public static void main(String[]args)
    {
         new main_Class("");

    }
}
