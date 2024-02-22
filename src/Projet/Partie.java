 package Projet;

import java.io.*;
import java.util.*;

public class Partie  implements Serializable {
	

	// attributs d'une Partie
	

	private static final long serialVersionUID =1L;
	private static Partie instance;
	public static LinkedList<Carte> fosse= new LinkedList<Carte>();
	public static ArrayList<Joueur> listJ;
	public static LinkedList<Carte> tasCartes;
	private boolean estTerminer;

	//private int Jeton=24;
	
	
	
	
	private Partie() {
		listJ=new ArrayList<Joueur>();
		this.estTerminer=false;		
		tasCartes = new LinkedList<Carte>();
		
		Carte c1=new Carte(TypeC.voyage,Valeur.trois,Couleur.vert,Pouvoir.Pouvoir13,"Puisez 3 cartes à la Source Vous pouvez ensuite jouer une autre carte.");
		Carte c2=new Carte(TypeC.panique,Valeur.un,Couleur.rouge,Pouvoir.Pouvoir15,"Défaussez la première carte de la Pile d'un joueur Vous pouvez ensuite jouer une autre carte.");
		Carte c3=new Carte(TypeC.Transmigration,Valeur.un,Couleur.bleu,Pouvoir.Pouvoir1,"Placez dans votre Main n’importequelle carte de votre Vie Future.");
		Carte c4=new Carte(TypeC.Rêves_Brisés,Valeur.deux,Couleur.bleu,Pouvoir.Pouvoir4,"Placez la première carte de la Vie Future d'un rival sur la vôtre");
		Carte c5=new Carte(TypeC.Vol,Valeur.trois,Couleur.bleu,Pouvoir.Pouvoir7,"Placez dans votre Main l’Oeuvre Exposée d'un rival.");
		Carte c6=new Carte(TypeC.Sauvetage,Valeur.deux,Couleur.vert,Pouvoir.Pouvoir10,"Ajoutez à votre Main une des3 dernières cartes de la Fosse");
		Carte c7=new Carte(TypeC.Coup_Oeil,Valeur.un,Couleur.bleu,Pouvoir.Pouvoir2,"Regardez la Main d’un rival.Vous pouvez ensuite jouer une autre carte.");
		Carte c8=new Carte(TypeC.Déni,Valeur.deux,Couleur.bleu,Pouvoir.Pouvoir5,"Défaussez une carte de votre Main.Copiez le pouvoir de cette carte.");
		Carte c9=new Carte(TypeC.Lendemain,Valeur.un,Couleur.bleu,Pouvoir.Pouvoir8,"Puisez une carte à la Source.Vous pouvez ensuite jouer une autre carte.");
		Carte c10=new Carte(TypeC.Longévité,Valeur.deux,Couleur.vert,Pouvoir.Pouvoir11,"Placez 2 cartes puisées à la Source sur la Pile d'un joueur.");
		Carte c11=new Carte(TypeC.Destinée,Valeur.deux,Couleur.bleu,Pouvoir.Pouvoir3,"Regardez les 3 premières cartes de la Source; ajoutez-en jusqu’à 2 à votre Vie Future. Replacez le reste dans l'ordre souhaité.");
		Carte c12=new Carte(TypeC.Duperie,Valeur.trois,Couleur.bleu,Pouvoir.Pouvoir6,"Regardez 3 cartes de la Main d’un rival ; ajoutez-en une à votre Main.");
		Carte c13=new Carte(TypeC.Recyclage,Valeur.un,Couleur.vert,Pouvoir.Pouvoir9,"Ajoutez à votre Vie Future une des 3 dernières cartes de la Fosse.");
		Carte c14=new Carte(TypeC.Semis,Valeur.deux,Couleur.vert,Pouvoir.Pouvoir12,"Puisez 2 cartes à la Source, puis placez sur votre Vie Future 2 cartes de votre Main.");
		Carte c15=new Carte(TypeC.jubilé,Valeur.trois,Couleur.vert,Pouvoir.Pouvoir14,"Placez jusqu’à 2 cartes de votre Main sur vos Oeuvres.");
		Carte c16=new Carte(TypeC.DernierSouffle,Valeur.un,Couleur.rouge,Pouvoir.Pouvoir16,"Le joueur de votre choix défausse une carte de sa Main.");
		Carte c17=new Carte(TypeC.Crise,Valeur.deux,Couleur.rouge,Pouvoir.Pouvoir17,"Le rival de votre choix défausse une de ses Oeuvres.");
		Carte c18=new Carte(TypeC.Roulette,Valeur.deux,Couleur.rouge,Pouvoir.Pouvoir18,"Défaussez jusqu’à 2 cartes de votre Main. Vous pouvez ensuite puiser à la Source autant de carte(s) + 1.");
		Carte c19=new Carte(TypeC.Fournaise,Valeur.deux,Couleur.rouge,Pouvoir.Pouvoir19,"Défaussez les 2 premières cartes de la Vie Future d'un rival");
		Carte c20=new Carte(TypeC.Vengeance,Valeur.trois,Couleur.rouge,Pouvoir.Pouvoir20,"Défaussez l’Oeuvre Exposée d’un rival.");
		Carte c21=new Carte(TypeC.Bassesse,Valeur.trois,Couleur.rouge,Pouvoir.Pouvoir21,"Défaussez au hasard 2 cartes de la Main d’un rival.");
		Carte c22=new Carte(TypeC.Incarnation,Valeur.un,Couleur.multi_color,Pouvoir.Pouvoir22,"Choisissez une de vos Oeuvres.Copiez son pouvoir");
		Carte c23=new Carte(TypeC.Mimétisme,Valeur.un,Couleur.multi_color,Pouvoir.Pouvoir23,"Choisissez un Rival.Copiez le pouvoir de son Oeuvre Exposée");
		
		
		
		tasCartes.add(c1);tasCartes.add(c1);tasCartes.add(c1);
		tasCartes.add(c2);tasCartes.add(c2);tasCartes.add(c2);
		tasCartes.add(c3);tasCartes.add(c3);tasCartes.add(c3);
		tasCartes.add(c4);tasCartes.add(c4);tasCartes.add(c4);
		tasCartes.add(c5);tasCartes.add(c5);
		tasCartes.add(c6);tasCartes.add(c6);tasCartes.add(c6);
		tasCartes.add(c7);tasCartes.add(c7);tasCartes.add(c7);
		tasCartes.add(c8);tasCartes.add(c8);tasCartes.add(c8);
		tasCartes.add(c9);tasCartes.add(c9);tasCartes.add(c9);
		tasCartes.add(c10);tasCartes.add(c10);tasCartes.add(c10);
		tasCartes.add(c11);tasCartes.add(c11);tasCartes.add(c11);
		tasCartes.add(c12);tasCartes.add(c12);
		tasCartes.add(c13);tasCartes.add(c13);tasCartes.add(c13);
		tasCartes.add(c14);tasCartes.add(c14);tasCartes.add(c14);
		tasCartes.add(c15);tasCartes.add(c15);
		tasCartes.add(c16);tasCartes.add(c16);tasCartes.add(c16);
		tasCartes.add(c17);tasCartes.add(c17);tasCartes.add(c17);
		tasCartes.add(c18);tasCartes.add(c18);tasCartes.add(c18);
		tasCartes.add(c19);tasCartes.add(c19);tasCartes.add(c19);
		tasCartes.add(c20);tasCartes.add(c20);
		tasCartes.add(c21);tasCartes.add(c21);
		tasCartes.add(c22);tasCartes.add(c22);tasCartes.add(c22);tasCartes.add(c22);tasCartes.add(c22);
		tasCartes.add(c23);tasCartes.add(c23);

		

	} 
	
	public static Partie getInstance() {
        if (instance == null) {
            instance = new Partie();
        }
        return instance;
    }
	
	
	public static LinkedList<Carte> getFosse() {
		return fosse;
	}

	public static void setFosse(LinkedList<Carte> fosse) {
		Partie.fosse = fosse;
	}

	public static void setTasCartes(LinkedList<Carte> tasCartes) {
		Partie.tasCartes = tasCartes;
	}

	public boolean isEstTerminer() {
		return estTerminer;
	}
	
	public static Strategie creerPouvoir(Carte c) {
		
		switch (c.getPouvoir()) {
		
		case Pouvoir1:
			return new Pouvoir1();
		case Pouvoir2:
			return new Pouvoir2();
		case Pouvoir3:
			return new Pouvoir3();
		case Pouvoir4:
			return new Pouvoir4();
		case Pouvoir5:
			return new Pouvoir5();
		case Pouvoir6:
			return new Pouvoir6();
		case Pouvoir7:
			return new Pouvoir7();
		case Pouvoir8:
			return new Pouvoir8();
		case Pouvoir9:
			return new Pouvoir9();
		case Pouvoir10:
			return new Pouvoir10();
		case Pouvoir11:
			return new Pouvoir11();
		case Pouvoir12:
			return new Pouvoir12();
		case Pouvoir13:
			return new Pouvoir13();
		case Pouvoir14:
			return new Pouvoir14();
		case Pouvoir15:
			return new Pouvoir15();
		case Pouvoir16:
			return new Pouvoir16();
		case Pouvoir17:
			return new Pouvoir17();
		case Pouvoir18:
			return new Pouvoir18();
		case Pouvoir19:
			return new Pouvoir19();
		case Pouvoir20:
			return new Pouvoir20();
		case Pouvoir21:
			return new Pouvoir21();
		case Pouvoir22:
			return new Pouvoir22();
		case Pouvoir23:
			return new Pouvoir23();
		default:
			return new Pouvoir1();
		
		}
		
	}
	

	public void setEstTerminer(boolean estTerminer) {
		this.estTerminer = estTerminer;
	} 
	
	
	public ArrayList<Joueur> getListJ() {
		return listJ;
	}


	public void setListJ(ArrayList<Joueur> listJ) {
		this.listJ = listJ;
	}


	public Carte distribuerUneCarte(){
		return tasCartes.poll();
	}
	
	public int randomJoueur() {
		Random random=new Random();
		int index= random.nextInt(listJ.size());
		return index;
	} 
		
	public void melanger(){
		Collections.shuffle(tasCartes);
	}
		
	public boolean estVide() {
		return tasCartes.isEmpty();
	}
	
	public String toString(){
		return tasCartes.toString();
	}
		
	public LinkedList<Carte> getTasCartes(){
		return tasCartes;
	}
	
	
	public void ajouterUnJoueur(Joueur joueur){
		listJ.add(joueur);
	}
	
	public void sauvegarde(Partie part) {
		
		try {		
			
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Elève\\Documents\\TP LOO2\\Projet_KARMAKA\\src\\KarmaSauvegarder.ser");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(part);
		System.out.println("Partie sauvegarder");
		os.close();
		System.out.println("fermeture");
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	
}
	
	// Methode pour lire un nombre dans un interval
	
	public static int lireNombreDansMenu(String message, ArrayList<?> liste, int valeurMin, int valeurMax, Scanner scanner) {
		int nombre;
		
		while(true) {
			
			try {
			
			System.out.println(message);
			System.out.println(Joueur.affichageArrayList(liste));
			nombre=Integer.parseInt(scanner.nextLine());
			
			if(nombre<valeurMin || nombre>valeurMax) {
				
			throw new IllegalArgumentException("Entrez un nombre parmi les choix possibles");
				
			}
			// Sort une fois que le nombre est valide 
			break;
			}catch(IllegalArgumentException e) {
				
				System.out.println("Erreur : " + "Enterz un entier parmi les choix possibles");
			}
			
		}
		
		return nombre;
		
		
	}
	public static int lireNombreDansMenu(String message, Joueur j, Scanner scanner) {
		int nombre;
		
		while(true) {
			
			try {
				
			
			//System.out.println(j);
			System.out.println(message);
			System.out.println("\n");
			nombre=Integer.parseInt(scanner.nextLine());
			
			if(nombre<1 || nombre>j.getMain().size()) {
				
			throw new IllegalArgumentException("Entrez un nombre parmi les choix possibles");
				
			}
			// Sort une fois que le nombre est valide 
			break;
			}catch(IllegalArgumentException e) {
				
				System.out.println("Erreur : " + "Enterz un entier parmi les choix possibles");
			}
			
		}
		
		return nombre;
		
		
	}
	
	
	public void distribuerCartes(){
		melanger();
		int i=0;
		while (estVide() == false){
			Iterator<Joueur> it =listJ.iterator();
						
			while(it.hasNext()){
					if(i<=3){
					Carte carte1 = distribuerUneCarte();
					if(carte1 == null) {
					break;
					}
					it.next().ramasserCarteMain(carte1);
				}
				if(i>3){
					Carte carte2 = distribuerUneCarte();
					if(carte2 == null) {
					break;
					}
					it.next().ramasserCartePile(carte2);
				}
				
			}
			i=i+1;
			 if(i==6) {
				 break;
			 }
			
			}
		}
	
	public static void main(String[] args) throws InterruptedException {
	// création d'une partie de Bataille
		Partie bataille = getInstance();
		PartieSave partiesave = new PartieSave();
		int indexPremierJ;
		int tour = 1; 
		int compteurPouvoir=0;
		
		Scanner srv= new Scanner(System.in);	;
		ArrayList<String> menu0=new ArrayList<String>();
		menu0.add("NOUVEAU JEU ");
		menu0.add("RECHARGER ANCIENNE PARTIE");
		
		System.out.println("\t\t BIENENUE AU JEU DE CARTE KARMAKA \n\n\n" );
		int vr= lireNombreDansMenu("\n Que voulez vous faire ?  : \n", menu0, 1, 2, srv);
		
		if(vr == 2) {
			partiesave = Chargement.chargerPartie("save.dat");
			bataille.setEstTerminer(false);
			bataille.setListJ(partiesave.getListJ());
			bataille.setTasCartes(partiesave.getTasCartes());
			bataille.setFosse(partiesave.getFosse());
			indexPremierJ=partiesave.getIndexjoueurcourant();
			 tour = partiesave.getTour(); 
		}else {
			
		menu0.clear();
		menu0.add("Reel");
		menu0.add("Virtuel");
		
		System.out.println("Donner votre nom  :   " );
		String nom1 = srv.nextLine();
		Joueur Karadoc = new Joueur(nom1,TypeJoueur.Réel);
		Joueur Perceval;
		String nom2;
		//System.out.println("\n\n Voulez vous jouer avec un joueur Reel ou Virtuel ?  :   " );
		vr= lireNombreDansMenu("\n Voulez vous jouer avec un joueur Reel ou Virtuel ?  : \n", menu0, 1, 2, srv);
		
		if(vr==1) {
			System.out.println("\n\n Donner le nom du joueur 2  :   " );
			srv = new Scanner(System.in);	
			nom2 = srv.nextLine();
			Perceval = new Joueur(nom2,TypeJoueur.Réel);
		}else {
			nom2="BOT";
			Perceval = new Joueur(nom2,TypeJoueur.Virtuel);
		}
		
	
	// crééation de deux joueurs
	

	// on ajoute les 2 joueurs à la partie
	bataille.ajouterUnJoueur(Karadoc);
	bataille.ajouterUnJoueur(Perceval);
	
	
	// on affiche le jeu de cartes
	//System.out.println(bataille.jeu);
	// on distribue les cartes à l'ensemble des joueurs
		
	bataille.distribuerCartes();
	// Determinons le premier Joueur
	
	indexPremierJ= bataille.randomJoueur();
	
		}
	
		boolean renaitre=false;
	System.out.println("\t\t\t\t\t La partie a commencé " );
	
	//System.out.println(bataille.listJ.get(indexPremierJ));
	
	
	
	
	while(bataille.estTerminer==false) {
		
		renaitre=false;
		System.out.println("\t\t\t\t\t Tour " + tour);
		Joueur joueurCourant= bataille.getListJ().get(indexPremierJ);
		Scanner scanner= new Scanner(System.in);
		
				
		//joueur reel
		if(compteurPouvoir!=0 ) {
			
			int j=0;
			ArrayList<String> menu1=new ArrayList<String>();
			menu1.add("OUI");
			menu1.add("NON");
			System.out.println(joueurCourant.getNom());
				if(joueurCourant.type==TypeJoueur.Réel) {
				j= lireNombreDansMenu("\n Voulez vous la carte du joueur precedent ?  : \n", menu1, 1, 2, scanner);
				}else {		
						//debut random
						Random random = new Random();
				        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
				        int min = 1;
				        int max = 2;
				         j = random.nextInt((max - min) + 1) + min;
				         //fin random
				         System.out.println("Le joueur virtuel a deja jouer");
				}
			
	         switch(j) {
			
			case 1:
				joueurCourant.DeposerCarteViefuture(Partie.fosse.poll());
				compteurPouvoir=0;
				break;
			case 2:
				compteurPouvoir=0;
				break;
			
			}
			
		}
		
		if(joueurCourant.main.isEmpty() && joueurCourant.getPile().isEmpty()) {
			
			joueurCourant.seReincarner();
			renaitre=true;	
		
		}
		
		if(renaitre==false) {
			
		System.out.println(bataille.listJ.get(indexPremierJ));
		
	
		
		//Les Variables qui permettents de sauvegarder les choix du Joueur
		int t=0;
		int choix=1;
		
		
		
		if(joueurCourant.getPile().isEmpty()==false) {
			
			ArrayList<String> menu=new ArrayList<String>();
			menu.add("Jouer");
			menu.add("Passer");
			menu.add("Sauvegarder");
			if(joueurCourant.type==TypeJoueur.Réel) {
				choix= lireNombreDansMenu("Que voulez vous faire : \n", menu, 1, 3, scanner);
						
			}else {		
						//debut random
						Random random = new Random();
				        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
				        int min = 1;
				        int max = 2;
				         choix = random.nextInt((max - min) + 1) + min;
				         //fin random
				         System.out.println("Le joueur virtuel a deja jouer");
				}
			
			
			if(choix==1) {
				int j=joueurCourant.getPile().size()-1;
				joueurCourant.setMain(joueurCourant.getPile().get(j));
				joueurCourant.getPile().remove(j);
			}
			
		}else if(joueurCourant.type==TypeJoueur.Réel) {
			 ArrayList<String> menu=new ArrayList<String>();
			 menu.add("Jouer");
			 menu.add("Sauvegarde");
			 choix= lireNombreDansMenu("Que voulez vous faire : \n", menu, 1, 2, scanner);
			 if(choix==2) { 

				 partiesave.setListJ(listJ);
				 partiesave.setTasCartes(tasCartes);
				 partiesave.setIndexjoueurcourant(indexPremierJ);
				 partiesave.setTour(tour);
				 Sauvegarde.sauvegarderPartie(partiesave, "save.dat");break;}
		}
		
		
		
		if(choix==3) {
			 partiesave.setListJ(listJ);
			 partiesave.setTasCartes(tasCartes);
			 partiesave.setIndexjoueurcourant(indexPremierJ);
			 partiesave.setTour(tour);
			 Sauvegarde.sauvegarderPartie(partiesave, "save.dat");break;
			
		}
		if(choix==1) {

		while(true) {
			System.out.println(joueurCourant);
			
			if(joueurCourant.type==TypeJoueur.Réel) {
				t= lireNombreDansMenu("Choisir la carte vous voulez jouer : \n", joueurCourant, scanner);
						
			}else {		
						//debut random
						Random random = new Random();
				        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
				        int min = 1;
				        int max = joueurCourant.getMain().size();
				         t = random.nextInt((max - min) + 1) + min;
				         //fin random
				         System.out.println("Le joueur virtuel a deja jouer");
				}			
			choix=t;
			t=t-1;
			
			
			
			ArrayList<String> menu1=new ArrayList<String>();
			menu1.add("Jouer Pour le POUVOIR");
			menu1.add("Jouer Pour la VIE FUTURE ");
			menu1.add("Jouer Pour les POINTS");
			menu1.add("Annuler");
			System.out.println(joueurCourant.getMain().get(choix-1).caracteristique());
			
			if(joueurCourant.type==TypeJoueur.Réel) {
				choix= lireNombreDansMenu("Que voulez vous faire : \n", menu1, 1, 4, scanner);
						
			}else {		
						//debut random
						Random random = new Random();
				        // Génération d'un nombre aléatoire dans l'intervalle [min, max]
				        int min = 1;
				        int max = 3;
				         choix = random.nextInt((max - min) + 1) + min;
				         //fin random
		         System.out.println("Le joueur virtuel a deja jouer");
				}
			
			if(choix!=4) 
				break;	
		}
		switch (choix) {
		
		case 1:
			Carte cart= joueurCourant.getMain().get(t);
			Strategie s= creerPouvoir(cart);
			joueurCourant.setStrategie(s);
			joueurCourant.getStrategie().jouerCarte(joueurCourant, t);
			compteurPouvoir++;
			//Thread.sleep(50000);
			
			break;
		case 2:
			Strategie p= new StrategieVieFuture();
			joueurCourant.setStrategie(p);
			joueurCourant.getStrategie().jouerCarte(joueurCourant, t);
			
			
			break;
		case 3:
			cart= joueurCourant.getMain().get(t);
			s= new StrategiePoint();
			joueurCourant.setStrategie(s);
			StrategiePoint.incrementerNombreCouleur(joueurCourant, cart);
			joueurCourant.getStrategie().jouerCarte(joueurCourant, t);
			
			break;
		
		
		}
		}
		}
		
		if(joueurCourant.getNiveau()==NiveauKarmique.Transcendance_5) {
			
			
			System.out.print(joueurCourant.getNom()+ " Vous avez atteint le niveau " + joueurCourant.getNiveau() + " \n FELICITATION VOUS AVEZ GAGNEZ LA PARTIE");
			
			bataille.estTerminer=true;
		}
		
		indexPremierJ=(indexPremierJ+1)%bataille.getListJ().size();
		tour=tour+1;
		}

	System.out.print("\n\n LA PARTIE EST TERMINEE \n\n");
	}

}
		
 