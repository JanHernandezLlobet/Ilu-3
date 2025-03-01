package testsFonctionnels;
import cartes.JeuDeCartes;
import jeu.Sabot;

public class TestSabot {

	public TestSabot() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String args[]) {
				
		int option = 2;
		
		System.out.println("----------| Début des tests: |-----------");
		
		Sabot Jeu = new Sabot();

		
		//-------------| Differentes options d'iteration |-----------//
		if(option == 1) {
			while (Jeu.hasNext()){
				System.out.println("je pioche " + Jeu.piocher().toString());
			}
		}
		else if(option == 2) {
			while (Jeu.hasNext()){
				System.out.println("je pioche " + Jeu.next().toString());
				Jeu.remove();
			}
		}
		
		System.out.println("-------------| Fin test2 |----------------");
		System.out.println("PAS COMPRIS QUESTION 2)C)");
	}
	
	
	
}
