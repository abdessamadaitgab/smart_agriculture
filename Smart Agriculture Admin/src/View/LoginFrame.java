package View;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import Model.Client;
import db.CRUD_Client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginFrame extends JFrame /*implements ActionListener*/ {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container container = getContentPane();
    public JLabel userLabel = new JLabel("USERNAME");
    public JLabel passwordLabel = new JLabel("PASSWORD");
    public JTextField userTextField = new JTextField();
    public JPasswordField passwordField = new JPasswordField();
    public JButton loginButton = new JButton("LOGIN");
    public JButton resetButton = new JButton("RESET");
    public JButton inButton = new JButton("S'inscrire");

    
    JCheckBox showPassword = new JCheckBox("Show Password");
    CRUD_Client cc=new CRUD_Client();


    public LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
     //   addActionEvent();
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

  /*  public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        inButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            Client c=new Client (userText,pwdText);
            try {
				cc.CRUD_Client("root","Aitgab@1998");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            boolean m=false;
            
				try {
					m=cc.Connexion(userText, pwdText);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(m) {
	                JOptionPane.showMessageDialog(this, "Connexion Etablie");

                 new TerrainFrame();
            
          
                
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }}

        
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }

        }
        if (e.getSource() == inButton) {

        new InscriptionFrame();
        setVisible(false);
    
        }
    }
        
    */




    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(100, 100, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

    }

	public JTextComponent getUserTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public JTextComponent getPasswordField() {
		// TODO Auto-generated method stub
		return null;
	}

	public JTextField getInButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public JTextField getLoginButton() {
		// TODO Auto-generated method stub
		return null;
	}

}


