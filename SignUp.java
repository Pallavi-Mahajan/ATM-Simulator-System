
package bank.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class SignUp extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textName ,textFName,textEmail,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() %9000L) +1000L;
    String first = " " + Math.abs(first4);
    SignUp()
    {
        super("APPLICATION FORM");
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5,1,100,100);
        add(image);
        
        
        JLabel label1 = new JLabel("Application Form No." + first);
        label1.setBounds(200,10,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,24));
        add(label1);
        
        
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,20));
        label2.setBounds(330,50,600, 30);
        add(label2);
        
        
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(290,70,600,30);
        add(label3);
        
        
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,16));
        labelName.setBounds(100,130,100,30);
        add(labelName);
        
        
        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,130,400,30);
        add(textName);
        
        
        
         JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,16));
        labelfName.setBounds(100,180,200,30);
        add(labelfName);
        
        
        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,180,400,30);
        add(textFName);
        
        
         JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,16));
        DOB.setBounds(100,230,200,30);
        add(DOB);
        
        dateChooser =  new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,230,400,30);
        add(dateChooser);
        
        
          JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,16));
       labelG.setBounds(100,280,200,30);
        add(labelG);
       
        
        r1= new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,280,60,30);
        add(r1);
        
        
          r2= new JRadioButton("Female");
          r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,280,90,30);
        add(r2);
        
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        
        
        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,16));
        labelEmail.setBounds(100,320,200,30);
        add(labelEmail);        
        
        
         textEmail = new JTextField();
        textEmail .setFont(new Font("Raleway",Font.BOLD,14));
        textEmail .setBounds(300,320,400,30);
        add(textEmail );
        
        
          JLabel labelMs = new JLabel("Marital Status :");
         labelMs.setFont(new Font("Raleway",Font.BOLD,16));
         labelMs.setBounds(100,370,200,30);
        add( labelMs);        
        
         m1= new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,370,90,30);
        add(m1);
        
         m2= new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,370,100,30);
        add(m2);
        
         m3= new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,370,90,30);
        add(m3);
        
        ButtonGroup buttonGroup1= new ButtonGroup();
        buttonGroup1.add(m1);
         buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        
        JLabel labelAdd = new JLabel("Adress :");
         labelAdd.setFont(new Font("Raleway",Font.BOLD,16));
         labelAdd.setBounds(100,420,200,30);
        add( labelAdd);        
        
        
         textAdd = new JTextField();
        textAdd .setFont(new Font("Raleway",Font.BOLD,14));
        textAdd .setBounds(300,420,400,30);
        add(textAdd );
        
        
         JLabel labelCity = new JLabel("City :");
         labelCity.setFont(new Font("Raleway",Font.BOLD,16));
         labelCity.setBounds(100,470,200,30);
        add( labelCity);        
        
        
         textCity = new JTextField();
        textCity .setFont(new Font("Raleway",Font.BOLD,14));
        textCity .setBounds(300,470,400,30);
        add(textCity );
        
        
        JLabel labelPin = new JLabel("Pin Code :");
         labelPin.setFont(new Font("Raleway",Font.BOLD,16));
         labelPin.setBounds(100,520,200,30);
        add( labelPin);        
        
        
         textPin = new JTextField();
        textPin .setFont(new Font("Raleway",Font.BOLD,14));
        textPin .setBounds(300,520,400,30);
        add(textPin );
        
        
        JLabel labelState = new JLabel("State :");
         labelState.setFont(new Font("Raleway",Font.BOLD,16));
         labelState.setBounds(100,570,200,30);
        add( labelState);        
        
        
         textState = new JTextField();
        textState .setFont(new Font("Raleway",Font.BOLD,14));
        textState .setBounds(300,570,400,30);
        add(textState );
        
         
        next = new JButton("Next ");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,610,80,30);
        next.addActionListener(this);
        add(next);
        
       getContentPane().setBackground(new Color(222,255,228));
       setLayout(null);
       setSize(850,680);
       setLocation(260,2);
       setVisible(true);
       
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
      
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if(r2.isSelected())
        {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital= null;
        if(m1.isSelected())
        {
            marital = "Married";
        }
        else if(m2.isSelected())
        {
            marital = "Unmarried";
        }
        else if (m3.isSelected())
        {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();
     
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            }
            else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }
        catch(Exception E)
         {
            E.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        new SignUp();
        
    }
    
}
