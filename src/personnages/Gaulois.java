package personnages;
public class Gaulois{
	 public String nom;
	 public int force;
	 private int effetPotion=1;
	 private int nbTrophee;
	 private Equipement[] trophee = new Equipement[100];
	 public Gaulois(String nom, int force) {
		 this.nom = nom;
		 this.force = force;
		 
	 }
	public String getNom() {
		return nom;
	}
	public  void parler(String texte) {
		System.out.println(prendreParole() + "< " + texte + " >");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	/*public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}*/
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		trophee = romain.recevoirCoup((force/3) * effetPotion);
		for (int i=0;trophee != null && i<trophee.length;i++,nbTrophee++) {
			this.trophee[nbTrophee] = trophee[i];
		}
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";

	}
	public void boirePotion(int effetPotionPreparee) {
		effetPotion = effetPotionPreparee;
		parler("Merci Druide, je sens ma force est "+ effetPotion + " fois d�cupl�e");
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		System.out.println(asterix.prendreParole()); 
		asterix.frapper(minus);
		panoramix.preparerPotion();
		asterix.boirePotion(panoramix.effetPotionPreparee);
		//TODO cr�er un main permettant de tester la classe Gaulois
	}
}


