package Model;

import java.io.Serializable;
import java.util.LinkedList;

public class Technicien extends Personne implements Serializable{

	protected int id_Technicien;
	protected LinkedList<Capteur>[] Capteur_a_Installer;
	protected double Salaire;
	
	public Technicien(String nom, String prenom, int age, String login, String mdp, int id_Technicien, LinkedList<Capteur>[] capteur_a_Installer, double salaire) {
		super(nom, prenom, age, login, mdp);
		this.id_Technicien = id_Technicien;
		Capteur_a_Installer = capteur_a_Installer;
		Salaire = salaire;
	}

	public Technicien(String nom, String prenom, int age, String login, String mdp, double salaire) {
		super(nom, prenom, age, login, mdp);
		Salaire = salaire;
	}

	public Technicien(int id,String nom, String prenom, int age, String login, String mdp, double salaire) {
		super(nom, prenom, age, login, mdp);
		Salaire = salaire;
		id_Technicien =id;
	}

	
	
	public Technicien(String login, String mdp) {
		super(login, mdp);
		//Salaire = salaire;
	}
	
	
	public int getId_Technicien() {
		return id_Technicien;
	}

	public void setId_Technicien(int id_Technicien) {
		this.id_Technicien = id_Technicien;
	}

	public LinkedList<Capteur>[] getCapteur_a_Installer() {
		return Capteur_a_Installer;
	}

	public void setCapteur_a_Installer(LinkedList<Capteur>[] capteur_a_Installer) {
		Capteur_a_Installer = capteur_a_Installer;
	}

	public double getSalaire() {
		return Salaire;
	}

	public void setSalaire(double salaire) {
		Salaire = salaire;
	}
	
	
	
}
