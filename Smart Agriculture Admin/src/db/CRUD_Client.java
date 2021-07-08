package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Model.*;

public class CRUD_Client {
	
    Statement stmt;

	  public void CRUD_Client(String username, String password) throws SQLException, ClassNotFoundException {

		  Connection con = DriverManager.getConnection(
		                       "jdbc:mysql://localhost:3306/smartagriculture2",
		                       username,
		                       password);

		  stmt = con.createStatement();

		  }
		      public boolean Connexion(String login, String password) throws SQLException{
		          String query="select * from client where login like'"+login+"'AND password='"+password+"'  ";

		            ResultSet rs=stmt.executeQuery(query);
		            
		            return rs.next();
		         }

	public LinkedList<Client> GetAllClients() throws SQLException {
		{
			String query="select * from client ";
		    ResultSet rs=stmt.executeQuery(query);
		           LinkedList<Client> Clients= new   LinkedList<Client> ();

		    while(rs.next()){
		       String nom=rs.getString("name");
		       String prenom=rs.getString("prenom");
		       int age=rs.getInt("age");
		       String login=rs.getString("login");
		       String password=rs.getString("Password");
		       Client c =new Client(nom,prenom,age,login,password);
		     Clients.add(c);
		}
		    return Clients;
		    
		}
	}
		
		
	
	
	
	
	
	
	public Client GetClient_ByLogin(String log) throws SQLException {
		String query="select * from client where login='"+log+"'";
	    ResultSet rs=stmt.executeQuery(query);

	    if(rs.next()) {
	    	int id = rs.getInt("id");
	       String nom=rs.getString("name");
	       String prenom=rs.getString("prenom");
	       int age=rs.getInt("age");
	       String login=rs.getString("login");
	       String password=rs.getString("Password");
	       Client c =new Client(id,nom,prenom,age,login,password);
	       return c;
	    }else {
		return null;
	    }
	}
	
	
	
	
	
	public Client GetClient_ById(int id_Client) throws SQLException {
		String query="select * from client where id="+id_Client;
	    ResultSet rs=stmt.executeQuery(query);

	    if(rs.next()) {
	       String nom=rs.getString("name");
	       String prenom=rs.getString("prenom");
	       int age=rs.getInt("age");
	       String login=rs.getString("login");
	       String password=rs.getString("Password");
	       Client c =new Client(nom,prenom,age,login,password);
	       return c;
	    }else {
		return null;
	    }
	}
	
	
	public Client GetClient_ByName(String Nom) throws SQLException {
		
		String query="select * from client where name='" +Nom+ "'";
	    ResultSet rs=stmt.executeQuery(query);

	    while(rs.next()){
	       String nom=rs.getString("nom");
	       String prenom=rs.getString("prenom");
	       int age=rs.getInt("age");
	       String login=rs.getString("login");
	       String password=rs.getString("Password");
	       Client c =new Client(nom,prenom,age,login,password);
	       return c;
	}
		return null;	}
	
	
	public Client GetClient_ByPrenom(String Prenom) throws SQLException {
		
		
		String query="select * from client where prenom='" +Prenom+ "'";
	    ResultSet rs=stmt.executeQuery(query);

	    while(rs.next()){
	       String nom=rs.getString("nom");
	       String prenom=rs.getString("prenom");
	       int age=rs.getInt("age");
	       String login=rs.getString("login");
	       String password=rs.getString("Password");
	       Client c =new Client(nom,prenom,age,login,password);
	       return c;
	}
		return null;	}
	
	
	public Client GetClient_ByTerrain(int id_Terrain) throws SQLException {
		
		String query="select(name,prenom,age,login,password) from terrain,client  where id_terrain='" +id_Terrain+ "'";
	    ResultSet rs=stmt.executeQuery(query);

	    while(rs.next()){
	       String nom=rs.getString("nom");
	       String prenom=rs.getString("prenom");
	       int age=rs.getInt("age");
	       String login=rs.getString("login");
	       String password=rs.getString("Password");
	       Client c =new Client(nom,prenom,age,login,password);
	       return c;
	}
		return null;		}
   public  boolean Ajouter_Client(Client c) throws SQLException{
       String nom =((Personne) c).getNom();
       String prenom=((Personne) c).getPrenom();
       String email=c.getLogin();
       String password=c.getMdp();
       int age=c.getAge();
                
    String query ="INSERT INTO client(name,prenom,age,login,password)  Values ('" +nom+ "','" +prenom+ "','" +age+ "','" +email+ "','" +password+ "') ";
        int nbUpdated = stmt.executeUpdate(query);  
        return nbUpdated!=0;
    }
   public boolean Modifier_Client_Nom(String login, String nom) throws SQLException{
       String query="update client set name="+nom+" where login='"+login+"' ";
       int nbUpdated = stmt.executeUpdate(query);  
       return nbUpdated!=0;
   }
  public  boolean Modifier_Client_Prenom(String login, String prenom) throws SQLException{
        String query="update client set prenom="+prenom+" where login='"+login+"' ";
        int nbUpdated = stmt.executeUpdate(query);  
        return nbUpdated!=0;
    }
   public boolean Modifier_Client_age(String login, int age) throws SQLException{
        String query="update client set age="+age+" where login='"+login+"' ";
        int nbUpdated = stmt.executeUpdate(query);  
        return nbUpdated!=0;
    }
   public boolean Modifier_Client_Password(String login, String password) throws SQLException{
        String query="update client set password="+password+" where login='"+login+"' ";
        int nbUpdated = stmt.executeUpdate(query);  
        return nbUpdated!=0;
    }
   
   
   public boolean Modifier_Client(int id,String nom, String prenom, int Age, String login, String password) throws SQLException{
       String query="update client set password='"+password+"',name='"+nom+"',prenom='"+prenom+"',age="+Age+",login='"+login+"' where id='"+id+"'";
       int nbUpdated = stmt.executeUpdate(query);  
       return nbUpdated!=0;
   }
  
   public boolean SupprimerClient(int id) throws SQLException {
       String query="delete from commande where client_id="+id;

       String query2="delete from client where id="+id;
       int nbUpdated = stmt.executeUpdate(query);  
       int nbUpdated2 = stmt.executeUpdate(query2);  

       return nbUpdated2!=0;

   }
   
   
   
   
   
   public  boolean Ajouter_Terrain(Terrain t, Client c) throws SQLException{
       Double sup =t.Superficie ;
       String adr=t.Adresse;
       String ville=t.Ville;
       int idc=c.id_Client;
                
    String query ="INSERT INTO terrain(client_id,surface,adresse,ville)  Values ('" +idc+ "','" +sup+ "','" +adr+ "','" +ville+"')";
        int nbUpdated = stmt.executeUpdate(query);  
        return nbUpdated!=0;
    }
   
   
   
   
   
   
	public boolean Terrain_exist(Terrain t , Client c, int idd) throws SQLException {
		System.out.println(c.id_Client);
		String query="select * from terrain where id="+idd+" AND client_id="+c.id_Client;
	    ResultSet rs=stmt.executeQuery(query);

	    if(rs.next()) {
	     //  String nom=rs.getString("id");
	       return true;
	    }else {
		return false;
	    }
	}
   
   
   
   
	
	
	public Terrain GetTerrain_ByAdresse(String adr) throws SQLException {
		String query="select * from terrain where adresse='"+adr+"'";
	    ResultSet rs=stmt.executeQuery(query);
	    if(rs.next()) {
	       Double sup=rs.getDouble("surface");
	       String ville=rs.getString("ville");
	       int id=rs.getInt("id");
	       int idc=rs.getInt("client_id");
	       Terrain t =new Terrain(id,idc,sup,adr,ville);
	       return t;
	    }else {
		return null;
	    }
	}
	
	
	
	
	
	
	
	public Terrain GetTerrain_ById(int id) throws SQLException {
		String query="select * from terrain where id="+id;
	    ResultSet rs=stmt.executeQuery(query);

	    if(rs.next()) {
	       int idc=rs.getInt("client_id");
	       Double sup=rs.getDouble("surface");
	       String adr=rs.getString("adresse");
	       String ville=rs.getString("ville");
	       Terrain c =new Terrain(id,idc,sup,adr,ville);
	       return c;
	    }else {
		return null;
	    }
	}
	
	
	
	
	
	public LinkedList<Terrain> GetAllTerrain(int idd) throws SQLException {
		{
			String query="select * from terrain where client_id="+idd;
		    ResultSet rs=stmt.executeQuery(query);
		           LinkedList<Terrain> terrains= new   LinkedList<Terrain> ();

		    while(rs.next()){
		       int id=rs.getInt("id");
		       int idc=rs.getInt("client_id");
		       Double sup = rs.getDouble("surface");
		       String adr=rs.getString("adresse");
		       String ville=rs.getString("ville");
		       Terrain t = new Terrain(id,idc,sup,adr,ville);
		       terrains.add(t);
		}
		    return terrains;
		    
		}
	}

	
	
	
	
	
	
	
	
	
   
   
}
