package histoire;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Chef;
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois.parler("Bonjour à tous");
		Romain.parler("UN GAU... UN GAUGAU...");
		Gaulois.frapper(Romain.minus);
		Romain.recevoirCoup(Gaulois.force);
		Gaulois.frapper(Romain.minus);
		Romain.recevoirCoup(Gaulois.force);
		Gaulois.frapper(Roamin.minus);
		Romain.recevoirCoup(Gaulois.force);
	}

}
