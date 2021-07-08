package Model;

import java.util.LinkedList;

public class Terrain {

	protected int id_Terrain;
	protected double Superficie;
	protected String Adresse;
	protected String Ville;
	protected LinkedList<Capteur> ListeCapteur;
	
	public Terrain(int id_Terrain, double superficie, String adresse, LinkedList<Capteur> listeCapteur, String ville) {
		this.id_Terrain = id_Terrain;
		Superficie = superficie;
		Adresse = adresse;
		ListeCapteur = listeCapteur;
		Ville=ville;
	}

	public Terrain(double superficie, String adresse, String ville) {
		super();
		Superficie = superficie;
		Adresse = adresse;
		Ville = ville;
	}
	
	
	
	
}
