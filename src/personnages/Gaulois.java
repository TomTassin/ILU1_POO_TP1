package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int nb_trophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

//	public String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	
	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	
	

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//	}
	
	
	
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,this.nb_trophees++) {
			this.trophees[this.nb_trophees] = trophees[i];
		}
	}
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		System.out.println(prendreParole()+"Merci Druide, je sens que ma force est "+forcePotion+" fois décuplée");
	}
	
	public static void main(String[] args) {
		Gaulois gaulois = new Gaulois("gaulois",8);
		gaulois.boirePotion(5);
	}
}
