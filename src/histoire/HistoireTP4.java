package histoire;

import personnages.Commerçant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);

		Commerçant marco = new Commerçant("Marco", "du thé", 20);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "du whisky", 45, "Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		
		Ronin roro = new Ronin("roro", "shochu", 60);
//		roro.direBonjour();
//		roro.donner(marco);
		
		roro.provoquer(yaku);
		
		
	}

}
