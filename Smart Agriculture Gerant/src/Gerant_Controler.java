import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTextField;

import Model.Capteur;
import Model.CapteurTableModel;
import Model.Client;
import Model.ClientTableModel;
import Model.Commande;
import Model.CommandeTableModel;
import Model.Technicien;
import View.adminview;

public class Gerant_Controler {

	static BufferedReader in;
	static PrintWriter out;
	static ObjectInputStream input_object;

	static adminview Int;
	
	public Gerant_Controler() {
		 Int = new adminview();
	}
	
	
	//Client 
	public static void Ajouter_Client() throws IOException {
		out.println("Ajout client");
		
		out.println(Int.nom.getText());
		out.println(Int.prenom.getText());
		out.println(Int.age.getText());
		out.println(Int.login.getText());
		out.println(Int.password.getText());
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.pacl, "Le client est ajout� avec succes");
		}else {
	    	JOptionPane.showMessageDialog(Int.pacl, "Une erreur s'est produit");

		}
		Int.nom.setText("");
		Int.prenom.setText("");
		Int.age.setText("");
		Int.login.setText("");
		Int.password.setText("");
	}
	


	public static void Modifier_Client() throws HeadlessException, IOException {
		out.println("Modifier Client");
		
		out.println(Int.nom2.getText());
		out.println(Int.prenom2.getText());
		out.println(Int.age2.getText());
		out.println(Int.login2.getText());
		out.println(Int.password2.getText());

		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.pmcl, "Le client est modifi� avec succes");
		}else {
	    	JOptionPane.showMessageDialog(Int.pmcl, "Une erreur s'est produit");

		}
			
	}
	
	public static void show_Modifier() throws IOException {
				out.println("show modifier");
			String S_id = JOptionPane.showInputDialog("Veuillez Entrez l'id du client a modifier");
		//	System.out.println(S_id);
			int id = Integer.parseInt(S_id);
			out.println(id);

			Int.card.show(Int.p, "modifier client");

			
			Int.nom2.setText(in.readLine());
			Int.prenom2.setText(in.readLine());
			Int.age2.setText(in.readLine());
			Int.login2.setText(in.readLine());
			Int.password2.setText(in.readLine());

			
		  }
		
	
	
	
	public static void Supprimer_Client() throws HeadlessException, IOException {
		out.println("supprimer client");
		out.println(Int.idsupp.getText());
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.pscl, "Le client est supprimé avec succes");
		}else {
	    	JOptionPane.showMessageDialog(Int.pscl, "Une erreur s'est produit");

		}
	}
	
	
//
	public static void Afficher_Client() throws ClassNotFoundException, IOException {
		out.println("Afficher Clients");
		
		//String [][] data = null;
		Int.list = (LinkedList<Client>) input_object.readObject();
		/* 
		for(int j=0;j<Int.list.size();j++) {
        
			 Int.pvoirclient.add(new JTextField(Int.list.get(j).getNom()));
        	 Int.pvoirclient.add(new JTextField(Int.list.get(j).getNom()));
        	 Int.pvoirclient.add(new JTextField(Int.list.get(j).getPrenom()));
        	 Int.pvoirclient.add(new JTextField(Int.list.get(j).getLogin()));
        	 Int.pvoirclient.add(new JTextField(Int.list.get(j).getMdp()));
         
			// data[j]= {Int.list.get(j).getNom(),Int.list.get(j).getPrenom(),Int.list.get(j).getLogin(),Int.list.get(j).getMdp()};
			 data[j][]=Int.list.get(j).getPrenom();	 
			 data[j][2]=Int.list.get(j).getLogin();
			 data[j][3]=Int.list.get(j).getMdp();
         }
		 */
		// String[] columns = {"nom","prenom","age","login","password"};
		 //Int.jt = new JTable(data,columns);
		 	
		 Int.jt.setModel(new ClientTableModel(Int.list));
		Int.card.show(Int.p, "voir les clients");

	}
	


	
	
	
	
	
	//Ajouter Capteur
	public static void Ajouter_Capteur() throws HeadlessException, IOException {
		
		
		out.println("Ajout capteur");
		
		out.println(Int.tdes.getText());
		out.println(Int.ttype.getText());
		out.println(Int.tprix.getText());
		out.println(Int.timage.getText());
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.pacl, "Le capteur est ajout� avec succes");
		}else {
	    	JOptionPane.showMessageDialog(Int.pacl, "Une erreur s'est produit");

		}
		Int.tdes.setText("");
		Int.ttype.setText("");
		Int.tprix.setText("");
		Int.timage.setText("");
		
		
	}
	
	
	//Supprimer Capteur
	
	public static void Supprimer_Capteur() throws HeadlessException, IOException {
		
		
		out.println("supprimer capteur");
		out.println(Int.idsuppcap.getText());
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.pscl, "Le Capteur est supprim� avec succes");
		}else {
	    	JOptionPane.showMessageDialog(Int.pscl, "Une erreur s'est produit");

		}
		
	}
	
	
	//Afficher Capteur
	
	public static void Afficher_Capteur() throws ClassNotFoundException, IOException {
		out.println("Afficher Capteur");

		Int.listcap = (LinkedList<Capteur>) input_object.readObject();
		 	
		 Int.jtcap.setModel(new CapteurTableModel(Int.listcap));
		Int.card.show(Int.p, "voir les capteurs");

		
	}
	
	
	
	
	
	//Ajouter Technicien
	
	
	public static void Ajouter_Technicien() throws IOException {
		out.println("Ajout Technicien");
		
		out.println(Int.nom3.getText());
		out.println(Int.prenom3.getText());
		out.println(Int.age3.getText());
		out.println(Int.login3.getText());
		out.println(Int.password3.getText());
		out.println(Int.salaire.getText());
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.pacl, "Le technicien est ajout� avec succes");
		}else {
	    	JOptionPane.showMessageDialog(Int.pacl, "Une erreur s'est produit");

		}
		Int.nom3.setText("");
		Int.prenom3.setText("");
		Int.age3.setText("");
		Int.login3.setText("");
		Int.password3.setText("");
		Int.salaire.setText("");

	}
	


	
	
	//Modifier Tech
	
	
	
	public static void show_Modifier_tech() throws IOException {
		out.println("show modifier tech");
	String S_id_tech = JOptionPane.showInputDialog("Veuillez Entrez l'id du technicien a modifier");

	int id_tech = Integer.parseInt(S_id_tech);
	out.println(id_tech);

	Int.card.show(Int.p, "modifier technicien");

	
	Int.nom4.setText(in.readLine());
	Int.prenom4.setText(in.readLine());
	Int.age4.setText(in.readLine());
	Int.login4.setText(in.readLine());
	Int.password4.setText(in.readLine());
	Int.salaire4.setText(in.readLine());

	}
	
	
	
	public static void Modifier_Tech() throws HeadlessException, IOException {
		
		
		out.println("Modifier Technicien");
		
		out.println(Int.nom4.getText());
		out.println(Int.prenom4.getText());
		out.println(Int.age4.getText());
		out.println(Int.login4.getText());
		out.println(Int.password4.getText());
		out.println(Int.salaire4.getText());
		
		if(in.readLine().equals("true")) {
	    	JOptionPane.showMessageDialog(Int.pmtech, "Le Technicien est modifi� avec succes");
		}else {
	    	JOptionPane.showMessageDialog(Int.pmtech, "Une erreur s'est produit");

		}
		
		
	}
	
	
	
	//Afficher les commandes
	
	
	public static void Afficher_Commande() throws ClassNotFoundException, IOException {
		out.println("voir les commandes");

		Int.listcom = (LinkedList<Commande>) input_object.readObject();
		 	
		 Int.jtcom.setModel(new CommandeTableModel(Int.listcom));
		Int.card.show(Int.p, "voir les commandes");

	}
	
	
	
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {

		Gerant_Controler Gerant = new Gerant_Controler();
		
	    Socket socket = new Socket("localhost", 150);
	    
	    //initialiser les variable input and output
	    out = new PrintWriter(socket.getOutputStream(), true);
	    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    input_object = new ObjectInputStream(socket.getInputStream());

		
		out.println("gerant");


		
		//Ajouter Client
		Int.loginButton.addActionListener(e->{try {Ajouter_Client();} catch (IOException e1) {e1.printStackTrace();}});
	    //Modifier Client
		Int.loginButton2.addActionListener(e->{try {Modifier_Client();} catch (HeadlessException e1) {e1.printStackTrace();} catch (IOException e1) {e1.printStackTrace();}});
	    Int.modifiercl.addActionListener(e->{try {show_Modifier();} catch (IOException e1) {e1.printStackTrace();}});
	    //supp Client
	    Int.suppclt.addActionListener(e->{try {Supprimer_Client();} catch (IOException e1) {e1.printStackTrace();}});	    //Afficher all clients
	    Int.voirlistcl.addActionListener(e->{try {Afficher_Client();} catch (ClassNotFoundException | IOException e1) {e1.printStackTrace();}});
	    
	    
	    
	    
	    
	    
	    //Ajouter Capteur
	    Int.ajoutercapteur.addActionListener(e->{try {Ajouter_Capteur();} catch (IOException e1) {e1.printStackTrace();}});
	    //Supprimer Capteur
	    Int.suppcap.addActionListener(e->{try {Supprimer_Capteur();} catch (IOException e1) {e1.printStackTrace();}});
	    //Afficher ALL capteur
	    Int.voirlistcap.addActionListener(e->{try {Afficher_Capteur();} catch (ClassNotFoundException | IOException e2) {e2.printStackTrace();}});
	    

	    
	    
	    
	    
	    //Ajouter technicien
	    
	    Int.ajouter_technicien.addActionListener(e->{try {Ajouter_Technicien();} catch (IOException e1) {e1.printStackTrace();}});

	    //Modifier Technicien
	    
	    Int.modifiertech.addActionListener(e->{try {show_Modifier_tech();} catch (IOException e1) {e1.printStackTrace();}});
	    Int.loginButton4.addActionListener(e->{try {Modifier_Tech();} catch (HeadlessException e1) {e1.printStackTrace();} catch (IOException e1) {e1.printStackTrace();}});
	
	    
	    
	    //Afficher les commandes
	    Int.affichercomm.addActionListener(e->{try {Afficher_Commande();} catch (ClassNotFoundException | IOException e2) {e2.printStackTrace();}});  
	    
	}

}
