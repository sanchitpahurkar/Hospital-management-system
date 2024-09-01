package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

    JTextField textField;
    JPasswordField jpasswordField;
    JButton b1,b2;

    Login() {
        // Username label
        JLabel namelabel = new JLabel("Username");
        namelabel.setBounds(40,20,100,30);
        namelabel.setFont(new Font("Tahoma",Font.BOLD,16));
        namelabel.setForeground(Color.BLACK);
        add(namelabel);

        // Password label
        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,30);
        password.setFont(new Font("Tahoma",Font.BOLD,16));
        password.setForeground(Color.BLACK);
        add(password);

        // Username input field
        textField = new JTextField();
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("Tahoma",Font.PLAIN,16));
        textField.setBackground(new Color(255,179,0));
        add(textField);

        // password input field
        jpasswordField = new JPasswordField();
        jpasswordField.setBounds(150,70,150,30);
        jpasswordField.setFont(new Font("Tahoma",Font.PLAIN,16));
        jpasswordField.setBackground(new Color(255,179,0));
        add(jpasswordField);

        // logo image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(320,-30,400,300);
        add(label);

        // login button
        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        add(b1);

        // cancel button
        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        add(b2);

        // created the layout of the frame
        getContentPane().setBackground(new Color(109,164,170));
        setSize(750,300);
        setLocation(550,300);
        setLayout(null);
        setVisible(true); // makes frame visible
    }
    public static void main(String[] args) {
        new Login();
    }
}
