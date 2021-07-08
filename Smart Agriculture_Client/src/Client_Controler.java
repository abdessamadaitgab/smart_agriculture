import java.awt.*;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
	import java.net.Socket;
	import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.*;

	import Model.Capteur;
import Model.CapteurTableModel;
import Model.Client;
import Model.Terrain;
import Model.TerrainTableModel;
import Model.captter;
import View.EspaceClient;
import View.GraphPanelEau;
import View.GraphPanelHumidite;
import View.GraphPanelTemperature;
import View.Interface;

	public class Client_Controler{


	static BufferedReader in;
	static PrintWriter out;
	static ObjectInputStream input_object;
	static ObjectOutputStream output_object;
	public static Capteur choix_capt;
	public static Terrain choix_terrain;
	static Interface Int;
	//static LinkedList<Capteur> list;

	public Client_Controler(LinkedList<Capteur> list) throws IOException {


		 Int = new Interface(list);


	}


	public static void LogintoInscrire() {
		//System.out.println("Hello");
		Int.Card.show(Int.panel, "Inscription");
	}


	public static void Login() throws IOException, ClassNotFoundException {
			
		out.println("Login");
		String userText;
	    String pwdText;
	    userText = Int.login_userTextField.getText();
	    pwdText = Int.login_passwordField.getText();
	    out.println(userText);
	    out.println(pwdText);
	    
	    if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.panel, "Connexion Etablie");
//	    	Int.initialiser_Acceuil(Int.l);
	    	//System.out.println(Int.l);
	    	Int.Card.show(Int.panel, "Acceuil");
	    }else {
	    	JOptionPane.showMessageDialog(Int.panel, "Invalid Username or Password");
	    }
	    

	    	
	    
	}




	public static void Inscrire_Client() throws HeadlessException, IOException{
		out.println("Inscrire");
		
		out.println(Int.inscription_nom.getText());
		out.println(Int.inscription_prenom.getText());
		out.println(Int.inscription_age.getText());
		out.println(Int.inscription_login.getText());
		out.println(Int.inscription_password.getText());
		
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.Inscription_Panel, "Le client est ajout� avec succes");
	    	Int.Card.show(Int.panel, "Login");
		}else {
	    	JOptionPane.showMessageDialog(Int.Inscription_Panel, "Une erreur s'est produit");

		}

		

		
			
		
		
		
	}

	
	
	
	
	
	
	
	
	public static void choix_capt(int apt) throws ClassNotFoundException, IOException {
		out.println("choix_capt");

		out.println(apt);
		
		 choix_capt = (Capteur) input_object.readObject();
		 Int.Card.show(Int.panel, "Terrain");

	}
	
	
	
	
	
	
	
	
	
	
	//Terrain
	
	
	public static void Ajouter_commande() throws IOException {
		out.println("Ajout_Commande");

		out.println(choix_capt.getDesignation());
		
		out.println(Int.Terrain_tsup.getText());
		out.println(Int.Terrain_tadresse.getText());
		out.println(Int.Terrain_tville.getText());

		//output_object.writeObject(choix_capt);
    	Int.Card.show(Int.panel, "Paiement");
		
	}
	
	
	
	
	
	
	public static void terrain_exist() throws IOException {
		out.println("terrain existe");
		out.println(choix_capt.getDesignation());

		String S_id = JOptionPane.showInputDialog("Veuillez Entrez l'id terrain déja existant");
		out.println(S_id);
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.Terrain_Panel, "Le terrain existe");
	    	Int.Card.show(Int.panel, "Paiement");
		}else {
	    	JOptionPane.showMessageDialog(Int.Terrain_Panel, "Le terrain n'existe pas");

		}

	}
	
	
	
	
	//Paiement
	
	public static void Paiement() {
		out.println("Paiement");
			System.out.println(Int.tnum.getText());
		
		if(!(Int.tnum.getText()).equals("") && !(Int.tnom.getText()).equals("") && !(Int.tcode.getText()).equals("")) {
	    	JOptionPane.showMessageDialog(Int.panel, "Paiement est effectu� avec succ�s");
			out.println("true");
	    	Int.Card.show(Int.panel, "Acceuil");
		}else {
	    	JOptionPane.showMessageDialog(Int.panel, "Paiement n'est pas effectu�");
			out.println("false;");
		}
		
	}
	
	
	
	
	
	
	
	
	//
	
	public static void affiche_espace() {
		System.out.println("Hamza");
		Int.Card.show(Int.panel, "Espace");
	}
	
	
	
	public static void Voir_Capteur() throws ClassNotFoundException, IOException {
		out.println("Afficher Capteur client");

		Int.listcap = (LinkedList<captter>) input_object.readObject();
		 	
		 Int.jtcap.setModel(new CapteurTableModel(Int.listcap));
		Int.Card.show(Int.panel, "voir capteur");

	}
	
	
	
	
	
	
	public static void Voir_Terrain() throws ClassNotFoundException, IOException {
		out.println("Afficher Terrain client");

		Int.listerr = (LinkedList<Terrain>) input_object.readObject();
		 	
		 Int.jtter.setModel(new TerrainTableModel(Int.listerr));
		Int.Card.show(Int.panel, "voir terrain");

	}
	
	
	public static void show_Mod_Infos() throws ClassNotFoundException, IOException {
		out.println("modifiermesinfos");
		Client cc=(Client)input_object.readObject();
		Int.nomm.setText(cc.getNom());
		Int.prenomm.setText(cc.getPrenom());
		Int.agem.setText(Integer.toString(cc.getAge()));
		Int.loginm.setText(cc.getLogin());
		Int.loginm.setEditable(false);
		Int.passwordm.setText(cc.getMdp());
		
		Int.Card.show(Int.panel, "modifier infos");
	}
	
	
	public static void Mod_Infos() throws IOException {
		out.println("mod infos client");
		
		out.println(Int.nomm.getText());
		out.println(Int.prenomm.getText());
		out.println(Int.agem.getText());
		out.println(Int.loginm.getText());
		out.println(Int.passwordm.getText());

		System.out.println("aa12a");
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.panel, "vos infos sont modifi�s avec succes");
			Int.nomm.setText("");
			Int.prenomm.setText("");
			Int.agem.setText("");
			Int.loginm.setText("");
			Int.passwordm.setText("");
			
			Int.Card.show(Int.panel, "Espace");
		}else {
	    	JOptionPane.showMessageDialog(Int.panel, "Une erreur s'est produit");

		}

	}
	
	
	public static void show_acc() {
		Int.Card.show(Int.panel, "Acceuil");

	}
	
	
	public static void to_espace() {
		Int.Card.show(Int.panel, "Espace");

	}

	
	
	
	public static void show_vis() {
		Int.Card.show(Int.panel, "voir decision");

	}
	
	
	
	
	
	
	public static void visualiser() throws IOException {
		out.println("Visualiser");
		
		out.println(Int.idvisualiser.getText());
		out.println(Int.idvisualisert.getText());
		
		String type = in.readLine();
		
		
		int id = Integer.parseInt(in.readLine());

		String chemin="/Users/user/Downloads/Nouveau dossier/Smart Agriculture_Client/src/"+id+""+Int.idvisualiser.getText()+Int.idvisualisert.getText()+".txt";

		if(type.equals("eau")) {
			
			GraphPanelEau eau = new GraphPanelEau();
			eau.createAndShowGui(chemin);
		}else if(type.equals("temperature")) {
			
			GraphPanelTemperature temper = new GraphPanelTemperature();
			temper.createAndShowGui(chemin);

			
		}else {
			
			GraphPanelHumidite humid = new GraphPanelHumidite();
			humid.createAndShowGui(chemin);

			
		}
		
	}
	
	
	
	

	public static void main(String []args) throws SQLException, IOException, ClassNotFoundException{
		
		
	    Socket socket = new Socket("localhost", 150);
	    
	    //initialiser les variable input and output
	    out = new PrintWriter(socket.getOutputStream(), true);
	    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    input_object = new ObjectInputStream(socket.getInputStream());
	    //output_object = new ObjectOutputStream(socket.getOutputStream());
	    
	    
	    //sift l serveur bach i3ref hada client
		out.println("client");
 
		Client_Controler smart=new Client_Controler((LinkedList<Capteur>) input_object.readObject());

		//EspaceClient Espace = new EspaceClient();
		//hna katbda lkhedma
		
		
		//nbdaw b Client
		
		//Espace Client--Espace Client--Espace Client--Espace Client--Espace Client--Espace Client--Espace Client--Espace Client--Espace Client
		
		// action listener dial button login dial login Panel
		
		Int.login_Button_login.addActionListener(e->{try {Login();} catch (IOException e1) {e1.printStackTrace();} catch (ClassNotFoundException e1) {e1.printStackTrace();}});
		Int.login_InscrireButton.addActionListener(e-> LogintoInscrire());
		
		
		
		
		//Inscription Panel
		
		Int.inscription_inscrire_Button.addActionListener(e->{try {Inscrire_Client();} catch (HeadlessException | IOException e1) {e1.printStackTrace();}});
		
		//Acceuil Pannel
		
		Int.acceuil_b0.addActionListener(e-> {try {choix_capt(1);} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
		Int.acceuil_b1.addActionListener(e-> {try {choix_capt(2);} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
		Int.acceuil_b2.addActionListener(e-> {try {choix_capt(3);} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
		Int.acceuil_b3.addActionListener(e-> {try {choix_capt(4);} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
		Int.acceuil_b4.addActionListener(e-> {try {choix_capt(5);} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
		Int.acceuil_b5.addActionListener(e-> {try {choix_capt(6);} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});

		
		//Acceuil Terrain
		Int.Terrain_Ajouter_Button.addActionListener(e-> {try {Ajouter_commande();} catch (IOException e1) {e1.printStackTrace();}});



		//Paiement
		
		Int.loginButton.addActionListener(e->Paiement());
	    
		
		
		//Terrain
		
		Int.Terrain_Existe_Button.addActionListener(e->{try {terrain_exist();} catch (IOException e1) {e1.printStackTrace();}});
		
		
		
		
		
		//Espace
		
		Int.acceuil_espace_btn.addActionListener(e-> affiche_espace());
		//
		Int.bvoircapteur.addActionListener(e->{try {Voir_Capteur();} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
		
		//
		Int.bvoirterrain.addActionListener(e->{try {Voir_Terrain();} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});

		//
		Int.bmodifierInfos.addActionListener(e-> {
			try {
				show_Mod_Infos();
			} catch (ClassNotFoundException | IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		});
		//
		Int.loginButtonm.addActionListener(e-> {try {Mod_Infos();} catch (IOException e1) {e1.printStackTrace();}});

		//
		Int.bacc.addActionListener(e-> show_acc());
		
		//
		Int.bvoirdecision.addActionListener(e-> show_vis());
		//
		Int.visualiser.addActionListener(e-> {try {visualiser();} catch (IOException e1) {e1.printStackTrace();}});
		//
		Int.bretourmod.addActionListener(e-> to_espace());
		Int.bretourter.addActionListener(e-> to_espace());
		Int.bretourcap.addActionListener(e-> to_espace());
		Int.bretourdec.addActionListener(e-> to_espace());

		
		
		
		//Espace Admin--Espace Admin--Espace Admin--Espace Admin--Espace Admin--Espace Admin--Espace Admin--Espace Admin--Espace Admin--Espace Admin
		
		
		
		
		
		
	}
	}


