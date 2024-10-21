package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void recevoirArgent(int argent){
		gagnerArgent(argent);
		System.out.println(parler() + argent + " sous ! Je te remercie généreux donateur!");
	}
	
	public int seFaireExtorquer() {
		int argent = this.argent;
		this.argent=0;
		System.out.println(parler() + "J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	
	

}
