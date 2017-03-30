package me.Marius.packe;
import java.util.Random;

import me.Marius.packe.Karte.Farbe;
import me.Marius.packe.Karte.Wert;


public class Kartenspiel {
	
	private Karte[] karten;
	
	
	//Kartenspiel Konstruktor
	public Kartenspiel(int n){
		karten = new Karte [n];	
		Farbe[] fb = Farbe.values();
		Wert[] wb = Wert.values();
		Random r = new Random ();
		for(int p = 0; p<n; p++){
			Karte neueKarte = new Karte(fb[r.nextInt(fb.length)], wb[r.nextInt(wb.length)]);
			karten[p] = neueKarte;
		}
	}
	
	
	public void mischen (){
		Random r = new Random();
		for(int w= 0; w <karten.length*20; w++){
			int one = r.nextInt(karten.length);
			int two = r.nextInt(karten.length);
			Karte x = karten[one];
			Karte y = karten[two];
			Karte xx = x;
			Karte yy = y;
			karten[two] = xx;
			karten[one] = yy;
}
		}
		
	}
	
	
	
	//To String Methode mit String Buffer �ber Karte.toString
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer ();
		for ( Karte k: karten ){
			if(k != null)
				sb.append(k.toString());
		}
		return sb.toString();
	}
}