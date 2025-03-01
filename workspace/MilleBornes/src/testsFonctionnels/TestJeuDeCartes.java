package testsFonctionnels;
import cartes.JeuDeCartes; 


public class TestJeuDeCartes {

	public TestJeuDeCartes() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String args[]) {
		
		System.out.println("----------| Début des tests: |-----------");
		
		JeuDeCartes Jeu = new JeuDeCartes();
		
		System.out.println(Jeu.affichageJeuDeCartes());
		
		
		System.out.println("-------------| Fin test1 |----------------");
		
	}
	
	
	
	
}
