package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel I3 = new JLabel(i3);
        I3.setBounds(0,0,1550,830);
        add(I3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,18));
        label.setBounds(430,180,700,35);
        I3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(410,274,150,35);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        I3.add(b1);

        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(410,320,150,35);
        b4.setBackground(Color.white);
        b4.setForeground(Color.black);
        b4.addActionListener(this);
        I3.add(b4);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(700,274,150,35);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        I3.add(b2);

        b5 = new JButton("PIN CHANGE");
        b5.setBounds(410,362,150,35);
        b5.setBackground(Color.white);
        b5.setForeground(Color.black);
        b5.addActionListener(this);
        I3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(700,320,150,35);
        b6.setBackground(Color.white);
        b6.setForeground(Color.black);
        b6.addActionListener(this);
        I3.add(b6);

        b7 = new JButton("EXIT");
        b7.setBounds(700,362,150,35);
        b7.setBackground(Color.white);
        b7.setForeground(Color.black);
        b7.addActionListener(this);
        I3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){

        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            System.exit(0);
        }else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==b5){
            new Pin(pin);
            setVisible(false);
        }else if (e.getSource()==b4){
            new mini(pin);
        }
    }
    public static void main(String[] args) {
        new main_Class("");
    }
}
