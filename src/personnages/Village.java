package personnages;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum=30;
	private Gaulois villageois[];
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void SetChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		nbVillageois += 1;
		villageois[nbVillageois] = gaulois;
	}
	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = Village.trouverHabitant(30);
		
		
		
	}
}
