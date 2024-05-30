package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
        JRadioButton r1,r2,r3,r4;
        JCheckBox c1,c2,c3,c4,c5,c6;
        JButton s,c;
        String form_no;
        Signup3(String form_no){
            this.form_no = form_no;
            JLabel label1 = new JLabel("page 3");
            label1.setBounds(280, 40, 400, 40);
            label1.setFont(new Font("Arial", Font.BOLD, 22));
            add(label1);

            JLabel label2 = new JLabel("Account Details");
            label2.setBounds(280, 70, 400, 40);
            label2.setFont(new Font("Arial", Font.BOLD, 22));
            add(label2);

            JLabel label3 = new JLabel("Account type:");
            label3.setBounds(100, 140, 200, 30);
            label3.setFont(new Font("Arial", Font.BOLD, 22));
            add(label3);

            r1 = new JRadioButton("Saving Account");
            r1.setBounds(100,180,150,30);
            r1.setFont(new Font("Raleway",Font.BOLD,16));
            r1.setBackground(new Color(215,252,255));
            add(r1);

            r2 = new JRadioButton("Fixed Deposit Account");
            r2.setBounds(350,180,300,30);
            r2.setFont(new Font("Raleway",Font.BOLD,17));
            r2.setBackground(new Color(215,252,255));
            add(r2);

            r3 = new JRadioButton("Recurring Deposit Account");
            r3.setBounds(100,220,250,30);
            r3.setFont(new Font("Raleway",Font.BOLD,17));
            r3.setBackground(new Color(215,252,255));
            add(r3);

            r4 = new JRadioButton("Current Account");
            r4.setBounds(350,220,250,30);
            r4.setFont(new Font("Raleway",Font.BOLD,17));
            r4.setBackground(new Color(215,252,255));
            add(r4);

            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(r1);
            buttonGroup.add(r2);
            buttonGroup.add(r3);
            buttonGroup.add(r4);

            JLabel label4 = new JLabel("Card Number:");
            label4.setBounds(100, 300, 200, 30);
            label4.setFont(new Font("Arial", Font.BOLD, 18));
            add(label4);

            JLabel label5 = new JLabel("Your 16-Digit Card Number");
            label5.setBounds(100, 330, 200, 30);
            label5.setFont(new Font("Arial", Font.BOLD, 12));
            add(label5);

            JLabel label6 = new JLabel("XXXX-XXXX-XXXX-9876");
            label6.setBounds(330,300,250,30);
            label6.setFont(new Font("Arial", Font.BOLD, 18));
            add(label6);

            JLabel label7 = new JLabel("It Would appear on atm card/cheque Book and Statements");
            label7.setBounds(330, 330, 500, 20);
            label7.setFont(new Font("Arial", Font.BOLD, 12));
            add(label7);

            JLabel label8 = new JLabel("PIN:");
            label8.setBounds(100, 370, 200, 30);
            label8.setFont(new Font("Arial", Font.BOLD, 18));
            add(label8);

            JLabel label9 = new JLabel("XXXX");
            label9.setBounds(330, 370, 200, 30);
            label9.setFont(new Font("Arial", Font.BOLD, 18));
            add(label9);

            JLabel label10 = new JLabel("4-digit Password");
            label10.setBounds(100, 400, 200, 20);
            label10.setFont(new Font("Arial", Font.BOLD, 12));
            add(label10);

            JLabel label11 = new JLabel("Service Required:");
            label11.setBounds(100, 450, 200, 30);
            label11.setFont(new Font("Arial", Font.BOLD, 18));
            add(label11);

            c1 = new JCheckBox("ATM card");
            c1.setBackground(new Color(215,253,255));
            c1.setFont(new Font("Raleway",Font.BOLD,16));
            c1.setBounds(100,500,200,30);
            add(c1);

            c2 = new JCheckBox("Internate Banking");
            c2.setBackground(new Color(215,253,255));
            c2.setFont(new Font("Raleway",Font.BOLD,16));
            c2.setBounds(350,500,200,30);
            add(c2);

            c3 = new JCheckBox("Mobile Banking");
            c3.setBackground(new Color(215,253,255));
            c3.setFont(new Font("Raleway",Font.BOLD,16));
            c3.setBounds(100,550,200,30);
            add(c3);

            c4 = new JCheckBox("E-mail alert");
            c4.setBackground(new Color(215,253,255));
            c4.setFont(new Font("Raleway",Font.BOLD,16));
            c4.setBounds(350,550,200,30);
            add(c4);

            c5 = new JCheckBox("Cheque Book");
            c5.setBackground(new Color(215,253,255));
            c5.setFont(new Font("Raleway",Font.BOLD,16));
            c5.setBounds(100,600,200,30);
            add(c5);

            c6 = new JCheckBox("E-statement");
            c6.setBackground(new Color(215,253,255));
            c6.setFont(new Font("Raleway",Font.BOLD,16));
            c6.setBounds(350,600,200,30);
            add(c6);

            JCheckBox c7 = new JCheckBox("Ihere by declares that the above enterd deatil correct to the best of my knlowdge.",true);
            c7.setBackground(new Color(215,253,255));
            c7.setFont(new Font("Raleway",Font.BOLD,12));
            c7.setBounds(100,680,600,20);
            add(c7);

            JLabel label12 = new JLabel("FORM No:");
            label12.setBounds(700, 10, 100, 30);
            label12.setFont(new Font("Arial", Font.BOLD, 14));
            add(label12);

            JLabel label13 = new JLabel("formno");
            label13.setBounds(760, 10, 60, 30);
            label13.setFont(new Font("Arial", Font.BOLD, 14));
            add(label13);

            s = new JButton("Submit");
            s.setBackground(Color.black);
            s.setForeground(Color.white);
            s.setFont(new Font("Raleway",Font.BOLD,14));
            s.setBounds(250,720,100,30);
            s.addActionListener(this);
            add(s);

            c = new JButton("Cancel");
            c.setBackground(Color.black);
            c.setForeground(Color.white);
            c.setFont(new Font("Raleway",Font.BOLD,14));
            c.setBounds(420,720,100,30);
            c.addActionListener(this);
            add(c);

            getContentPane().setBackground(new Color(215,252,252));
            setSize(850,800);
            setLayout(null);
            setLocation(400,20);
            setVisible(true);
        }

        public void actionPerformed(ActionEvent e){
            String atype = null;
            if (r1.isSelected()){
                atype = "Saving Account";
            }else if (r2.isSelected()){
                atype = "Fixed Deposit Account";
            }else if (r3.isSelected()){
                atype = "Current Account";
            }else if (r4.isSelected()){
                atype = "Recurring Deposit Account";
            }

            Random ran = new Random();
            long first7 = (ran.nextLong()%90000000L)+1409963000000000L;
            String cardno = ""+Math.abs(first7);
            long first3 = (ran.nextLong()%9000L)+1000L;
            String pin = ""+Math.abs(first3);

            String fac = "";
            if (c1.isSelected()){
                fac = fac+"ATM CARD";
            }else if(c2.isSelected()){
                fac = fac+"Internate Banking";
            } else if (c3.isSelected()) {
                fac = fac+"Mobile Banking";
            }else if (c4.isSelected()){
                fac = fac+"Email alert";
            }else if (c5.isSelected()){
                fac = fac+"Cheque Book";
            }else if (c6.isSelected()){
                fac = fac+"E-statement";
            }

            try{
                if (e.getSource()==s){
                    if (atype.equals("")){
                        JOptionPane.showMessageDialog(null,"Fill the all feilds");
                    }else{
                        Conn c1 = new Conn();
                        String q1 = "insert into signup3 values('"+form_no+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                        String q2 = "insert into login values('"+form_no+"','"+cardno+"','"+pin+"')";
                        c1.statement.executeUpdate(q1);
                        c1.statement.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null,"Card Number:"+cardno+"\n Pin:"+pin);
                        new Deposit(pin);
                        setVisible(false);
                    }
                    }else if (e.getSource()==c){
                    System.exit(0);
                }
            }catch (Exception E){
                E.printStackTrace();
            }

        }

    public static void main(String[] args) {
            new Signup3("");
    }
}
