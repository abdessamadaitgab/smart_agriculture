package View;

import java.awt.Container;
import java.awt.Frame;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.Client;
import db.CRUD_Client;

public class modifierInfos extends JFrame {
	int id;
	
	private static final long serialVersionUID = 1L;
	Container container = getContentPane();
    JLabel usernom= new JLabel("NOM");
    JLabel userpnom= new JLabel("PRENOM");
    JLabel userage= new JLabel("AGE");
    JLabel userlogin = new JLabel("LOGIN");
    JLabel userpass = new JLabel("PASSWORD");
   
    JTextField nom= new JTextField();
    JTextField prenom= new JTextField();
    JTextField age= new JTextField();
    JTextField login= new JTextField();
    JPasswordField password = new JPasswordField();
     
    JButton loginButton = new JButton("MODIFIER");
    
    //CRUD_Client cc=new CRUD_Client();
    
    public modifierInfos(int id) throws SQLException {
    	this.id=id;
    	 setTitle("Login Form");
	      setVisible(true);
	      setBounds(100, 100, 370, 600);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(true);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
       /* cc.CRUD_Client("root", "Aitgab@1998");
       Client c= cc.GetClient_ById(id);
        nom.setText(c.getNom());
        prenom.setText(c.getPrenom());
        age.setText(Integer.toString(c.getAge()));
        login.setText(c.getLogin());
        password.setText(c.getMdp());
        login.setEditable(false);*/
        
      //  addActionEvent();
        this.pack();
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
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


    }

    public void addComponentsToContainer() {
        container.add(usernom);
        container.add(userpnom);
        container.add(userage);
        container.add(userlogin);
        container.add(userpass);
        container.add(nom);
        container.add(prenom);
        container.add(age);
        container.add(login);
        container.add(password);
        
        container.add(loginButton);
        
    }
    public static void main(String[] args) throws SQLException {
		
	}

	public JTextField getAge() {
		return age;
	}

	public void setAge(JTextField age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
