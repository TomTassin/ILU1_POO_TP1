package personnages;

import java.util.Iterator;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[2];

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
	
	
	
	
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	
	

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//	}
	
	
	
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			trophees[nbTrophees] = trophees[i];
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
	
	public void faireUneDonnation(Musee musee, Gaulois gaulois) {
		if (nbTrophees>0) {
			System.out.println(prendreParole()+ " Je donne au musee tous mes trophees :");
			for (int i=0;i<nbTrophees;i++) {
				musee.donnerTrophees(gaulois, trophees[i]);
				System.out.println("- "+ trophees[i]);
				trophees[i]=null;
			}
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Musee louvre = new Musee();
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		asterix.frapper(minus);
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
		}
		asterix.faireUneDonnation(louvre, asterix);
	}
}
