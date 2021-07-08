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
	
	
	
}
