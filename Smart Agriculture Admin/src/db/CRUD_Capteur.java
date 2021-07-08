package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Model.Capteur;
import Model.Client;
import Model.Personne;
import Model.captter;

public class CRUD_Capteur {
	
	 Statement stmt;

	  public void CRUD_Capteur(String username, String password) throws SQLException {

		  Connection con = DriverManager.getConnection(
		                       "jdbc:mysql://localhost:3306/smartagriculture2",
		                       username,
		                       password);

		  stmt = con.createStatement();

		  }
	  public LinkedList<Capteur> GetAllCapteurs() throws SQLException {
			{
				String query="select * from capteur ";
			    ResultSet rs=stmt.executeQuery(query);
			           LinkedList<Capteur> Capteurs= new   LinkedList<Capteur> ();

			    while(rs.next()){
			       String designation=rs.getString("designation");
			       String type=rs.getString("type");
			       double prix=rs.getDouble("prix");
			       String img = rs.getString("image");

			       Capteur c =new Capteur(designation,type,prix,img);
			     Capteurs.add(c);
			}
			    return Capteurs;
			    
			}
		}
	  public LinkedList<Capteur> GetAllCapteursClient(int id) throws SQLException {
			{
				String query="select capteur.id,designation,type,prix ,image from capteur,commande where client_id='"+id+"' and id_capt=capteur.id ";
			    ResultSet rs=stmt.executeQuery(query);
			           LinkedList<Capteur> Capteurs= new   LinkedList<Capteur> ();

			    while(rs.next()){
			    	int idc=rs.getInt("id");
			       String designation=rs.getString("designation");
			       String type=rs.getString("type");
			       double prix=rs.getDouble("prix");
			       String img = rs.getString("image");

			       Capteur c =new Capteur(idc,designation,type,prix,img);
			     Capteurs.add(c);
			}
			    return Capteurs;
			    
			}
		}
	  public LinkedList<captter> GetAllCapteursClientInstalle(int id) throws SQLException {
			{
				String query="select capteur.id,designation,type,prix ,image,commande.id_terr from capteur,commande where client_id='"+id+"' and id_capt=capteur.id and traite=1 ";
			    ResultSet rs=stmt.executeQuery(query);
			           LinkedList<captter> Capteurs= new   LinkedList<captter> ();

			    while(rs.next()){
			    	int idc=rs.getInt("id");
			       String designation=rs.getString("designation");
			       String type=rs.getString("type");
			       double prix=rs.getDouble("prix");
			       String img = rs.getString("image");
			       int idt=rs.getInt("id_terr");

			       captter c =new captter(idc,designation,type,prix,img,idt);
			     Capteurs.add(c);
			}
			    return Capteurs;
			    
			}
		}
		public Capteur GetCapteur_ById(int id_Capteur) throws SQLException {
			String query="select * from capteur where id='" +id_Capteur+ "'";
		    ResultSet rs=stmt.executeQuery(query);

		    while(rs.next()){
		    	 String designation=rs.getString("designation");
			       String type=rs.getString("type");
			       double prix=rs.getDouble("prix");
			       String img = rs.getString("image");

			       Capteur c =new Capteur(designation,type,prix,img);
		      
		       return c;
		}
			return null;
		}
		public Capteur GetCapteur_ByDesignation(String designation) throws SQLException {
			String query="select * from capteur where designation='" +designation+ "'";
		    ResultSet rs=stmt.executeQuery(query);

		    while(rs.next()){
		    	int id = rs.getInt("id");
		    	 String designation1=rs.getString("designation");
			       String type=rs.getString("type");
			       double prix=rs.getDouble("prix");
			       String img = rs.getString("image");

			       Capteur c =new Capteur(id,designation1,type,prix,img);
		      
		       return c;
		}
			return null;
		}
		public Capteur GetCapteur_ByType(String type) throws SQLException {
			String query="select * from capteur where type='" +type+ "'";
		    ResultSet rs=stmt.executeQuery(query);

		    while(rs.next()){
		    	 String designation1=rs.getString("designation");
			       String type1=rs.getString("type");
			       double prix=rs.getDouble("prix");
			       String img = rs.getString("image");

			       Capteur c =new Capteur(designation1,type1,prix,img);
		      
		       return c;
		}
			return null;
		}
		 public LinkedList<Capteur> TrierCapteurParType(String type) throws SQLException {
				{
					String query="select * from capteur where type='"+type+"'";
				    ResultSet rs=stmt.executeQuery(query);
				           LinkedList<Capteur> Capteurs= new   LinkedList<Capteur> ();

				    while(rs.next()){
				       String designation=rs.getString("designation");
				       String type1=rs.getString("type");
				       double prix=rs.getDouble("prix");
				       String img = rs.getString("image");

				       Capteur c =new Capteur(designation,type1,prix,img);
				     Capteurs.add(c);
				}
				    return Capteurs;
				    
				}
			}
		 public LinkedList<Capteur> TrierCapteurParType() throws SQLException {
				{
					String query="select * from capteur ordered by Prix";
				    ResultSet rs=stmt.executeQuery(query);
				           LinkedList<Capteur> Capteurs= new   LinkedList<Capteur> ();

				    while(rs.next()){
				       String designation=rs.getString("designation");
				       String type1=rs.getString("type");
				       double prix=rs.getDouble("prix");
				       String img = rs.getString("image");
				       
				       Capteur c = new Capteur(designation,type1,prix,img);
				     Capteurs.add(c);
				}
				    return Capteurs;
				    
				}
			}
		public boolean Ajouter_Capteur(Capteur c) throws SQLException{
		       String designation =c.getDesignation();
		       String type=c.getType();
		       double prix=c.getPrix();
		       String img = c.getImage();
		       String query ="INSERT INTO capteur(designation,type,prix,image)  Values ('" +designation+ "','" +type+ "','" +prix+"','" +img+ "')";
		        int nbUpdated = stmt.executeUpdate(query);  
		        return nbUpdated!=0;
		    }
    
    

		   public boolean SupprimerCapteur(int id) throws SQLException {
		       String query="delete from capteur where id="+id;
		       int nbUpdated = stmt.executeUpdate(query);  
		       return nbUpdated!=0;

		   }
    
		   
		   
		   
			  public LinkedList<Capteur> GetAllCapteurs_Client() throws SQLException {
					{
						String query="select * from capteur,commande where ";
					    ResultSet rs=stmt.executeQuery(query);
					           LinkedList<Capteur> Capteurs= new   LinkedList<Capteur> ();

					    while(rs.next()){
					       String designation=rs.getString("designation");
					       String type=rs.getString("type");
					       double prix=rs.getDouble("prix");
					       String img = rs.getString("image");

					       Capteur c =new Capteur(designation,type,prix,img);
					     Capteurs.add(c);
					}
					    return Capteurs;
					    
					}
				}
		   
		   
		   
		   
		   

		   

           

}
