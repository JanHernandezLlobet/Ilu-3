package cartes;

public abstract class Probleme extends Carte {
	Type type;
	
	
	public Probleme(Type type1) {
		this.type = type1;
	}
	
	public Type getType() {
		return type;
	}
	
	
}
