package Projet;
import java.util.*;

public class StrategiePoint implements Strategie{
	
	private static Couleur multi_color;

	public void jouerCarte(Joueur j, int index) {
		Carte c= j.getMain().get(index);
		j.DeposerCarteOeuvre(c);
		j.getMain().remove(index);
		
	}
	   public static void incrementerNombreCouleur(Joueur j, Carte carte) {
	        if (carte != null && carte.getCouleur() != null) {
	            Couleur couleurCarte = carte.getCouleur();
	            
	           
	  
				// Vérifier si la couleur existe déjà dans la map
	            if(couleurCarte==Couleur.multi_color) {
	            	
	            	j.getPoint().put(Couleur.bleu, j.getPoint().get(Couleur.bleu)+1);
	            	j.getPoint().put(Couleur.vert, j.getPoint().get(Couleur.vert)+1);
	            	j.getPoint().put(Couleur.rouge, j.getPoint().get(Couleur.rouge)+1);
	            	
	            }
	            

	            if (j.getPoint().containsKey(couleurCarte)) {
		            int i= j.getPoint().get(couleurCarte);
	                // Si la couleur existe, incrémenter le nombre associé
	            
	            	j.getPoint().put(couleurCarte, i+carte.getValeur().ordinal()+1);
	            	
	            	System.out.println("OK pour l'incrementation");
	        }	
	   }
}
	   
	   public static void decrementerNombreCouleur(Joueur j, Carte carte) {
	        if (carte != null && carte.getCouleur() != null) {
	            Couleur couleurCarte = carte.getCouleur();
	            int i= j.getPoint().get(couleurCarte);
	            
	            // Vérifier si la couleur existe déjà dans la map
	            if (j.getPoint().containsKey(couleurCarte)) {
	                // Si la couleur existe, incrémenter le nombre associé
	            	j.getPoint().put(couleurCarte, i-carte.getValeur().ordinal());
	            	System.out.println("OK pour la decrementation");
	        }	
	   }
}
}