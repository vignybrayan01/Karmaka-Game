package Projet;

import java.io.Serializable;

public class Pouvoir20 implements Strategie,Serializable{
	
	public void jouerCarte(Joueur j, int index) {
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		int k= j2.getOeuvre().size();
		
		
		if(k>=1) {
			
			Partie.fosse.add(j2.getOeuvre().get(k-1));
			j2.getOeuvre().remove(k-1);
			System.out.println(" 1 carte a été défaussez dans l'oeuvre de votre adversaire`\n");
			
			
		}else {
			
			System.out.println(" Il n'y a pas assez de carte dans la vie future de votre adversaire`\n");
			
		}
		if (!j.getMain().isEmpty()) {
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);}
	}

}
