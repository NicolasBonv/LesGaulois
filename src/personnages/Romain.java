package personnages;

public class Romain{
	private static String nom;
	private static int force;
	public Romain(String nom,int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public static void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}
	private static String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public static void recevoirCoup(int forceCoup){
		force -= forceCoup;
		if (force>0) {
			parler("Aie");
		}
		else {
			parler("J'abandonne...");
		}
	}
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus);
		System.out.println(prendreParole()); 
		parler("coucou je suis un romain");
		recevoirCoup(5);
		//TODO cr�er un main permettant de tester la classe Romain
}
}