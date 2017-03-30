package my.Package.Marius;

public class Karte {
	
	private Farbe color;
	private Werte count;
	
	public enum Farbe {
		KREUZ, PIK, HERZ ,KARO
	}
	
	public enum Werte {
		SIEBEN, ACHT, NEUN, ZEHN, BAUER, DAME, KOENIG, ASS
	}
	
	public Karte (Farbe f, Werte w) {
		this.color=f;
		this.count=w;
		
	}
	
	
	
	public String toString(){
		return "Karte"+" "+color+" "+count ; 
	}

}
