package Projet;

import java.util.Scanner;

public class Pouvoir23 implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		int k= j2.getOeuvre().size();
		
		if(k>0) {
			
			System.out.println("vous avez jouer le pouvoir de la carte " +j2.getOeuvre().get(k-1)+" \n");
			System.out.println("Son pouvoir est de : " +j2.getOeuvre().get(k-1).geteffet() +" \n");
			
			carte = j2.getOeuvre().get(k-1);
			Strategie s= Partie.creerPouvoir(carte);
			j.setStrategie(s);
			j.getStrategie().jouerCarte(j, k-1);
		
		
		}else {
			
			System.out.println(" Il n'y a pas de carte dans votre oeuvre`\n");
					
		
		}
	}

}
