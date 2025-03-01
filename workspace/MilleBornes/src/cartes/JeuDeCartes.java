package cartes;

public class JeuDeCartes {

	private Configuration[] typesDeCartes;
	
	public JeuDeCartes() {
		this.typesDeCartes = new Configuration[19];
		
		typesDeCartes[0] = new Configuration(new Borne(25), 10);
		typesDeCartes[1] = new Configuration(new Borne(50), 10);
		typesDeCartes[2] = new Configuration(new Borne(75), 10);
		typesDeCartes[3] = new Configuration(new Borne(100), 12);
		typesDeCartes[4] = new Configuration(new Borne(200), 4);
		
		typesDeCartes[5] = new Configuration(new Parade(Type.FEU), 14);
		typesDeCartes[6] = new Configuration(new FinLimite(), 6);
		typesDeCartes[7] = new Configuration(new Parade(Type.ESSENCE), 6);
		typesDeCartes[8] = new Configuration(new Parade(Type.CREVAISON), 6);
		typesDeCartes[9] = new Configuration(new Parade(Type.ACCIDENT), 6);
		
		typesDeCartes[10] = new Configuration(new Attaque(Type.FEU), 5);
		typesDeCartes[11] = new Configuration(new DebutLimite(), 4);
		typesDeCartes[12] = new Configuration(new Attaque(Type.ESSENCE), 3);
		typesDeCartes[13] = new Configuration(new Attaque(Type.CREVAISON), 3);
		typesDeCartes[14] = new Configuration(new Attaque(Type.ACCIDENT), 3);
		
		typesDeCartes[15] = new Configuration(new Botte(Type.FEU), 1);
		typesDeCartes[16] = new Configuration(new Botte(Type.ESSENCE), 1);
		typesDeCartes[17] = new Configuration(new Botte(Type.CREVAISON), 1);
		typesDeCartes[18] = new Configuration(new Botte(Type.ACCIDENT), 1);

	}
	
	public String affichageJeuDeCartes() {
		String liste = "Nombre:      Nom:\n";
		for(int i = 0; i < typesDeCartes.length; i++) {
			liste =  liste + "      " + (typesDeCartes[i].getNbExemplaires());
			
			int j=1;
			int taille = typesDeCartes[i].getNbExemplaires();
			while( taille >= 10) { taille = taille % 10; j++;}
			
			String test = "";
			test = test + typesDeCartes[i].getCarte();
			for(; j < 24 - test.length(); j++) {
				liste = liste + " ";
			}
			liste = liste + (typesDeCartes[i].getCarte() + "\n");
		}
		return liste;
	}
	
	
	private class Configuration {
		protected int nbExemplaires;
		protected Carte carte;
		
		private Configuration(Carte carte, int nbEx) {
			this.nbExemplaires = nbEx;
			this.carte = carte;
		}
		
		public Carte getCarte() {
			return carte;
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}
		
	}

	public Carte[] donnerCartes() {
		int tailleDeck = 0;
		for(int i = 0; i < typesDeCartes.length; i++) {
			if( typesDeCartes[i] != null) {
				tailleDeck += typesDeCartes[i].nbExemplaires;
			}
		}
		Carte[] deck = new Carte[tailleDeck];
		int l = 0;
		for(int j = 0; j < typesDeCartes.length; j++) {
			if( typesDeCartes[j] != null) {
				int k = 0;
				for(; k < typesDeCartes[j].getNbExemplaires(); k++) {
					deck[l+k] = typesDeCartes[j].getCarte();
				}
				l += k;
			}
		}
		return deck;
	}

		
		
		
		
		

	
	
}
