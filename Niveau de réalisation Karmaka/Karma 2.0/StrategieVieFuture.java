package Projet;

public class StrategieVieFuture implements Strategie{
	
	public void jouerCarte(Joueur j, int index) {
		
		Carte c= j.getMain().get(index);
		j.DeposerCarteViefuture(c);
		j.getMain().remove(index);
		
	}

	
}
