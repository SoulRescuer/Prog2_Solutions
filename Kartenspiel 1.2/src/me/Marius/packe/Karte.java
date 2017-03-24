package me.Marius.packe;

public class Karte implements Comparable<Karte> {
	// Implements Comparable -> Karte ist "vergleichbar"dazu muss Methode aus
	// Comparable Überschrieben werden.
	private Farbe f;
	private Wert w;

	public enum Farbe {
		KREUZ, PIK, HERZ, KARO;
	}

	public enum Wert {
		SIEBEN, ACHT, NEUN, ZEHN, BAUER, DAME, KOENIG, ASS;
	}

	// Karten Konstruktor
	public Karte(Farbe f, Wert w) {
		this.f = f;
		this.w = w;
	}

	// To String Methode gibt Werte und Farbe der Karte aus
	@Override
	public String toString() {
		return w + "-" + f;

	}

	// Ordnung: Karo < Herz < Pik < Kreuz
	@Override
	public int compareTo(Karte x) {
		if(f.ordinal()>x.getFarbe().ordinal())
		{
			return 1;
		}
		else if(f.ordinal()<x.getFarbe().ordinal())
		{
			return -1; 
		}
		return 0;
	}
	

}
