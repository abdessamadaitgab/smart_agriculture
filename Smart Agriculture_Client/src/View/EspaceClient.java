package View;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;


public class EspaceClient extends JFrame{
	JPanel phaut,pprincipal;
	JButton bvoircapteur=new JButton("voir mes capteurs");
	JPanel pvoircapteur=new JPanel();
	JButton bvoirterrain=new JButton("voir mes terrains");
	JPanel pvoirterrain =new JPanel();
	JButton bvoirdecision =new JButton("voir les résultat des capteur");
	JPanel pvoirdecision=new JPanel();
	JButton bmodifierInfos=new JButton("modifier mes infos");
	JPanel pmodifierInfos=new JPanel();

    CardLayout card;
public EspaceClient() {
	 setTitle("Login Form");
     setVisible(true);
     setBounds(100, 100, 370, 600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(true);
     this.pack();
     card=new CardLayout();
     phaut=new JPanel();
     phaut.setLayout(new FlowLayout());phaut.add(bvoircapteur);phaut.add(bvoirterrain);phaut.add(bmodifierInfos);phaut.add(bvoirdecision);
	 add(phaut,BorderLayout.PAGE_START);
	 
	 // ajout du panneau principal cardlayout
	 pprincipal=new JPanel(card);
	 JPanel pvide=new JPanel();
	 pprincipal.add(pvide,"vide");
	 // panneau voir mes capteur
	 bvoircapteur.addActionListener(new ActionListener() {
  		  public void actionPerformed(ActionEvent a) {
  		    	card.show(pprincipal,"pvoircapteur");
  		    	System.out.print("fait");
  		    	}
  		
  	});
	 pvoircapteur.setLayout(new GridLayout(5,1));
	 for(int i=0;i<5;i++) {
		 pvoircapteur.add(new JLabel("aa"));
		 pvoircapteur.add(new JLabel(""));
		 pvoircapteur.add(new JLabel(""));
		 pvoircapteur.add(new JLabel(""));
		 pvoircapteur.add(new JLabel(""));


	 }
	 pprincipal.add(pvoircapteur,"pvoircapteur");
	 // panneau voir mes terrain
	 bvoirterrain.addActionListener(new ActionListener() {
 		  public void actionPerformed(ActionEvent a) {
 		    	card.show(pprincipal,"pvoirterrain");
 		    	System.out.print("fait");
 		    	}
 		
 	});
	 pvoirterrain.setLayout(new GridLayout(5,1));
	 for(int i=0;i<5;i++) {
		 pvoirterrain.add(new JLabel("bb"));
		 pvoirterrain.add(new JLabel(""));
		 pvoirterrain.add(new JLabel(""));
		 pvoirterrain.add(new JLabel(""));
		 pvoirterrain.add(new JLabel(""));


	 }
	 pprincipal.add(pvoirterrain,"pvoirterrain");

	 //panneau modifier infos
	 bmodifierInfos.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent a) {
		    	card.show(pprincipal,"pmodifierInfos");
		    	System.out.print("fait");
		    	}
		
	});
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
	    pmodifierInfos.setLayout(new GridLayout(6,2));

	    
	    usernom.setAlignmentX(RIGHT_ALIGNMENT);
	    userpnom.setAlignmentX(RIGHT_ALIGNMENT);
	    userage.setAlignmentX(RIGHT_ALIGNMENT);
	    userlogin.setAlignmentX(RIGHT_ALIGNMENT);
	    userpass.setAlignmentX(RIGHT_ALIGNMENT);
        
        
        nom.setPreferredSize(new Dimension(50, 25));
        prenom.setPreferredSize(new Dimension(50, 25));
        age.setPreferredSize(new Dimension(50, 25));
        login.setPreferredSize(new Dimension(50, 25));
        password.setPreferredSize(new Dimension(50, 25));

        
        
        loginButton.setBounds(600, 500, 100, 30);
        pmodifierInfos.add(usernom);        pmodifierInfos.add(nom);

        pmodifierInfos.add(userpnom);        pmodifierInfos.add(prenom);

        pmodifierInfos.add(userage);        pmodifierInfos.add(age);

        pmodifierInfos.add(userlogin);        pmodifierInfos.add(login);

        pmodifierInfos.add(userpass);
        pmodifierInfos.add(password);
        
        pmodifierInfos.add(loginButton,BorderLayout.CENTER);
        pmodifierInfos.setBounds(600, 500, 100, 30);
   	 pprincipal.add(pmodifierInfos,"pmodifierInfos");
   	 
   	 
   	 
   	 
   	 
   	 //voir les decisions;
   	 bvoirdecision.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent a) {
		    	card.show(pprincipal,"pvoirdecision");
		    	System.out.print("fait");
		    	}
		
	});
     JLabel tidvisualiser=new JLabel("entrez l'id du capteur que vous voulez visualisez") ;
     JTextField idvisualiser=new JTextField(5);
     JButton visualiser=new JButton("visualiser");
     pvoirdecision.add(tidvisualiser);     pvoirdecision.add(idvisualiser);
     pvoirdecision.add(visualiser);

	
	 pprincipal.add(pvoirdecision,"pvoirdecision");
	 visualiser.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent a) {
		    	}
		
	});
	    
	 
	 
add(pprincipal,BorderLayout.CENTER);	
	
}
public static void main(String[] args) {
	new EspaceClient();
}
	
}