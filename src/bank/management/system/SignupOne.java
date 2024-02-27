package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*; //color,actionlistener
import java.util.*; //random
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JDateChooser dateChooser;
    JRadioButton male,female,married,unmarried;
    SignupOne(){
        setLayout(null);

        Random ran=new Random();
        long random=Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personDetails=new JLabel("Page 1:Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,25);
        add(personDetails);

        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

       nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,180,200,30);
        add(fname);

        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,180,400,30);
        add(fnameTextField);

        JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);



        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);

        female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendergoup=new ButtonGroup(); // done to group the buttons so that only one of them is selected
        gendergoup.add(male);
        gendergoup.add(female);


        JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        married=new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.white);
        add(married);

        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        ButtonGroup marriedgoup=new ButtonGroup(); // done to group the buttons so that only one of them is selected
        marriedgoup.add(married);
        marriedgoup.add(unmarried);


        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

         addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

         cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        JLabel State=new JLabel("State:");
        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(100,540,200,30);
        add(State);

        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        JLabel pincode=new JLabel("Pincode");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);

        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){ //overriding event
      String formno=""+random;
      String name=nameTextField.getText();
      String fname=fnameTextField.getText();
      String gender=null;
      if(male.isSelected()){
          gender="Male";

      }
      else{
          gender="Female";
      }
      String email=emailTextField.getText();
      String marital=null;
      if(married.isSelected()){
          marital="Married";
      }
      else{
          marital="Unmarried";
      }
      String address=addressTextField.getText();
      String city=cityTextField.getText();
      String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
      String state=cityTextField.getText();
      String pin=pinTextField.getText();
      try{
          if(name.equals("")){
              JOptionPane.showMessageDialog(null,"Name is Required");
          }
          if(city.equals("")){
              JOptionPane.showMessageDialog(null,"City is Required");
          }
          if(email.equals("")){
              JOptionPane.showMessageDialog(null,"Email is Required");
          }
          if(fname.equals("")){
              JOptionPane.showMessageDialog(null,"FName is Required");
          }
          if(address.equals("")){
              JOptionPane.showMessageDialog(null,"Address is Required");
          }
          if(state.equals("")){
              JOptionPane.showMessageDialog(null,"State is Required");
          }
          if(pin.equals("")){
              JOptionPane.showMessageDialog(null,"Pin is Required");
          }
          else{
              Conn c=new Conn();
              String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
              c.s.executeUpdate(query);
          }

      }
      catch(Exception e){
          e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new SignupOne();
    }
}


