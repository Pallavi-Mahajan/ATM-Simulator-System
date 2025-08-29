
package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Mini extends JFrame implements ActionListener
{
    String pin;
    JButton button;
    
    Mini(String pin)
    {
      this.pin = pin;  
         
      getContentPane().setBackground(new Color(255,204,204));
      setSize(400,600);
      setLocation(370,30);
      setLayout(null);
      
      
      
      
      JLabel label2 = new JLabel("MAHAJAN BANK");
      label2.setBounds(100,40,200,30);
      label2.setFont(new Font("System",Font.BOLD,20));
      add(label2);
      
      JLabel label3 = new JLabel();
      label3.setBounds(20,80,300,30);
      add(label3);
      
      JLabel label1 = new JLabel();
      label1.setBounds(20,140,400,250);
      add(label1);
      
      JLabel label4 = new JLabel();
      label4.setBounds(20,450,300,30);
      add(label4);
      
      
      try
      {
         Con c = new Con();
         ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
         while(resultSet.next())
         {
             label3.setText("Card Number : "+ resultSet.getString("card_number").substring(0,4)+ "XXXXXXXX"+resultSet.getString("card_number").substring(12));            
         }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    
      try
      {
         int balance = 0;
         Con c = new Con();
         ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
              while(resultSet.next())
              {
                  label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");                                     
                  if(resultSet.getString("type").equals("Deposit")){
                      balance += Integer.parseInt(resultSet.getString("amount"));
                  }
                  else{
                      balance -= Integer.parseInt(resultSet.getString("amount"));
                  }
              }
              label4.setText("Your Total Balance is Rs "+balance);       
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      
      button = new JButton("Exit");
      button.setBounds(20,500,100,25);
      button.addActionListener(this);
      button.setBackground(Color.black);
      button.setForeground(Color.WHITE);
      add(button);
      
      setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
    }
    
    
    public static void main(String[]args)
    {
        new Mini("");
    }
}
