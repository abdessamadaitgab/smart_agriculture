package View;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	public JPanel pconnex;
	public JLabel userLabel = new JLabel("USERNAME");
	public JLabel passwordLabel = new JLabel("PASSWORD");
	public JTextField userTextField = new JTextField();
	public JPasswordField passwordField = new JPasswordField();
	public JButton loginButton = new JButton("LOGIN");

	public Login() {
	   	 setTitle("Login Technicien");
	     setVisible(true);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setResizable(true);
	     setSize(500,300);
	     pconnex=new JPanel();
	     userLabel.setBounds(500, 150, 100, 30);
	     passwordLabel.setBounds(500, 220, 100, 30);
	     userTextField.setBounds(700, 150, 150, 30);
	     passwordField.setBounds(700, 220, 150, 30);
	     loginButton.setBounds(600, 300, 120, 50);
	     
	     
	     pconnex.setLayout(null);
	     pconnex.add(userLabel);pconnex.add(userTextField);pconnex.add(passwordLabel);pconnex.add(passwordField);pconnex.add(loginButton);
	     add(pconnex);
	    // Container c = getContentPane();
	    // c.add(pconnex);
	    // this.pack();

	}
	
}
