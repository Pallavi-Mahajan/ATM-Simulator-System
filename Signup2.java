
package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    
    String formno;
   
    
    Signup2(String formno){
         super("APPLICATION FORM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,-8,100,100);
        add(image);
        
        
        this.formno = formno;
        
        JLabel l1 =new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(300,10,600,40);
        add(l1);
        
        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(300,40,600,40);
        add(l2);
        
        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,16));
        l3.setBounds(100,100,100,30);
        add(l3);
        
        String religion [] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,100,320,30);
        add(comboBox);
        
         JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway",Font.BOLD,16));
        l4.setBounds(100,150,100,30);
        add(l4);
        
        String category [] = {"General","OBC","ST","SC","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,150,320,30);
        add(comboBox2);
        
        
         JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,16));
        l5.setBounds(100,200,100,30);
        add(l5);
        
        String income [] = {"Null","<1,50,000","<2,50,000","5,00,000","upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,200,320,30);
        add(comboBox3);
        
        
         JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway",Font.BOLD,16));
        l6.setBounds(100,250,150,30);
        add(l6);
        
        String educational [] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,250,320,30);
        add(comboBox4);
        
        
        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway",Font.BOLD,16));
        l7.setBounds(100,300,150,30);
        add(l7);
        
        String occupation [] = {"Salaried","Self-Employed","Bussiness","Students","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,300,320,30);
        add(comboBox5);
        
         JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway",Font.BOLD,16));
        l8.setBounds(100,350,150,30);
        add(l8);
        
        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,16));
        textPan.setBounds(350,350,320,30);
        add(textPan);
        
        
         JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway",Font.BOLD,16));
        l9.setBounds(100,400,150,30);
        add(l9);
        
        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,16));
        textAadhar.setBounds(350,400,320,30);
        add(textAadhar);
        
        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway",Font.BOLD,16));
        l10.setBounds(100,450,150,30);
        add(l10);
        
       r1 = new JRadioButton("Yes");
       r1.setFont(new Font("Raleway",Font.BOLD,14));
       r1.setBackground(new Color(252,208,76));
       r1.setBounds(350,450,100,30);
       add(r1);
       
        r2 = new JRadioButton("No");
       r2.setFont(new Font("Raleway",Font.BOLD,14));
       r2.setBackground(new Color(252,208,76));
       r2.setBounds(460,450,100,30);
       add(r2);
       
       ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
       
       
        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway",Font.BOLD,16));
        l11.setBounds(100,500,150,30);
        add(l11);
        
       e1 = new JRadioButton("Yes");
       e1.setFont(new Font("Raleway",Font.BOLD,14));
       e1.setBackground(new Color(252,208,76));
       e1.setBounds(350,500,100,30);
       add(e1);
       
        e2 = new JRadioButton("No");
       e2.setFont(new Font("Raleway",Font.BOLD,14));
       e2.setBackground(new Color(252,208,76));
       e2.setBounds(460,500,100,30);
       add(e2);
       
        ButtonGroup buttonGroup1= new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);
        
       
        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(650,10,100,30);
        add(l12);
       
         JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(720,10,100,30);
        add(l13);
       
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setBackground( Color.white);
        next.setForeground(Color.black);
        next.setBounds(570,580,100,30);
        next.addActionListener(this);
        add(next);
        
          
        setLayout(null);
        setSize(850,670);
        setLocation(260,2);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
        
    }
    
    @Override
   public void actionPerformed(ActionEvent e)
   {
       String rel = (String)comboBox.getSelectedItem();
       String cate = (String)comboBox2.getSelectedItem();
       String inc = (String)comboBox3.getSelectedItem();
       String edu = (String)comboBox4.getSelectedItem();
       String occ = (String)comboBox5.getSelectedItem();
       
       String pan = textPan.getText();
       String aadhar = textAadhar.getText();
       
       String scitizen = null;
       if(r1.isSelected())
       {
           scitizen = "Yes";
       }else if(r2.isSelected())
       {
           scitizen = "No";
       }
       
       String eaccount = null;
       if(r1.isSelected())
       {
           eaccount = "Yes";
       }else if(r2.isSelected())
       {
           eaccount = "No";
       }
       
       
       try
       {
           if(textPan.getText().equals("")|| textAadhar.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null,"Fill all the fields");
           }
           else
           {
               Con c1 = new Con();
               String q = "insert into Signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
               c1.statement.executeUpdate(q);
               new Signup3(formno);
               setVisible(false);
           }
       }
       catch(Exception E)
       {
           E.printStackTrace();
       }
       
       
   }
    
    public static void main(String[] args){
        new Signup2("");
    }
    
    
}
    

