package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince implements Sujet {
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt = 0;
	
	public PetitPrince(String nom) {
		this.nom = nom;
		this.argent = 100;
		cpt++;
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
	public void run() {
		console.parler(nom + cpt);
		console.seDirigerVers(0);
	}

}
