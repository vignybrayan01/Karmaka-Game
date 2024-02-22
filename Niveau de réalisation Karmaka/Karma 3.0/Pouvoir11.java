package Projet;

public class Pouvoir11 implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		j2.getPile().add(Partie.tasCartes.poll());
		j2.getPile().add(Partie.tasCartes.poll());
		System.out.println(" La carte a été ajouté dans la main de votre adversaire`\n");
		
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
	}

}
