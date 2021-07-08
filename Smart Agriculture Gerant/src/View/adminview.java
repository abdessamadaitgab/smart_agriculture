package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
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

import Model.Capteur;
import Model.Client;
import Model.ClientTableModel;
import Model.Commande;
import Model.Technicien;


public class adminview extends JFrame implements ActionListener{
	/**
	 * 
	 */
	public LinkedList<Client> list=new LinkedList();
	public LinkedList<Capteur> listcap=new LinkedList();
	public LinkedList<Commande> listcom=new LinkedList();
	public LinkedList<Technicien> listtech=new LinkedList();

	public JTable jt = new JTable();
	public JTable jtcap = new JTable();
	public JTable jtcom = new JTable();
	

	private static final long serialVersionUID = 1L;
	public JMenuBar mb;
	public JMenu escl,estec,escom,escap;
	public JMenuItem ajoutercl,modifiercl,suppcl,voirlistcl,ajoutercap,supprimercapt,voirlistcap,modifiercap,ajoutertech,modifiertech,affichertech,affichercomm;
	public  JPanel p ,pacl,pmcl,pvide,pscl,pvoirclient,pacap,pscap,pvoircap,pvoircom,patech,pmtech,pvoirtech;
	public  JLabel usernom= new JLabel("NOM");
	public  JLabel userpnom= new JLabel("PRENOM");
	public  JLabel userage= new JLabel("AGE");
	public   JLabel userlogin = new JLabel("LOGIN");
	public  JLabel userpass = new JLabel("PASSWORD");
   
	public   JTextField nom;
	public JTextField prenom;
	public JTextField age;
	public  JTextField login;
	public JPasswordField password ;
     
	public JButton loginButton = new JButton("S'INSCRIRE");
	public JLabel usernom2= new JLabel("NOM");
	public  JLabel userpnom2= new JLabel("PRENOM");
	public  JLabel userage2= new JLabel("AGE");
	public JLabel userlogin2 = new JLabel("LOGIN");
	public JLabel userpass2 = new JLabel("PASSWORD");
   
	public JTextField nom2= new JTextField();
	public  JTextField prenom2= new JTextField();
	public  JTextField age2= new JTextField();
	public  JTextField login2= new JTextField();
	public   JPasswordField password2 = new JPasswordField();
    
    
	public JButton ajouter_technicien = new JButton("Ajouter technicien");
	public  JLabel usernom3= new JLabel("NOM");
	public  JLabel userpnom3= new JLabel("PRENOM");
	public  JLabel userage3= new JLabel("AGE");
	public  JLabel userlogin3 = new JLabel("LOGIN");
	public  JLabel userpass3 = new JLabel("PASSWORD");
    public  JLabel usersalaire= new JLabel("Salaire");

    
   
    public  JTextField nom3= new JTextField();
    public  JTextField prenom3= new JTextField();
    public  JTextField age3= new JTextField();
    public  JTextField login3= new JTextField();
    public JPasswordField password3 = new JPasswordField();
    public   JTextField salaire= new JTextField();
    
    
    public  JButton loginButton4 = new JButton("Ajouter technicien");
    public  JLabel usernom4= new JLabel("NOM");
    public  JLabel userpnom4= new JLabel("PRENOM");
    public  JLabel userage4= new JLabel("AGE");
    public JLabel userlogin4 = new JLabel("LOGIN");
    public JLabel userpass4 = new JLabel("PASSWORD");
    public JLabel usersalaire4= new JLabel("Salaire");

    
   
    public JTextField nom4= new JTextField();
    public JTextField prenom4= new JTextField();
    public JTextField age4= new JTextField();
    public  JTextField login4= new JTextField();
    public JPasswordField password4 = new JPasswordField();
    public  JTextField salaire4= new JTextField();

    
    
    public  JTextField idsupp,idsuppcap;
    public JButton suppclt=new JButton("supprimer clients");
    public JButton suppcap=new JButton("supprimer capteur");

     
    public JButton loginButton2 = new JButton("MODIFIER");
    /* espace capteurs*/
    public   JLabel des=new JLabel("designation");JLabel type=new JLabel("Type");JLabel prix=new JLabel("prix");JLabel image=new JLabel("image");
    public  JTextField tdes= new JTextField();
    public JTextField ttype= new JTextField();
    public  JTextField tprix= new JTextField();
    public  JTextField timage= new JTextField();
    public  JButton ajoutercapteur=new JButton("ajouter capteur");

    
    
    public CardLayout card;
    
    public adminview() {
    	 
    	 setTitle("Smart Agriculture");
    	 
	      setVisible(true);
	      setBounds(100, 100, 370, 600);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(true);
	      this.pack();
	      card=new CardLayout();
	      p=new JPanel();p.setBackground(Color.MAGENTA);
	      pvide=new JPanel();
	      pvide.setBackground(Color.cyan);
	       JFrame.setDefaultLookAndFeelDecorated(true);
	      this.setExtendedState(Frame.MAXIMIZED_BOTH);
	      JLabel timg=new JLabel("");

	      ImageIcon icone = new ImageIcon("/Users/user/Downloads/Nouveau dossier/Smart Agriculture Gerant/src/View/admm.png");
	      
	     
	      timg.setIcon(icone);
	      timg.setSize(400, 400);
	      pvide.add(timg , BorderLayout.CENTER);
	      
	      
	      mb=new JMenuBar();
	      escl=new JMenu("espace client");
	      estec=new JMenu("espace technicien");
	      escom=new JMenu("espace commande");
	      escap=new JMenu("espace capteur");
	      
	      
	      
	      
	      
	      
	      
	      ajoutercl=new JMenuItem("ajouter client");
	      
	      
	      
	    	ajoutercl.addActionListener(new ActionListener() {
	    		  public void actionPerformed(ActionEvent a) {
	    		    	card.show(p, "ajouter client");
	    		    	System.out.print("fait");
	    		    	}
	    		
	    	}); 

	    		  
	    modifiercl=new JMenuItem("modifier Client");

	    
	    
	    
	    suppcl=new JMenuItem("supprimer client");
		suppcl.addActionListener(new ActionListener() {
  		  public void actionPerformed(ActionEvent a) {
  			card.show(p, "supprimer client");
  		    	System.out.print("fait");
  		    	}
  		
  	}); 
		
		voirlistcl =new JMenuItem("voir la liste des clients");
	/*	voirlistcl.addActionListener(new ActionListener() {
  		  public void actionPerformed(ActionEvent a) {
  			card.show(p, "voir les clients");
  		    	//System.out.print("fait");
  		    	
  		    	}
  		
  	});*/
		
		
		  escl.add(ajoutercl); escl.add(modifiercl);escl.add(suppcl);escl.add(voirlistcl);
	      
		  
		  
	      /*panneau ajouter client*/
	      
	      JPanel pacldiv=new JPanel();
	      
	    
	      pacldiv.setLayout(new GridLayout(0,2,5,5));
	      //  loginButton.setBounds(600, 400, 100, 30);
           
			  nom= new JTextField("");
	             prenom= new JTextField("");
	             age= new JTextField("");
	             login= new JTextField("");
	            password = new JPasswordField("");
			
          

	       
	        pacldiv.add(usernom);  pacldiv.add(nom); 
	        pacldiv.add(userpnom);
	        pacldiv.add(prenom); pacldiv.add(userage);  pacldiv.add(age);pacldiv.add(userlogin);
	        pacldiv.add(login); pacldiv.add(userpass);
	        pacldiv.add(password);pacldiv.add(loginButton);

	       // pacl.add(loginButton,BorderLayout.SOUTH);
	       
	        
	        
	        
	        //panneau modifier cl
	        pmcl=new JPanel();
	       JPanel pmcldiv=new JPanel();
	       pmcldiv .setLayout(new BoxLayout(pmcldiv,BoxLayout.Y_AXIS));
	       pmcl.setBounds(200, 500, 600, 700);
	        pmcl.setLayout(new BorderLayout());
	      
	        
	        
	        loginButton2.setBounds(600, 500, 100, 30);
	        pmcldiv.add(usernom2);   pmcldiv.add(nom2);  
	        pmcldiv.add(userpnom2);   pmcldiv.add(prenom2);    pmcldiv.add(userage2);    pmcldiv.add(age2); 
	        pmcldiv.add(userlogin2);    
	              pmcldiv.add(login2);  pmcldiv.add(userpass2);  pmcldiv.add(password2); pmcldiv.add(loginButton2); 
	        pmcl.add(pmcldiv);
	        
	        
	        // supp cl;
	        pscl=new JPanel();
	        idsupp=new JTextField("saisir l'id du client");
	        pscl.add(idsupp); pscl.add(suppclt);
	        
	        //voir les clients
			pvoirclient=new JPanel();
			pvoirclient.setLayout(new BorderLayout());
           /*  for(int j=0;j<list.size();j++) {
            	 pvoirclient.add(new JTextField(list.get(j).getNom()));
            	 pvoirclient.add(new JTextField(list.get(j).getPrenom()));
            	 pvoirclient.add(new JTextField(list.get(j).getLogin()));
            	 pvoirclient.add(new JTextField(list.get(j).getMdp()));

             }
	        */
				//jt = new JTable(new ClientTableModel(list));
			    // jt.setAutoCreateRowSorter(true);
				//JScrollPane js = new JScrollPane(jt);
				//js.setMaximumSize(getMaximumSize());
				//jt.setSize(500,700);
				pvoirclient.add(new JScrollPane(jt),BorderLayout.CENTER);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //ajouter cap
		      ajoutercap=new JMenuItem("ajouter capteur");
		      pacap=new JPanel();
		      pacap.setLayout(new BoxLayout(pacap,BoxLayout.Y_AXIS));
		      pacap.add(des);pacap.add(tdes);
		      pacap.add(type);pacap.add(ttype);
		      pacap.add(prix);pacap.add(tprix);
		      pacap.add(image);pacap.add(timage);
		      ajoutercap.addActionListener(new ActionListener() {
  		  public void actionPerformed(ActionEvent a) {
  		    	card.show(p,"ajouter capteur");
  		    	System.out.print("fait");
  		    	}
  		
  	});
		      pacap.add(ajoutercapteur);
		      escap.add(ajoutercap);

	      //suupp capteur
		      
		      supprimercapt=new JMenuItem("supprimer capteur");
		      supprimercapt.addActionListener(new ActionListener() {
  		  public void actionPerformed(ActionEvent a) {
  		    	card.show(p,"supprimer capteur");
  		    	System.out.print("fait");
  		    	}
  		
  	});
		      pscap=new JPanel();
		      pscap.setLayout(new FlowLayout());
		      idsuppcap=new JTextField("saisir lid du capteur");
		        pscap.add(idsuppcap); pscap.add(suppcap);
		        escap.add(supprimercapt);

	        //voir les cap
			      voirlistcap=new JMenuItem("voir les capteur");
		/*	      voirlistcap.addActionListener(new ActionListener() {
	  		  public void actionPerformed(ActionEvent a) {
	  		    	card.show(p,"voir les capteurs");
	  		    	//System.out.print("fait cap");
	  		    	}
	  		
	  	});*/
			     
		        pvoircap=new JPanel();
				pvoircap.setLayout(new BorderLayout());
	            /* for(int j=0;j<listcap.size();j++) {
	            	 pvoircap.add(new JLabel(listcap.get(j).getDesignation()));
	            	 pvoircap.add(new JLabel(listcap.get(j).getType()));
	            	 pvoircap.add(new JLabel(Double.toString(listcap.get(j).getPrix())));

	             }*/
				
				JScrollPane jscap = new JScrollPane(jtcap);
				//js.setSize(pvoircap.getMaximumSize());;
				
				pvoircap.add(new JScrollPane(jtcap),BorderLayout.CENTER);

				
				
	             escap.add(voirlistcap);

	             
	            
	             //voir les comm
			      affichercomm=new JMenuItem("voir les commandes");
			  /*    affichercomm.addActionListener(new ActionListener() {
	  		  public void actionPerformed(ActionEvent a) {
	  		    	card.show(p,"voir les commandes");
	  		    	System.out.print("fait com");
	  		    	}
	  		
	  	});*/
			     
			      
			      
		        pvoircom=new JPanel();
				pvoircom.setLayout(new BorderLayout());
	           /*  for(int j=0;j<listcom.size();j++) {
	            	 pvoircap.add(new JLabel(Integer.toString(listcom.get(j).getId_Commande())));
	            	 pvoircap.add(new JLabel(Integer.toString(listcom.get(j).getId_Client())));
	            	 pvoircap.add(new JLabel(listcom.get(j).getDate_commande().toString()));

	             }*/
				JScrollPane jscom = new JScrollPane(jtcom);
				//js.setSize(pvoircom.getMaximumSize());;
				
				pvoircom.add(new JScrollPane(jtcom),BorderLayout.CENTER);
				
				
				
				
	             escom.add(affichercomm);
	             
	             
	             //ajouter teech
	             ajoutertech=new JMenuItem("ajouter technicien");
			      patech=new JPanel();
			      patech.setLayout(new BoxLayout(patech,BoxLayout.Y_AXIS));
			      patech.add(usernom3);patech.add(nom3);
			      patech.add(userpnom3);patech.add(prenom3);
			      patech.add(userage3);patech.add(age3);
			      patech.add(userlogin3);patech.add(login3);
			      patech.add(userpass3);	   patech.add(password3);
			      patech.add(usersalaire);
			      patech.add(salaire);
			      patech.add(ajouter_technicien);

			     ajoutertech.addActionListener(new ActionListener() {
	  		  public void actionPerformed(ActionEvent a) {
	  		    	card.show(p,"ajouter technicien");
	  		    	System.out.print("fait");
	  		    	}
	  		
	  	});
			      
			      estec.add(ajoutertech);
			      //modif tech
			      
			       modifiertech=new JMenuItem("modifier technicien");
				      pmtech=new JPanel();
				      pmtech.setLayout(new BoxLayout(pmtech,BoxLayout.Y_AXIS));
				      pmtech.add(usernom4);pmtech.add(nom4);
				      pmtech.add(userpnom4);pmtech.add(prenom4);
				      pmtech.add(userage4);pmtech.add(age4);
				      pmtech.add(userlogin4);pmtech.add(login4);
				      pmtech.add(userpass4);	   pmtech.add(password4);
				      pmtech.add(usersalaire4);
				      pmtech.add(salaire4);
				      pmtech.add(loginButton4);

/*				     modifiertech.addActionListener(new ActionListener() {
		  		  public void actionPerformed(ActionEvent a) {
		  		    	card.show(p,"modifier technicien");
		  		    	//System.out.print("fait");
		  		    	}
		  		
		  	});*/
				      
				      estec.add(modifiertech);
	        
	        //voirlisttech
				     affichertech =new JMenuItem("voir les techniciens");
				      affichertech.addActionListener(new ActionListener() {
		  		  public void actionPerformed(ActionEvent a) {
		  		    	card.show(p,"voir les techniciens");
		  		    	//System.out.print("fait tech");
		  		    	}
		  		
		  	});
				     
			        pvoirtech=new JPanel();
					pvoirtech.setLayout(new FlowLayout());
		             for(int j=0;j<listtech.size();j++) {
		            	pvoirtech.add(new JLabel(listtech.get(j).getNom()));
		            	pvoirtech.add(new JLabel(listtech.get(j).getPrenom()));
		            	pvoirtech.add(new JLabel(listtech.get(j).getLogin()));
		            	pvoirtech.add(new JLabel(listtech.get(j).getMdp()));
		            	pvoirtech.add(new JLabel(Double.toString(  listtech.get(j).getSalaire())));


		             }
		             escom.add(affichercomm);
	        
	        
	        
	        setJMenuBar(mb);
	        p.setLayout(card);
	        p.add(pvide,"vide");
	        p.add(pacldiv,"ajouter client");
	        p.add(pmcl,"modifier client");
	        p.add(pscl,"supprimer client");
	        p.add(pacap,"ajouter capteur");
	        p.add(pvoirclient,"voir les clients");
	        p.add(pscap,"supprimer capteur");
	        p.add(pvoircap,"voir les capteurs");
	        p.add(pvoircom,"voir les commandes");
	        p.add(patech,"ajouter technicien");
	        p.add(pmtech,"modifier technicien");
	        p.add(pvoirtech,"voir technicien");




	        
	       
	        add(p);
	        
	      
	      
	      
	      
	      
	      
	      
	      
	      mb.add(escl); mb.add(escap);mb.add(estec);mb.add(escom);
	 
	
    	
    	
    	
    	
    	
    	
    }
    public void actionPerformed(ActionEvent a) {
    	if(a.getSource()==ajoutercl) {
    		
    	
    	}
    	
    }


    }

