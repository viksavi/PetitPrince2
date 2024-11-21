package personnages;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet {
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt = 0;
	
	public PetitPrince0() {
		this.nom = "Petit Prince";
		this.argent = 100;
		cpt++;
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
	public void run() {
		console.parler(nom);
		console.seDirigerVers(0);
	
	}

}
