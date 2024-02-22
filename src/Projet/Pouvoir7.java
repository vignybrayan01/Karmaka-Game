package Projet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Pouvoir7 implements Strategie,Serializable{
	
public void jouerCarte(Joueur j, int index) {
		
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		Carte carte;
		
		int b=j2.getOeuvre().size();
		
		if (j2.getOeuvre().isEmpty()){
			System.out.println("Votre adversaire n'a aucune carte dans son oeuvre dommage`\n");
		
		}else {
			
			carte=j2.getOeuvre().get(b-1);
			j2.getOeuvre().remove(b-1);
			
			j.setMain(carte);
			System.out.println(" La carte a été ajouté dans votre main`\n");
		}
		
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
}
}