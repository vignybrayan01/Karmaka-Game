package Projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Pouvoir5 implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		System.out.println("Chosisez la carte dont vous souhaitez copier le pouvoir \n\n");
		
		Joueur.affichageArrayList(j.getMain());
		
		Scanner scanner= new Scanner(System.in);
		System.out.println(j);
		int i =Integer.parseInt(scanner.nextLine());
		
		carte = j.getMain().get(i-1);
		Strategie s= Partie.creerPouvoir(carte);
		j.setStrategie(s);
		j.getStrategie().jouerCarte(j, i-1);
		//compteurPouvoir++;
		//Thread.sleep(50000);

		
	}

	
	
	

}
