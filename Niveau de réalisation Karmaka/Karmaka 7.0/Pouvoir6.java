package Projet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir6 implements Strategie,Serializable{
	
public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		ArrayList<Carte> list= new ArrayList<Carte>();
		
		int b=j2.getMain().size();
		
		if (b==0){
			System.out.println("Votre adversaire n'a aucune carte dans sa main dommage`\n");
		
		}else if(b==1){
			
			carte= j2.getMain().get(b-1);
			j.getMain().remove(b-1);
				
			j.setMain(carte);
			System.out.println("La carte de la main de votre adversaire est ajouté à la votre`\n");
			
		}else if(b==2) {
			
			list.add(j2.getMain().get(b-1));
			list.add(j2.getMain().get(b-2));
		
			System.out.println("Voici les 2 premieres cartes dans la main de l'adversaire, choisissez 1 carte \n");
			System.out.println(Joueur.affichageArrayList(list));
			
			Scanner scanner= new Scanner(System.in);
			System.out.println("Choisisez une carte \n");
			int l;
						if(j.type==TypeJoueur.Réel) {
							 l =Integer.parseInt(scanner.nextLine());
							
						}else {		
								//debut random
								Random random = new Random();
						        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
						        int min = 1;
						        int max = list.size();
						        l= random.nextInt((max - min) + 1) + min;
						         //fin random
						         System.out.println("Le joueur virtuel a deja jouer");
						}
			j.setMain(list.get(l-1));
			j2.getMain().remove(l-1);
			
			
		}else if(b>=3) {
			
			list.add(j2.getMain().get(b-1));
			list.add(j2.getMain().get(b-2));
			list.add(j2.getMain().get(b-3));
		
			System.out.println("Voici les 3 premieres cartes dans la main de l'adversaire, choisissez 1 carte \n");
			System.out.println(Joueur.affichageArrayList(list));
			Scanner scanner= new Scanner(System.in);
			System.out.println("Choisisez une carte \n");
			int l;
					if(j.type==TypeJoueur.Réel) {
						 l =Integer.parseInt(scanner.nextLine());
						
					}else {		
							//debut random
							Random random = new Random();
					        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
					        int min = 1;
					        int max = list.size();
					        l= random.nextInt((max - min) + 1) + min;
					         //fin random
					         System.out.println("Le joueur virtuel a deja jouer");
					}
			j.setMain(list.get(l-1));
			j2.getMain().remove(l-1);
			
		}
		
		
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
	}

}
