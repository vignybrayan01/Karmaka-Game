package Projet;

import java.util.Scanner;

public class Pouvoir16 implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		System.out.println("Ce pouvoir donne la possbilité à votre adversaire de defaussez une carte de sa main \n");
		System.out.println(j2.getNom()+"  veuillez choisir une carte à defaussez \n");
		System.out.println(Joueur.affichageArrayList(j2.main));
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choisissez une carte \n");
		int t =Integer.parseInt(scanner.nextLine());
		Partie.fosse.add(j2.getMain().get(t-1));
		j2.getMain().remove(t-1);
		
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
	}

}
