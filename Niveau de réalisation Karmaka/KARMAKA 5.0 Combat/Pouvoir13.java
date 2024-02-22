package Projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Pouvoir13 implements Strategie {
	
	public void jouerCarte(Joueur j, int index) {
		
		j.setMain(Partie.tasCartes.poll());
		j.setMain(Partie.tasCartes.poll());
		j.setMain(Partie.tasCartes.poll());
		
		System.out.println("3 cartes ont été ajouter à votre main \n\n");
		
		int t=0;
		int choix=1;
		Scanner scanner= new Scanner(System.in);
		System.out.println(j);
		t= Partie.lireNombreDansMenu("Choisir la carte vous voulez jouer : \n", j, scanner);
		choix=t;
		t=t-1;
		
		ArrayList<String> menu1=new ArrayList<String>();
		menu1.add("Jouer Pour le POUVOIR");
		menu1.add("Jouer Pour la VIE FUTURE ");
		menu1.add("Jouer Pour les POINTS");
		menu1.add("Annuler");
		System.out.println(j.getMain().get(t).caracteristique());
		choix= Partie.lireNombreDansMenu("Que voulez vous faire : \n", menu1, 1, 4, scanner);
		
	switch (choix) {
	
	case 1:
		Carte cart= j.getMain().get(t);
		Strategie s= Partie.creerPouvoir(cart);
		j.setStrategie(s);
		j.getStrategie().jouerCarte(j, t);
		//compteurPouvoir++;
		//Thread.sleep(50000);
		
		break;
	case 2:
		Strategie p= new StrategieVieFuture();
		j.setStrategie(p);
		j.getStrategie().jouerCarte(j, t);
		
		
		break;
	case 3:
		cart= j.getMain().get(t);
		s= new StrategiePoint();
		j.setStrategie(s);
		StrategiePoint.incrementerNombreCouleur(j, cart);
		j.getStrategie().jouerCarte(j, t);
		
		break;
	
	
	}
	
	Carte cart= j.getMain().get(index);
	j.getMain().remove(index);
	Partie.fosse.add(cart);
	
	}

}
