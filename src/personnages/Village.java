package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum=30;
	private Gaulois[] villageois;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}
	public void afficherVillageois() {
		System.out.println("Dans " + getNom() + " du chef " + chef.getNom() + " vivent les l�gendaires gaulois : ");
		for(int i = 0 ;i<nbVillageois;i++) {
			Gaulois gaulois = trouverHabitant(i);
			System.out.println(gaulois);
		}
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles",30);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",25);
		Chef abraracourcix = new Chef("Abracourcix",6,0,village);
		village.setChef(abraracourcix);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		//On obtient Asterix avec sa force et son effetPotion
	}
}
