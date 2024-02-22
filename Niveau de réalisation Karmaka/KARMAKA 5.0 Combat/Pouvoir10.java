package Projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Pouvoir10 implements Strategie {
	
	public void jouerCarte(Joueur j, int index) {
		

		Carte carte;
		int i = Partie.fosse.size();
		
		
		if(i<3)
			System.out.println("Il n'y a pas assez de carte dans la fosse \n");
		else {
			
			ArrayList<Carte> list= new ArrayList<Carte>();
			
			list.add(Partie.fosse.get(i-1));
			list.add(Partie.fosse.get(i-2));
			list.add(Partie.fosse.get(i-3));
			
			System.out.println("Voici les 3 dernières carte de la fosse, choisissez 1 carte \n");
			System.out.println(Joueur.affichageArrayList(list));
			Scanner scanner= new Scanner(System.in);
			System.out.println("Choisisez une carte \n");
			int l =Integer.parseInt(scanner.nextLine());
			j.setMain(list.get(l-1));
			Partie.fosse.remove(i-l);

		}
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
				
		
	}

}
