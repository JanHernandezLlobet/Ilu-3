package jeu;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;
import cartes.JeuDeCartes;

public class Sabot implements Iterator<Carte>{

	private Carte[] Jeu;
	private int nbCartes;
	
	// Variables de l'itérateur
	private int indiceIterateur = 0;
	private boolean nextEffectue = false;
	private int nombreOperations = 0;
	
	
	public Sabot() {
		Jeu = new JeuDeCartes().donnerCartes();
		this.nbCartes = Jeu.length;
	}
	
	public boolean estVide() {
		return (nbCartes == 0);
	}
	
	public void ajouterCarte(Carte carte) throws Exception {
		if (nbCartes == Jeu.length - 1) {
			throw new Exception("Trop de cartes dans le jeu");
		}
		Jeu[nbCartes] = carte;
	}
	
	@Override
	public boolean hasNext() {
		return (indiceIterateur < nbCartes);
	}
	
	@Override
	public Carte next(){   // demander pourquoi ici il n'y a pas de throws Exception
		if (this.hasNext()) {
			indiceIterateur++;
			nextEffectue = true;
			return Jeu[indiceIterateur];
		}
		else {
			throw new NoSuchElementException("pas de carte suivante");
		}
	}

	@Override
	public void remove() {
		if(nbCartes < 1 || !nextEffectue) {
			throw new IllegalStateException("Remove non autorisé");
		}
		else {
			for (int i = indiceIterateur-1; i < nbCartes-1; i++) {
				//System.out.println("effectué a: " + i);

				Jeu[i] = Jeu[i+1];
			}
			nextEffectue = false;
			indiceIterateur--;
			nbCartes--;
		}
	}
	
	public Carte piocher() {
		if(nbCartes < 1) {
			throw new NoSuchElementException("Pas de cartes dans le Jeu");
		}
		indiceIterateur = 0;
		Carte cartePiochee = Jeu[indiceIterateur];
		next();
		remove();
		return cartePiochee;
	}
	
	
	
	public void AffichageSabot() {
		for(int i = 0; i < nbCartes; i++) {
			Jeu[i].toString();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}









