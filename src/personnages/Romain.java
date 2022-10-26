package personnages;

public class Romain{
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement[] equipement;
	
	public Romain(String nom,int force) {
		this.nom = nom;
		this.force = force;
		this.equipement = new Equipement[2];
		assert (force>=0);
	}
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	/*public void recevoirCoup(int forceCoup){
		int forceInit = force;
		assert (forceCoup>0);
		force -= forceCoup;
		if (force>0) {
			parler("Aie");
		}
		else {
			parler("J'abandonne...");
		}
		assert (force<forceInit);
	}*/
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		assert (force>0);
		int forceOld = force;
		forceCoup = calculResistEquip(forceCoup);
		force -= forceCoup;
		if (force == 0) {
			parler("Aie");
		}
		else {
			equipementEjecte = ejecterEquip();
			parler("J'abandonne...");
		}
		assert (force < forceOld);
		return equipementEjecte;
	}
	
	private Equipement[] ejecterEquip() {
		Equipement[] equipEjecte = new Equipement[nbEquipement];
		System.out.println("L'equipement de "+ nom + "s'envole sous la force du coup"); 
		int nbEquipEjecte = 0;
		for (int i=0; i<nbEquipement;i++) {
			if (equipement[i] != null) {
				equipEjecte[nbEquipEjecte] = equipement[i];
				nbEquipEjecte ++;
				equipement[i] = null;
			}
		}
		return equipEjecte;
	}
	
	private int calculResistEquip(int forceCoup) {
		String txt;
		txt = "Ma force est de " + this.force + " et la force du coup est de " + forceCoup;
		int resistEquip = 0;
		if (nbEquipement != 0) {
			txt += "Mais heureusement, grace a mon equipement, sa force est diminué de ";
			for (int i = 0; i<nbEquipement;i++) {
				if (equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER)) {
					resistEquip += 8;
				}
				else {
					System.out.println("Equipement casque");
					resistEquip += 5;
				}
			}
			txt += resistEquip + "!";
		}
		parler(txt);
		forceCoup -= resistEquip;
		return forceCoup;
	}
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	public void equipe(Equipement equip) {
		System.out.println("Le soldat " + nom + " s'equipe avec un " + equip.getNom() + " !");
		nbEquipement ++;
		equipement[nbEquipement-1] = equip;
	}
	
	public void sEquiper(Equipement equip) {
		switch(nbEquipement) {
			case 2 :System.out.println("Le soldat " + nom + " est deja bien prot�g� !");
					break;
			case 1 : if (equipement[0] == equip) {
				System.out.println("Le soldat " + nom + " possede d�j� " + equip.getNom() + " !");
				}
			else {
				equipe(equip);
			}
			break;
			case 0 :
				equipe(equip);
				break;
		}
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus);
		System.out.println(minus.prendreParole());
		minus.parler("test");
		minus.recevoirCoup(2);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}