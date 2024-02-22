package Projet;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir14 implements Strategie,Serializable {
	
	public void jouerCarte(Joueur j, int index) {
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		System.out.println("Voici les cartes qui se trouve dans votre main, choisissez 2 cartes a deposer dans l'oeuvre \n");
		System.out.println(Joueur.affichageArrayList(j.main));
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choisisez la premiere carte \n");
		int i;
					if(j.type==TypeJoueur.Réel) {
							i=Integer.parseInt(scanner.nextLine());
						
					}else {		
								//debut random
								Random random = new Random();
						        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
						        int min = 1;
						        int max = j.getMain().size();
						        if(max-min>0)
						        	i= random.nextInt((max - min) + 1) + min;
						        else
						        	i=1;
						        //fin random
						        
						         System.out.println("Le joueur virtuel a deja jouer");
						}
		j.setOeuvre(j.getMain().get(i-1));
		j.getMain().remove(i-1);
		System.out.println(Joueur.affichageArrayList(j.main));
		System.out.println("Choisisez la seconde carte \n");
		
					if(j.type==TypeJoueur.Réel) {
						i=Integer.parseInt(scanner.nextLine());
					
					}else {		
							//debut random
							Random random = new Random();
					        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
							int min = 1;
							int max = j.getMain().size();

							if (max > 0) {
							    i = random.nextInt((max - min) + 1) + min;
							    // Faites quelque chose avec la valeur générée (i)
							} else {
							    System.out.println("La liste est vide, impossible de générer un nombre aléatoire.");
							}
					        //fin random
					         System.out.println("Le joueur virtuel a deja jouer");
					}
		
		if(!j.getMain().isEmpty()) {
		j.setOeuvre(j.getMain().get(i-1));
		j.getMain().remove(i-1);
		}
	}

}
