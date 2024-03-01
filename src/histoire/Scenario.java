package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 9);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("Bonjour à tous");
		minus.prendreParole();
		minus.parler("UN GAU... UN GAUGAU...");
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
			minus.recevoirCoup(8);

		}
	}

}
