package db;

import java.util.LinkedList;

import Model.*;

abstract public class CRUD{
	

	private LinkedList<Capteur> GetAllCapteur(int id_Client){
		//Retourne la liste des capteur que le client posséde
		return null;
	}
	
	
	private Capteur GetCapteur(int id_Capteur) {
		//retourner un capteur avec son id
		return null;
	}
	
	
	private LinkedList<Terrain> GetAllTerrain(int id_Client){
		//retourner tout les terrain du client
		return null;
	}
	
	
	private Terrain GetTerrain(int id_Terrain) {
		//retourne le terrain avec son id
		return null;
	}
	
	
	private LinkedList<Commande> GetAllCommande(int id_Client){
		//retourner tout les commande faites par le client
		return null;
	}
	
	
	private Commande GetCommande(int id_Commande) {
		//retourne la commande  avec son id
		return null;
	}	
	
	
	private boolean AjoutetTerrain(Terrain t) {
		return false;
	}
	
	
}
