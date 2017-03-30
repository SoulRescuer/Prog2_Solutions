package my.Package.marius;

public class Dozent extends Person {
	private final String lehrgebiet; 

	
	//Konstruktor Dozent
	public Dozent(String vorname, String nachname, String straßenname, int hausnummer, int plz, String ort, String lehrgebiet,int gehalt) {
		super(vorname, nachname, straßenname, hausnummer, plz, ort, gehalt);
		this.lehrgebiet=lehrgebiet;
	}
	
	
	public String toString(){
		return super.toString() + lehrgebiet;
	}

}
