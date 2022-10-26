package histoire;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Asterix",8);
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Ob�lix",10);
		
		panoramix.parler("Je vais aller pr�parer une petite potion");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler(" Par B�l�nos, ce n'est pas juste !");
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
		}
	}

}
