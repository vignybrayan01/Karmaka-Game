package Projet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir18 implements Strategie,Serializable{
	
	Scanner scanner= new Scanner(System.in);
	int i,k;
	int compteur=0;
	public void jouerCarte(Joueur j, int index) {
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		ArrayList<String> menu1=new ArrayList<String>();
		menu1.add("OUI");
		menu1.add("NON");
		
	while(true) {
		
					if(j.type==TypeJoueur.Réel) {
						i= Partie.lireNombreDansMenu("\n Voulez vous defaussez une carte ?  : \n", menu1, 1, 2, scanner);
					
					}else {		
								//debut random
								Random random = new Random();
						        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
						        int min = 1;
						        int max = 2;
						         i = random.nextInt((max - min) + 1) + min;
						         //fin random
						         System.out.println("Le joueur virtuel a deja jouer");
						}

		
		if(compteur==2 || i==2) {
			break;
		}else{
			
			compteur++;
			System.out.println(j.getNom()+ "  veuillez choisir la " + compteur + " carte que vous voulez defaussez"+ " \n");
			System.out.println(Joueur.affichageArrayList(j.main));
			
			Scanner scanner= new Scanner(System.in);
			System.out.println("Choisissez une carte \n");
			int t;
						if(j.type==TypeJoueur.Réel) {
							 t =Integer.parseInt(scanner.nextLine());
							
						}else {		
									//debut random
									Random random = new Random();
							        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
									int min = 1;
									int max = j.getMain().size();

									if (max > 0) {
									    t = random.nextInt((max - min) + 1) + min;
									    
									} else {
									    t=1;System.out.println("La liste est vide, impossible de générer un nombre aléatoire.");
									}
							          //fin random
							         System.out.println("Le joueur virtuel a deja jouer");
							}
						
			if(j.getMain().isEmpty()) {
				Partie.fosse.add(j.getMain().get(t-1));
				j.getMain().remove(t-1);
						}
						
			
			
		}
	
	}
	k=0;
	compteur++;
	
	while(k<compteur) {
		
		if(j.type==TypeJoueur.Réel) {
			i= Partie.lireNombreDansMenu("\n Voulez vous ajoutez une carte dans votre main ?  : \n", menu1, 1, 2, scanner);

		}else {		
					//debut random
					Random random = new Random();
			        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
			        int min = 1;
			        int max = 2;
			         i = random.nextInt((max - min) + 1) + min;
			         //fin random
			         System.out.println("Le joueur virtuel a deja jouer");
			}
	
		if(i==2)
			break;
		
		j.setMain(Partie.tasCartes.poll());
		System.out.print("La carte a été ajouté \\n");
		k++;
		
	}
	
	
	
	}

}
