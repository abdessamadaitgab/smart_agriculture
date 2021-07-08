package View;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Interface extends JFrame{
	public JPanel panel;
	public JPanel Login_Panel;
	public JPanel Inscription_Panel;
	public JPanel acceuil;
	public CardLayout Card;

	// Login Panel
	
    public JLabel userLabel = new JLabel("USERNAME");
    public JLabel passwordLabel = new JLabel("PASSWORD");
    
    public JTextField userTextField = new JTextField();
    public JPasswordField passwordField = new JPasswordField();
    
    public JButton loginButton_login = new JButton("LOGIN");
    public JButton resetButton = new JButton("RESET");
    public JButton inButton = new JButton("S'inscrire");	
    
    JCheckBox showPassword = new JCheckBox("Show Password");

    //Fin Login Panel
    
    
    
    //Inscription Panel
    
    public JLabel usernom= new JLabel("NOM");
    public JLabel userpnom= new JLabel("PRENOM");
    public JLabel userage= new JLabel("AGE");
    public JLabel userlogin = new JLabel("LOGIN");
    public JLabel userpass = new JLabel("PASSWORD");
   
    public JTextField nom= new JTextField();
    public JTextField prenom= new JTextField();
    public JTextField age= new JTextField();
    public JTextField login= new JTextField();
    public JPasswordField password = new JPasswordField();
     
    public JButton loginButton = new JButton("S'INSCRIRE");     

    //Fin Inscription Panel
    
    
    
    
	public Interface() {

		Card = new CardLayout();
		panel = new JPanel(Card);
		
		Login_Panel = new JPanel();
		Login_Panel.setLayout(null);
		Inscription_Panel = new JPanel();
		Inscription_Panel.setLayout(null);
		acceuil = new JPanel();
		acceuil.setLayout(null);
		
		initialiser_Login();
		initialiser_Inscription();
		initialiser_acceuil();
		
		panel.add(Login_Panel,"Login");
		panel.add(Inscription_Panel,"Inscription");
		
		Container c  =  getContentPane();
		c.add(panel);
		//c.setVisible(true);
		setSize(getMaximumSize());
		setVisible(true);
		show();
	}
	
	
	
	
	
	public void initialiser_Login() {
		Login_Panel.setSize(950, 650);
		//
        Login_Panel.add(userLabel);
        Login_Panel.add(passwordLabel);
        Login_Panel.add(userTextField);
        Login_Panel.add(passwordField);
        Login_Panel.add(showPassword);
        Login_Panel.add(loginButton_login);
        Login_Panel.add(resetButton);
        Login_Panel.add(inButton);
		//
        userLabel.setBounds(500, 150, 100, 30);
        passwordLabel.setBounds(500, 220, 100, 30);
        userTextField.setBounds(700, 150, 150, 30);
        passwordField.setBounds(700, 220, 150, 30);
        showPassword.setBounds(800, 250, 150, 30);
        loginButton_login.setBounds(500, 300, 100, 30);
        resetButton.setBounds(700, 300, 100, 30);
        inButton.setBounds(900, 600, 100, 30);
       
	}
	
	
	
	
	
	
	public void initialiser_Inscription() {
		Inscription_Panel.setSize(750,600);
		
        usernom.setBounds(500, 150, 100, 30);
        userpnom.setBounds(500, 220, 100, 30);
        userage.setBounds(500, 290, 100, 30);
        userlogin.setBounds(500, 360, 100, 30);
        userpass.setBounds(500, 430, 100, 30);
        
        nom.setBounds(700, 150, 150, 30);
        prenom.setBounds(700, 220, 150, 30);
        age.setBounds(700, 290, 150, 30);
        login.setBounds(700, 360, 150, 30);
        password.setBounds(700, 430, 150, 30);
          
        loginButton.setBounds(600, 500, 100, 30);
        //
        //
        //
        Inscription_Panel.add(usernom);
        Inscription_Panel.add(userpnom);
        Inscription_Panel.add(userage);
        Inscription_Panel.add(userlogin);
        Inscription_Panel.add(userpass);
        Inscription_Panel.add(nom);
        Inscription_Panel.add(prenom);
        Inscription_Panel.add(age);
        Inscription_Panel.add(login);
        Inscription_Panel.add(password);
        
        Inscription_Panel.add(loginButton);
	}
	
	
	
	public void initialiser_acceuil() {
		
	}
	
	
	
	
	

}
