package Projet;

import java.io.*;

public class Sauvegarde {

    public static void sauvegarderPartie(PartieSave p, String nomFichier) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier))) {
            oos.writeObject(p);
            System.out.println("Partie sauvegardée avec succès !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}