package cartes;

public class Botte extends Probleme {

	public Botte(Type type1) {
		super(type1);
	}

	@Override
	public String toString() {
		return type.getBotte();
	}
	
}
