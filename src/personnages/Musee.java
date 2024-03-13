package personnages;

public class Musee {
	private Trophee[] trophee=new Trophee[200];
	private int nbTrophee=0;


	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophee[nbTrophee]= new Trophee(gaulois,equipement);
	}
}
