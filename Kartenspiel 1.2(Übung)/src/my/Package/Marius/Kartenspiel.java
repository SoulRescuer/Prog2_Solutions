package my.Package.Marius;


import my.Package.Marius.Karte.Farbe;
import my.Package.Marius.Karte.Werte;

public class Kartenspiel {
	private int numberOfCards;
	private Karte[] cards;

	// Konstruktor für ein Kartenspiel mit x Karten
	public Kartenspiel(int x) {
		this.numberOfCards = x;
		int random = (int) Math.random();
		cards = new Karte[numberOfCards];
		// Farb und Wert Array mit value des Enums
		Farbe[] fb = Farbe.values();
		Werte[] wb = Werte.values();
		// Füllen des Karten Arrays mit Random werten
		for (int p = 0; p < random; p++) {
			Karte newCard = new Karte(fb[random], wb[random]);
			cards[p] = newCard;
		}

	}

	// To String Methode mit String Buffer über Karte.toString
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Karte k : cards) {
			if (k != null)
				sb.append(k.toString());
		}
		return sb.toString();
	}
}
