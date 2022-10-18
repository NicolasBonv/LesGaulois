package histoire;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Chef;
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Asterix",8);
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obélix",10);
		
		Druide.parler("Je vais aller préparer une petite potion");
		Druide.preparerPotion();
		Druide.booster(obelix);
		Gaulois.parler(" Par Bélénos, ce n'est pas juste !");
		Gaulois.parler("Bonjour");
		Romain.parler("UN GAU... UN GAUGAU...");
		Gaulois.frapper(minus);
		Gaulois.frapper(minus);
		Gaulois.frapper(minus);
		Gaulois.frapper(minus);
	}

}
