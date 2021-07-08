package Model;

import java.io.Serializable;

public class TerCom implements Serializable{

	public int id;
	public String Nom,Prenom,date,adresse,ville,designation,type;

	public TerCom(int idc, String nom, String prenom, String date, String adresse, String ville, String designation, String type) {
		this.id=idc;
		this.Nom=nom;
		this.Prenom=prenom;
		this.date=date;
		this.adresse=adresse;
		this.ville=ville;
		this.designation=designation;
		this.type=type;
	}
	
}