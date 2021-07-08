package Model;

import java.io.Serializable;

public class Admin extends Personne implements Serializable{

	protected int id_Admin;

	public Admin(String nom, String prenom, int age, String login, String mdp, int id_Admin) {
		super(nom, prenom, age, login, mdp);
		this.id_Admin = id_Admin;
	}


	
	
}
