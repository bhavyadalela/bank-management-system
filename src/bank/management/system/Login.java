package bank.management.system;

import javax.swing.*;  //imageicon
import java.awt.*; // image
import java.awt.event.ActionListener;
import java.awt.event.*; //actionlistener

//javax is a package used for apis, extended java package
//swing ke andar jitne bhi packages hai jo yaha use hoengt unko import
//jframe is a class in java swing framework which is part of the Java API for creating graphical user interfaces (GUIs).
public class Login extends JFrame implements ActionListener {

    JButton login,signup,clear; //globally defined so that they can be accessed outside constructor also
    JTextField cardTextField;
    JPasswordField pinTextField;
    // declared globally so that can be accessed outside constructor also
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null); //to prevent default layout

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//image aa gyi
        Image i2 = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//change height width of image

        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3); // place on frame(cant place directly on frame)
        label.setBounds(70, 10, 100, 100);

        add(label); //jlabel ka object pass in add function to place on frame

        getContentPane().setBackground(Color.WHITE);// getcontentpane se poora contentpane uth jaega

        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125, 240, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 230, 250, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); //button pe action ko catch krne ke liye
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(450, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGNUP");
        signup.setBounds(300, 350, 250, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        setSize(800, 450);
        setVisible(true);
        setLocation(350, 200);

    }
    //jab button pe click hua
    public void actionPerformed(ActionEvent ae){// ae is action event class ka object
       if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
       }
       else if(ae.getSource()==login){

       }
       else if(ae.getSource()==signup){

       }
    }

    public static void main(String[] args){
        new Login();
    }
}
