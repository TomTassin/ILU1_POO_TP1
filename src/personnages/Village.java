package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private Chef chef;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];

	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois = nbVillageois + 1;
	}

	public Gaulois trouverHabitant(int indiceVillageois) {
		return villageois[indiceVillageois];
	}

	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois:");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(abraracourcix);
	}
	// Gaulois gaulois = village.trouverHabitant(30);
	/*
	 * Gaulois gaulois = village.trouverHabitant(1); System.out.println(gaulois);
	 */
}
