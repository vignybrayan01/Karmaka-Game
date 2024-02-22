package Projet;

public class Pouvoir21 implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		int k= j2.getMain().size();
		
		
		if(k>=2) {
			
			Partie.fosse.add(j2.getMain().get(k-1));
			j2.getMain().remove(k-1);
			Partie.fosse.add(j2.getMain().get(k-2));
			j2.getMain().remove(k-2);
			System.out.println(" 2 cartes ont été défaussez dans la main de votre adversaire`\n");
			
			
		}else {
			
			System.out.println(" Il n'y a pas assez de carte dans la vie future de votre adversaire`\n");
			
		}
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
	}

}
