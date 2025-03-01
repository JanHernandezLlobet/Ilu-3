package cartes;

public class Attaque extends Bataille {

	public Attaque(Type type1) {
		super(type1);
	}

	@Override
	public String toString() {
		return type.getAttaque();
	}
	
	
	
}

