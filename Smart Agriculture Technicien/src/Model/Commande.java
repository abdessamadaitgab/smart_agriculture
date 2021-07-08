package Model;

import java.util.Date;

public class Commande  {

	protected int id_Commande,id_Client;
	protected Date date_commande;
	
	public Commande(int id_Commande, int id_Client, Date date_commande) {
		this.id_Commande = id_Commande;
		this.id_Client = id_Client;
		this.date_commande = date_commande;
	}

	public Commande(int id_Client, Date date_commande) {
		super();
		this.id_Client = id_Client;
		this.date_commande = date_commande;
	}

	public Commande(int id_Client) {
		super();
		this.id_Client = id_Client;
	}

	public int getId_Commande() {
		return id_Commande;
	}

	public void setId_Commande(int id_Commande) {
		this.id_Commande = id_Commande;
	}

	public int getId_Client() {
		return id_Client;
	}

	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}

	public Date getDate_commande() {
		return date_commande;
	}

	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}
	
	
	
}
