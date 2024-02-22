package Projet;

import java.util.Scanner;

public class Pouvoir12 implements Strategie{
	
	Carte carte;
	
	public void jouerCarte(Joueur j, int index) {
		
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		j.setMain(Partie.tasCartes.poll());
		j.setMain(Partie.tasCartes.poll());
		
		System.out.println("Voici les cartes qui se trouve dans votre main, choisissez 2 cartes \n");
		System.out.println(Joueur.affichageArrayList(j.main));
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choisisez la premiere carte \n");
		int i =Integer.parseInt(scanner.nextLine());
		j.DeposerCarteViefuture(j.getMain().get(i-1));
		j.getMain().remove(i-1);
		System.out.println(Joueur.affichageArrayList(j.main));
		System.out.println("Choisisez la seconde carte \n");
		i =Integer.parseInt(scanner.nextLine());
		j.DeposerCarteViefuture(j.getMain().get(i-1));
		j.getMain().remove(i-1);
		
		
		
	}

}
