package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label2;
    JButton b1;
    BalanceEnquiry(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel I3 = new JLabel(i3);
        I3.setBounds(0,0,1550,830);
        add(I3);

        JLabel label1 = new JLabel("Your Current Balance In Rs");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,700,35);
        I3.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(430,220,400,35);
        I3.add(label2);

        b1 = new JButton("Back");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,125));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        I3.add(b1);

        int balance = 0;
        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setLocation(0,0);
        setSize(1550,1080);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new main_Class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
