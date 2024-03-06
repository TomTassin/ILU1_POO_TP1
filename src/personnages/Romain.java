package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements= new Equipement[2];
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int force1 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert force1 > force;
	}

	public int getForce() {
		return force;
	}

	private void sEquiper(Equipement equipement) {
		switch (nbEquipements) {
		case 2:
			System.out.println("Le soldat " + nom + " est deja bien protege !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement + " !");
			} else {
				nbEquipements += 1;
				equipements[1] = equipement;
				System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement + ".");
			}
			break;
		default:
			equipements[0] = equipement;
			nbEquipements += 1;
			System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement + ".");
		}

	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
	
	
}
