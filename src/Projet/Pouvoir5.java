package Projet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir5 implements Strategie,Serializable{
	
	public void jouerCarte(Joueur j, int index) {
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		System.out.println("Chosisez la carte dont vous souhaitez copier le pouvoir \n\n");
		
		Joueur.affichageArrayList(j.getMain());
		
		Scanner scanner= new Scanner(System.in);
		System.out.println(j);
		int i;
				if(j.type==TypeJoueur.Réel) {
					 i =Integer.parseInt(scanner.nextLine());
					
				}else {		
						//debut random
						Random random = new Random();
				        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
				        int min = 1;
				        int max = j.getMain().size();
				        if(max>min) {
				        i= random.nextInt((max - min) + 1) + min;
				        }else
				        	i=1;//fin random
				         System.out.println("Le joueur virtuel a deja jouer");
				}
		
		carte = j.getMain().get(i-1);
		Strategie s= Partie.creerPouvoir(carte);
		j.setStrategie(s);
		j.getStrategie().jouerCarte(j, i-1);
		//compteurPouvoir++;
		//Thread.sleep(50000);

		
	}

	
	
	

}
