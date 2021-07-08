import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import Model.Capteur;
import Model.CapteurTableModel;
import Model.Commande;
import Model.TerCom;
import View.Login;
//import Model.CommandeTableModel;
import View.techniview;

public class TechnicienControler {

	static BufferedReader in;
	static PrintWriter out;
	static ObjectInputStream input_object;

	


	static techniview TechView;
	static Login login;
	public TechnicienControler() throws IOException{
		login = new Login(); 
		//TechView = new techniview();
    	TechView = new techniview();
    	TechView.disable();
    	login.toFront();

	}
	
	
	//Login
	/*
	public static void  Login() throws HeadlessException, IOException {
	out.println("Login");
	
	String userText;
    String pwdText;
    userText = login.userTextField.getText();
    pwdText = login.passwordField.getText();
    out.println(userText);
    out.println(pwdText);
    
    if(in.readLine().equals("true")) {
    	JOptionPane.showMessageDialog(login.pconnex, "Connexion Etablie");
    	login.dispose();
    	TechView.enable();
    }else {
    	System.out.println("Hello");
    	JOptionPane.showMessageDialog(login.pconnex, "Invalid Username or Password");
    	System.out.println("Hello2");
    	login.userTextField.setText("");
    	login.passwordField.setText("");
    }
	
	}*/
	
	
	public static  void Login() throws IOException {
		
		out.println("Login");
		String userText;
	    String pwdText;
	    userText = login.userTextField.getText();
	    pwdText = login.passwordField.getText();
	    out.println(userText);
	    out.println(pwdText);
	    
	    if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(login.pconnex, "Connexion Etablie");
	    	login.dispose();
	    	TechView.enable();
	    	TechView.toFront();
	    	//Int.Card.show(Int.panel, "Inscription");
	    }else {
	    	JOptionPane.showMessageDialog(login.pconnex, "Invalid Username or Password");
	    	
	    }
	    

	    	
	    
	}
	
	
	
	
	
	
	public static void Afficher_Capteur() throws ClassNotFoundException, IOException {
		out.println("afficher capteur");
		
		TechView.listcap = (LinkedList<TerCom>) input_object.readObject();
	 	
		TechView.jtcap.setModel(new CapteurTableModel(TechView.listcap));
		TechView.card.show(TechView.p, "voir capteur");
	}
	
	
	
	
	
	public static void show_Modifier_tech() throws IOException {

		
	System.out.println("Hamza");
	out.println("modifier show tech");
	System.out.println("Hamza1");
	TechView.card.show(TechView.p, "modification");
	System.out.println("Hamza2");

	
	TechView.nom.setText(in.readLine());
	System.out.println("Hamzaaaa");
	TechView.prenom.setText(in.readLine());
	TechView.age.setText(in.readLine());
	TechView.login.setText(in.readLine());
	TechView.password.setText(in.readLine());
	System.out.println("Hamza3");


	}
	
	public static void Insta() throws HeadlessException, IOException, ClassNotFoundException {
		out.println("Installer");
		out.println(TechView.idInsta.getText());
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(TechView.pvoircapteurs, "Le capteur est installer avec succes");
	    	Afficher_Capteur();
		}else {
	    	JOptionPane.showMessageDialog(TechView.pvoircapteurs, "Le capteur n'est pas installern une erreur s'est produit");
	    	Afficher_Capteur();
		}
	}
	
	
	public static void Modifier_Tech() throws HeadlessException, IOException {
		
		
		out.println("Modifier Technicien");
		
		
		
		out.println(TechView.nom.getText());
		out.println(TechView.prenom.getText());
		out.println(TechView.age.getText());
		out.println(TechView.login.getText());
		out.println(TechView.password.getText());
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(TechView.pmodifier, "Le Technicien est modifi� avec succes");
		}else {
	    	JOptionPane.showMessageDialog(TechView.pmodifier, "Une erreur s'est produit");

		}
		
		
	}
	
	
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {

		TechnicienControler Technic = new TechnicienControler();
		
	    Socket socket = new Socket("localhost", 150);
	    
	    //initialiser les variable input and output
	    out = new PrintWriter(socket.getOutputStream(), true);
	    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    input_object = new ObjectInputStream(socket.getInputStream());

		
		out.println("technicien");
		

	    		
		
		//Login
		
		login.loginButton.addActionListener(e->{try {Login();} catch (HeadlessException | IOException e2) {e2.printStackTrace();}});
		
		//Capteur
		//Voir Capteur
		TechView.voircapteurs.addActionListener(e->{try {Afficher_Capteur();} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
		TechView.installer.addActionListener(e->{try {try {Insta();} catch (HeadlessException e1) {e1.printStackTrace();} 
		catch (ClassNotFoundException e1) {e1.printStackTrace();}} catch (IOException e1) {e1.printStackTrace();}});
		
		//Modifier Infos
		//TechView.modifierinfos.addActionListener(l);
		TechView.modifierinfos.addActionListener(e->{try {show_Modifier_tech();} catch (IOException e1) {e1.printStackTrace();}});
		TechView.loginButton2.addActionListener(e->{try {Modifier_Tech();} catch (HeadlessException e1) {e1.printStackTrace();} catch (IOException e1) {e1.printStackTrace();}});
 
	}

}
