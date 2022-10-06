package personnages;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private static int nbVillageois = 0;
	private int nbVillageoisMaximum;
	private static Gaulois villageois[];
	public Village(String nom) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}
	public void SetChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public static void ajouterHabitant(Gaulois nom) {
		nbVillageois += 1;
		villageois[nbVillageois] = new Gaulois(Gaulois.nom,Gaulois.force);
	}
	public static Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}
	
}
