package Projet;

import java.io.Serializable;

public class Pouvoir19 implements Strategie,Serializable{
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		int k= j2.getViefuture().size();
		
		
		if(k>=2) {
			
			Partie.fosse.add(j2.getViefuture().get(k-1));
			j2.getViefuture().remove(k-1);
			Partie.fosse.add(j2.getViefuture().get(k-2));
			j2.getViefuture().remove(k-2);
			System.out.println(" 2 cartes ont été défaussez dans la vie future de votre adversaire`\n");
			
			
		}else {
			
			System.out.println(" Il n'y a pas assez de carte dans la vie future de votre adversaire`\n");
			
		}
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
	}

}
