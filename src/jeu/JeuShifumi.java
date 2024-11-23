package jeu;

import java.util.Random;

public class JeuShifumi extends JeuSimple{
	
	public JeuShifumi() {
		super.nom = "JeuShifumi";
	}

	@Override
	public int arbitrer(String c1, String c2) {
		Shifumi coup1 = Shifumi.valueOf(c1.toUpperCase());
		Shifumi coup2 = Shifumi.valueOf(c2.toUpperCase());
		if(coup1 == coup2)
			return 0;
		else {
			int numComp = coup1.compareTo(coup2);
			if(numComp == -1 || numComp == 2) {
				return -1;
			} else if (numComp == -2 || numComp == 1){
				return 1;
			}
		}
		return 0;
	}

	@Override
	public String jouerUnTour() {
		Random r = new Random();
		return Shifumi.values()[r.nextInt(3)].toString();
	}

}
