package Projet;

import java.util.Scanner;

public class Pouvoir17 implements Strategie {
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		int k= j2.getOeuvre().size();
		
		if(k==0) {
			
			System.out.println(" Il n'y a pas assez de carte dans l'oeuvre de votre adversaire`\n");
					
		
		}else {
			
			System.out.println("Ce pouvoir donne la possbilité à votre adversaire de defaussez une carte de son oeuvre \n");
			System.out.println(j2.getNom()+"  veuillez choisir une carte à defaussez \n");
			System.out.println(Joueur.affichageArrayList(j2.getOeuvre()));
			
			Scanner scanner= new Scanner(System.in);
			System.out.println("Choisissez une carte \n");
			int t =Integer.parseInt(scanner.nextLine());
			Partie.fosse.add(j2.getOeuvre().get(t-1));
			j2.getOeuvre().remove(t-1);
						
		}
		
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
	}

}
