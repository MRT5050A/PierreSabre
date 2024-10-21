package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	

	public int getReputation() {
		return reputation;
	}


	public void extorquer(Commerçant victime) {
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler() + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");

		int argentVole = victime.seFaireExtorquer();
		argent += argentVole;
		System.out.println(parler() + "J’ai piqué les " + argentVole + " sous de Marco, ce qui me fait " + argent
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public int perdre() {
		System.out.println(parler() + "J’ai perdu mon duel et mes " + argent
				+ " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		int argentPerdu = argent;
		argent = 0;
		reputation -= 1;
		return argentPerdu;
	}

	public void gagner(int gain) {
		System.out.println(parler() + "Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan
				+ " Je l'ai dépouillé de ses " + gain + " sous.");
		gagnerArgent(gain);
	}

}
