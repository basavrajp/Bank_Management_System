package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;

    JButton b1,b2,b3;
    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel I3 = new JLabel(i3);
        I3.setBounds(0,0,1550,830);
        add(I3);

        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.white);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(460,180,400,35);
        I3.add(l1);

        textField = new TextField();
        textField.setBackground(Color.white);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        I3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,125));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        I3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,125));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        I3.add(b2);

        b3 = new JButton("");
        b3.setBounds(700,362,150,35);
        b3.setBackground(new Color(65,125,125));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        I3.add(b3);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        try{
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if (e.getSource()==b1){
                    JOptionPane.showMessageDialog(null,"Enter your Pin");
                }
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the Amount you wan't to Deposit");

                }else {
                    Conn c = new Conn();

                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs." +amount+ " Deposit Sucessfully");
                    setVisible(false);
                    new main_Class(pin);

                }
                }else if (e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
