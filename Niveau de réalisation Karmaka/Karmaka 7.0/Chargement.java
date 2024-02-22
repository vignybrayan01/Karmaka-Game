package Projet;

import java.io.*;

public class Chargement {

    public static Joueur chargerPartie(String nomFichier) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichier))) {
            Joueur j = (Joueur) ois.readObject();
            System.out.println("Partie chargée avec succès !");
          //  System.out.println(partie);
            return j;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
public static void main(String[] agrs) {
	
	Joueur j = Chargement.chargerPartie("save.dat");
	
	System.out.print(j.toString());
	
}

}

