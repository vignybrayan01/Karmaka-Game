package Sauvegarde;

//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.io.*;
import Projet.Partie;
import Projet.TypeJoueur;
import Projet.Joueur;

public class SauvegardePartie {
	
	Partie p;
	
	public SauvegardePartie(Partie partie) {
		this.p=partie;
	}
	
	public void save(){
		
		try {
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(new File("save.dat")));
			
			Partie pt = new Partie();
			
			pt.fosse=p.fosse;
			pt.listJ=p.listJ;
			pt.tasCartes=p.tasCartes;
			pt.setEstTerminer(p.isEstTerminer());
			
			oos.writeObject(pt);
		}catch(Exception e) {
			System.out.print("Save Exception");
		}
	}
	
	public Partie load() {
		
		try {
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream(new File("save.dat")));
			
			Partie pt = new Partie();
			
			p.fosse=pt.fosse;
			p.listJ=pt.listJ;
			p.tasCartes=pt.tasCartes;
			p.setEstTerminer(pt.isEstTerminer());
			
			return (Partie)ois.readObject();
		}catch(Exception e) {
			System.out.print("Save Exception");
		}
		
		
	}
}
