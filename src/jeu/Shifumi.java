package jeu;

public enum Shifumi implements Comparable<Shifumi>{
	 
	PIERRE("Pierre"),
	CISEAUX("Ciseaux"), 
	FEUILLE("Feuille");
	
	private String nom;
	
	private Shifumi(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
}
