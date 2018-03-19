package main;

import src.Connexion;
import src.Puissance;
import src.Sapin;

public class Main {
	public static void main(String[] args) {

		Sapin.dessinerHautSapin();
		Sapin.dessinerPiedSapin(3,5,"*");
        Connexion.connexion();
        Puissance.CalculerPuissance();
	}
}