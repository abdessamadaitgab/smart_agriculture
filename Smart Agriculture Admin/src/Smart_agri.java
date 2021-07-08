import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;

import javax.swing.*;

import Model.Capteur;
import Model.Client;
import View.InscriptionFrame;
import View.Interface;
import View.LoginFrame;
import View.TerrainFrame;
import View.accueil;
import db.CRUD_Capteur;
import db.CRUD_Client;
import db.CRUD_Commande;
import db.CRUD_Technicien;
import java.awt.Frame;

public class Smart_agri extends JFrame{
/*CRUD_Capteur ccp;
CRUD_Client ccl;
CRUD_Commande ccm;
CRUD_Technicien ct;

static CRUD_Client cc=new CRUD_Client();
static JFrame Main_Frame;

static Interface Int;
static PrintWriter out;
static BufferedReader in;
static ObjectOutputStream output_objet;
static Client client;
static PrintWriter out_gerant;
static BufferedReader in_gerant;
static ObjectOutputStream output_objet_gerant;*/

public Smart_agri() throws UnknownHostException, IOException {
   // Main_Frame = new JFrame();
	/*ccp=new CRUD_Capteur();
	ccl=new CRUD_Client();
	ccm=new CRUD_Commande();
	ct=new CRUD_Technicien();	
	*/
//	 Int = new Interface();

	
   	/*String hostname="localhost";
   	int port= 100;
	
   	Socket Client = new Socket("localhost",port);
*/
	
    
    

	}



/*
public static void LogintoInscrire() {
	System.out.println("Hello");
	Int.Card.show(Int.panel, "Inscription");
}


public static void Login() {
	
	String userText;
    String pwdText;
    userText = Int.userTextField.getText();
    pwdText = Int.passwordField.getText();
    Client c=new Client (userText,pwdText);
    try {
		cc.CRUD_Client("root","");
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
            JOptionPane.showMessageDialog(Int.panel, "Connexion Etablie");

         //new TerrainFrame();
    
  
        
    } else {
        JOptionPane.showMessageDialog(Int.panel, "Invalid Username or Password");
    }
}




public static void Inscrire() {
    String nm,pnm,lg,pss;
    String ag;
    nm=Int.nom.getText();
    pnm=Int.prenom.getText();
    ag=Int.age.getText();
    lg=Int.login.getText();
    pss=Int.password.getText();
   int agee=Integer.parseInt(ag);
    
    
    Client c=new Client (nm,pnm,agee,lg,pss);
    try {
		cc.CRUD_Client("root","");
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
			
         // new LoginFrame();			
            JOptionPane.showMessageDialog(Int.panel, "Client Ajouté");

    
  
        
    } else {
        JOptionPane.showMessageDialog(Int.panel, "Veuillez ressayer s'il vous plait");
    }

}
*/




public static void main(String []args) throws SQLException, IOException{
	
	//Smart_agri smart=new Smart_agri();
/*	cc.CRUD_Client("root","");


    ServerSocket serverSocket = new ServerSocket(100);
    Socket clientSocket = serverSocket.accept();

     out =new PrintWriter(clientSocket.getOutputStream(), true);
     in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    output_objet = new ObjectOutputStream(clientSocket.getOutputStream());

    //
    
    ServerSocket serverSocket_Gerant = new ServerSocket(1500);
    Socket gerantSocket = serverSocket_Gerant.accept();
    out_gerant =new PrintWriter(gerantSocket.getOutputStream(), true);
    in_gerant = new BufferedReader(new InputStreamReader(gerantSocket.getInputStream()));
    output_objet_gerant = new ObjectOutputStream(gerantSocket.getOutputStream());
*/
 /*   
    if(clientSocket.isConnected()) {
    while(true) {
    	switch(in.readLine()) {
    	case "Login" :	Login_admin();break;
    	case "Inscrire" : System.out.println("Inscrire");break;
    	}
    }
    
    }else if(gerantSocket.isConnected()) {
    	System.out.println("Gerant");
    }
   
*/ 
    
/*
	Int.inButton.addActionListener(e-> LogintoInscrire());
	Int.loginButton_login.addActionListener(e->Login());
	Int.loginButton.addActionListener(e->Inscrire());
*/
    
	
    int port = 150;
    ServerSocket server = new ServerSocket(150);
    
    while(true){
        Socket soc = server.accept();
        Thread t = new Thread(new AdminServeur(soc));
        t.start();
    }
	
    
}
}
