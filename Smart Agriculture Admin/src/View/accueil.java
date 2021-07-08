package View;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.*;

import Model.Capteur;
import db.CRUD_Capteur;
import db.CRUD_Client;

public class accueil extends JFrame  {
	JPanel p=new JPanel();
    CRUD_Capteur cc=new CRUD_Capteur();
    

	public accueil(){
		p.setLayout(new GridLayout(5,5,0,5));
		try {
			cc.CRUD_Capteur("root", "");
			LinkedList<Capteur> l= cc.GetAllCapteurs();
			for(int i=0;i<l.size();i++) {
				p.add(new Button(l.get(i).getDesignation()+"\r"+l.get(i).getType()));

			}
			
			 setTitle("Login Form");
		      setVisible(true);
		      setBounds(100, 100, 370, 600);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setResizable(true);
		      this.pack();
		       JFrame.setDefaultLookAndFeelDecorated(true);
		       this.setExtendedState(Frame.MAXIMIZED_BOTH);
		       add(p);

			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	


	}
}
