import Karte.Farbe;
import Karte.Werte;

public class Kartenspiel {
	private int numberOfCards;
	private Karte[] cards;
	
	public Kartenspiel (int x){
		this.numberOfCards=x;
		int random = (int)Math.random();
		cards = new Karte[random];
		Farbe[] fb= Farbe.value();
		Werte[] wb = Werte.values();
	}
	
	
	
	
	public String toString(){
		return numberOfCards;
	}

}
