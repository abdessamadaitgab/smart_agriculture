package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Model.Capteur;
import Model.Technicien;
import Model.TerCom;

public class CRUD_Technicien {
	Statement stmt;
	CRUD_Capteur ccc = new CRUD_Capteur();
	
	
	  public LinkedList<Capteur> GetAllCapteursNon() throws SQLException {
			{
				ccc.CRUD_Capteur("root", "Aitgab@1998");
				String query="select * from capteur_nontraiter ";
			    ResultSet rs=stmt.executeQuery(query);
			           LinkedList<Capteur> Capteurs= new   LinkedList<Capteur> ();

			    while(rs.next()){
			       int id=rs.getInt("id_capt");

			  
			     Capteurs.add(ccc.GetCapteur_ById(id));
			}
			    return Capteurs;
			    
			}
		}
	
	
	
	  public void CRUD_Technicien(String username, String password) throws SQLException {

		  Connection con = DriverManager.getConnection(
		                       "jdbc:mysql://localhost:3306/smartagriculture2",
		                       username,
		                       password);

		  stmt = con.createStatement();

		  }
	  
	  
      public boolean Connexion(String login, String password) throws SQLException{
          String query="select * from technicien where login='"+login+"'AND password='"+password+"'  ";

            ResultSet rs=stmt.executeQuery(query);
            
            return rs.next();
         }

	  
	  
	  
	  
	  
	  
	  public boolean ajouterTechnicien(Technicien c) throws SQLException {
		  String nom=c.getNom();
		  String prenom=c.getPrenom();
		  int age=c.getAge();
		  String login=c.getLogin();
		  String password=c.getMdp();
		  double salaire=c.getSalaire();
          
		    String query ="INSERT INTO technicien(name,prenom,age,login,password,salaire)  Values ('" +nom+ "','" +prenom+ "','"+age+"','"+login+"','"+password+"','"+salaire+"') ";
		        int nbUpdated = stmt.executeUpdate(query);  
		        return nbUpdated!=0;
		  
	  }
	  public boolean supprimerTechnicien(int id) throws SQLException {
		  String query ="DELETE * from technicien where id= '" +id+ "'";
	        int nbUpdated = stmt.executeUpdate(query);  
	        return nbUpdated!=0;
	  }
      public boolean modifierSalaire(int id, double salaire) throws SQLException {
		  String query ="Update technicien set salaire='"+salaire+"' where id= '" +id+ "'";
	        int nbUpdated = stmt.executeUpdate(query);  
	        return nbUpdated!=0;
      }
      
      
      
      public boolean Modifier_Tech(int id,String nom, String prenom, int Age, String login, String password, Double salaire) throws SQLException{
          String query="update technicien set password='"+password+"',name='"+nom+"',prenom='"+prenom+"',age="+Age+",login='"+login+"', salaire ='"+salaire+"' where id='"+id+"'";
          int nbUpdated = stmt.executeUpdate(query);  
          return nbUpdated!=0;
      }
      
      
      public boolean Modifier_Tech(int id,String nom, String prenom, int Age, String login, String password) throws SQLException{
          String query="update technicien set password='"+password+"',name='"+nom+"',prenom='"+prenom+"',age="+Age+",login='"+login+"' where id='"+id+"'";
          int nbUpdated = stmt.executeUpdate(query);  
          return nbUpdated!=0;
      }
      
      
      
		public Technicien GetTech_ById(int id_Capteur) throws SQLException {
			String query="select * from technicien where id='" +id_Capteur+ "'";
		    ResultSet rs=stmt.executeQuery(query);

		    if(rs.next()){
		    	 String name=rs.getString("name");
			       String prenom=rs.getString("prenom");
			      // String type=rs.getString("type");
			       String login=rs.getString("login");
			       String password=rs.getString("password");
			       int age=rs.getInt("Age");
			       double salaire=rs.getDouble("salaire");

			       Technicien Tech =new Technicien(name,prenom,age,login,password,salaire);
		      
		       return Tech;
		}else {
			return null;
		}
		}
      
		public Technicien GetTech_ByLogPass(String log , String pass) throws SQLException {
			String query="select * from technicien where login='" +log+ "' AND password='"+pass+"'";
		    ResultSet rs=stmt.executeQuery(query);

		    if(rs.next()){
		    	   int id = rs.getInt("id");
		    	   String name=rs.getString("name");
			       String prenom=rs.getString("prenom");
			      // String type=rs.getString("type");
			       String login=rs.getString("login");
			       String password=rs.getString("password");
			       int age=rs.getInt("Age");
			       double salaire=rs.getDouble("salaire");

			       Technicien Tech =new Technicien(id,name,prenom,age,login,password,salaire);
		      
		       return Tech;
		}else {
			return null;
		}
		}
		public LinkedList<TerCom> GetTerCom() throws SQLException {
			String query="SELECT * FROM terrain,commande,capteur,client WHERE terrain.id=commande.id_terr AND commande.id_capt=capteur.id AND commande.client_id=client.id AND commande.traite=0";
		    ResultSet rs=stmt.executeQuery(query);
		    LinkedList<TerCom> Techs = new LinkedList<TerCom>();
		    
		    while(rs.next()){
		    	 int idc=rs.getInt("commande.id");
			     String nom = rs.getString("name"); 
		    	 String prenom=rs.getString("prenom");
			      // String type=rs.getString("type");
			       String date=rs.getString("date");
			       String adresse=rs.getString("adresse");
			       String ville=rs.getString("ville");
			       String designation=rs.getString("designation");
			       String type = rs.getString("type");

			       TerCom Tech =new TerCom(idc,nom,prenom,date,adresse,ville,designation,type);  
			       Techs.add(Tech);
		    }
			return Techs;
		
		}
      
	
	
	
	
	
	
	
	     public boolean InstallerCapt(int id) throws SQLException{
	          String query="update commande set traite=1 where id='"+id+"'";
	          int nbUpdated = stmt.executeUpdate(query);  
	          return nbUpdated!=0;
	      }
		
		
      
}
