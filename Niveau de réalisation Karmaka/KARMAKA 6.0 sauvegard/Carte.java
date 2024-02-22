package Projet;
import java.util.*;
import java.io.*;


public class Carte implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 private Valeur valeur;
	 private TypeC typeC;
	 private String effet;
	 private Couleur couleur;
	 private Pouvoir pouvoir;
	
	 public Carte (TypeC typeC,Valeur valeur, Couleur couleur ,Pouvoir pouvoir, String effet) {
	
	this.setValeur(valeur);
	this.settypeC(typeC);
	this.setCouleur(couleur);
	this.seteffet(effet);
	this.setPouvoir(pouvoir);
	 }
	 
	 
	 public Couleur getCouleur() {
		return couleur;
	}


	public Pouvoir getPouvoir() {
		return pouvoir;
	}


	public void setPouvoir(Pouvoir pouvoir) {
		this.pouvoir = pouvoir;
	}


	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}


	public TypeC gettypeC() {
			return typeC;
			 }
	public void settypeC(TypeC typeC) {
			 this.typeC = typeC;
			}
	
	public String geteffet() {
		return effet;
		 }
	public void seteffet(String effet) {
		 this.effet = effet;
		} 
	 public Valeur getValeur() {
	return valeur;
	 }
	 public void setValeur(Valeur valeur) {
	 this.valeur = valeur;
	 }
	 
	 public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append(this.typeC);
	sb.append(": ");
	sb.append(this.valeur);
	sb.append("\t ");
	//sb.append(this.effet);
	//sb.append(") ");
	sb.append("\n ");
	return sb.toString();
	 }
	 public String caracteristique() {
		 StringBuffer sb = new StringBuffer();
		 sb.append("\n ******************************************* \n");
		 sb.append("\n Vous voulez jouer la carte : " + this.typeC);
		 sb.append("\n\t Nombre points : " + this.getValeur());
		 sb.append("\n\t Couleur : " + this.getCouleur());
		 sb.append("\n\t Son effet : " + this.geteffet());
		sb.append("\n ");
		return sb.toString();
		 
	 }
	 

}
