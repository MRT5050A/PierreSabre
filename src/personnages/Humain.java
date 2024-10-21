package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	private String getBoissonFavorite() {
		return boissonFavorite;
	}

	public int getArgent() {
		return argent;
	}

	protected String parler() {
		return "(" + nom + ") - ";
	}

	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + "et j'aime boire du " + boissonFavorite);
	}

	public void boire() {
		System.out.println(parler() + "Mmmmmh, un bon verre de " + boissonFavorite + "! GLOUPS !");
	}

	protected void perdreArgent(int gain) {
		argent -= gain;
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			System.out.println(parler() + "Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir "
					+ bien + " à " + prix + " sous.");
		} else {
			System.out.println(parler() + "J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à "
					+ prix + " sous");
			perdreArgent(prix);
		}
	}

}
