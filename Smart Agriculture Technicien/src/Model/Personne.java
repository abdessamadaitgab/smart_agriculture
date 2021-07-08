package Model;

public class Personne {

	protected String Nom;
	protected String Prenom;
	protected int Age;
	protected String Login;
	protected String Mdp;
	
	public Personne(String nom, String prenom, int age, String login, String mdp) {
		super();
		Nom = nom;
		Prenom = prenom;
		Age = age;
		Login = login;
		Mdp = mdp;
	}

	public String getNom() {
		return Nom;
	}

	public Personne(String login, String mdp) {
		super();
		Login = login;
		Mdp = mdp;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getMdp() {
		return Mdp;
	}

	public void setMdp(String mdp) {
		Mdp = mdp;
	}




}
