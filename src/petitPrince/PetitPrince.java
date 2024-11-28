package petitPrince;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Random;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;
import interfaces.Joueur;
import jeu.JeuDe;
import jeu.JeuShifumi;
import jeu.JeuSimple;

public class PetitPrince implements Sujet, Joueur {
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private ArrayList<Integer> sujetsConnus = new ArrayList<>();
	
	public PetitPrince(String nom) {
		this.nom = nom;
		this.argent = 100;
		console = new ConsoleJavaBoy(this);
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public int getArgent() {
		return argent;
	}

	@Override
	public void gagner(int argent) {
		console.parler("J'ai gagné " + argent + " euro!");
		this.argent += argent;
	}

	@Override
	public void perdre(int argent) {
		console.parler("Oh no... J'ai perdu " + argent + " euro:(");
		this.argent -= argent;
		
	}
	
	private int max(int a, int b) {
		return Math.max(a, b);
	}
	
	private int abs(int a) {
		return Math.abs(a);
	}
	
	private int distanceChebyshev(int l, int c) {
		return max(abs(10-l), abs(10-c));
	}
	
	private int[] chercherPlusProche(int[][] vision) {
		int min = Integer.MAX_VALUE;
		int[] position = new int[2];
		int sujet = 0;
		for(int i = 0; i < vision.length; i++) {
			for(int j = 0; j < vision[i].length; j++) {
				sujet = vision[i][j];
				if(sujet > 0 && !sujetsConnus.contains(sujet)) {
					int distance = distanceChebyshev(i, j);
					if(distance < min) {
						min = distance;
					}
				}
			}
		}
		position[0] = min;
		position[1] = sujet;
		return position;
		
	}
	
	private JeuSimple choisirRandomJeu() {
		ArrayList<JeuSimple> jeux = new ArrayList<>();
		jeux.add(new JeuDe());
		jeux.add(new JeuShifumi());
		
		Random r = new Random();
		return jeux.get(r.nextInt(jeux.size()));
		
	}
	
	@Override
	public void run() {
		int[][] vision = console.regarder();
		int[] sujet = chercherPlusProche(vision);
		int distance = sujet[0];
		int reference = sujet[1];
		
		if(distance <= 1) {
			console.jouer(choisirRandomJeu(), reference);
			//console.parler("Je joue au " + choisirRandomJeu().getNom());
			sujetsConnus.add(reference);
		} else {
			if(reference == 0) {
				Random r = new Random();
				console.seDirigerVers(r.nextInt(10));
				console.parler("Je cherche quelqu'un pour jouer!");
			} else {
				console.seDirigerVers(reference);
				console.parler("Je suis un sujet pour jouer avec lui!");
			}
		}
		
	}

}
