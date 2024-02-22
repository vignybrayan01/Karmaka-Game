package Projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Pouvoir18 implements Strategie{
	
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

		i= Partie.lireNombreDansMenu("\n Voulez vous defaussez une carte ?  : \n", menu1, 1, 2, scanner);
		
		if(compteur==2 || i==2) {
			break;
		}else{
			
			compteur++;
			System.out.println(j.getNom()+ "  veuillez choisir la " + compteur + " carte que vous voulez defaussez"+ " \n");
			System.out.println(Joueur.affichageArrayList(j.main));
			
			Scanner scanner= new Scanner(System.in);
			System.out.println("Choisissez une carte \n");
			int t =Integer.parseInt(scanner.nextLine());
			Partie.fosse.add(j.getMain().get(t-1));
			j.getMain().remove(t-1);
			
			
		}
	
	}
	k=0;
	compteur++;
	
	while(k<compteur) {
		
	i= Partie.lireNombreDansMenu("\n Voulez vous ajoutez une carte dans votre main ?  : \n", menu1, 1, 2, scanner);

		if(i==2)
			break;
		
		j.setMain(Partie.tasCartes.poll());
		System.out.print("La carte a été ajouté \\n");
		k++;
		
	}
	
	
	
	}

}
