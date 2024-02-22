package Projet;

import java.io.*;

public class Chargement {

    public static PartieSave chargerPartie(String nomFichier) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichier))) {
            PartieSave p = (PartieSave) ois.readObject();
            System.out.println("Partie chargée avec succès !");
          //  System.out.println(partie);
            return p;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
public static void main(String[] agrs) {
	Partie p= Partie.getInstance();
	PartieSave partiesave = Chargement.chargerPartie("save.dat");
	p.setEstTerminer(false);
	p.setListJ(partiesave.getListJ());
	p.setTasCartes(partiesave.getTasCartes());
	p.setFosse(partiesave.getFosse());
	
	System.out.print(p.listJ.get(0).toString());
	System.out.print(p.listJ.get(1).toString());
	
}

}

