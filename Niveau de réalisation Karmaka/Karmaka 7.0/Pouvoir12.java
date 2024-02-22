package Projet;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir12 implements Strategie,Serializable{
	
	Carte carte;
	
	public void jouerCarte(Joueur j, int index) {
		
		if (!j.getMain().isEmpty()) {
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);}
		
		j.setMain(Partie.tasCartes.poll());
		j.setMain(Partie.tasCartes.poll());
		
		System.out.println("Voici les cartes qui se trouve dans votre main, choisissez 2 cartes \n");
		System.out.println(Joueur.affichageArrayList(j.main));
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choisisez la premiere carte \n");
		int i;
				if(j.type==TypeJoueur.Réel) {
					 i =Integer.parseInt(scanner.nextLine());
					
				}else {		
							//debut random
							Random random = new Random();
					        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
					        int min = 1;
					        int max = j.main.size();
					         i = random.nextInt((max - min) + 1) + min;
					         //fin random
					         System.out.println("Le joueur virtuel a deja jouer");
					}
		
		j.DeposerCarteViefuture(j.getMain().get(i-1));
		j.getMain().remove(i-1);
		System.out.println(Joueur.affichageArrayList(j.main));
		System.out.println("Choisisez la seconde carte \n");
				if(j.type==TypeJoueur.Réel) {
					 i =Integer.parseInt(scanner.nextLine());
					
				}else {		
							//debut random
							Random random = new Random();
					        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
					        int min = 1;
					        int max = j.main.size();
					         i = random.nextInt((max - min) + 1) + min;
					         //fin random
					         System.out.println("Le joueur virtuel a deja jouer");
					}
		
		j.DeposerCarteViefuture(j.getMain().get(i-1));
		j.getMain().remove(i-1);
		
		
		
	}

}
