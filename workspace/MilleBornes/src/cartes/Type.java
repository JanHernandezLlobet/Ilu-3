package cartes;

public enum Type {
	FEU			("feu rouge", "feu vert", "prioritaire"),
	ESSENCE		("Panne d'essence", "Essence", "Citerne d'essence"),
	CREVAISON	("Crevaison", "Roue de secours", "Increvable"),
	ACCIDENT	("Accident", "Réparations", "As du volant");
	
	private String attaque;
	private String parade;
	private String botte;
	
	private Type(String att, String par, String bot) {
		this.attaque = att;
		this.parade = par;
		this.botte = bot;
	}

	public String getAttaque() {
		return attaque;
	}

	public String getParade() {
		return parade;
	}

	public String getBotte() {
		return botte;
	}
	
}


