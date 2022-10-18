package personnages;

public class Romain{
	private String nom;
	private int force;
	public Romain(String nom,int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup){
		assert force>0;
		force -= forceCoup;
		if (force>0) {
			parler("Aie");
		}
		else {
			parler("J'abandonne...");
		}
		assert force<force+forceCoup;
	}
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus);
		System.out.println(minus.prendreParole()); 
		minus.parler("coucou je suis un romain");
		minus.recevoirCoup(5);
		//TODO cr�er un main permettant de tester la classe Romain
}
}