package bankmanagementsystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName,textFname,textEmail,textadd,textcity,textstate,textpin;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " "+ Math.abs(first4);


    Signup() {
      super("APPLICATION FORM");

      JLabel label1 = new JLabel("APPLICATION FORM NO :" + first);
      label1.setBounds(160, 20, 600, 40);
      label1.setFont(new Font("Arial", Font.BOLD, 35));
      add(label1);

      JLabel label2 = new JLabel("Page 1");
      label2.setBounds(330, 70, 600, 30);
      label2.setFont(new Font("Arial", Font.BOLD, 22));
      add(label2);

      JLabel label3 = new JLabel("Personal Detail");
      label3.setBounds(290, 90, 600, 40);
      label3.setFont(new Font("Arial", Font.BOLD, 35));
      add(label3);

      JLabel labelName = new JLabel("Name:");
      labelName.setFont(new Font("Raleway", Font.BOLD, 20));
      labelName.setBounds(100, 190, 100, 30);
      add(labelName);

      textName = new JTextField();
      textName.setBounds(300, 190, 400, 30);
      textName.setFont(new Font("Arial", Font.BOLD, 14));
      add(textName);

      JLabel labelfName = new JLabel("Father's Name:");
      labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
      labelfName.setBounds(100, 240, 200, 30);
      add(labelfName);

      textFname = new JTextField();
      textFname.setBounds(300, 240, 400, 30);
      textFname.setFont(new Font("Arial", Font.BOLD, 14));
      add(textFname);

      JLabel Dob = new JLabel("Date Of Birth:");
      Dob.setFont(new Font("Raleway", Font.BOLD, 20));
      Dob.setBounds(100, 340, 200, 30);
      add(Dob);

      dateChooser = new JDateChooser();
      dateChooser.setForeground(new Color(105, 105, 105));
      dateChooser.setBounds(300, 340, 400, 30);
      add(dateChooser);

      JLabel labelg = new JLabel("Gender");
      labelg.setFont(new Font("Raleway", Font.BOLD, 20));
      labelg.setBounds(100, 290, 200, 30);
      add(labelg);

      r1 = new JRadioButton("Male");
      r1.setBackground(new Color(222, 255, 228));
      r1.setFont(new Font("Raleway", Font.BOLD, 14));
      r1.setBounds(300, 290, 60, 30);
      add(r1);

      r2 = new JRadioButton("Female");
      r2.setBackground(new Color(222, 255, 228));
      r2.setFont(new Font("Raleway", Font.BOLD, 14));
      r2.setBounds(450, 290, 90, 30);
      add(r2);

      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(r1);
      buttonGroup.add(r2);

      JLabel labelEmail = new JLabel("Email Address: ");
      labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
      labelEmail.setBounds(100, 390, 200, 30);
      add(labelEmail);

      textEmail = new JTextField();
      textEmail.setBounds(300, 390, 400, 30);
      textEmail.setFont(new Font("Arial", Font.BOLD, 14));
      add(textEmail);

      JLabel labelms = new JLabel("Marital Status:");
      labelms.setFont(new Font("Raleway", Font.BOLD, 20));
      labelms.setBounds(100, 440, 200, 30);
      add(labelms);

      m1 = new JRadioButton("Married");
      m1.setBackground(new Color(222, 255, 228));
      m1.setFont(new Font("Raleway", Font.BOLD, 14));
      m1.setBounds(300, 440, 100, 30);
      add(m1);

      m2 = new JRadioButton("Unmarried");
      m2.setBackground(new Color(222, 255, 228));
      m2.setFont(new Font("Raleway", Font.BOLD, 14));
      m2.setBounds(450, 440, 100, 30);
      add(m2);

      m3 = new JRadioButton("Other");
      m3.setBackground(new Color(222, 255, 228));
      m3.setFont(new Font("Raleway", Font.BOLD, 14));
      m3.setBounds(635, 440, 100, 30);
      add(m3);

      ButtonGroup buttonGroup1 = new ButtonGroup();
      buttonGroup1.add(m1);
      buttonGroup1.add(m2);
      buttonGroup1.add(m3);

      JLabel labelAdd = new JLabel("Address:");
      labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
      labelAdd.setBounds(100, 490, 200, 30);
      add(labelAdd);

      textadd = new JTextField();
      textadd.setBounds(300, 490, 400, 30);
      textadd.setFont(new Font("Arial", Font.BOLD, 14));
      add(textadd);

      JLabel labelcity = new JLabel("City:");
      labelcity.setFont(new Font("Raleway", Font.BOLD, 20));
      labelcity.setBounds(100, 540, 200, 30);
      add(labelcity);

      textcity = new JTextField();
      textcity.setBounds(300, 540, 400, 30);
      textcity.setFont(new Font("Arial", Font.BOLD, 14));
      add(textcity);

      JLabel labelpin = new JLabel("Pin Code:");
      labelpin.setFont(new Font("Raleway", Font.BOLD, 20));
      labelpin.setBounds(100, 590, 200, 30);
      add(labelpin);

      textpin = new JTextField();
      textpin.setBounds(300, 590, 400, 30);
      textpin.setFont(new Font("Arial", Font.BOLD, 14));
      add(textpin);

      JLabel labelstate = new JLabel("State:");
      labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
      labelstate.setBounds(100, 640, 200, 30);
      add(labelstate);

      textstate = new JTextField();
      textstate.setBounds(300, 640, 400, 30);
      textstate.setFont(new Font("Arial", Font.BOLD, 14));
      add(textstate);

      next = new JButton("Next");
      next.setFont(new Font("Raleway",Font.BOLD,14));
      next.setBackground(Color.BLACK);
      next.setForeground(Color.WHITE);
      next.setBounds(620,710,80,30);
      next.addActionListener(this);
      add(next);



      setLayout(null);
      setSize(850, 800);
      setLocation(360, 40);
      getContentPane().setBackground(new Color(222, 255, 228));
      setVisible(true);
    }

  @Override
  public void actionPerformed(ActionEvent E) {

      String formno =first;
      String name = textName.getText();
      String fname = textFname.getText();
      String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

      String gender = null;
      if(r1.isSelected()){
        gender = "Male";
      } else if (r2.isSelected()) {
        gender = "Female";
      }

      String email = textEmail.getText();
      String marital= null;
      if (m1.isSelected()){
        marital = "Married";
      } else if (m2.isSelected()) {
        marital = "Unmarried";
      } else if (m3.isSelected()) {
        marital = "Other";
      }

      String address = textadd.getText();
      String city = textcity.getText();
      String pincode = textpin.getText();
      String state = textstate.getText();

      try{

        if(textName.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Fill all the Details");
        }else {
          Conn con1 = new Conn();
          String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
          con1.statement.executeUpdate(query);
          new Signup2(formno);
          setVisible(false);
        }

      }catch (Exception e){
        e.printStackTrace();
      }

  }

  public static void main(String[] args) {
      new Signup2("");
    }
}
