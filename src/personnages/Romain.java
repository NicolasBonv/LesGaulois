package personnages;
import Equipement;
public class Romain{
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement equipement[][];
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
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2 : System.out.println("Le soldat " + nom + " est deja bien protégé !");
		case 1 : if (equipement[0][0] == equipement) {
			System.out.println("Le soldat " + nom + " possede déjà " + equipement.getNom() + " !");
		}
		default : nbEquipement += 1;
				equipement[Equipement.CASQUE] = equipement;
				System.out.println("Le soldat "  + nom +" s'équipe avec un " + equipement.getNom());
		}
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Equipement equipement = Equipement.CASQUE;
		/*System.out.println(minus);
		System.out.println(minus.prendreParole()); 
		minus.parler("coucou je suis un romain");
		minus.recevoirCoup(5);*/
		//TODO crï¿½er un main permettant de tester la classe Romain
		minus.sEquiper(equipement);
}
}