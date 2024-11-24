package tests;

import interfaces.Joueur;
import jeu.JeuSimple;

public class TestArbitre implements Joueur{
	
	public static void arbitrer(Joueur j1, Joueur j2, JeuSimple jeu) {
		System.out.println("Jouons maintenant au jeu : " + jeu.getNom());
		String res1 = jeu.jouerUnTour();
		System.out.println("J1 joue : " + res1);
		String res2 = jeu.jouerUnTour();
		System.out.println("J2 joue : " + res2);
		int res = jeu.arbitrer(res1, res2);
		switch(res) {
			case -1 -> System.out.println("Gagnant : J1");
			case 0 -> System.out.println("Égalité");
			case 1 -> System.out.println("Gagnant : J2");
		}
	}

	@Override
	public void gagner(int argent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void perdre(int argent) {
		// TODO Auto-generated method stub
	}
}
