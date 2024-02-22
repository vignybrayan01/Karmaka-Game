package Projet;
import java.util.*;

public class Pouvoir3 implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		ArrayList<Carte> list= new ArrayList<Carte>();
		
		list.add(Partie.tasCartes.poll());
		list.add(Partie.tasCartes.poll());
		list.add(Partie.tasCartes.poll());
		
		System.out.println("Voici les 3 premieres cartes dans la source, choisissez 2 cartes \n");
		System.out.println(Joueur.affichageArrayList(list));
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choisisez la premiere carte \n");
		int i =Integer.parseInt(scanner.nextLine());
		j.DeposerCarteViefuture(list.get(i-1));
		list.remove(i-1);
		System.out.println("Choisisez la seconde carte \n");
		System.out.println(Joueur.affichageArrayList(list));
		i =Integer.parseInt(scanner.nextLine());
		j.DeposerCarteViefuture(list.get(i-1));
		list.remove(i-1);
		
		Partie.tasCartes.add(list.get(0));
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
	}

}
