package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import Model.Capteur;
import Model.TerCom;

public class techniview  extends JFrame{
	JMenuBar mb;
	public JMenu menu;
	public JMenuItem modifierinfos;
	public JMenuItem voircapteurs;
	public JPanel pp,pconnex,pmodifier,pvoircapteurs,p;
	public CardLayout card;
	public JLabel userLabel = new JLabel("USERNAME");
	public JLabel passwordLabel = new JLabel("PASSWORD");
	public JTextField userTextField = new JTextField();
	public JPasswordField passwordField = new JPasswordField();
	public JButton loginButton = new JButton("LOGIN");
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
	public JButton loginButton2 = new JButton("Modifier");
	public LinkedList<Capteur> list=new LinkedList();

	public JTable jtcap = new JTable();
	public LinkedList<TerCom> listcap=new LinkedList();
    public JButton installer=new JButton();
    public JTextField idInsta=new JTextField();
	
	
    public techniview() throws IOException {
    	pp = new JPanel();
    	pp.setBackground(Color.ORANGE);

		   BufferedImage img = ImageIO.read(new File("/Users/user/Downloads/Nouveau dossier/Smart Agriculture Technicien/src/View/techtech.png"));
		   JLabel pic = new JLabel(new ImageIcon(img));
		   pp.add(pic, BorderLayout.CENTER);
		   
   	 setTitle("espace technicien");
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(true);
     this.pack();
     card=new CardLayout();  
      JFrame.setDefaultLookAndFeelDecorated(true);
     this.setExtendedState(Frame.MAXIMIZED_BOTH);
     //menu
     mb=new JMenuBar();
     menu = new JMenu("Votre Espace");
     modifierinfos =new JMenuItem("modifier les infos");
     voircapteurs=new JMenuItem("voir la listes des capteurs à installer");
     //connexion
     pconnex=new JPanel();
     userLabel.setBounds(500, 150, 100, 30);
     passwordLabel.setBounds(500, 220, 100, 30);
     userTextField.setBounds(700, 150, 150, 30);
     passwordField.setBounds(700, 220, 150, 30);
     loginButton.setBounds(600, 300, 120, 50);
     
     
     pconnex.setLayout(null);
     pconnex.add(userLabel);pconnex.add(userTextField);pconnex.add(passwordLabel);pconnex.add(passwordField);pconnex.add(loginButton);
     //modifierInfos
     
     pmodifier=new JPanel();
     
     pmodifier.setLayout(new BoxLayout(pmodifier,BoxLayout.Y_AXIS));
     pmodifier.setBounds(200, 500, 600, 700);
    
      login.setEditable(false);
      
      loginButton2.setBounds(600, 500, 100, 30);
      pmodifier.add(usernom);        pmodifier.add(nom);  
      pmodifier.add(userpnom);        pmodifier.add(prenom);         pmodifier.add(userage);         pmodifier.add(age); 
      pmodifier.add(userlogin);    
      pmodifier.add(login);       pmodifier.add(userpass);       pmodifier.add(password);      pmodifier.add(loginButton2); 
      /*modifierinfos.addMenuListener(new MenuListener() {
  		  public void menuSelected(MenuEvent a) {
  		    	card.show(p,"modification");
  		    	System.out.print("modification");
  		    	}
*/


      //voir les capteurs
      pvoircapteurs=new JPanel();
      pvoircapteurs.setLayout(new BorderLayout());
     /* for(int j=0;j<list.size();j++) {
     	 pvoircapteurs.add(new JLabel(list.get(j).getDesignation()));
     	 pvoircapteurs.add(new JLabel(list.get(j).getType()));


      }*/
    	JPanel voirCapt = new JPanel();
        
        
        installer = new JButton("Installer");
        idInsta = new JTextField(3);
        
        voirCapt.add(new JLabel("Entrez l'id"));
        voirCapt.add(idInsta);
        voirCapt.add(installer);
        
        voirCapt.setBackground(new Color(120,120,120));
       
 		pvoircapteurs.add(new JScrollPane(jtcap),BorderLayout.CENTER);
 		pvoircapteurs.add(voirCapt,BorderLayout.SOUTH);

      
      
      
     /* voircapteurs.addMenuListener(new MenuListener() {
  		  public void menuSelected(MenuEvent a) {
  		    	card.show(p,"voir capteur");
  		    	System.out.print("fait");
  		    	}


		@Override
		public void menuDeselected(MenuEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void menuCanceled(MenuEvent e) {
			// TODO Auto-generated method stub
			
		}
  		
  	});*/
     //menu
     setJMenuBar(mb);
     menu.add(modifierinfos);
     menu.add(voircapteurs);
     mb.add(menu);
     // panneaux
     
     p=new JPanel();
     p.setLayout(card);
   //p.add(pconnex,"connexion");
     p.add(pp);
     p.add(pmodifier,"modification");
     p.add(pvoircapteurs,"voir capteur");


     
    add(p);	
    	
    }

/*
	public static void main(String[] args) {
		techniview tv= new techniview(); 
		
	}
*/
}
