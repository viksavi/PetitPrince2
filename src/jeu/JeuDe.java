package jeu;

import java.util.Random;

public class JeuDe extends JeuSimple {
	
	public JeuDe() {
		super.nom = "JeuDe";
	}
	
	@Override
	public int arbitrer(String c1, String c2) {
		int num1 = Integer.parseInt(c1);
		int num2 = Integer.parseInt(c2);
		
		if(num1 > num2) {
			return -1;
		} else if (num1 == num2) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String jouerUnTour() {
		Random r = new Random();
		int num = r.nextInt(1, 7);
		return "" + num;
	}

}
