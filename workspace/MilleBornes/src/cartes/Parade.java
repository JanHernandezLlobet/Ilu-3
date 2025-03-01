package cartes;

public class Parade extends Bataille {

	public Parade(Type type1) {
		super(type1);
	}

	@Override
	public String toString() {
		return type.getParade();
	}
	
}
