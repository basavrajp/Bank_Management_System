package bankmanagementsystem;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    Login(){
        super("Bank Management System");

     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/SBI LOGO.png"));
     Image i2 = i1.getImage().getScaledInstance(150,70,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(350,10,150,70);
     add(image);

     ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
     Image j2 = j1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
     ImageIcon j3 = new ImageIcon(j2);
     JLabel image1 = new JLabel(j3);
     image1.setBounds(630,350,100,100);
     add(image1);

     label1 = new JLabel("Welcome To State Bank Of India");
     label1.setForeground(Color.white);
     label1.setFont(new Font("AvantGarde",Font.BOLD,29));
     label1.setBounds(200,130,500,30);
     add(label1);

     label2 = new JLabel("Card No:");
     label2.setForeground(Color.white);
     label2.setFont(new Font("AvantGarde",Font.BOLD,25));
     label2.setBounds(150,190,375,30);
     add(label2);

     textField2 = new JTextField(15);
     textField2.setBounds(290,190,290,30);
     textField2.setFont(new Font("Arial",Font.BOLD,14));
     add(textField2);

     label3 = new JLabel("PIN: ");
     label3.setForeground(Color.white);
     label3.setFont(new Font("AvantGarde",Font.BOLD,25));
     label3.setBounds(150,250,375,30);
     add(label3);

     passwordField3 = new JPasswordField(15);
     passwordField3.setBounds(290,250,290,30);
     passwordField3.setFont(new Font("Arial",Font.BOLD,14));
     add(passwordField3);

     button1 = new JButton("SIGN IN");
     button1.setFont(new Font("Arial",Font.BOLD,14));
     button1.setForeground(Color.white);
     button1.setBackground(Color.BLACK);
     button1.setBounds(300,300,100,30);
     button1.addActionListener(this);
     add(button1);
     button1.addActionListener(this);

     button2 = new JButton("CLEAR");
     button2.setFont(new Font("Arial",Font.BOLD,14));
     button2.setForeground(Color.white);
     button2.setBackground(Color.BLACK);
     button2.setBounds(430,300,100,30);
     button2.addActionListener(this);
     add(button2);
     button2.addActionListener(this);

     button3 = new JButton("SIGN UP");
     button3.setFont(new Font("Arial",Font.BOLD,14));
     button3.setForeground(Color.white);
     button3.setBackground(Color.BLACK);
     button3.setBounds(300,350,230,30);
     button3.addActionListener(this);
     add(button3);
     button3.addActionListener(this);

     ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
     Image k2 = k1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
     ImageIcon k3 = new ImageIcon(k2);
     JLabel image2 = new JLabel(k3);
     image2.setBounds(650,350,850,480);
     add(image2);



     setSize(850,480);
     setLocation(450,200);
     setVisible(true);
    }

public void actionPerformed(ActionEvent e) {
    try{
        if(e.getSource()==button1){
            Conn c = new Conn();
            String cardno = textField2.getText();
            String pin = passwordField3.getText();

            String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
            ResultSet resultSet = c.statement.executeQuery(q);
            if (resultSet.next()){
                setVisible(false);
                new main_Class(pin);
            }else {
                JOptionPane.showMessageDialog(null,"Incorrect Card Number Or Pin");
            }
        }else if(e.getSource()==button2){
            textField2.setText("");
            passwordField3.setText("");

        }else if(e.getSource()==button3){
            new Signup();
            setVisible(false);
        }
    }catch (Exception E){
        E.printStackTrace();
    }

}


    public static void main(String[] args) {
        new Login();
    }
}
