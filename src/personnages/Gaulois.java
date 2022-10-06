package personnages;
import personnages.Romain;
import personnages.Druide;
public class Gaulois{
	 public static String nom;
	 public static int force;
	 private static int effetPotion=1;
	 public Gaulois(String nom, int force) {
		 this.nom = nom;
		 this.force = force;
		 
	 }
	public static String getNom() {
		return nom;
	}
	public static void parler(String texte) {
		System.out.println(prendreParole() + "< " + texte + " >");
	}
	private static String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public static void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		Romain.recevoirCoup((force / 3)*Druide.effetPotionPreparee);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";

	}
	public static void boirePotion(int effetPotionPreparee) {
		effetPotion = Druide.effetPotionPreparee;
		parler("Merci Druide, je sens ma force est "+ effetPotion + " fois décuplée");
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		System.out.println(prendreParole()); 
		frapper(minus);
		Druide.preparerPotion();
		boirePotion(Druide.effetPotionPreparee);
		//TODO crï¿½er un main permettant de tester la classe Gaulois
	}
}


