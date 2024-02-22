package Projet;

import java.io.Serializable;

public class StrategieVieFuture implements Strategie, Serializable{
	
	public void jouerCarte(Joueur j, int index) {
		
		Carte c= j.getMain().get(index);
		j.DeposerCarteViefuture(c);
		j.getMain().remove(index);
		
	}

}
