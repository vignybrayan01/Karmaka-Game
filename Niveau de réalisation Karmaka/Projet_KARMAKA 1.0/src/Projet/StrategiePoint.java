package Projet;
import java.util.*;

public class StrategiePoint implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		Carte c= j.getMain().get(index);
		j.DeposerCarteOeuvre(c);
		j.getMain().remove(index);
		
	}
	   public static void incrementerNombreCouleur(Joueur j, Carte carte) {
	        if (carte != null && carte.getCouleur() != null) {
	            Couleur couleurCarte = carte.getCouleur();
	            int i= j.getPoint().get(couleurCarte);
	            
	            // Vérifier si la couleur existe déjà dans la map
	            if (j.getPoint().containsKey(couleurCarte)) {
	                // Si la couleur existe, incrémenter le nombre associé
	            	j.getPoint().put(couleurCarte, i+carte.getValeur().ordinal());
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