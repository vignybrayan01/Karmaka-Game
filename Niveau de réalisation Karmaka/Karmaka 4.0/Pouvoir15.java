package Projet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir15 implements Strategie {
	
	public void jouerCarte(Joueur j, int index) {
		
		Carte carte;
		carte= j.getMain().get(index);
		j.getMain().remove(index);
		Partie.fosse.add(carte);
		
		int i = Partie.listJ.indexOf(j);
		i=(i+1)%Partie.listJ.size();
		Joueur j2= Partie.listJ.get(i);
		
		
		int k= j2.getPile().size();
		
		
		
		if(k==0) {
			
			System.out.println(" Il n'y a pas assez de carte dans la pile de votre adversaire`\n");
			
		}else {
		Partie.fosse.add(j2.getPile().get(k-1));
		j2.getPile().remove(k-1);
		System.out.println(" Une carte a été ajouté dans la main de votre adversaire`\n");
		
		System.out.println(" Elle vous permet également de jouer une seconde fois`\n");
		
		
		int t=0;
		int choix=1;
		Scanner scanner= new Scanner(System.in);
		System.out.println(j);
		
				if(j.type==TypeJoueur.Réel) {
					t= Partie.lireNombreDansMenu("Choisir la carte vous voulez jouer : \n", j, scanner);
							
				}else {		
							//debut random
							Random random = new Random();
					        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
					        int min = 1;
					        int max = j.getMain().size();
					        do {
					        t = random.nextInt((max - min) + 1) + min;
					        }while(t<0);//fin random
					         System.out.println("Le joueur virtuel a deja jouer");
					}
		choix=t;
		t=t-1;
		
		ArrayList<String> menu1=new ArrayList<String>();
		menu1.add("Jouer Pour le POUVOIR");
		menu1.add("Jouer Pour la VIE FUTURE ");
		menu1.add("Jouer Pour les POINTS");
		menu1.add("Annuler");
		System.out.println(j.getMain().get(t).caracteristique());
		
					if(j.type==TypeJoueur.Réel) {
						choix= Partie.lireNombreDansMenu("Que voulez vous faire : \n", menu1, 1, 4, scanner);
								
					}else {		
								//debut random
									Random random = new Random();
					
							        // Définir l'intervalle et l'exception
							        int min = 1;
							        int max = 3;
							        choix = random.nextInt((max - min) + 1) + min;
							       
						         //fin random
						         System.out.println("Le joueur virtuel a deja jouer");
						}
		
	switch (choix) {
	
	case 1:
		Carte cart= j.getMain().get(t);
		Strategie s= Partie.creerPouvoir(cart);
		j.setStrategie(s);
		j.getStrategie().jouerCarte(j, t);
		//compteurPouvoir++;
		//Thread.sleep(50000);
		
		break;
	case 2:
		Strategie p= new StrategieVieFuture();
		j.setStrategie(p);
		j.getStrategie().jouerCarte(j, t);
		
		
		break;
	case 3:
		cart= j.getMain().get(t);
		s= new StrategiePoint();
		j.setStrategie(s);
		StrategiePoint.incrementerNombreCouleur(j, cart);
		j.getStrategie().jouerCarte(j, t);
		
		break;
	
	
	}
		}
		
		
		
		
		
		
	}

}
