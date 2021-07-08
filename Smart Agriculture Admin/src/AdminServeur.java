import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import Model.Capteur;
import Model.Client;
import Model.Commande;
import Model.Technicien;
import Model.Terrain;
import View.Interface;
import db.CRUD_Capteur;
import db.CRUD_Client;
import db.CRUD_Commande;
import db.CRUD_Technicien;


public class AdminServeur implements Runnable{
	Socket socket;
	//static Interface Int;
	static PrintWriter out;
	static BufferedReader in;
	static ObjectOutputStream output_objet;
	static ObjectInputStream input_object;
	 static Client client;
	 Technicien technicien;
	static CRUD_Capteur ccp;
	static CRUD_Client ccl;
	static CRUD_Commande ccm;
	 CRUD_Technicien ct;
     int id,id_t,id_tt;
	//static CRUD_Client cc=new CRUD_Client(); 
     Commande cmd;
     Terrain terr;
     Capteur captt;
     Terrain tt;
     int idd=-1;
	public AdminServeur(Socket soc){
	    this.socket=soc;    

	}
	
	
	@Override
	public void run() {
         a a=new a();
         a.ccp=new CRUD_Capteur();
         a.ccl=new CRUD_Client();
         a.ccm=new CRUD_Commande();
         a.ct=new CRUD_Technicien();	
		try {
			
			
			a.ccl.CRUD_Client("root","Aitgab@1998");
			a.ccp.CRUD_Capteur("root", "Aitgab@1998");
			a.ct.CRUD_Technicien("root", "Aitgab@1998");
			a.ccm.CRUD_Client("root", "Aitgab@1998");
		//	ServerSocket serverSocket = new ServerSocket(150);
		  //  Socket clientSocket = serverSocket.accept();

			a.out =new PrintWriter(socket.getOutputStream(), true);
			a.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			a.output_objet = new ObjectOutputStream(socket.getOutputStream());
		    // input_object = new ObjectInputStream(socket.getInputStream());

		    //
		 
		    	switch(a.in.readLine()) {
		    	
		    	case "client" :   	//List des capteur existant
		    		a.output_objet.writeObject(a.ccp.GetAllCapteurs());

		    						while(true) { 
		    						switch(a.in.readLine()) {
		    							case "Login" :	a.Login();break;
		    							case "Inscrire" : a.Inscrire_Client();break;
		    							case "choix_capt" : a.choix_capt();break;
		    							case "Ajout_Commande" : a.Ajout_Command();break;
		    							case "Paiement" : a.Paiement();break;
		    							case "terrain existe" : a.exist_terrain();break;
		    							case "Afficher Capteur client" : a.Affich_Capteur_client();break;
		    							case "Afficher Terrain client" : a.Affich_Terr_client();break;
		    							case "mod infos client" : a.mod_Infos();break;
		    							case "Visualiser" : a.Visualiser();break;
		    							case "modifiermesinfos" : a.modifiermesinfos();break;
		    							};
		    						}
		    						
		    	case "gerant" : while(true) {
		    					
		    						switch(a.in.readLine()) {
		    							case "Ajout client" : a.Ajout_Client();break;
		    							case "Modifier Client" : a.Modifier_Client();break; 
		    							case "show modifier" : a.Show_Modifier();break;
		    							case "supprimer client" : a.Supprimer_Client();break;
		    							case "Afficher Clients" : a.Afficher_Client();break;
		    							//Capteur
		    							case "Ajout capteur" : a.Ajout_Capteur();break;
		    							case "supprimer capteur" : a.Supprimer_Capteur();break;
		    							case "Afficher Capteur" : a.Afficher_Capteur();break;
		    							
		    							//Technicien
		    							case "Ajout Technicien": a.Ajout_Technicien();break;
		    							case "show modifier tech": a.Show_Modifier_Tech();break;
		    							case "Modifier Technicien" : a.Modifier_Tech();break;
		    							
		    							//Commande
		    							case "voir les commandes" : a.Afficher_Commande();break;
		    						};
		    		
		    		
		    					}
		    						
		    	
		    	case "technicien" : while(true) {
		    							switch(a.in.readLine()) {
		    									case "Login" : a.Login_Tech();break;
		    									case "afficher capteur" : a.Affich_Capteur_Tech();break;
		    									case "modifier show tech" : a.Show_Modifier_Tech_Tech();break;
		    									case "Modifier Technicien" : a.Modifier_Tech_Tech();break;
		    									case "Installer" : a.Installer();break;
		    							};
		    						}
		    	
		    	
		    	}
		    
			
			
		    
		    
			
		} catch (SQLException | IOException e) {e.printStackTrace();} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	    

	
	
	
	}
	
	
	
	
	
	
	
	// les fonction li ki communiquer le serveur bihom avec sois client ou admin ou technicien
	
	//Clients
	//Cette fonction return true si le username and password sont correct sinon return false ; apres renvois cette valeur au client pour qu'il affiche ce qu'il doit affich� 


	
	


}
