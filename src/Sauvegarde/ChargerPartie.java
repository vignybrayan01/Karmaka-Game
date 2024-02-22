package Sauvegarde;

//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.io.*;

import Projet.Partie;


public class ChargerPartie {
	
public static void main(String[] args) {
		
	
			//FileInputStream fis= new FileInputStream("KarmaSauvegarder.txt");
			
		
	
		try	(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\Elève\\\\Documents\\\\TP LOO2\\\\Projet_KARMAKA\\\\src\\\\KarmaSauvegarder.txt"))) {
			
			
						
			Partie bataille = (Partie) ois.readObject();
			
			System.out.println(bataille.listJ.get(0).getClass());			
			System.out.println("Partie recharger avec succes  ");
			
			
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
