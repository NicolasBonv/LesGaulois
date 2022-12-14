package personnages;
import java.util.Random;

public class Druide {
	private  String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public int effetPotionPreparee = 1;
	
	public Druide(String nom,int effetPotionMin,int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + " .");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		Random rand = new Random();
		effetPotionPreparee = rand.nextInt(effetPotionMax - effetPotionMin+1);
		effetPotionPreparee += effetPotionMin;
		if (effetPotionPreparee > 7 ) {
			parler("J'ai prepar�e une super potion de force : " + effetPotionPreparee);
		}
		else {
			parler("Je n'ai pas trouv�e tous les ingr�dients, ma potion est seulement de force " + effetPotionPreparee);
		}
	}
	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if ("Obelix".equals(nomGaulois)) {
			parler("Non, " + nomGaulois + "!... Tu n'auras pas de potion magique");	
		}
		else {
			gaulois.boirePotion(effetPotionPreparee);
		}
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}