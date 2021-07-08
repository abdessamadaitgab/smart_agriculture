package Model;

import java.io.Serializable;
import java.util.LinkedList;

public class Terrain implements Serializable {
	static final long serialVersionUID = 1L;
	public int id_cli;
	public int id_Terrain;
	public double Superficie;
	public String Adresse;
	public String Ville;
	protected LinkedList<Capteur> ListeCapteur;
	
	public Terrain(int id, int idc, double superficie, String adresse, String ville) {
		this.id_Terrain = id;
		id_cli = idc;
		Superficie = superficie;
		Adresse = adresse;
		Ville=ville;
	}
	
	
	public Terrain(int id,double superficie, String adresse, String ville) {
		//this.id_Terrain = id_Terrain;
		this.id_cli = id;
		Superficie = superficie;
		Adresse = adresse;
		Ville=ville;
	}

	
	

	public Terrain(double superficie, String adresse, String ville) {
		super();
		Superficie = superficie;
		Adresse = adresse;
		Ville = ville;
	}
	
	
	
	
}
