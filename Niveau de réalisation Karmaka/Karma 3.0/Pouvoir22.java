package Projet;

import java.util.Scanner;

public class Pouvoir22 implements Strategie{
	public void jouerCarte(Joueur j, int index) {
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		int k= j.getOeuvre().size();
		
		if(k==1) {
			
			System.out.println("vous avez jouer le pouvoir de la carte " +j.getOeuvre().get(k-1)+" \n");
			System.out.println("Son pouvoir est de : " +j.getOeuvre().get(k-1).geteffet() +" \n");
			
			carte = j.getOeuvre().get(k-1);
			Strategie s= Partie.creerPouvoir(carte);
			j.setStrategie(s);
			j.getStrategie().jouerCarte(j, k-1);
		
		
		}else if(k>1) {
			
			System.out.println("Chosissez la carte de votre oeuvre dont vous souhaitez copier le pouvoir \n\n");
			
			Joueur.affichageArrayList(j.getOeuvre());
			
			Scanner scanner= new Scanner(System.in);
			System.out.println(j);
			int i =Integer.parseInt(scanner.nextLine());
			
			carte = j.getOeuvre().get(i-1);
			Strategie s= Partie.creerPouvoir(carte);
			j.setStrategie(s);
			j.getStrategie().jouerCarte(j, i-1);
		
			
		}else {
			
			System.out.println(" Il n'y a pas de carte dans votre oeuvre`\n");
					
		
		}

	}
	
}
