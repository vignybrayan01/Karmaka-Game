package Projet;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Pouvoir22 implements Strategie,Serializable {

    private boolean dejaJoue = false; // Ajout d'une variable de contrôle

    public void jouerCarte(Joueur j, int index) {
        Carte carte;
        if (!j.getMain().isEmpty()) {
            carte = j.getMain().get(index);
            j.getMain().remove(index);
            Partie.fosse.add(carte);
        }

        int k = j.getOeuvre().size();

        if (k == 1) {
            System.out.println("vous avez jouer le pouvoir de la carte " + j.getOeuvre().get(k - 1) + " \n");
            System.out.println("Son pouvoir est de : " + j.getOeuvre().get(k - 1).geteffet() + " \n");

            carte = j.getOeuvre().get(k - 1);
            Strategie s = Partie.creerPouvoir(carte);
            j.setStrategie(s);

            // Ajout de la condition de sortie
            if (!dejaJoue) {
                dejaJoue = true;
                j.getStrategie().jouerCarte(j, k - 1);
            }

        } else if (k > 1) {
            System.out.println("Choisissez la carte de votre oeuvre dont vous souhaitez copier le pouvoir \n\n");
            Joueur.affichageArrayList(j.getOeuvre());
            Scanner scanner = new Scanner(System.in);

            int i;
            if (j.type == TypeJoueur.Réel) {
                i = Integer.parseInt(scanner.nextLine());
            } else {
                Random random = new Random();
                int min = 1;
                int max = j.getOeuvre().size();
                i = random.nextInt((max - min) + 1) + min;
                System.out.println("Le joueur virtuel a deja jouer");
            }

            carte = j.getOeuvre().get(i - 1);
            Strategie s = Partie.creerPouvoir(carte);
            j.setStrategie(s);

            // Ajout de la condition de sortie
            if (!dejaJoue) {
                dejaJoue = true;
                j.getStrategie().jouerCarte(j, i - 1);
            }

        } else {
            System.out.println(" Il n'y a pas de carte dans votre oeuvre`\n");
        }
    }
}