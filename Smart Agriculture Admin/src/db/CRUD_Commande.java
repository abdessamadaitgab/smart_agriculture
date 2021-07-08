package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;

import Model.Capteur;
import Model.Client;
import Model.Commande;
import Model.Personne;
import Model.Terrain;

public class CRUD_Commande {
    Statement stmt;
    Date dt = new Date();

	  public void CRUD_Client(String username, String password) throws SQLException {

		  Connection con = DriverManager.getConnection(
		                       "jdbc:mysql://localhost:3306/smartagriculture2",
		                       username,
		                       password);

		  stmt = con.createStatement();

		  }
	  boolean Ajouter_Commande(Commande c) throws SQLException{
	       int id=c.getId_Client();
	                
	    String query ="INSERT INTO commande(client_id)  Values ('" +id+ "') ";
	        int nbUpdated = stmt.executeUpdate(query);  
	        return nbUpdated!=0;
	    }
	  
	  
	  
	  
	  
	  public boolean Ajouter_Commande(Commande c, Capteur cap, Terrain ter) throws SQLException{
	       int id=c.getId_Client();
	       String date = dt.getDate()+"-"+dt.getMonth()+"-"+(dt.getYear()+1900)+" "+dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds();
	                System.out.println(date);
	    String query ="INSERT INTO commande(client_id,id_capt,id_terr,date)  Values ('" +id+ "','"+cap.getId_Capteur()+"','"+ter.id_Terrain+"','"+date+"') ";
	        int nbUpdated = stmt.executeUpdate(query);  
	        return nbUpdated!=0;
	    }
	  
	  
	  
	  
	  
		
		public Commande getCommandebyId (int idCommande) throws SQLException {
			
			String query="select * from commande  where id_commande='" +idCommande+ "' ";
		    ResultSet rs=stmt.executeQuery(query);

		    while(rs.next()){
		     int idc=rs.getInt("id_client");
		      Date dt=rs.getDate("dateCommande");
		      Commande c=new Commande(idc,dt);
		      return c;
		}
		    return null;
}
		
		
		
		
		
		
		
		
	public LinkedList<Commande> getCommandesbydate (Date dt) throws SQLException {
			
			String query="select * from commande  where date='" +dt+ "' ";
		    ResultSet rs=stmt.executeQuery(query);
		    LinkedList<Commande> commandes=new LinkedList<Commande>();

		    while(rs.next()){
		     int idc=rs.getInt("id_client");
		      Commande c=new Commande(idc,dt);
		      commandes.add(c);
		}
		    return null;
}
		
	
	
	  public LinkedList<Commande> GetAllCommande() throws SQLException {
			{
				String query="select * from commande ";
			    ResultSet rs=stmt.executeQuery(query);
			           LinkedList<Commande> Commandes= new   LinkedList<Commande> ();

			    while(rs.next()){
			
			       String date=rs.getString("date");
			       int idc = rs.getInt("id");
			       int idcc = rs.getInt("client_id");

			       Commande c =new Commande(idc,idcc,date);
			     Commandes.add(c);
			}
			    return Commandes;
			    
			}
		}








		public String getCommandebyIdCapt(Client c,int capt , int idt) throws SQLException {
			
			String query="select * from commande,capteur  where commande.id_capt=capteur.id AND client_id='" +c.id_Client+ "'  AND  id_capt='"+capt+"' AND id_terr='"+idt+"'";
		    ResultSet rs=stmt.executeQuery(query);

		    while(rs.next()){
		     int idc=rs.getInt("client_id");
		      return rs.getString("type");
		}
		    return null;
}



}
