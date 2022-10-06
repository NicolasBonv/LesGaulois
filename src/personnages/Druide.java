package personnages;
import personnages.Gaulois;
import java.util.Random;
public class Druide {
	private static String nom;
	private static int effetPotionMin;
	private static int effetPotionMax;
	public static int effetPotionPreparee;
	private int forcePotion = 1;
	public Druide(String nom,int effetPotionMin,int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionPreparee = effetPotionPreparee;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " Ã  " + effetPotionMax + " .");
	}
	public String getNom() {
		return nom;
	}
	public static void preparerPotion() {
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
	public static void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}
	private static String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public static void booster(Gaulois nom) {
		Gaulois.parler("Non, " + Gaulois.getNom() + "!... Tu n'auras pas de potion magique");
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		preparerPotion();
	}
}