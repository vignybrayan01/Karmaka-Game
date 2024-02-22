package Projet;
import java.util.*;

public class Pouvoir1 implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		Scanner scanner = new Scanner(System.in);
		Carte carte;
		int nombre;
		
		if(j.getViefuture().isEmpty()) {
			
			System.out.println("\n\n Vous n'avez aucune carte dans votre vie future dommage \n\n");
			
		}else {
		
					System.out.println("\n\n Choissisez une carte dans votre vie future : \n\n");
					System.out.println(Joueur.affichageArrayList(j.getViefuture()));
					
					
					if(j.type==TypeJoueur.Réel) {
						 nombre =Integer.parseInt(scanner.nextLine());
						
					}else {		
								//debut random
								Random random = new Random();
						        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
						        int min = 1;
						        int max = j.getViefuture().size();
						        nombre= random.nextInt((max - min) + 1) + min;
						         //fin random
						         System.out.println("Le joueur virtuel a deja jouer");
						}
					
					
					
					//scanner.close();
					carte= j.getViefuture().get(nombre-1);
					j.getViefuture().remove(nombre-1);
					j.setMain(carte);
					System.out.println("\n La carte a été ajoutée \n");
		
		}
		
		Partie.fosse.add(j.getMain().get(index));
		j.getMain().remove(index);	
		
		
	}

}
