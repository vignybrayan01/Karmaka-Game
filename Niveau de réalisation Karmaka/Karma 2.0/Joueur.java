package Projet;

import java.util.*;

public class Joueur {
	
	// attributs d'un joueur
	private String nom;
	protected ArrayList<Carte> main;
	private ArrayList<Carte> pile;
	private ArrayList<Carte> oeuvre;
	private ArrayList<Carte> viefuture;
	private int Jeton;
	private NiveauKarmique niveau;
	private Strategie strategie;
	private HashMap<Couleur,Integer> Point;
	
	//private Carte derniereCarteJouee;
	
	public Joueur(String nom){
		
	this.nom=nom;
	main = new ArrayList<Carte>();
	pile = new ArrayList<Carte>();
	oeuvre = new ArrayList<Carte>();
	viefuture = new ArrayList<Carte>();
	this.strategie= new Pouvoir1();
	this.Jeton=0;
	this.niveau=NiveauKarmique.Bousier_1;
	
	HashMap<Couleur,Integer> Point=new HashMap<Couleur,Integer>();
	Point.put(Couleur.bleu, 0);
	Point.put(Couleur.rouge, 0);
	Point.put(Couleur.vert, 0);
	
	}
	
	
	public HashMap<Couleur, Integer> getPoint() {
		if(Point==null) {
			Point=new HashMap<>();
			Point.put(Couleur.bleu, 0);
			Point.put(Couleur.rouge, 0);
			Point.put(Couleur.vert, 0);
		}
		return Point;
	}


	public void setPoint(HashMap<Couleur, Integer> point) {
		Point = point;
	}


	public void ramasserCarteMain(Carte carte){
	main.add(carte);
	}
	
	public void ramasserCartePile(Carte carte){
		pile.add(carte);
	}
	
	public void DeposerCarteOeuvre(Carte carte){
		oeuvre.add(carte);
		}
	public void DeposerCarteViefuture(Carte carte){
		viefuture.add(carte);
		}
	
	/*public Carte jouerCarte(){
	System.out.println(this.nom + " que voulez vous jouez ? ");
	Iterator<Carte> it= main.iterator();
	while(it.hasNext()) {
		System.out.println(main.get(it.next()));
		System.out.println("\n");
	}
	
	
	return derniereCarteJouee;
		}*/
	
	public void seReincarner() {
		
		int taille=this.getViefuture().size();
		
		NiveauKarmique[] niveaux = NiveauKarmique.values();
		int pointj=this.getPoint().get(findMaxValueKey(this.Point));
		int n= pointj + this.Jeton - (NiveauKarmique.Bousier_1.ordinal()+4);
		
		this.main.addAll(this.viefuture);
		this.viefuture.clear();
		Partie.fosse.addAll(this.oeuvre);
		this.oeuvre.clear();
		this.getPoint().put(Couleur.bleu, 0);
    	this.getPoint().put(Couleur.vert, 0);
    	this.getPoint().put(Couleur.rouge, 0);
    	//this.niveau=niveaux[this.niveau.ordinal()+1];
    	
    	if(this.getViefuture().size()<6){
		
							
			if(taille<4) {
            	for(int i=taille; i<4; i++) {
            		this.main.add(Partie.tasCartes.poll());
            		
            	}
           	
           	this.pile.add(Partie.tasCartes.poll());
           	this.pile.add(Partie.tasCartes.poll());
				
				
				
			}else {

        	for(int i=taille; i<6; i++) {
        		this.pile.add(Partie.tasCartes.poll());
        		
        	}
			}
			
		}
		
		if(n<0) {
			
			this.Jeton++;

		
		}else {
			
			this.niveau=niveaux[this.niveau.ordinal()+1];
			
			if(pointj<NiveauKarmique.Bousier_1.ordinal()+4){
		
				//this.Jeton=(n-this.Jeton-NiveauKarmique.Bousier_1.ordinal()+4)-pointj;
				this.Jeton=(this.Jeton-1);
			}
					
		}
			
		System.out.print("Vous vous êtes réincarner \n");
			
		}
		
	
	public String getNom(){
		return nom;
		}
	public Strategie getStrategie() {
		return strategie;
	}

	public void setStrategie(Strategie strategie) {
		this.strategie = strategie;
	}

	public ArrayList<Carte> getMain(){
	return main;
		}
	public void setMain(Carte c){
		 this.main.add(c);
		}
	public ArrayList<Carte> getPile(){
		return pile;
		}
	public ArrayList<Carte> getOeuvre(){
		return oeuvre;
		}
	public ArrayList<Carte> getViefuture(){
		return viefuture;
		}
	public void setOeuvre(Carte c){
		 this.oeuvre.add(c);
		}

	//public void afficherCartes()
	
	public static String affichageArrayList(ArrayList<?> liste) {
		StringBuilder builder= new StringBuilder();
		for(int i=0; i<liste.size(); i++) {	
			builder.append(i+1).append("-").append(liste.get(i));
			builder.append("\n");	
			
			if(i<liste.size()-1) {
				//builder.append("\n");
			}
		}

			
		return builder.toString();
		
	}
	
	   private static Couleur findMaxValueKey(Map<Couleur, Integer> map) {
	       if (map == null || map.isEmpty()) {
	            // Gérer le cas où la map est nulle ou vide
	            return null;
	        }

	        // Initialisation avec la première clé et sa valeur
	        Couleur maxKey= Couleur.bleu;
	        int maxValue = 0;

	        // Parcourir toutes les entrées de la map
	        for (Map.Entry<Couleur, Integer> entry : map.entrySet()) {
	            Couleur currentKey = entry.getKey();
	            int currentValue = entry.getValue();

	            // Mettre à jour la clé et la valeur maximales si nécessaire
	            if (currentValue > maxValue) {
	                maxKey = currentKey;
	                maxValue = currentValue;
	            }
	        }

	        return maxKey;
	    }
	
	
	
	public String toString(){
	StringBuffer sb = new StringBuffer();
	sb.append("\n ******************************************* \n");
	sb.append(nom + " a " + main.size() + " cartes dans sa main et " + this.pile.size() + " dans sa plie" + "\t\t");
	sb.append("Niveau du Jeu: " + this.niveau +"\t\t");
	sb.append("Nbre Jeton: " + this.Jeton +"\n");
	sb.append(affichageArrayList(main));
	//sb.append("\n         a " + pile.size() + " cartes dans sa pile \n");
	//sb.append(pile);
	sb.append("\nVous avez a " + oeuvre.size() + " cartes dans votre oeuvre et Vous avez déja "+this.getPoint().get(findMaxValueKey(this.Point))  + " Point(s) \n");
	sb.append(affichageArrayList(oeuvre));
	sb.append("\nVous avez " + viefuture.size() + " cartes dans votre viefuture \n");
	sb.append(affichageArrayList(viefuture));	
	sb.append("\n ******************************************* \n");
	return sb.toString();
	}

}
