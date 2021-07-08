import java.io.*;
import java.sql.SQLException;

import Model.Capteur;
import Model.Client;
import Model.Commande;
import Model.Technicien;
import Model.Terrain;
import db.CRUD_Capteur;
import db.CRUD_Client;
import db.CRUD_Commande;
import db.CRUD_Technicien;

public class a {

	
	
	//static Interface Int;
	public PrintWriter out;
	public BufferedReader in;
	public ObjectOutputStream output_objet;
	public ObjectInputStream input_object;
	 
	public Client client;
	public Technicien technicien;
	public CRUD_Capteur ccp;
	public CRUD_Client ccl;
	public CRUD_Commande ccm;
	public CRUD_Technicien ct;
	public int id,id_t,id_tt;
	//static CRUD_Client cc=new CRUD_Client();
	public Commande cmd;
	public Terrain terr;
	public Capteur captt;
	public Terrain tt;
	public int idd=-1;

	public a() {
		  out=null;
		  in=null;
		  output_objet=null;
		  input_object=null;
		 
		   client=null;
		  technicien=null;
		  ccp=null;
		  ccl=null;
		  ccm=null;
		   ct=null;
	      id=0;
	      id_t=0;
	      id_tt=0;

	       cmd=null;
	      terr=null;
	      captt=null;
	      tt=null;
	      idd=-1;
	}
	
	
	
	
	
	
	// les fonction li ki communiquer le serveur bihom avec sois client ou admin ou technicien
	public  void Login() throws IOException, SQLException {
		String userText = in.readLine(); 
		String pwdText = in.readLine();
	    boolean m=false;
	    
			try {
				m=ccl.Connexion(userText, pwdText);
			} catch (SQLException e1) {e1.printStackTrace();}
			if(m) {client = ccl.GetClient_ByLogin(new Client(userText,pwdText).getLogin());
					
					out.println("true");
				  }else {
					  out.println("false");
				  }
	}
	
	//Inscription client,
	
	 public void Inscrire_Client() throws SQLException, NumberFormatException, IOException {
		 		Client client_inscri = new Client(in.readLine(),in.readLine(),Integer.parseInt(in.readLine()),in.readLine(),in.readLine());
			out.println(ccl.Ajouter_Client(client_inscri));

	 }
	
	
	
	 //Acceuil
	 
	 //choix capt
	 public void choix_capt() throws NumberFormatException, IOException, SQLException {
		 output_objet.writeObject(ccp.GetCapteur_ById(Integer.parseInt(in.readLine())));
	 }
	 
	 
	 
	 
	 
	 //Terrain
	 
	 public void Ajout_Command() throws ClassNotFoundException, IOException, SQLException {
		  captt = ccp.GetCapteur_ByDesignation(in.readLine());
		   tt=new Terrain(captt.getId_Capteur(),Double.parseDouble(in.readLine()), in.readLine(),in.readLine());
		 // System.out.println(terr.id_Terrain);
		// ccm.Ajouter_Commande(cmd, captt, terr);
			 cmd = new Commande(ccl.GetClient_ByLogin(client.getLogin()).id_Client,captt.getId_Capteur(),tt.id_Terrain);

		 
	 }
	 
	
	
	 
	 
	 
	 
	 public void exist_terrain() throws NumberFormatException, SQLException, IOException {
		  captt = ccp.GetCapteur_ByDesignation(in.readLine());
		  idd=Integer.parseInt(in.readLine());
		 boolean abc = ccl.Terrain_exist(terr, client,idd);
		 terr=ccl.GetTerrain_ById(idd);
		 tt=ccl.GetTerrain_ByAdresse(terr.Adresse);
		 System.out.println(abc);
		 if(abc) {
			 out.println("true");
			 System.out.println(client.id_Client+","+captt.getId_Capteur()+","+idd);
			 
			 cmd = new Commande(client.id_Client,captt.getId_Capteur(),idd);

		 }else {
			 out.println("false");
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //Paiement
	 
	 public void Paiement() throws SQLException, IOException {
		 
		 if(in.readLine().equals("true")) {
			  if(idd==-1) {ccl.Ajouter_Terrain(tt, client);}else {idd=-1;}
			  terr = ccl.GetTerrain_ByAdresse(tt.Adresse);

			 
			 ccm.Ajouter_Commande(cmd, captt, terr);
			 
			 String chem ="/Users/user/Downloads/Nouveau dossier/Smart Agriculture_Client/src/"+client.id_Client+""+captt.getId_Capteur()+terr.id_Terrain+".txt";
			 
			// File file = new File(chem);
			 //file.createNewFile();
			 //FileWriter fw = new FileWriter(chem,true);
			// fw.write("20.0");
			 	//BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			    //writer.write("20.0");
			    //writer.flush();
			 //fw.write((int) 0.0);
			 String fileData = "0.00";
			 FileOutputStream fos = new FileOutputStream(chem);
			 fos.write(fileData.getBytes());
			 fos.flush();
			 fos.close();

			 
		 }else {
			 
		 }
		 
	 }
	 
	 
	 
	 
	 
	 //
	 public void Affich_Capteur_client() throws IOException, SQLException {
			output_objet.writeObject(ccp.GetAllCapteursClientInstalle(client.id_Client));
	 }
	 
	 
	 
	 public void Affich_Terr_client() throws IOException, SQLException {
		// System.out.println(ccl.GetAllTerrain(client.id_Client));
			output_objet.writeObject(ccl.GetAllTerrain(client.id_Client));
	 }
	 
	 
	 
	 
	 public void mod_Infos() throws NumberFormatException, SQLException, IOException {
		// System.out.println("112");
		    
			out.println(ccl.Modifier_Client(client.id_Client,in.readLine(),in.readLine(),Integer.parseInt(in.readLine()),in.readLine(),in.readLine()));
			//System.out.println("aa1");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public void Visualiser() throws NumberFormatException, SQLException, IOException {
		 out.println(ccm.getCommandebyIdCapt(client,Integer.parseInt(in.readLine()),Integer.parseInt(in.readLine())));
		 out.println(client.id_Client);
		 
	 }
	 
	 
	 
	 public void modifiermesinfos() throws IOException {
		 output_objet.writeObject(client);
	 }
	 
	 
	 
	 
	 
	 
	
	
	
	
	//Admin
	
	//->Client
	public void Ajout_Client() throws NumberFormatException, SQLException, IOException{
		
			Client ajout_client =new Client(in.readLine(),in.readLine(),Integer.parseInt(in.readLine()),in.readLine(),in.readLine());
		out.println(ccl.Ajouter_Client(ajout_client));

		
	}
	
	
	
	public void Modifier_Client() throws NumberFormatException, SQLException, IOException {
		
		out.println(ccl.Modifier_Client(id,in.readLine(),in.readLine(),Integer.parseInt(in.readLine()),in.readLine(),in.readLine()));

	}
	
	
	
	public void Show_Modifier() throws NumberFormatException, SQLException, IOException {

		id = Integer.parseInt(in.readLine());	
		
		Client c = ccl.GetClient_ById(id);
		

		
		out.println(c.getNom());
		out.println(c.getPrenom());
		out.println(c.getAge());
		out.println(c.getLogin());
		out.println(c.getMdp());
	}
	
	
	
	public void Supprimer_Client() throws NumberFormatException, SQLException, IOException {
		out.println(ccl.SupprimerClient(Integer.parseInt(in.readLine())));
	}
	
	   
	
	
	public void Afficher_Client() throws IOException, SQLException {
		output_objet.writeObject(ccl.GetAllClients());
	}
	
	
	
	
	
	//->Capteur 
	
	public void Ajout_Capteur() throws NumberFormatException, IOException, SQLException {
		String des = in.readLine();
		String type = in.readLine();

		Double prix = Double.parseDouble(in.readLine());
		String img = in.readLine();
		
		Capteur ajout_capteur = new Capteur(des,type,prix,img);
		out.println(ccp.Ajouter_Capteur(ajout_capteur));

	}
	
	
	
	public void Supprimer_Capteur() throws NumberFormatException, SQLException, IOException {
		out.println(ccp.SupprimerCapteur(Integer.parseInt(in.readLine())));
	}
	
	
	public void Afficher_Capteur() throws IOException, SQLException {
		output_objet.writeObject(ccp.GetAllCapteurs());

	}
	
	
	
	
	//->Technicien
	
	
	public void Ajout_Technicien() throws SQLException, NumberFormatException, IOException {
		
		
	Technicien ajout_technicien =new Technicien(in.readLine(),in.readLine(),Integer.parseInt(in.readLine()),in.readLine(),in.readLine(),Double.parseDouble(in.readLine()));
	out.println(ct.ajouterTechnicien(ajout_technicien));

		
		
	}

	
	public void Modifier_Tech() throws NumberFormatException, SQLException, IOException {
		
		out.println(ct.Modifier_Tech(id_t,in.readLine(),in.readLine(),Integer.parseInt(in.readLine()),in.readLine(),in.readLine(),Double.parseDouble(in.readLine()) ));

	}
	
	
	
	public void Show_Modifier_Tech() throws SQLException, NumberFormatException, IOException {
		id_t = Integer.parseInt(in.readLine());	
		
		Technicien Tech = ct.GetTech_ById(id_t);


		
		out.println(Tech.getNom());
		out.println(Tech.getPrenom());
		out.println(Tech.getAge());
		out.println(Tech.getLogin());
		out.println(Tech.getMdp());
		out.println(Tech.getSalaire());
	}



	
	//-> Commande
	public void Afficher_Commande() throws IOException, SQLException {
		output_objet.writeObject(ccm.GetAllCommande());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Espace Technicien Espace Technicien Espace Technicien Espace Technicien Espace Technicien Espace Technicien Espace Technicien
	
	
	//Login Technicien
	public void Login_Tech() throws IOException, SQLException{
		String userTextTech = in.readLine(); 
		String pwdTextTech = in.readLine();
	    boolean m=false;
			try {
				m=ct.Connexion(userTextTech, pwdTextTech);
				//System.out.println(m);
			} catch (SQLException e1) {e1.printStackTrace();}
			if(m) {technicien = ct.GetTech_ByLogPass(userTextTech, pwdTextTech);
					out.println("true");
				  }else {
					  out.println("false");
				  }
		
	}
	
	
	
	
	
	
	
	
	
	public void Affich_Capteur_Tech() throws IOException, SQLException {
		output_objet.writeObject(ct.GetTerCom());
	}
	
	
	
	public void Modifier_Tech_Tech() throws NumberFormatException, SQLException, IOException {
		
		out.println(ct.Modifier_Tech(technicien.getId_Technicien(),in.readLine(),in.readLine(),Integer.parseInt(in.readLine()),in.readLine(),in.readLine() ));

	}
	
	
	
	public void Show_Modifier_Tech_Tech() throws SQLException, NumberFormatException, IOException {

		System.out.println(technicien.getId_Technicien());
		
		out.println(technicien.getNom());
		out.println(technicien.getPrenom());
		out.println(technicien.getAge());
		out.println(technicien.getLogin());
		out.println(technicien.getMdp());
	}
	public void Installer() throws NumberFormatException, SQLException, IOException {
		out.println(ct.InstallerCapt(Integer.parseInt(in.readLine())));
		
	}

	
	
	
	
	
	
	
	
	
}