package Model;

import java.io.Serializable;
import java.util.LinkedList;

public class Client extends Personne implements Serializable{
	static final long serialVersionUID = 1L;

	protected int id_Client;
	protected LinkedList<Capteur>[] ListeCapteur;
	protected LinkedList<Terrain>[] ListeTerrain;
	
	
	public Client(String nom, String prenom, int age, String login, String mdp, int id_Client, LinkedList<Capteur>[] listeCapteur, LinkedList<Terrain>[] listeTerrain) {
		super(nom, prenom, age, login, mdp);
		this.id_Client = id_Client;
		ListeCapteur = listeCapteur;
		ListeTerrain = listeTerrain;
	}


	public Client(String nom, String prenom, int age, String login, String mdp) {
		super(nom, prenom, age, login, mdp);
	}
	
	public Client (String login,String mdp) {
		super(login,mdp);
	}
	
	
	
	
	
	
}
