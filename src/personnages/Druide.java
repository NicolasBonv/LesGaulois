package personnages;
import personnages.Gaulois;
import java.util.Random;
public class Druide {
	private  String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public int effetPotionPreparee;
	public Druide(String nom,int effetPotionMin,int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " Ã  " + effetPotionMax + " .");
	}
	public String getNom() {
		return nom;
	}
	public void preparerPotion() {
		Random rand = new Random();
		effetPotionPreparee = rand.nextInt(effetPotionMax);
		if (effetPotionPreparee < effetPotionMin) {
			effetPotionPreparee = rand.nextInt(effetPotionMax);
			preparerPotion();
		}
		else if (effetPotionPreparee > 7 ) {
			parler("J'ai preparée une super potion de force");
		}
		else {
			parler("Je n'ai pas trouvée tous les ingrédients, ma potion est seulement de force " + effetPotionPreparee);
		}
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void booster(Gaulois nom) {
		parler("Non, " + nom.getNom() + "!... Tu n'auras pas de potion magique");
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}