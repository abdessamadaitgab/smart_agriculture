package Model;

import java.util.LinkedList;

public class Technicien extends Personne{

	protected int id_Technicien;
	protected LinkedList<Capteur>[] Capteur_a_Installer;
	protected double Salaire;
	
	public Technicien(String nom, String prenom, int age, String login, String mdp, int id_Technicien, LinkedList<Capteur>[] capteur_a_Installer, double salaire) {
		super(nom, prenom, age, login, mdp);
		this.id_Technicien = id_Technicien;
		Capteur_a_Installer = capteur_a_Installer;
		Salaire = salaire;
	}
	
	
}
