package View;
import javax.swing.*;

import Model.Client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginFrame extends JFrame/* implements ActionListener*/ {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton inButton = new JButton("S'inscrire");

    
    JCheckBox showPassword = new JCheckBox("Show Password");


    public LoginFrame() {
    	setVisible(true);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        this.pack();
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(500, 150, 100, 30);
        passwordLabel.setBounds(500, 220, 100, 30);
        userTextField.setBounds(700, 150, 150, 30);
        passwordField.setBounds(700, 220, 150, 30);
        showPassword.setBounds(800, 250, 150, 30);
        loginButton.setBounds(500, 300, 100, 30);
        resetButton.setBounds(700, 300, 100, 30);
        inButton.setBounds(900, 600, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(inButton);
    }

   public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        inButton.addActionListener(this);
    }


    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(100, 100, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

    }

}


