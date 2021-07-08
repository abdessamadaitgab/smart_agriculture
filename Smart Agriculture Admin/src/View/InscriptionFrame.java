package View;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.Client;
import db.CRUD_Client;

public class InscriptionFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public Container container = getContentPane();
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
     
    JButton loginButton = new JButton("S'INSCRIRE");
    
    CRUD_Client cc=new CRUD_Client();
    
    public InscriptionFrame() {
    	 setTitle("Login Form");
	      setVisible(true);
	      setBounds(100, 100, 370, 600);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(true);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
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

   /* public void addActionEvent() {
        loginButton.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String nm,pnm,lg,pss;
            String ag;
            nm=nom.getText();
            pnm=prenom.getText();
            ag=age.getText();
            lg=login.getText();
            pss=password.getText();
           int agee=Integer.parseInt(ag);
            
            
            Client c=new Client (nm,pnm,agee,lg,pss);
            try {
				cc.CRUD_Client("root","Aitgab@1998");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            boolean m5=false;
            
				try {
					m5= cc.Ajouter_Client(c);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(m5) {
					
                  new LoginFrame();			

            
          
                
            } else {
                JOptionPane.showMessageDialog(this, "Veuillez ressayer s'il vous plait");
            }}
    }
        */


	public static void main(String[] args) {
		InscriptionFrame in=new InscriptionFrame ();

	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public JLabel getUsernom() {
		return usernom;
	}

	public void setUsernom(JLabel usernom) {
		this.usernom = usernom;
	}

	public JLabel getUserpnom() {
		return userpnom;
	}

	public void setUserpnom(JLabel userpnom) {
		this.userpnom = userpnom;
	}

	public JLabel getUserage() {
		return userage;
	}

	public void setUserage(JLabel userage) {
		this.userage = userage;
	}

	public JLabel getUserlogin() {
		return userlogin;
	}

	public void setUserlogin(JLabel userlogin) {
		this.userlogin = userlogin;
	}

	public JLabel getUserpass() {
		return userpass;
	}

	public void setUserpass(JLabel userpass) {
		this.userpass = userpass;
	}

	public JTextField getNom() {
		return nom;
	}

	public void setNom(JTextField nom) {
		this.nom = nom;
	}

	public JTextField getPrenom() {
		return prenom;
	}

	public void setPrenom(JTextField prenom) {
		this.prenom = prenom;
	}

	public JTextField getLogin() {
		return login;
	}

	public void setLogin(JTextField login) {
		this.login = login;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(JButton loginButton) {
		this.loginButton = loginButton;
	}

}
