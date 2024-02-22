package Projet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class PartieSave implements Serializable{

	
	private static final long serialVersionUID =1L;

	private  LinkedList<Carte> fosse= new LinkedList<Carte>();
	private  ArrayList<Joueur> listJ;
	private  LinkedList<Carte> tasCartes;
	private int indexjoueurcourant;
	private int tour;
	
	
	
	public LinkedList<Carte> getFosse() {
		return fosse;
	}



	public void setFosse(LinkedList<Carte> fosse) {
		this.fosse = fosse;
	}



	public ArrayList<Joueur> getListJ() {
		return listJ;
	}



	public void setListJ(ArrayList<Joueur> listJ) {
		this.listJ = listJ;
	}



	public LinkedList<Carte> getTasCartes() {
		return tasCartes;
	}



	public void setTasCartes(LinkedList<Carte> tasCartes) {
		this.tasCartes = tasCartes;
	}



	public int getIndexjoueurcourant() {
		return indexjoueurcourant;
	}



	public void setIndexjoueurcourant(int indexjoueurcourant) {
		this.indexjoueurcourant = indexjoueurcourant;
	}



	public void PartieSave() {
		this.fosse= null;
		this.listJ=null;
		this.tasCartes=null;
		this.indexjoueurcourant=1;
		this.tour=1;
		
	}



	public int getTour() {
		return tour;
	}



	public void setTour(int tour) {
		this.tour = tour;
	}
	
	
	

}
