package my.Package.marius;


public class Person {
	public String vorname;
	public String nachname;
	public String stra�enname;
	public int hausnummer;
	public int plz;
	public String ort;
	public int gehalt;
	
	
	
	
	
	//Konstruktor Person
	public Person (String vorname, String nachname, String stra�enname, int hausnummer, int plz, String ort, int gehalt){
		this.vorname=vorname;
		this.nachname=nachname;
		this.stra�enname=stra�enname;
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
	public String getStra�enname() {
		return stra�enname;
	}
	public void setStra�enname(String stra�enname) {
		this.stra�enname = stra�enname;
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
		return vorname + " "+ nachname+ " "+ stra�enname+ " " + hausnummer+ " "+plz+ " " +ort +" ";
	}
	

}
