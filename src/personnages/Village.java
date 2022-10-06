package personnages;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	
	public Village(String nom) {
		this.nom = nom;
	}
	public void SetChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
}
