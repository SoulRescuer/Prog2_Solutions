package my.Package.marius;


public class Person {
	public String vorname;
	public String nachname;
	public String straßenname;
	public int hausnummer;
	public int plz;
	public String ort;
	public int gehalt;
	
	
	
	
	
	//Konstruktor Person
	public Person (String vorname, String nachname, String straßenname, int hausnummer, int plz, String ort, int gehalt){
		this.vorname=vorname;
		this.nachname=nachname;
		this.straßenname=straßenname;
		this.hausnummer=hausnummer;
		this.plz=plz;
		this.ort=ort;
		this.gehalt=gehalt;
	}
	
	
	
	
	//Getter und Setter
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStraßenname() {
		return straßenname;
	}
	public void setStraßenname(String straßenname) {
		this.straßenname = straßenname;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public int getGehalt() {
		return gehalt;
	}
	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	@Override
	public String toString(){
		return vorname + " "+ nachname+ " "+ straßenname+ " " + hausnummer+ " "+plz+ " " +ort +" ";
	}
	

}
