package Projet;

public class Pouvoir4 implements Strategie{
	public void jouerCarte(Joueur j, int index) {
		
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		
		int b=j2.getViefuture().size();
		
		if (b==0){
			System.out.println("Votre adversaire n'a aucune carte dans sa vie future dommage`\n");
		
		}else {
			Carte carte= j2.getViefuture().get(b-1);
			j.getViefuture().remove(b-1);
				
			j.DeposerCarteViefuture(carte);
			System.out.println("La premiere carte de la vie future de votre adversaire est ajouté à la votre`\n");
		}
		
		Carte carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
	}

}
