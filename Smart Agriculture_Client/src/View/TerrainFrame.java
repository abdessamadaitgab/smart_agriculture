package View;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.Client;
import Model.Terrain;
import db.CRUD_Client;

public class TerrainFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	Container container = getContentPane();
    JLabel sup= new JLabel("SUPERFICIE");
    JLabel adresse= new JLabel("ADRESSE");
    JLabel ville= new JLabel("VILLE");
    
   
    JTextField tsup= new JTextField();
    JTextField tadresse= new JTextField();
    JTextField tville= new JTextField();
   
     
    JButton loginButton = new JButton("AJOUTER");
    
    CRUD_Client cc=new CRUD_Client();
    
    TerrainFrame() {
    	 setTitle("Terrain Form");
	      setBounds(100, 100, 370, 600);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(true);
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
        sup.setBounds(500, 150, 100, 30);
        adresse.setBounds(500, 220, 100, 30);
        ville.setBounds(500, 290, 100, 30);
      
        
        
        tsup.setBounds(700, 150, 150, 30);
        tadresse.setBounds(700, 220, 150, 30);
        tville.setBounds(700, 290, 150, 30);
      
        
        loginButton.setBounds(600, 500, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(sup);
        container.add(tsup);
        container.add(adresse);
        container.add(tadresse);
        container.add(ville);
        container.add(tville);
      
        
        container.add(loginButton);
        
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String superficie,adresseter,villeter;
            
           superficie=sup.getText();
           adresseter=adresse.getText();
           villeter=ville.getText();
           double superter=Double.parseDouble(superficie);
           Terrain t=new Terrain(superter,adresseter,villeter);
            
           /* try {
				cc.CRUD_Client("root","Aitgab@1998");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            boolean m=false;
            
				try {
					m= cc.Ajouter_Client(c);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(m) {
					
				 JOptionPane.showMessageDialog(this, "Client ajouté avec succés");
				 setVisible(false);

            
          
                
            } else {
                JOptionPane.showMessageDialog(this, "Veuillez ressayer s'il vous plait");
            }}*/
    }
}

	public static void main(String[] args) {
		TerrainFrame tin=new TerrainFrame ();

	}}
