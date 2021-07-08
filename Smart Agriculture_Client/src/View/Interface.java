package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.Capteur;
import Model.Terrain;
import Model.captter;

public class Interface extends JFrame{
	public JPanel panel;
	public JPanel Login_Panel;
	public JPanel Inscription_Panel;
	public JPanel acceuil_Panel;
	public JPanel Terrain_Panel;
	public JPanel Infos_Panel;
	public JPanel Paiement_Panel;
	
	public CardLayout Card;

	JButton b;
	
	// Login Panel
	
    public JLabel login_userLabel = new JLabel("USERNAME");
    public JLabel login_passwordLabel = new JLabel("PASSWORD");
    
    public JTextField login_userTextField = new JTextField();
    public JPasswordField login_passwordField = new JPasswordField();
    
    public JButton login_Button_login = new JButton("LOGIN");
    public JButton login_resetButton = new JButton("RESET");
    public JButton login_InscrireButton = new JButton("S'inscrire");	
    
    
    JCheckBox login_showPassword = new JCheckBox("Show Password");

    //Fin Login Panel
    
    
    
    
    
    //Inscription Panel
    
    public JLabel inscription_usernom= new JLabel("NOM");
    public JLabel inscription_userpnom= new JLabel("PRENOM");
    public JLabel inscription_userage= new JLabel("AGE");
    public JLabel inscription_userlogin = new JLabel("LOGIN");
    public JLabel inscription_userpass = new JLabel("PASSWORD");
   
    public JTextField inscription_nom= new JTextField();
    public JTextField inscription_prenom= new JTextField();
    public JTextField inscription_age= new JTextField();
    public JTextField inscription_login= new JTextField();
    public JPasswordField inscription_password = new JPasswordField();
     
    public JButton inscription_inscrire_Button = new JButton("S'INSCRIRE");     

    //Fin Inscription Panel
    
    
    
    
    //Acceuil Panel
    
	JPanel acceuil_p=new JPanel();
	JPanel acceuil_haut=new JPanel();
	JPanel acceuil_moy=new JPanel();
    public JButton acceuil_b0,acceuil_b1,acceuil_b2,acceuil_b3,acceuil_b4,acceuil_b5;
    public JLabel acceuil_lbl;
    public JButton acceuil_accueil_btn,acceuil_espace_btn,acceuil_connecter_btn,acceuil_creer_btn;
    public LinkedList<Capteur> l;

    
    //Fin Acceuil Panel
    
    
    
    
    //Terrain Panel
    

    JLabel Terrain_sup= new JLabel("SUPERFICIE");
    JLabel Terrain_adresse= new JLabel("ADRESSE");
    JLabel Terrain_ville= new JLabel("VILLE");
    JLabel tlab;
    
   
    public JTextField Terrain_tsup= new JTextField();
    public JTextField Terrain_tadresse= new JTextField();
    public JTextField Terrain_tville= new JTextField();
   
     
    public JButton Terrain_Ajouter_Button = new JButton("AJOUTER");
    public JButton Terrain_Existe_Button = new JButton("Choisir un terrain existant");

    
    //Fin Terrain Panel
    
    
    
    
    
    //Infos Panel
    
    
    JLabel Infos_usernom= new JLabel("NOM");
    JLabel Infos_userpnom= new JLabel("PRENOM");
    JLabel Infos_userage= new JLabel("AGE");
    JLabel Infos_userlogin = new JLabel("LOGIN");
    JLabel Infos_userpass = new JLabel("PASSWORD");
   
    public JTextField Infos_nom= new JTextField();
    public JTextField Infos_prenom= new JTextField();
    public JTextField Infos_age= new JTextField();
    public JTextField Infos_login= new JTextField();
    public JPasswordField Infos_password = new JPasswordField();
     
    public JButton Infos_Modifier_Button = new JButton("MODIFIER");

    
    
    //Fin Infos Panel
    
    
    
    
    
    
    
    //Paiement Panel
    
    JLabel type= new JLabel("TYPE DE CARTE");
    JLabel num= new JLabel("NUMERO DE LA CARTE");
    JLabel code= new JLabel("CODE DE SECURITE");
    JLabel nom = new JLabel("NOM DU PROPRIETAIRE");
    JLabel date = new JLabel("DATE D'EXPIRATION");
    
    public String types[]={"VISA","MASTERCARD"};        
    public JComboBox tcb=new JComboBox(types); 
    DateFormat format = new SimpleDateFormat("MM/YYYY");
    public JFormattedTextField tdate= new JFormattedTextField(format);
    public JTextField tnum=new JTextField("");
    public JTextField tcode=new JTextField("");
    public JTextField tnom=new JTextField("");
    public JButton loginButton = new JButton("PAYER");

    
    
    //Espaaaaaaace
    public JPanel phaut;
	public JPanel Espace_Panel;

    //Voir Capteur
	public JButton bvoircapteur;
	public JPanel pvoircapteur=new JPanel();
	public JTable jtcap = new JTable();
	public JButton bretourcap;
	

	
	//Voir Terrain
	public JButton bvoirterrain;
	public JPanel pvoirterrain =new JPanel();
	public JTable jtter = new JTable();
	public JButton bretourter;

	//Voir Resultat
	public JButton bvoirdecision;
	public JButton bretourdec;
	public JPanel pvoirdecision=new JPanel();
	
    public JLabel tidvisualisert;
    public JTextField idvisualisert;

	
	//Modifier infos
	public JButton bmodifierInfos;
	public JButton bretourmod;
	public JPanel pmodifierInfos=new JPanel();
	//
	public JButton bacc;
	public JLabel usernom= new JLabel("NOM");
	public  JLabel userpnom= new JLabel("PRENOM");
	public  JLabel userage= new JLabel("AGE");
	public  JLabel userlogin = new JLabel("LOGIN");
	public  JLabel userpass = new JLabel("PASSWORD");
	   
	public  JTextField nomm= new JTextField();
	public   JTextField prenomm= new JTextField();
	public   JTextField agem= new JTextField();
	    public  JTextField loginm= new JTextField();
	    public  JPasswordField passwordm = new JPasswordField();
	     
	    public JButton loginButtonm = new JButton("MODIFIER");

	    
	    //voir Decision
	    
	     public JLabel tidvisualiser;
	     public JTextField idvisualiser;
	     public JButton visualiser;

	
	//
	public LinkedList<captter> listcap=new LinkedList();
	public LinkedList<Terrain> listerr=new LinkedList();

    
    
    
	public Interface(LinkedList<Capteur> list) throws IOException {
		l = list;
		
		Card = new CardLayout();
		panel = new JPanel(Card);
		
		setTitle("Smart Agriculture");
		
		Login_Panel = new JPanel();
		Login_Panel.setLayout(null);
		Inscription_Panel = new JPanel();
		Inscription_Panel.setLayout(null);
		acceuil_Panel = new JPanel();
		acceuil_Panel.setLayout(null);
		Terrain_Panel = new JPanel();
		Terrain_Panel.setLayout(null);	
		Infos_Panel = new JPanel();
		Infos_Panel.setLayout(null);
		
		Paiement_Panel = new JPanel();
		Paiement_Panel.setLayout(null);
		
		//
		Espace_Panel= new JPanel();
		//Espace_Panel.setLayout(null);
		
		//Voir capteur 
		//pvoircapteur.setLayout(null);
		//pvoirterrain.setLayout(null);
		//pvoirdecision.setLayout(null);
		//pmodifierInfos.setLayout(null);

		//Voir Terrain
		
		
		


		initialiser_Login();
		initialiser_Inscription();
		initialiser_Acceuil(l);
		initialiser_Terrain();
		initialiser_Infos();
		initialiser_Paiement();
		
		initialiser_Espace();
		initialiser_VoirCapteur();
		initialiser_VoirTerrain();
		initialiser_modInfos();
		initialiser_VoirDecision();
		panel.setBackground(Color.DARK_GRAY);
		panel.add(Login_Panel,"Login");
		panel.add(Inscription_Panel,"Inscription");
		panel.add(acceuil_Panel,"Acceuil");
		panel.add(Terrain_Panel,"Terrain");
		panel.add(Infos_Panel,"Infos");
		panel.add(Paiement_Panel,"Paiement");
		panel.add(Espace_Panel,"Espace");
		panel.add(pvoircapteur,"voir capteur");
		panel.add(pvoirterrain,"voir terrain");
		panel.add(pvoirdecision,"voir decision");
		panel.add(pmodifierInfos,"modifier infos");
		
		Container c  =  getContentPane();
		c.add(panel);
		c.setBackground(Color.DARK_GRAY);
		//c.setVisible(true);
		setSize(getMaximumSize());
		setVisible(true);
		show();
	}
	
	
	
	
	
	public void initialiser_Login() {
		Login_Panel.setSize(950, 650);
		//
        Login_Panel.add(login_userLabel);
        Login_Panel.add(login_passwordLabel);
        Login_Panel.add(login_userTextField);
        Login_Panel.add(login_passwordField);
        Login_Panel.add(login_showPassword);
        Login_Panel.add(login_Button_login);
        Login_Panel.add(login_resetButton);
        Login_Panel.add(login_InscrireButton);
		//
        login_userLabel.setBounds(500, 150, 100, 30);
        login_passwordLabel.setBounds(500, 220, 100, 30);
        login_userTextField.setBounds(700, 150, 150, 30);
        login_passwordField.setBounds(700, 220, 150, 30);
        login_showPassword.setBounds(800, 250, 150, 30);
        login_Button_login.setBounds(500, 300, 100, 30);
        login_resetButton.setBounds(700, 300, 100, 30);
        login_InscrireButton.setBounds(900, 600, 100, 30);
       
	}
	
	
	
	
	
	
	public void initialiser_Inscription() {
		Inscription_Panel.setSize(750,600);
		
		inscription_usernom.setBounds(500, 150, 100, 30);
		inscription_userpnom.setBounds(500, 220, 100, 30);
		inscription_userage.setBounds(500, 290, 100, 30);
		inscription_userlogin.setBounds(500, 360, 100, 30);
		inscription_userpass.setBounds(500, 430, 100, 30);
        
		inscription_nom.setBounds(700, 150, 150, 30);
		inscription_prenom.setBounds(700, 220, 150, 30);
		inscription_age.setBounds(700, 290, 150, 30);
		inscription_login.setBounds(700, 360, 150, 30);
		inscription_password.setBounds(700, 430, 150, 30);
          
		inscription_inscrire_Button.setBounds(600, 500, 100, 30);
        //
        //
        //
        Inscription_Panel.add(inscription_usernom);
        Inscription_Panel.add(inscription_userpnom);
        Inscription_Panel.add(inscription_userage);
        Inscription_Panel.add(inscription_userlogin);
        Inscription_Panel.add(inscription_userpass);
        Inscription_Panel.add(inscription_nom);
        Inscription_Panel.add(inscription_prenom);
        Inscription_Panel.add(inscription_age);
        Inscription_Panel.add(inscription_login);
        Inscription_Panel.add(inscription_password);
        
        Inscription_Panel.add(inscription_inscrire_Button);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void initialiser_Acceuil(LinkedList<Capteur> All_Capteurs) {
		
		
		acceuil_accueil_btn=new JButton("accueil");
		acceuil_espace_btn =new JButton("mon espace");
		//acceuil_connecter_btn=new JButton("se connecter");
		//acceuil_creer_btn=new JButton("creer un compte");
		acceuil_haut.setLayout(new FlowLayout());
		acceuil_haut.add(acceuil_accueil_btn);
		acceuil_haut.add(acceuil_espace_btn);
		
		
		acceuil_moy.setLayout(new GridLayout(0,3));
		// l= cc.GetAllCapteurs();
		Dimension maxSize = new Dimension(400, 300);

		//for(int i=0;i<All_Capteurs.size();i++) {
			 double prix0=All_Capteurs.get(0).getPrix();
			 String pr0= Double.toString(prix0);
			 String img0 = "capteurtemperature.jpeg";
			 
			 acceuil_b0=new JButton(All_Capteurs.get(0).getDesignation()+" "+All_Capteurs.get(0).getType()+" "+pr0+"DHS",new ImageIcon(this.getClass().getResource(img0)));
			//System.out.println(All_Capteurs.get(0).getImage().substring(1));
			 acceuil_b0.setFont(new Font("Arial", Font.BOLD, 15));
			 acceuil_b0.setHorizontalTextPosition(SwingConstants.CENTER);
			 acceuil_b0.setVerticalTextPosition(SwingConstants.BOTTOM);
			// b.setMaximumSize(maxSize);
			 acceuil_b0.setPreferredSize(maxSize);
			 acceuil_moy.add(acceuil_b0);
             
			 //1
			 double prix1=All_Capteurs.get(1).getPrix();
			 String pr1= Double.toString(prix1);
			 String img1 = "capteurhumidite.jpeg";

			 
			 acceuil_b1=new JButton(All_Capteurs.get(1).getDesignation()+" "+All_Capteurs.get(1).getType()+" "+pr1+"DHS",new ImageIcon(this.getClass().getResource(img1)));
			 acceuil_b1.setFont(new Font("Arial", Font.BOLD, 15));
			 acceuil_b1.setHorizontalTextPosition(SwingConstants.CENTER);
			 acceuil_b1.setVerticalTextPosition(SwingConstants.BOTTOM);
			// b.setMaximumSize(maxSize);
			 acceuil_b1.setPreferredSize(maxSize);
			 acceuil_moy.add(acceuil_b1);

			 //2
			 
			 double prix2=All_Capteurs.get(2).getPrix();
			 String pr2= Double.toString(prix2);
			 
			 String img2 = "capteureau.jpeg";
			 
			 acceuil_b2=new JButton(All_Capteurs.get(2).getDesignation()+" "+All_Capteurs.get(2).getType()+" "+pr2+"DHS",new ImageIcon(this.getClass().getResource(img2)));
			 acceuil_b2.setFont(new Font("Arial", Font.BOLD, 15));
			 acceuil_b2.setHorizontalTextPosition(SwingConstants.CENTER);
			 acceuil_b2.setVerticalTextPosition(SwingConstants.BOTTOM);
			// b.setMaximumSize(maxSize);
			 acceuil_b2.setPreferredSize(maxSize);
			 acceuil_moy.add(acceuil_b2);

			 
			 //3
			 
			 double prix3=All_Capteurs.get(3).getPrix();
			 String pr3= Double.toString(prix3);
			 
			 String img3 = "capteureau2.jpeg";

			 
			 acceuil_b3=new JButton(All_Capteurs.get(3).getDesignation()+" "+All_Capteurs.get(3).getType()+" "+pr3+"DHS",new ImageIcon(this.getClass().getResource(img3)));
			 acceuil_b3.setFont(new Font("Arial", Font.BOLD, 15));
			 acceuil_b3.setHorizontalTextPosition(SwingConstants.CENTER);
			 acceuil_b3.setVerticalTextPosition(SwingConstants.BOTTOM);
			// b.setMaximumSize(maxSize);
			 acceuil_b3.setPreferredSize(maxSize);
			 acceuil_moy.add(acceuil_b3);

			 
			//4
			 
			 double prix4=All_Capteurs.get(4).getPrix();
			 String pr4= Double.toString(prix4);
			 
			 String img4 = "capteurtemperature2.jpeg";

			 
			 acceuil_b4=new JButton(All_Capteurs.get(4).getDesignation()+" "+All_Capteurs.get(4).getType()+" "+pr4+"DHS",new ImageIcon(this.getClass().getResource(img4)));
			 acceuil_b4.setFont(new Font("Arial", Font.BOLD, 15));
			 acceuil_b4.setHorizontalTextPosition(SwingConstants.CENTER);
			 acceuil_b4.setVerticalTextPosition(SwingConstants.BOTTOM);
			// b.setMaximumSize(maxSize);
			 acceuil_b4.setPreferredSize(maxSize);
			 acceuil_moy.add(acceuil_b4);

			 
			 //5
			 
			 double prix5=All_Capteurs.get(5).getPrix();
			 String pr5= Double.toString(prix5);
			 
			 String img5 = "capteurhumidite2.jpeg";

			 
			 acceuil_b5=new JButton(All_Capteurs.get(5).getDesignation()+" "+All_Capteurs.get(5).getType()+" "+pr5+"DHS",new ImageIcon(this.getClass().getResource(img5)));
			 acceuil_b5.setFont(new Font("Arial", Font.BOLD, 15));
			 acceuil_b5.setHorizontalTextPosition(SwingConstants.CENTER);
			 acceuil_b5.setVerticalTextPosition(SwingConstants.BOTTOM);
			// b.setMaximumSize(maxSize);
			 acceuil_b5.setPreferredSize(maxSize);
			 acceuil_moy.add(acceuil_b5);

		//}
		
		
		

		  acceuil_Panel.setVisible(true);
		  acceuil_Panel.setBounds(100, 100, 370, 600);





		  acceuil_Panel.setLayout(new BorderLayout());
		  acceuil_Panel.add(acceuil_haut,BorderLayout.PAGE_START);
	      acceuil_p.add(acceuil_moy);
	      acceuil_Panel.add(acceuil_p,BorderLayout.CENTER);
	      acceuil_Panel.setBackground(Color.DARK_GRAY);
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	public void initialiser_Terrain() {
		
     Terrain_Panel.setBounds(100, 100, 370, 600);
     Terrain_Panel.setVisible(true);
     
     //
     
     Terrain_sup.setBounds(500, 150, 100, 30);
     Terrain_adresse.setBounds(500, 220, 100, 30);
     Terrain_ville.setBounds(500, 290, 100, 30);
   
     
     
     Terrain_tsup.setBounds(700, 150, 150, 30);
     Terrain_tadresse.setBounds(700, 220, 150, 30);
     Terrain_tville.setBounds(700, 290, 150, 30);
   
     
     Terrain_Ajouter_Button.setBounds(480, 400, 150, 30);
     Terrain_Existe_Button.setBounds(660, 400, 200, 30);
     
     //
     tlab=new JLabel("Entrez les informations du terrain ou vous voulez installer ce capteur");
     Terrain_Panel.add(tlab,BorderLayout.NORTH);
     
     Terrain_Panel.add(Terrain_sup);
     Terrain_Panel.add(Terrain_tsup);
     Terrain_Panel.add(Terrain_adresse);
     Terrain_Panel.add(Terrain_tadresse);
     Terrain_Panel.add(Terrain_ville);
     Terrain_Panel.add(Terrain_tville);
   
     
     Terrain_Panel.add(Terrain_Ajouter_Button);
     Terrain_Panel.add(Terrain_Existe_Button);



		
		
	}

	
	
	
	

	
	public void initialiser_Infos() {
		
		

		Infos_Panel.setVisible(true);
		Infos_Panel.setBounds(100, 100, 370, 600);

		
		//
		
		Infos_usernom.setBounds(500, 150, 100, 30);
		Infos_userpnom.setBounds(500, 220, 100, 30);
		Infos_userage.setBounds(500, 290, 100, 30);
		Infos_userlogin.setBounds(500, 360, 100, 30);
		Infos_userpass.setBounds(500, 430, 100, 30);
        
        
		Infos_nom.setBounds(700, 150, 150, 30);
		Infos_prenom.setBounds(700, 220, 150, 30);
		Infos_age.setBounds(700, 290, 150, 30);
		Infos_login.setBounds(700, 360, 150, 30);
		Infos_password.setBounds(700, 430, 150, 30);
        
        
		Infos_Modifier_Button.setBounds(600, 500, 100, 30);
		
		
		//
		
		Infos_Panel.add(Infos_usernom);
		Infos_Panel.add(Infos_userpnom);
		Infos_Panel.add(Infos_userage);
		Infos_Panel.add(Infos_userlogin);
		Infos_Panel.add(Infos_userpass);
		Infos_Panel.add(Infos_nom);
		Infos_Panel.add(Infos_prenom);
		Infos_Panel.add(Infos_age);
		Infos_Panel.add(Infos_login);
		Infos_Panel.add(Infos_password);
        
		Infos_Panel.add(Infos_Modifier_Button);
		
		
		
	}

	
	
	
	
	public void initialiser_Paiement() {
			setVisible(true);
	      setBounds(100, 100, 370, 600);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(true);

	      this.pack();
     JFrame.setDefaultLookAndFeelDecorated(true);
     this.setExtendedState(Frame.MAXIMIZED_BOTH);
     
     
     
     type.setBounds(500, 150, 150, 30);
     num.setBounds(500, 220, 150, 30);
     code.setBounds(500, 290, 150, 30);
     nom.setBounds(500, 360, 150, 30);
     date.setBounds(500, 430, 150, 30);
     tdate.setValue(new Date());;
     
     tcb.setBounds(700, 150, 150, 30);
     tnum.setBounds(700, 220, 150, 30);
     tcode.setBounds(700, 290, 150, 30);
     tnom.setBounds(700, 360, 150, 30);
     tdate.setBounds(700, 430, 150, 30);
     
     
     loginButton.setBounds(600, 500, 100, 30);
     
     
     
     //
     
     
     Paiement_Panel.add(type);
     Paiement_Panel.add(num);
     Paiement_Panel.add(code);
     Paiement_Panel.add(nom);
     Paiement_Panel.add(date);
     Paiement_Panel.add(tcb);
     Paiement_Panel.add(tnum);
     Paiement_Panel.add(tcode);
     Paiement_Panel.add(tnom);
     Paiement_Panel.add(tdate);
     
     Paiement_Panel.add(loginButton);

     
     
     
  
     
	}

	
	
	
	
	
	
	public void initialiser_Espace() throws IOException {
		  setVisible(true);
	      setBounds(100, 100, 370, 600);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(true);

	      this.pack();
   
		bvoircapteur=new JButton("voir mes capteurs");
		bvoirterrain=new JButton("voir mes terrains");
		bvoirdecision =new JButton("voir les r�sultat des capteur");
		bmodifierInfos=new JButton("modifier mes infos");
		bacc = new JButton("Acceuil");
		bvoirdecision= new JButton("voir les r�sultat des capteur");

	     phaut=new JPanel();
	     phaut.setLayout(new FlowLayout());
	     phaut.add(bvoircapteur);
	     phaut.add(bvoirterrain);
	     phaut.add(bmodifierInfos);
	     phaut.add(bvoirdecision);
	     phaut.add(bvoirdecision);
	     phaut.add(bacc);
		 Espace_Panel.add(phaut,BorderLayout.PAGE_START);
		 
            JPanel pp=new JPanel();
		   BufferedImage img = ImageIO.read(new File("/Users/user/Downloads/Nouveau dossier/Smart Agriculture_Client/src/View/clientespace.png"));
		   JLabel pic = new JLabel(new ImageIcon(img));
		   pp.setBackground(Color.darkGray);
		   pp.add(pic);
		   Espace_Panel.add(pp, BorderLayout.CENTER);
		   
		   
		
	}
	
	
	
	
	public void initialiser_VoirCapteur() {
		pvoircapteur.setLayout(new BorderLayout());

		bretourcap = new JButton("Retour");
		bretourcap.setBounds(450, 500, 100, 30);

		JScrollPane jscap = new JScrollPane(jtcap);
		
		pvoircapteur.add(new JScrollPane(jtcap),BorderLayout.CENTER);

		pvoircapteur.add(bretourcap,BorderLayout.SOUTH);

		
	}
	
	
	
	
	public void initialiser_VoirTerrain() {
		pvoirterrain.setLayout(new BorderLayout());
		bretourter = new JButton("Retour");
		bretourter.setBounds(450, 500, 100, 30);
		JScrollPane jscap = new JScrollPane(jtter);
		
		pvoirterrain.add(new JScrollPane(jtter),BorderLayout.CENTER);
		pvoirterrain.add(bretourter,BorderLayout.SOUTH);

	}
	
	
	
	public void initialiser_modInfos() {
	    pmodifierInfos.setLayout(new GridLayout(6,2));
	    bretourmod = new JButton("retour");
	    
	    usernom.setAlignmentX(RIGHT_ALIGNMENT);
	    userpnom.setAlignmentX(RIGHT_ALIGNMENT);
	    userage.setAlignmentX(RIGHT_ALIGNMENT);
	    userlogin.setAlignmentX(RIGHT_ALIGNMENT);
	    userpass.setAlignmentX(RIGHT_ALIGNMENT);
        
        
        nomm.setPreferredSize(new Dimension(50, 25));
        prenomm.setPreferredSize(new Dimension(50, 25));
        agem.setPreferredSize(new Dimension(50, 25));
        loginm.setPreferredSize(new Dimension(50, 25));
        passwordm.setPreferredSize(new Dimension(50, 25));

        
        
        loginButtonm.setBounds(600, 500, 100, 30);
        bretourmod.setBounds(720, 500, 80, 30);
        pmodifierInfos.add(usernom);        pmodifierInfos.add(nomm);

        pmodifierInfos.add(userpnom);        pmodifierInfos.add(prenomm);

        pmodifierInfos.add(userage);        pmodifierInfos.add(agem);

        pmodifierInfos.add(userlogin);        pmodifierInfos.add(loginm);

        pmodifierInfos.add(userpass);
        pmodifierInfos.add(passwordm);
        
        pmodifierInfos.add(loginButtonm,BorderLayout.CENTER);
        pmodifierInfos.add(bretourmod,BorderLayout.CENTER);
        pmodifierInfos.setBounds(600, 500, 100, 30);

	}
	
	
	
	public void initialiser_VoirDecision() {
		
	      tidvisualiser=new JLabel("entrez l'id du capteur que vous voulez visualisez") ;
	      idvisualiser=new JTextField(5);
	      visualiser=new JButton("visualiser");
	      
		 bretourdec = new JButton("Retour");
	      tidvisualisert=new JLabel("entrez l'id du terrain") ;
	      idvisualisert=new JTextField(5);

	     
	     pvoirdecision.add(tidvisualiser);     pvoirdecision.add(idvisualiser);
	     pvoirdecision.add(tidvisualisert);     pvoirdecision.add(idvisualisert);

	     pvoirdecision.add(visualiser); pvoirdecision.add(bretourdec);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
