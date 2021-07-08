package Model;

import java.io.Serializable;

public class Capteur implements Serializable {
	static final long serialVersionUID = 1L;

	protected int id_Capteur;
	private String Designation;
	private String Type;
	private double Prix;
	private String image;
	
	public Capteur(int id_Capteur, String designation, String type, double prix, String img) {
		this.id_Capteur = id_Capteur;
		setDesignation(designation);
		setType(type);
		setPrix(prix);
		setImage(img);
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId_Capteur() {
		return id_Capteur;
	}

	public void setId_Capteur(int id_Capteur) {
		this.id_Capteur = id_Capteur;
	}
	
	
	
}
