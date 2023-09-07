import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton login,signup,clear;
    JTextField cardTextField,
    JPasswordField,pinTextField;

    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label =new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text =new JLabel ("welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno =new JLabel ("card number:");
        cardno.setFont(new Font("Osward",Font.BOLD,38));
        cardno.setBounds(200,150,400,40);
        add(cardno);

        JTextField cardTextField =new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin =new JLabel ("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(120,220,400,40);
        add(pin);

        JTextField pinTextField =new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);

        login =new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear =new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);

        signup =new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        add(signup);

        getContentPane().setBackground(Color.WHITE);


        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    } 
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if (ae.getSource() == login){

        }else if (ae.getSource() == signup){
        }
    }
    public static void main(String args[]){
        new Login();

    }
     
   
}
