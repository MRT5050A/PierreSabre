package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commerçant beneficiaire) {
		System.out.println(parler() + beneficiaire.getNom() + " prend ces 6 sous");
		beneficiaire.recevoirArgent(argent / 10);
		argent = argent / 10;
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			System.out.println(parler() + "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			System.out.println(parler() + "Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
		}
		else {
			System.out.println(parler() + "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			argent=0;
			honneur-=1;
		}
	}

}
