package Model;

import java.io.Serializable;

public class captter implements Serializable{
	static final long serialVersionUID = 1L;

	public captter(String designation, String type, double prix, String image,int idter) {
		super();
		Designation = designation;
		setType(type);
		Prix = prix;
		this.setImage(image);
		this.idter=idter;

	}

	protected int id_Capteur;
	protected String Designation;
	private String Type;
	private String image;
	protected double Prix;
	protected int idter;
	
	public captter(int id_Capteur, String designation, String type, double prix, String img ,int idter) {
		this.id_Capteur = id_Capteur;
		Designation = designation;
		setType(type);
		Prix = prix;
		this.setImage(image);
		this.idter=idter;
	}

	public int getId_Capteur() {
		return id_Capteur;
	}

	public void setId_Capteur(int id_Capteur) {
		this.id_Capteur = id_Capteur;
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

	protected void setImage(String image) {
		this.image = image;
	}

	public int getIdter() {
		return idter;
	}

	public void setIdter(int idter) {
		this.idter = idter;
	}
	
	
}
