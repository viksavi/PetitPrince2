package main;

import petitPrince.PetitPrince0;
import tests.TestArbitre;
import interfaces.Joueur;
import jeu.JeuDe;
import jeu.JoueurJeu;
import jeu.JeuShifumi;
import petitPrince.PetitPrince;


public class Run3PetitsPrinces {
	
	private static void scenario0() {
		System.out.println("Creation Petit Princes 0 : \n");
		
		for (int i = 1; i <= 9; i++) {
			new PetitPrince0();
		}
	}

	private static void scenario1() {
		System.out.println("Creation Petit Princes : \n");
		
		for (int i = 1; i <= 10; i++) {
			new PetitPrince("PP" + i);
		}
	}
	
	private static void scenario3() {
		JoueurJeu joueur1 = new JoueurJeu();
		JoueurJeu joueur2 = new JoueurJeu();
		JeuDe jeuDe = new JeuDe();
		TestArbitre.arbitrer(joueur1, joueur2, jeuDe);
		JeuShifumi jeuShifumi = new JeuShifumi();
		TestArbitre.arbitrer(joueur1, joueur2, jeuShifumi);
	}
	
	private static void scenario4() {
		PetitPrince prince = new PetitPrince("PrinceMain");
		prince.run();
	}
	
	
	public static void main(String[] args) {
		System.out.println("BEGIN : Petit Prince 2 \n");
		
		//scenario0();
		scenario1();
		
		System.out.println("\nEND \n");
		
		System.out.println("test des jeux1");
		//scenario4();
		
	}

}
