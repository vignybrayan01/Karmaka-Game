package Projet;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir16 implements Strategie,Serializable{
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		System.out.println("Ce pouvoir donne la possbilité à votre adversaire de defaussez une carte de sa main \n");
		System.out.println(j2.getNom()+"  veuillez choisir une carte à defaussez \n");
		System.out.println(Joueur.affichageArrayList(j2.main));
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choisissez une carte \n");
		int t;
					if(j2.type==TypeJoueur.Réel) {
						 t =Integer.parseInt(scanner.nextLine());
								
					}else {		
								//debut random
									Random random = new Random();
					
							        // Définir l'intervalle et l'exception
							        int min = 1;
							        int max = j2.getMain().size();
							        t=1;
							        if(max - min>0) {
							        t = random.nextInt((max - min) + 1) + min;
							        }
						         //fin random
						         System.out.println("Le joueur virtuel a deja jouer");
						}
		if(!j.getMain().isEmpty()) {
			Partie.fosse.add(j2.getMain().get(t-1));
		j2.getMain().remove(t-1);
		}
	}

}
